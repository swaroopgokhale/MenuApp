<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<title>My jQuery JSON Web Page</title>
<head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">

JSONTest = function() {

    var resultDiv = $("#resultDivContainer");
    
/*    $.post( "http://localhost:8080/MenuApp/rest/Menu/addMenu",
    		{"id":"10","name":"panu puri","category":"snacks","photo":"puri1"}, function( data ){
    	alert("Success");
    	});
*/
    $.ajax({ 
        url: "http://localhost:8080/MenuApp/rest/Menu/addMenu",
        type: "POST",
        data:"{\"id\" : 10,\"name\":\"panupuri\",\"category\":\"snacks\",\"photo\":\"puri1\"}",
        headers: { 
            'Accept': 'application/json',
            'Content-Type': 'application/json' 
        },
        dataType: "json",
        success: function (result) {
            switch (result) {
                case true:
                    processResponse(result);
                    break;
                default:
                    resultDiv.html(result);
            }
        },
        error: function (xhr, ajaxOptions, thrownError) {
        alert(xhr.status);
        alert(thrownError);
        }
    });
    
    
};

</script>
</head>
<body>

<h1>My jQuery JSON Web Page</h1>

<div id="resultDivContainer"></div>

<button type="button" onclick="JSONTest()">JSON</button>

</body>
</html> 