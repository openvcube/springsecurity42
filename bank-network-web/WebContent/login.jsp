<%@page pageEncoding="GBK" contentType="text/html; charset=GBK" %>
<html>
  <head>
    <title>欢迎，网银客户，请登录</title>
  </head>

  <body onload="document.f.j_username.focus();">
    <h1>登录</h1>


    <form action="j_security_check" method="post">
      <table>
        <tr><td>用户名：</td><td><input type='text' name='j_username' ></td></tr>
        <tr><td>密码：</td><td><input type='password' name='j_password'></td></tr>
        <tr><td colspan='2'><input name="submit" type="submit"></td></tr>
        <tr><td colspan='2'><input name="reset" type="reset"></td></tr>
      </table>
    </form>

  </body>
</html>
