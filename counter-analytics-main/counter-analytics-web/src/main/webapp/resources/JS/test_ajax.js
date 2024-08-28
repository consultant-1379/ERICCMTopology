/*function sendrequest(){
	
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (this.readyState == 4 && this.status == 200) {
	      document.getElementById("demo").innerHTML = this.responseText;
	    }
	  };
	  xhttp.open("GET","http://10.59.130.163:8080/counter-analytics-web/getAccessbilityOutlier?date_id=2016-06-06&erbs=AB801F",true);
	  xhttp.send();
}*/

function sendrequest() {
	 $.ajax(
             {
                 dataType: 'json',
                 headers: {
                     Accept:"application/json",
                     "Access-Control-Allow-Origin": "*"
                 },
                 type:'GET',
                 url:'http://10.59.130.163:8080/counter-analytics-web/getAccessbilityOutlier?date_id=2016-06-06&erbs=AB801F',
                 success: function(data)
                 {
                    console.log(data);
                    
                 },
                 error: function(data)
                 {
                     alert("error");
                 }
             });
	}
