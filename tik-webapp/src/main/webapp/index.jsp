<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tikBook technology</title>
    <script src="static/js/jquery-3.2.1/jquery-3.2.1.min.js"></script>
</head>
<body>
    hello world!
    <input type="button" value="login" id="login"/>
    <script type="text/javascript">
        $("#login").click(function(){
            var url = "/user/login.action";
            var sendData = null;
            $.post(url,sendData,function(backData,textStaut,ajax){
                alert(ajax.responseText);
            });
        });
    </script>
</body>
</html>
