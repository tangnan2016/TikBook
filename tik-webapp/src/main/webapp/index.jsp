<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>tikbook technology</title>
    <link rel="stylesheet" href="/static/css/login.css">
</head>
<body>
    <div class="login">
        <div class="loginArea">
            <div class="header">
            </div>
            <div class="content">
                <form id="login-form" method="post" operatype="login" action="">
                    <ul>
                        <li><em></em><input type="text" name="loginId"  placeholder="用户名" id="user-name"></li>
                        <li><em></em><input type="password" name="password"  placeholder="密码" id="password"></li>
                        <li class="pay-message"></li>
                    </ul>
                    <a href="javascript:;" class="loginBtn" id="login-btn">登录</a>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
