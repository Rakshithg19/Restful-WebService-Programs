<html>
<head>
        <title>How to consume RESTful Web Service using jQuery</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
        <script src="js/consume-rest.js"></script>
        <script>
        $(document).ready(function(){
      	  $("button").click(function(){
      	    $("#div1").load("http://localhost:8081/Car_Rest_wsr/webapi/raksh");
      	    
      	  });
      	});</script>
      	
	
	
    </head>
<body>
<div id="div1"><h2> jQuery AJAX </h2></div>
 <br /><br />  
           <div class="container">  
                <h1 align="center">Show JSON Data in Jquery Table</h3><br />  
                <h3 align="center">Car Datails</h3><br />  
                <table id="data-table" class="table table-bordered">  
                </table>  
           </div>  

<button>Submit</button>
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/myresource">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!


	</body>
</html>
<script>  
$(document).ready(function() {

	 $('#data-table').DataTable({
         processing: true,
         serverSide: true,
         ajax:{url:"http://localhost:8081/Car_Rest_wsr/webapi/raksh",dataSrc:""}
   }
);
} );  
 </script>  
