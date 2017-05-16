<html>
<body>
<h1>Test page</h1>
<%@ page import="co.hatchmoney.hmrc.HelloFromHatch" %>
<%
    HelloFromHatch hellotest = new HelloFromHatch();
%>
<p>
    Response from Hatch using the &apos;HelloFromHatch&apos; test API is:<br>
    <%= hellotest.getHello() %>
</p>
</body>
</html>
