var xstart;
var xend;
var xaxisrange=[];
var c;
var queryString = new Array();
var id;
var mainkpi;
var str;
var eventParameterMapping=[];
data=[];
var timestamp;
var enodebs_selected;
var cellname;
$(function () {
	console.log("project caleed");
	if (queryString.length == 0) {
		if (window.location.search.split('?').length > 1) {
			var params = window.location.search.split('?')[1].split('&');
			for (var i = 0; i < params.length; i++) {
				var key = params[i].split('=')[0];
				var value = decodeURIComponent(params[i].split('=')[1]);
				queryString[key] = value;
			}
		}
	}
	if (queryString["checkedValue"] != null ) {

		id= queryString["checkedValue"];
		mainkpi=queryString["currentkpi"];
		c=queryString["click"];
		//      cokpi=queryString["corelatedkpi"];
		console.log(c);
		 enodeb_selected=queryString["enodeb_selected"];
		 console.log(enodeb_selected);
		//enodeb_selected="AB801F";
		timestamp=queryString["timestamp"];
		xstart=queryString["xstart"];
		xend=queryString["xend"];
		cellname=queryString["cellname"]; 
		console.log("cell name is"+cellname);
		console.log(mainkpi);
		console.log(timestamp);
		console.log(enodeb_selected);
		console.log(id[0]);
		console.log(" "+xstart+" "+xend)
		str = id.split(",");
		console.log(str);
		for(i=0; i<str.length;i++){
			data.push({correlatedkpiname:str[i],correlated_kpi_name:str[i].split('_').join(' ')}) 
		}
		document.getElementById('enodeb_selected').innerHTML =enodeb_selected;
		document.getElementById('timestamp').innerHTML =timestamp;
		document.getElementById('cellname').innerHTML=cellname;
		console.log(data);
	}
	$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGraphData',{kpi_name:mainkpi,date_id:timestamp,eutrancellfdd:cellname}, function (response) { 
		var points = response;
		var actual=[];
		var time=[];
		var predicted=[];
		var anom=[];
		var units;
		for(i=0;i<(points.length);i++){
			console.log("@@@@@@@@@@@@@"+timestamp);
			if((timestamp.localeCompare("Alldays"))==0){
				console.log("displaying data for all days");
				time.push(points[i].date_id);
				actual.push(points[i].actual);
				predicted.push(points[i].predicted);
				anom.push(points[i].anom);
				xstart=time[0];
				xend=time[(time.length-1)];
				console.log("showing for all days");
				
			}
			else{
				var tempstr=points[i].date_id;
				 var str = tempstr.split(" ");
				 var n = timestamp.localeCompare(str[0]);
				 if(n==0)
	            {
				// console.log(str[1]);
				 var trim= str[1].split(":");
				 var concate= trim[0]+':'+trim[1];
				 time.push(concate);
				 actual.push(points[i].actual);
					predicted.push(points[i].predicted);
					anom.push(points[i].anom);
			    }
			
            }
			
		
		}
		console.log(time);
		console.log(id);
		$.getJSON('kpiUnits.json',function(points){
			console.log(mainkpi);
			console.log(points);
			for(i=0;i<((points.length)-1);i++){
			var a=mainkpi.localeCompare(points[i].kpi_name);
			if(a==0)
				{
				units=points[i].units;
				}
			}
			console.log(units); 
		var timerId=0;
		var plotlyRelayoutEventFunction=function(eventdata){
			if( Object.prototype.toString.call(eventdata["xaxis.range"]) === '[object Array]' ) {
				console.log(eventdata["xaxis.range"]);
				console.log("rangeslider event!!");

				if(timerId>=0){
					//timer is running: stop it
					window.clearTimeout(timerId);
				}

				timerId = window.setTimeout(function(){ 
					//fire end event
					console.log("rangeslider event ENDS");
					var xaxisrange=eventdata["xaxis.range"];
					changerange(xaxisrange);
					console.log(eventdata["xaxis.range"])
					//reset timer to undefined
					timerId = -1;
				}, 800);
			}
		}

		console.log("function called");
		var trace1 = {
				x: time,
				y: predicted,
				mode: 'lines',
				name: 'Trend',
				text: '',
				hoverinfo:'y',
				type: 'scatter',
				line: {
					dash:'Solid',
					color: 'rgb(55, 128, 191)',
					width: 3,
					shape: 'spline'
				}
		};
		var trace2 = {
				type: 'scatter',
				x: time,
				y:actual ,
				mode: 'lines',
				name: 'Actual',
				text: '',
				hoverinfo:'y',
				type: 'scatter',
				line: {
					dash: 'Dashdot',
					width: 3,
					color:'#ff9900' ,

					shape: 'spline'
				}
		};
		var trace3 = {
				x: time,
				y: anom,
				mode: 'markers',
				name: 'Anomalies',

				hoverinfo:'none',
				type: 'scatter',
				line: {
					dash:'Solid',
					color: 'red',
					width: 3,
					shape: 'spline'
				}
		};
		var data = [trace1,trace2,trace3];

		var layout = {
				title: ' ',
				showlegend: true,
				width:930,
				height:200,
				autosize:true,
				margin: {
					l: 45,
					r: 0,
					b: 20,
					t: 10,
					pad: 2
				},
				xaxis: {
					range:[xstart,xend],


					rangeslider: {


						thickness:0.1,
						bgcolor:'transparent'
					},
					autotick: true,
					ticks: 'outside',
					tick0: 0,
					nticks:12,
					ticklen: 0,
					tickwidth: 0,
					tickcolor: '#000',
					tickfont: {
						family: 'Old Standard TT, serif',
						size: 11,
						color: 'black'
					}
				},
				yaxis: {
					title:units,
			  		 titlefont: {
			  		      family: 'sans-serif',
			  		      size: 12
			  		    },
					autotick: true,
					ticks: 'outside',
					tick0: 0,

					ticklen: 0,
					tickwidth: 0,
					tickcolor: '#000',
					tickfont: {
						family: 'Old Standard TT, serif',
						size: 11,
						color: 'black'
					}
				}
		};

		Plotly.newPlot('mainkpi', data,layout,{displayModeBar: false});
		document.getElementById('mainkpi').on('plotly_relayout', plotlyRelayoutEventFunction);
		document.getElementById('mainkpi').on('plotly_relayout',
				function(eventdata){  
			xaxisrange.push(eventdata['xaxis.range[0]']);
			xaxisrange.push(eventdata['xaxis.range[1]']);
			console.log("###########"+xaxisrange);
			changerange(xaxisrange);
		});

		document.getElementById('mainkpi').on('plotly_click', function(data){
			var ptsx ;
			var ptsy;
			console.log("mainkpi printing");
			console.log(mainkpi);
			for(var i=0; i < data.points.length; i++){
				ptsx =data.points[i].x;
				ptsy=data.points[i].y;
			}
			console.log(ptsx);
			console.log(ptsy);
			console.log("date selectde is "+timestamp);
			 var datetime_id = timestamp+"-"+ptsx.replace(':','-')+"-00";
			    console.log(datetime_id);
			$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiEventParameterData',{date_id:timestamp,eutrancellfdd:cellname,datetime_id:datetime_id,kpi_name:mainkpi}, function (jd) {
				//console.log(jd);//console.log(ptsx);
				//console.log("cellname is"+cellname);
				$("#countername").show();
				$("#countervalue").show();
				document.getElementById('displayevent').innerHTML =" ";

				document.getElementById('displayparam').innerHTML =" ";
				console.log(jd);
				var countarrr=[];			    	
				for(var i=0;i<jd.length;i++){
					var tempstr=jd[i].datetime_id;
					var str = tempstr.split(" ");
					var temptimeid=str[1].split(":");
					var timeid=temptimeid[0]+":"+temptimeid[1];
					var timeflag = ptsx.localeCompare(timeid);
					console.log(timeflag);
					var cellflag = cellname.localeCompare(jd[i].eutrancellfdd);
					console.log(cellflag);
					console.log(enodebflag);
					var enodebflag = enodeb_selected.localeCompare(jd[i].erbs)
					// console.log("all flags"+timeflag+" "+cellflag+ " ");
					
						countarrr.push({"datetime_id":jd[i].datetime_id,"counterName":jd[i].counterName,
							"counterValue":jd[i].counterValue,"eventName":jd[i].eventName,
							"eutrancellfdd":jd[i].eutrancellfdd,"eventParameter":jd[i].parameter});
						eventParameterMapping.push({"eventName":jd[i].eventName,"eventParameter":jd[i].parameter});
					

				}
				console.log(countarrr);
				console.log("svg template running");
				var template = $.templates("#svgtemplate1");
				console.log(template);

				var htmlOutput = template.render(countarrr);
				$("#right").html(htmlOutput);
				console.log(htmlOutput);
				console.log(countarrr);	});

		});	



	});
	});




	function changerange(xaxisrange){
		console.log("x range is changeing");
		xstart=xaxisrange[0];
		xend=xaxisrange[1];
		middle();
	}
	console.log(data);
	var template = $.templates("#svgTemplate");
	console.log(template);
	var htmlOutput = template.render(data);

	$("#correlatedkpi").html(htmlOutput);

	middle();

});

function middle(){
	for (i in str){

		var kpiname=str[i];
		plot(kpiname);
	}
}
function plot(kpiname){
	var actual=[];
	var time=[];
	var predicted=[];
	var anom=[];
	var units;
	console.log("*****************************"+xstart+"%%%%%%%%%%%%%%%%%%%%%%%%%%%"+xend)
	console.log("--------------"+kpiname);
	$.getJSON('kpiUnits.json',function(points){
		console.log(kpiname);
		console.log(points);
		for(i=0;i<points.length;i++){
		var a=kpiname.localeCompare(points[i].kpi_name);
		console.log(a);
		if(a==0)
			{
			units=points[i].units;
			}
		}
		console.log(units); 
		$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGraphData',{kpi_name:kpiname,date_id:timestamp,eutrancellfdd:cellname}, function (response) {
			var points = response;
		console.log(points);
		console.log(kpiname);
		for(i=0;i<(points.length);i++){
			//console.log("@@@@@@@@@@@@@"+timestamp);
			if((timestamp.localeCompare("Alldays"))==0){
				//console.log("displaying data for all days");
				time.push(points[i].date_id);
				actual.push(points[i].actual);
				predicted.push(points[i].predicted);
				anom.push(points[i].anom);
				
				//console.log("showing for all days");
				
			}
			else{
				var tempstr=points[i].date_id;
				 var str = tempstr.split(" ");
				 var n = timestamp.localeCompare(str[0]);
				 if(n==0)
	            {
				// console.log(str[1]);
				 var trim= str[1].split(":");
				 var concate= trim[0]+':'+trim[1];
				 time.push(concate);
				 actual.push(points[i].actual);
					predicted.push(points[i].predicted);
					anom.push(points[i].anom);
			    }
			
            }
			
		
		}
		var trace1 = {
				x:time,
				y: predicted ,
				mode: 'lines',
				name: 'Actual',

				type: 'scatter',
				hoverinfo:'y',
				line: {
					color: 'rgb(55, 128, 191)',
					width: 3,
					shape: 'spline'
				}
		};
		var trace2 = {
				type: 'scatter',
				x:time,
				y:actual,
				mode: 'lines',
				name: 'Predicted',

				type: 'scatter',
				hoverinfo:'y',
				line: {
					color:'#ff9900' ,
					width: 3,
					shape: 'spline'
				}
		};
		var trace3 = {
				x: time,
				y: anom,
				mode: 'markers',
				name: 'Anomalies',

				hoverinfo:'none',
				type: 'scatter',
				line: {
					dash:'Solid',
					color: 'red',
					width: 3,
					shape: 'spline'
				}
		};
		var data = [trace1,trace2,trace3];
		var layout = {
				title: '',
				showlegend: false,
				width:800,
				height:150,
				autosize:true,
				margin: {
					l: 45,
					r: 0,
					b: 35,
					t: 10,
					pad: 0
				},
				xaxis: {range: [xstart, xend],
					autotick: true,
					ticks: 'outside',
					tick0: 0,
					//    dtick: 12,
					ticklen: 0,
					tickwidth: 0,
					tickcolor: '#000',

					nticks:12,
					tickfont: {
						family: 'Old Standard TT, serif',
						size: 11,
						color: 'black'
					}
				},
				yaxis: {
					title:units,
			  		 titlefont: {
			  		      family: 'sans-serif',
			  		      size: 12
			  		    },
					autotick: true,
					ticks: 'outside',
					tick0: 0,

					ticklen: 0,
					tickwidth: 0,
					tickcolor: '#000',
					tickfont: {
						family: 'Old Standard TT, serif',
						size: 11,
						color: 'black'
					}
				}


		};


		Plotly.newPlot(kpiname, data,layout,{displayModeBar: false});
		var myPlot = document.getElementById(kpiname);
		myPlot.on('plotly_click', function(data){
			//alert('You clicked this Plotly chart!'+kpiname);
			$("#countername").show();
			$("#countervalue").show();
			document.getElementById('displayevent').innerHTML =" ";

			document.getElementById('displayparam').innerHTML =" ";
			var ptsx ;
			var ptsy;
			console.log("mainkpi printing");
			console.log(mainkpi);
			for(var i=0; i < data.points.length; i++){
				ptsx =data.points[i].x;
				ptsy=data.points[i].y;
			}
			console.log(ptsx);
			console.log(ptsy);
			console.log("date selectde is "+timestamp);
			 var datetime_id = timestamp+"-"+ptsx.replace(':','-')+"-00";
			    console.log(datetime_id);
			$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiEventParameterData',{date_id:timestamp,eutrancellfdd:cellname,datetime_id:datetime_id,kpi_name:kpiname}, function (jd) {
				//console.log(jd);//console.log(ptsx);
				//console.log("cellname is"+cellname);
				console.log(jd);
				var countarrr=[];			    	
				for(var i=0;i<jd.length;i++){
					var tempstr=jd[i].datetime_id;
					var str = tempstr.split(" ");
					var temptimeid=str[1].split(":");
					var timeid=temptimeid[0]+":"+temptimeid[1];// console.log("timeid is"+timeid);
					var timeflag = ptsx.localeCompare(timeid);
					// var cellname="AB8001L";
					//console.log("cellname is"+cellname);
					var cellflag = cellname.localeCompare(jd[i].eutrancellfdd);
					//console.log(cellflag);
					// console.log("all flags"+timeflag+" "+cellflag+ " ");
			
						countarrr.push({"datetime_id":jd[i].datetime_id,"counterName":jd[i].counterName,
							"counterValue":jd[i].counterValue,"eventName":jd[i].eventName,
							"eutrancellfdd":jd[i].eutrancellfdd,"eventParameter":jd[i].parameter});
						eventParameterMapping.push({"eventName":jd[i].eventName,"eventParameter":jd[i].parameter});
				}
				console.log(eventParameterMapping);
				console.log(countarrr);
				var template = $.templates("#svgtemplate1");
				var htmlOutput = template.render(countarrr);
				$("#right").html(htmlOutput);
				});


		});





		var mainkpiname=mainkpi.split('_').join(' ');
		document.getElementById('kpiname').innerHTML =mainkpiname;


	});
	});
}
function backbutton()
{
	console.log("sdn");


	// console.log("shndj"+c1);
	url = 'kpi_demo.html#flag?id='+encodeURIComponent(c)+'&mainkpi='+encodeURIComponent(mainkpi)+'&date='+encodeURIComponent(timestamp);
	location.href = url;
}
function displayevents(eventname){
	
	$("#events").show();
	$("#parameters").show();
	$("#displayevent").show();
	$("#displayparam").show();
	document.getElementById('displayevent').innerHTML =" ";
	
	document.getElementById('displayparam').innerHTML =" ";
	console.log("displaying detials");
	console.log(eventname);

	for(i in eventParameterMapping){
		var flag=eventname.localeCompare(eventParameterMapping[i].eventName);
		if(flag==0){

		if((eventParameterMapping[i].eventName)!==null)
			{
			document.getElementById('displayevent').innerHTML =(eventParameterMapping[i].eventName).split(",").join(" ");
			}
		else
			{
			document.getElementById('displayevent').innerHTML =(eventParameterMapping[i].eventName);
			}
		if((eventParameterMapping[i].eventParameter)!==null)
		{
			document.getElementById('displayparam').innerHTML =(eventParameterMapping[i].eventParameter).split(",").join(" ");
		}
		else
			{
			document.getElementById('displayparam').innerHTML =(eventParameterMapping[i].eventParameter);
			}
		}
	} 

}

function hide(){
	$("#details").hide(); 
	$("#events").hide();
	$("#parameters").hide();
	$("#countername").hide();
	$("#countervalue").hide();
	$("#displayevent").hide();
	$("#displayparam").hide();
	
}
function remove(id){
	var clickedID = id;
	console.log(clickedID);
	var divid=clickedID.slice(6);
	console.log(divid);
	$("#"+divid).hide();
	$("#heading"+divid).hide();
	console.log("remove function called");
	
}

