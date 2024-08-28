var xstart;
var xend;

var enodeb_selected;
var timestamp;
var correlatedkpi;
var setdate;
var xaxisrange=[];
var id;
var corrkpi;
var storeid;
var correlatedjson;
var currentkpi;
var cellname;
var clickedID;

function populate_enodeb() {
 console.log("function called");
	var dropdown = document.getElementById('enodeb_select');
	timestamp= document.getElementById("timestamp").value ;
	$.get('http://10.59.130.163:8080/counter-analytics-web/getNodeList',{date_id:timestamp}, function (data) {
		console.log(data);
		
	 for (let i = 0; i < data.length; i++) {
	      option = document.createElement('option');
	      option.text = data[i];
	      option.value = data[i];
	      dropdown.add(option);
	    }
	 start();
	 plotavailabiltygraph();
	 if(sessionStorage.getItem('enodeb_selected') != null) {
		 
		 document.getElementById('enodeb_select').value =sessionStorage.getItem('enodeb_selected');
		 start();
	 }
	});
	
}

function start(){
	document.getElementById('Accessibility').innerHTML ='';
	document.getElementById('Integrity').innerHTML ='';
	document.getElementById('Mobility').innerHTML ='';
	document.getElementById('Retainability').innerHTML ='';
	 enodeb_selected= document.getElementById("enodeb_select").value ;
	 console.log("enode b for pie chart is"+enodeb_selected);
	 timestamp=document.getElementById('timestamp').value;
	 
	 function hex (c) {
			var s = "0123456789abcdef";
			var i = parseInt (c);
			if (i == 0 || isNaN (c))
				return "00";
			i = Math.round (Math.min (Math.max (0, i), 255));
			return s.charAt ((i - i % 16) / 16) + s.charAt (i % 16);
		}

		/* Convert an RGB triplet to a hex string */
		function convertToHex (rgb) {
			return hex(rgb[0]) + hex(rgb[1]) + hex(rgb[2]);
		}

		/* Remove '#' in color hex string */
		function trim (s) { return (s.charAt(0) == '#') ? s.substring(1, 7) : s }

		/* Convert a hex string to an RGB triplet */
		function convertToRGB (hex) {
			var color = [];
			color[0] = parseInt ((trim(hex)).substring (0, 2), 16);
			color[1] = parseInt ((trim(hex)).substring (2, 4), 16);
			color[2] = parseInt ((trim(hex)).substring (4, 6), 16);
			return color;
		}

		function generateColor(colorStart,colorEnd,colorCount){

			// The beginning of your gradient
			var start = convertToRGB (colorStart);    

			// The end of your gradient
			var end   = convertToRGB (colorEnd);    

			// The number of colors to compute
			var len = colorCount;

			//Alpha blending amount
			var alpha = 0.0;

			var storecolor = [];

			for (i = 0; i < len; i++) {
				var c = [];
				alpha += (1.0/len);

				c[0] = start[0] * alpha + (1 - alpha) * end[0];
				c[1] = start[1] * alpha + (1 - alpha) * end[1];
				c[2] = start[2] * alpha + (1 - alpha) * end[2];

				storecolor.push('#'+convertToHex (c));
				console.log(storecolor);
			}

			return storecolor;

		}
	 
	 
		$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGroupOutliers',{kpi_group:"Integrity",date_id:timestamp,erbs:enodeb_selected}, function (response) {
		var points = response;
		var integrity=[];

		var SortedArrayIntegrity=[];

		for(var i=0;i<(points.length);i++) {

		
			var tempstr=points[i].date_id;
			//console.log(tempstr);
			var str = tempstr.split(" ");
			//console.log(str[0]);
			//console.log((timestamp.localeCompare(points[i].date_id)==0));
			if(timestamp.localeCompare(points[i].date_id)==0)
			{	
				SortedArrayIntegrity.push({cellName:points[i].cell,Outliers:points[i].outlier,date:points[i].date_id });

			}
		}
		console.log(SortedArrayIntegrity);
		console.log(integrity);

		SortedArrayIntegrity.sort(function(x, y) {
			return x.Outliers - y.Outliers ;
		});

		SortedArrayIntegrity.sort();
		console.log(SortedArrayIntegrity.length);

		var color = generateColor('#000066','#b6dae2',SortedArrayIntegrity.length);
		
		for(cor in color)
		{
			integrity.push({color:color[cor],cellName:SortedArrayIntegrity[cor].cellName,Outliers:SortedArrayIntegrity[cor].Outliers,date:SortedArrayIntegrity[cor].date });
		}
		console.log("looped");
		console.log(integrity);  
	    var chart = AmCharts.makeChart("Integrity", {
		    "type": "pie",
		    "hideCredits":true,
		    labelsEnabled: false,

		    marginTop: 0,
		    marginBottom: 0,
		    marginLeft: 0,
		    marginRight: 0,

		    "pullOutOnlyOne" :true,
		    "theme": "light",
		    "dataProvider":integrity,

		    "balloonText": "<span>Cell: </span>[[title]]<br><span>Outliers:</span>[[value]]",
		    "valueField": "Outliers",
		    "titleField": "cellName",
		    "colorField": "color",
		    "outlineAlpha": 0.4,
		    "angle": 60,
		    "depth3D": 12,
		    "listeners": [{
		        "event": "clickSlice",
		        "method": function(e) {
		        	cellname = e.dataItem.dataContext.cellName;

		        	console.log(cellname);
		        	  document.getElementById('cellname').innerHTML ="Cell: "+cellname;
		        	  sessionStorage.setItem('Cellname',cellname);
		        	  console.log(sessionStorage.getItem('Cellname'));
		        }
		      }],
		      "allLabels": [{
		          "y": "10%",
		          "x":"35%",
		          "align": "bottom",
		          "size": 12,
		          "bold": true,
		          "color": "#1d4263",
		          "text": "Integrity"
		        }],
		    "balloon": {
		        "drop": false,
		        "adjustBorderColor": false,
		        "color": "#FFFFFF",
		        "fontSize": 15
		    }




		});

	 });

	
		$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGroupOutliers',{kpi_group:"Mobility",date_id:timestamp,erbs:enodeb_selected}, function (response) {
		//console.log("mobility"+response); 
		var points = response;
		var mobility=[];


		var SortedArraymobility=[];

		for(var i=0;i<(points.length);i++) {

			//console.log("@@@@@@@@@@@@@"+timestamp);
			var tempstr=points[i].date_id;
			
			//console.log(tempstr);
			var str = tempstr.split(" ");
			//console.log(str[0]);
			//console.log((timestamp.localeCompare(points[i].date_id)==0));
			if(timestamp.localeCompare(points[i].date_id)==0)
			{	
				SortedArraymobility.push({cellName:points[i].cell,Outliers:points[i].outlier,date:points[i].date_id});

			}
		}
		console.log(SortedArraymobility);

		SortedArraymobility.sort(function(x, y) {
			return x.Outliers - y.Outliers ;
		});


		console.log(SortedArraymobility.length);


		var color = generateColor('#813264','#f8edf4',SortedArraymobility.length);
	
		for(cor in color)
		{
			mobility.push({color:color[cor],cellName:SortedArraymobility[cor].cellName,Outliers:SortedArraymobility[cor].Outliers,date:SortedArraymobility[cor].date });
		}
		console.log("looped");
		console.log(mobility); 
		var chart4 = AmCharts.makeChart("Mobility", {
			"type": "pie",
			"hideCredits":true,
			labelsEnabled: false,

			marginTop: 0,
			marginBottom: 0,
			marginLeft: 0,
			marginRight: 0,


			"theme": "light",

			"pullOutOnlyOne" :true,
			"dataProvider":mobility,
			   "balloonText": "<span>Cell: </span>[[title]]<br><span>Outliers:</span>[[value]]",
			"valueField": "Outliers",
			"titleField": "cellName",
			"colorField": "color",
			"outlineAlpha": 0.4,
			"angle": 60,
			"depth3D": 10,
			"listeners": [{
				"event": "clickSlice",
				"method": function(e) {
					cellname = e.dataItem.dataContext.cellName;

					console.log(cellname);
					document.getElementById('cellname').innerHTML ="Cell: "+cellname;
					sessionStorage.setItem('Cellname',cellname);
					console.log(sessionStorage.getItem('Cellname'));

				}
			}],
			"balloon": {
				"drop": false,
				"adjustBorderColor": false,
				"color": "#FFFFFF",
				"fontSize": 15
			},
			"allLabels": [{
				"y": "10%",
				"x":"28%",
				"align": "bottom",
				"size": 12,
				"bold": true,
				"color": "#1d4263",
				"text": "Mobility"
			}],

		});





}); 
	
	

		$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGroupOutliers',{kpi_group:"Retainability",date_id:timestamp,erbs:enodeb_selected}, function (response) {
		console.log("ret"); 
		var points = response;
		console.log("retainability"+points);
		var retainbilty=[];
		var SortedArrayretainbilty=[];

		for(var i=0;i<(points.length);i++) {

			//console.log("@@@@@@@@@@@@@"+timestamp);
			var tempstr=points[i].date_id;
			//console.log(tempstr);
			var str = tempstr.split(" ");
			//console.log(str[0]);
			//console.log((timestamp.localeCompare(points[i].date_id)==0));
			if(timestamp.localeCompare(points[i].date_id)==0)
			{	
				SortedArrayretainbilty.push({cellName:points[i].cell,Outliers:points[i].outlier,date:points[i].date_id });

			}
		}
		console.log(SortedArrayretainbilty);

		SortedArrayretainbilty.sort(function(x, y) {
			return x.Outliers - y.Outliers ;
		});


		console.log(SortedArrayretainbilty.length);


		var color = generateColor('#4d2600','#f1e4c1',SortedArrayretainbilty.length);
		
		for(cor in color)
		{
			retainbilty.push({color:color[cor],cellName:SortedArrayretainbilty[cor].cellName,Outliers:SortedArrayretainbilty[cor].Outliers,date:SortedArrayretainbilty[cor].date});
		} 
		console.log("looped");
		console.log(retainbilty);

		var chart2 = AmCharts.makeChart("Retainability", {
		    "type": "pie",
		    "hideCredits":true,
		    labelsEnabled: false,

		    marginTop: 0,
		    marginBottom: 0,
		    marginLeft: 0,
		    marginRight: 0,


		    "theme": "light",
		    "pullOutOnlyOne" :true,
		    "dataProvider":retainbilty,
		    "balloonText": "<span>Cell: </span>[[title]]<br><span>Outliers:</span>[[value]]",
		    "valueField": "Outliers",
		    "titleField": "cellName",
		    "colorField": "color",
		    "outlineAlpha": 0.4,
		    "depth3D": 12,
		    "angle": 60,
		    "listeners": [{
		        "event": "clickSlice",
		        "method": function(e) {
		        	cellname = e.dataItem.dataContext.cellName;

		        	console.log(cellname);
		        	document.getElementById('cellname').innerHTML ="Cell: "+cellname;
		        	sessionStorage.setItem('Cellname',cellname);
		      	  console.log(sessionStorage.getItem('Cellname'));

		        }
		      }],
		    "balloon": {
		        "drop": false,
		        "adjustBorderColor": false,
		        "color": "#FFFFFF",
		        "fontSize": 15
		    },
		    "allLabels": [{
		    	"y": "10%",
		        "x":"28%",
		        "align": "bottom",
		        "size": 12,
		        "bold": true,
		        "color": "#1d4263",
		        "text": "Retainability"
		      }],

		});


	 });
	
	
	
	
	
	
	
	
	
	$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGroupOutliers',{kpi_group:"Accessibility",date_id:timestamp,erbs:enodeb_selected}, function (response) {
		console.log("data received from server");
		//console.log(typeof response);
		//console.log(response);
	
	 var points=response;
		console.log(points);
	var accessbility=[];

		var SortedArrayaccessbility=[];

		for(var i=0;i<(points.length);i++) {

			//console.log("@@@@@@@@@@@@@"+timestamp);
			var tempstr=points[i].date_id;
			//console.log(tempstr);
			var str = tempstr.split(" ");
			//console.log(str[0]);
			//console.log((timestamp.localeCompare(points[i].date_id)==0));
			if(timestamp.localeCompare(points[i].date_id)==0)
			{	
				SortedArrayaccessbility.push({cellName:points[i].cell,Outliers:points[i].outlier,date:points[i].date_id });

			}
		}
		console.log(SortedArrayaccessbility);

		SortedArrayaccessbility.sort(function(x, y) {
			return x.Outliers - y.Outliers ;
		});


		console.log(SortedArrayaccessbility.length);


		var color = generateColor('#cc5200','#ffd699',SortedArrayaccessbility.length);
		
		for(cor in color)
		{
			accessbility.push({color:color[cor],cellName:SortedArrayaccessbility[cor].cellName,Outliers:SortedArrayaccessbility[cor].Outliers,date:SortedArrayaccessbility[cor].date});
		} 
		console.log("looped");
		console.log(accessbility);


		var chart1 = AmCharts.makeChart("Accessibility", {
		    "type": "pie",
		    "hideCredits":true,
		    labelsEnabled: false,

		    marginTop: 0,
		    marginBottom: 0,
		    marginLeft: 0,
		    marginRight: 0,


		    "theme": "light",

		    "pullOutOnlyOne" :true,
		    "dataProvider":accessbility,
		    "balloonText": "<span>Cell: </span>[[title]]<br><span>Outliers:</span>[[value]]",
		    "valueField": "Outliers",
		    "titleField": "cellName",
		    "colorField": "color",
		    "outlineAlpha": 0.4,
		    "angle": 60,
		    "depth3D": 10,
		    "listeners": [{
		        "event": "clickSlice",
		        "method": function(e) {
		        	  cellname = e.dataItem.dataContext.cellName;

		        	  console.log(cellname);
		        	  document.getElementById('cellname').innerHTML ="Cell: "+cellname;
		        	  sessionStorage.setItem('Cellname',cellname);
		        	  console.log(sessionStorage.getItem('Cellname'));

		        }
		      }],
		    "balloon": {
		        "drop": false,
		        "adjustBorderColor": false,
		        "color": "#FFFFFF",
		        "fontSize": 15
		    },
		    "allLabels": [{
		    	"y": "10%",
		        "x":"28%",
		        "align": "bottom",
		        "size": 12,
		        "bold": true,
		        "color": "#1d4263",
		        "text": "Accessibility"
		      }],

		});
	 }); 
	
	
	
	
}

//------------------------ ploting kpi-----------------------------
function hide(){
	 enodeb_selected= document.getElementById("enodeb_select").value ;
	 $("#buttontocompare").hide(); 
	
	 
	 $("#right").hide(); 
	 $("#gridview").hide(); 
    $('table.table').hide();
	 $("#AB801F").show();
	   
}
function datechange(){
	
	cellname=sessionStorage.getItem('Cellname');
	console.log("date is changes and cell name is"+cellname)
	console.log("date changing");
	console.log(sessionStorage.getItem('click'));
	clickedID= sessionStorage.getItem('click');
	 timestamp= document.getElementById("timestamp").value ;
	sessionStorage.setItem('timestamp',timestamp);
  plotavailabiltygraph();
	 plotingkpi(clickedID);
	 middle();
	 start();
	 plotAvailabilityCellwise();

}
$('.kpigrp').click(function(){
	 $("#right").show(); 
	document.getElementById('kpinametabs').innerHTML ='';
	document.getElementById('result').innerHTML ='';
	document.getElementById('row2').innerHTML ='';
//	$("#analysisgraph_heading").show(); 
	console.log("got clickedSS");
	 enodeb_selected= document.getElementById("enodeb_select").value ;
	 sessionStorage.setItem('enodeb_selected',enodeb_selected);
	 timestamp= document.getElementById("timestamp").value ;
	 sessionStorage.setItem('select_date',timestamp);
	 console.log(sessionStorage.getItem('select_date'));
	console.log("type is"+typeof timestamp);
	 console.log("time stamp selected"+timestamp);
	 console.log("enode b slected is"+enodeb_selected);
	  clickedID = this.id;
	  sessionStorage.setItem('click', clickedID );
	  var clicks= sessionStorage.getItem('click');
	  
	 console.log(clickedID);
	document.getElementById('displaykpigrp').innerHTML =clickedID;
	  console.log(clicks);
	 plotingkpi(clickedID);
	 plotAvailabilityCellwise();

});
function plotingkpi(clickedID){
console.log("--------- kpi grp selected is------------"+clickedID);

$.getJSON('KpiGroups/'+clickedID+'.json', function(jd) {
	
		 console.log( jd);
		 var template = $.templates("#svgTemplate1");

	    	var htmlOutput = template.render(jd);

	    	$("#kpinametabs").html(htmlOutput);
	    	var template = $.templates("#svgTemplate2");

	    	var htmlOutput = template.render(jd);

	    	$("#result").html(htmlOutput);
	    	  $("li:first-child").addClass('active');
	    	$('#'+jd[0].id).addClass('in');
	    	$('#'+jd[0].id).addClass('active');
	    	for (i in jd){
	    		
	    		id=jd[i].id;
	    		plot(id);
	    	}
	    
	    	
	 });

}
function plot(id){
	 document.getElementById('pmActiveUeDlSum').innerHTML ='';
	 document.getElementById('pmActiveUeUlSum').innerHTML ='';
	 document.getElementById('pmPdcpVolDlDrb').innerHTML ='';
	 document.getElementById('pmUeThpVolUl').innerHTML ='';
	 document.getElementById('pmSessionTimeUe').innerHTML ='';
	console.log("id is"+id);
	console.log("plotting main kpi");
	console.log("cell name is"+cellname); 
	console.log("enodeb selected is "+enodeb_selected);
	 $.getJSON('kpiUnits.json',function(data){
		var unitsdata=data;
	
		console.log("enodeb selected is "+enodeb_selected);
	
		$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGraphData',{kpi_name:id,date_id:timestamp,eutrancellfdd:cellname}, function (response) { 
		 // console.log("enodeb selected is "+enodeb_selected);
			var points = response;
			console.log("data received from ajax");
			console.log(points);
		var actual=[];
		var time=[];
		var predicted=[];
		var anom=[];
	console.log(unitsdata);
		for(i in unitsdata)
		{
	var flag=id.localeCompare(unitsdata[i].kpi_name)
	if(flag==0){
		var unit=unitsdata[i].units;
	}
		}
	console.log(unit);
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
		console.log(actual);
		console.log(predicted);
		console.log(anom);
		  console.log(id);
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
					  y: actual,
					  mode: 'lines',
					  name: 'Actual',
	
					  hoverinfo:'y',
					  type: 'scatter',
					  line: {
						  dash: 'Dashdot',
						    width: 3,
						    color: '#ff9900',
						   
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
						    width:730,
					        height:230,
					        autosize:true,
					        margin: {
					            l: 45,
					            r: 5,
					            b: 15,
					            t: 5,
					            pad: 0
					          },
					          xaxis: {
					  		    autorange: true,
					  		    
					  		  
					  		    rangeslider: {
					 
					  		      thickness:0.1,
					  		    bgcolor:'transparent'
					  		    	},
					  		      autotick: true,
					  		    ticks: 'outside',
					  		    tick0: 0,
					  		 nticks:8,
					  		    ticklen: 0,
					  		    tickwidth: 0,
					  		    tickcolor: '#000',
					  		  tickfont: {
					  		      family: 'Old Standard TT, serif',
					  		      size: 12,
					  		      color: 'black'
					  		    }
					  		  },
					  		 yaxis: {
						  		  	title:unit,
						  		  titlefont: {
						  		      family: 'sans-serif',
						  		      size: 12,
			
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

					Plotly.newPlot(id, data,layout,{displayModeBar: false, doubleClick: false});
					 document.getElementById(id).on('plotly_relayout', plotlyRelayoutEventFunction);
					 document.getElementById(id).on('plotly_relayout',
							    function(eventdata){  
						
						   xaxisrange.push(eventdata['xaxis.range[0]']);
						   xaxisrange.push(eventdata['xaxis.range[1]']);
						  console.log("###########"+xaxisrange);
					      changerange(xaxisrange);
							    });
					// document.getElementById(id).on('plotly_hover', function(data){
					//	  dragLayer.style.cursor = 'pointer'
					//	});
					 document.getElementById(id).on('plotly_click', function(data){
						   var ptsx ;
						   var ptsy;
							  
						    for(var i=0; i < data.points.length; i++){
						    	ptsx =data.points[i].x;
								   ptsy=data.points[i].y;
						    }
						    console.log(ptsx);
						    console.log(ptsy);
						    console.log("date selectde is "+timestamp);
						    var datetime_id = timestamp+"-"+ptsx.replace(':','-')+"-00";
						    console.log(datetime_id);
						    $.get('http://10.59.130.163:8080/counter-analytics-web/getServiceImpactCounterData',{date_id:timestamp,eutrancellfdd:cellname,datetime_id:datetime_id}, function (jd) { 
						    	
						    	console.log(jd);
						    	//console.log(ptsx);
						    	//console.log("cellname is"+cellname);
						    	for(var i=0;i<jd.length;i++){
						    	
						    		
									 if((jd[i].counterName.localeCompare("pmActiveUeDlSum"))==0){
										 document.getElementById('pmActiveUeDlSum').innerHTML =jd[i].counterValue;
									 }
									 if((jd[i].counterName.localeCompare("pmActiveUeUlSum"))==0){
										 document.getElementById('pmActiveUeUlSum').innerHTML =jd[i].counterValue;
									 }
									 if((jd[i].counterName.localeCompare("pmPdcpVolDlDrb"))==0){
										 document.getElementById('pmPdcpVolDlDrb').innerHTML =jd[i].counterValue;
									 }
									 if((jd[i].counterName.localeCompare("pmUeThpVolUl"))==0){
										 document.getElementById('pmUeThpVolUl').innerHTML =jd[i].counterValue;
									 }
									 if((jd[i].counterName.localeCompare("pmSessionTimeUe"))==0){
										 document.getElementById('pmSessionTimeUe').innerHTML =jd[i].counterValue;
									 }
						    		
						    	}
						    
						    });
						 
						});
					
					
	  });
	//  plotavailabiltygraph();
		});
	 
	  
}
function changerange(xaxisrange){
	console.log("x range is changeing");
	xstart=xaxisrange[0];
	xend=xaxisrange[1];
	middle();
	
	 plotAvailabilityCellwise();
}
//--------------correlated kpi-------------
function plotcorrelated(kpiid){
	
	 document.getElementById('pmActiveUeDlSum').innerHTML ='';
	 document.getElementById('pmActiveUeUlSum').innerHTML ='';
	 document.getElementById('pmPdcpVolDlDrb').innerHTML ='';
	 document.getElementById('pmUeThpVolUl').innerHTML ='';
	 document.getElementById('pmSessionTimeUe').innerHTML ='';
	 sessionStorage.setItem('kpiid',kpiid);

	 $("#buttontocompare").show(); 
	kpiid=kpiid.split(" ");
	currentkpi=kpiid[0];
	console.log("kpi id is"+currentkpi);
	clickedID = sessionStorage.getItem('click');
	$.get('http://10.59.130.163:8080/counter-analytics-web/getCorelatedKpi',{kpi_group:clickedID,kpi_name:currentkpi}, function (response) { 
	
		 correlatedjson=response;
		 console.log( correlatedjson);
	
	
	var template = $.templates("#svgTemplate3");

	var htmlOutput = template.render(correlatedjson);

	$("#row2").html(htmlOutput);
	
	middle();
	
	
	 });
	
}
function middle(){
	for (i in correlatedjson){
	
		 corrkpi=correlatedjson[i].corelated_kpi_id;
		 //document.getElementById('correlated'+corrkpi).innerHTML ='';
		console.log(corrkpi);
		plotcorrelatedgraph(corrkpi);
	}
}
function plotcorrelatedgraph(corrkpi){
	console.log(corrkpi);
	 $.getJSON('kpiUnits.json',function(data){
			var unitsdata=data;
		
			$.get('http://10.59.130.163:8080/counter-analytics-web/getKpiGraphData',{kpi_name:corrkpi,date_id:timestamp,eutrancellfdd:cellname}, function (response) {  
				var points = response;
		  var actual=[];
			var time=[];
			var predicted=[];
			var anom=[];
			console.log(unitsdata);
			for(i in unitsdata)
			{
		var flag=corrkpi.localeCompare(unitsdata[i].kpi_name)
		if(flag==0){
			var unit=unitsdata[i].units;
		}
			}
		console.log(unit);
			for(i=0;i<(points.length);i++){
				//console.log("@@@@@@@@@@@@@"+timestamp);
				if((timestamp.localeCompare("Alldays"))==0){
					//console.log("displaying data for all days");
					time.push(points[i].date_id);
					
					actual.push(points[i].actual);
					predicted.push(points[i].predicted);
					anom.push(points[i].anom);
					
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
		  	//console.log(points);
		  	console.log(time);
		  	console.log(actual);
		  	console.log(predicted);
		  	console.log("xstart is"+xstart);
		  	console.log("xend is"+xend);
			var trace1 = {
					  x: time,
					  y: predicted,
					  mode: 'lines',
					  name: 'Predicted',
			
				 hoverinfo:'y',
					  type: 'scatter',
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
					  name: 'actual',
					
					  hoverinfo:'y',
					  type: 'scatter',
					  line: {
						    color: '#ff9900',
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
						    title: ' ',
						    showlegend: false,
						    width:220,
					        height:150,
					        autosize:true,
					        margin: {
					            l: 40,
					            r: 0,
					            b: 20,
					            t: 5,
					            pad: 0
					          },
					          xaxis: {range: [xstart, xend],
					        	
					        	  autotick: true,
						  		    ticks: 'outside',
						  		    tick0: 0,
						  	nticks:6,
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
						  		  title:unit,
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

			
					Plotly.newPlot('correlated'+corrkpi, data,layout,{displayModeBar: false});
	
				  
		  
	  });
	 });
	  }


function analyse(){
	console.log("###################called######################");
	var checkedValue = []; 
	console.log(currentkpi);
	var inputElements = document.getElementsByName('correlatedkpi');
	console.log(inputElements);
	for(var i=0; inputElements[i]; ++i){
	      if(inputElements[i].checked){
	           checkedValue.push(inputElements[i].value);
	           
	           
	      }
	}
	console.log(checkedValue);
	if(checkedValue.length==0){
		alert("Please select any KPI to compare");
	}
	if(checkedValue.length>3){
		alert("User can only select maximum 3 KPI's to compare");
		for(var i=0; inputElements[i]; ++i){
		      if(inputElements[i].checked){
		    	  inputElements[i].checked = false;
		           
		           
		      }
		}
	}
	if(checkedValue.length!=0 )

	  {
		if(checkedValue.length<4){
		 console.log("checked value"+checkedValue.length);
		 console.log("@@@@@@"+timestamp)
		  url = 'Analysis.html?checkedValue='+encodeURIComponent(checkedValue)+'&currentkpi='+encodeURIComponent(currentkpi)+'&enodeb_selected='+encodeURIComponent(enodeb_selected)+'&timestamp='+encodeURIComponent(timestamp)+'&xstart='+encodeURIComponent(xstart)+'&xend='+encodeURIComponent(xend)+'&cellname='+encodeURIComponent(cellname);
	   location.href = url;
	}
	  }


   
}

function plotavailabiltygraph(){
	timestamp=document.getElementById('timestamp').value;
	console.log("plotting availability"+timestamp);
	$.get('http://10.59.130.163:8080/counter-analytics-web/getCellAvailibilityByNode',{date_id:timestamp,erbs:enodeb_selected}, function (response) {  
		 console.log("$$$$$"+timestamp);
		 var points = response;
		 console.log(points);
		 var value=[];
			var time=[];
			

			for(i=0;i<(points.length);i++){
			
				if((timestamp.localeCompare("Alldays"))==0){
					//console.log("displaying data for all days");
					time.push(points[i].datetime_id);
					value.push(points[i].cell_availability);
					//xstart=0;
					//xend=(points.length-1);
					//console.log(xstart+" "+xend);
					
				}
				else{
					var tempstr=points[i].datetime_id;
					 var str = tempstr.split(" ");
					 var n = timestamp.localeCompare(str[0]);
				
					 if(n==0)
		             {
						// console.log(str[0]);
						// console.log(timestamp);
					 var trim= str[1].split(":");
					 var concate= trim[0]+':'+trim[1];
					
					time.push(concate);
					value.push(points[i].cell_availability);	
				   }
			
			
	             }
			}
			//console.log("*****"+time);
		  var trace1 = {
				  x: time,
				  y: value,
				  mode: 'lines',
				  name: 'Actual',
			
			 hoverinfo:'y',
				  type: 'scatter',
				  line: {
					    color: '#ff9900',
					    width: 3,
					    shape: 'spline'
					  }
				};
	
				var data = [trace1];
				var layout = {
					    title: ' ',
					    showlegend: false,
					    width:300,
				        height:200,
				        autosize:true,
				        margin: {
				            l: 40,
				            r: 0,
				            b: 35,
				            t: 15,
				            pad: 0
				          },
				          xaxis: {range: [xstart, xend],
				        	
				        	  autotick: true,
					  		    ticks: 'outside',
					  		    tick0: 0,
					  	nticks:8,
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
				        	  title:'percentage',
				        	  titlefont: {
					  		      family: 'sans-serif',
					  		      size: 12
					  		    }, 
					  		  range:[0,100],
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

		
				Plotly.newPlot('analysisgraph', data,layout,{displayModeBar: false});
	        	//  document.getElementById('analysisgraph_heading').innerHTML ="Partial Cell Availability";
			
	  });
	 
}

$(document).ready(function() {
	//  $("#right, #left").css("height", $("#center").height());
	   $('[data-toggle="tooltip"]').tooltip();  
	});

function back()
{
	var a=location.hash;
	var b=a.split("?");
	var c=b[1];
	var d=c.split("&");
	var e=d[0].split("=");
	var f=d[1].split("=");

	var g=d[2].split('=');
	setdate=g;
	console.log(g[1]);
	
	cellname=sessionStorage.getItem('Cellname');
	var clicks= sessionStorage.getItem('click');
	console.log("session"+clicks);
	
	var date_selected=sessionStorage.getItem('select_date');
	console.log("date"+date_selected);
	

	var checkbox = sessionStorage.getItem('checked');
	console.log("sdhgashj"+checkbox);


	console.log("stored cell name"+sessionStorage.getItem('Cellname'));
	if(b[0]==="#flag")
		{
		 $("#right").show(); 
		timestamp= sessionStorage.getItem('select_date') ;
		enodeb_selected=sessionStorage.getItem('enodeb_selected');
		console.log(enodeb_selected);
		plotAvailabilityCellwise();
		console.log(date_selected);
		console.log(sessionStorage.getItem('click'));
		plotingkpi(sessionStorage.getItem('click'));
		clickedID = sessionStorage.getItem('click');
		plotcorrelated(sessionStorage.getItem('kpiid'));
	
		// $("#enodeb_select").val(enodeb_selected);
		 document.getElementById('enodeb_select').value =enodeb_selected;
		 document.getElementById('timestamp').value =timestamp;
		  console.log("date stored iin back"+timestamp);
			cellname=sessionStorage.getItem('Cellname');
		document.getElementById('cellname').innerHTML="Cell: "+sessionStorage.getItem('Cellname');
		document.getElementById('displaykpigrp').innerHTML =sessionStorage.getItem('click');
		start();
	
	}
}
 

function plotAvailabilityCellwise(){


	console.log("plotting cell wise availability");
	console.log("cellname"+cellname);
	
	cellname=sessionStorage.getItem('Cellname');
	if(cellname!=null){
		$("#showtable").hide();
		 $("#analysisgraph").show(); 
		 $("#gridview").hide();
	}
	
	console.log("cellname stored in avail"+cellname);
	$.get('http://10.59.130.163:8080/counter-analytics-web/getCellAvailibilityByCell',{date_id:timestamp,eutrancellfdd:cellname}, function (response) {  
		 console.log("$$$$$"+timestamp);
		 var points = response;
		 console.log(points);
		 var value=[];
			var time=[];
			

			for(i=0;i<((points.length));i++){
				if((timestamp.localeCompare("Alldays"))==0){
					//console.log("displaying data for all days");
					time.push(points[i].datetime_id);
					value.push(points[i].cell_availability);
				
					
				}
				else{
					var tempstr=points[i].datetime_id;
					 var str = tempstr.split(" ");
					 var n = timestamp.localeCompare(str[0]);
				
					 if(n==0)
		             {
						
					 var trim= str[1].split(":");
					 var concate= trim[0]+':'+trim[1];
					
					time.push(concate);
					value.push(points[i].cell_availability);	
				   }
			
			
	             }
			
			}
			console.log(time);
			console.log(value);
		  var trace1 = {
				  x: time,
				  y: value,
				  mode: 'lines',
				  name: 'Actual',
			
			 hoverinfo:'y',
				  type: 'scatter',
				  line: {
					    color: '#ff9900',
					    width: 5,
					    shape: 'spline'
					  }
				};
	
				var data = [trace1];
				var layout = {
					    title: ' ',
					    showlegend: false,
					    width:300,
				        height:200,
				        autosize:true,
				        margin: {
				            l: 35,
				            r: 0,
				            b: 35,
				            t: 25,
				            pad: 0
				          },
				          xaxis: {range: [xstart, xend],
				        	
				        	  autotick: true,
					  		    ticks: 'outside',
					  		    tick0: 0,
					  	nticks:8,
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
				        	  title:'percentage',
				        	  titlefont: {
					  		      family: 'sans-serif',
					  		      size: 12
					  		    }, 
				        
					  		  range:[0,100],
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

		
				Plotly.newPlot('analysisgraph', data,layout,{displayModeBar: false});
				cellname=sessionStorage.getItem('Cellname');
	         document.getElementById('analysisgraph_heading').innerHTML ="Availability for Cell: "+cellname;
			
	  });
	 
}

$(".nav-tabs").hover(function () {  $(this).css("overflow", "hidden"); $(this).css("overflow", "auto"); }, function () { $(this).animate({ height: "42px" }, 600); });





function showtable(){
	 $("#gridview").show(); 
	 $("#analysisgraph").hide(); 
	
}
function showgraph(){
	 $("#analysisgraph").show(); 
	 $("#gridview").hide(); 
}

function enodeBchange(){
	console.log("@@@@@@@@@@@@@@@@@@@@@@@@");
	cellname=sessionStorage.getItem('Cellname');
	console.log("enodeb is changing and cell name is"+cellname);
	console.log("enodeb is changoing");
	console.log(sessionStorage.getItem('click'));
	clickedID= sessionStorage.getItem('click');
	 timestamp= document.getElementById("timestamp").value ;
	 enodeb_selected= document.getElementById("enodeb_select").value ;
	sessionStorage.setItem('timestamp',timestamp);
	sessionStorage.setItem('enodeb_selected',enodeb_selected);

    start();
 
    plotavailabiltygraph();
    document.getElementById('kpinametabs').innerHTML ='';
	document.getElementById('result').innerHTML ='';
	document.getElementById('row2').innerHTML ='';
	document.getElementById('cellname').innerHTML='';
	document.getElementById('displaykpigrp').innerHTML ='';
	$("#showtable").show();
}

$('select').change(function(){
    if($(this).val() != "-1")
    {
    $('table.table').hide();
    $('table#'+$(this).val()).show();
    }
})
