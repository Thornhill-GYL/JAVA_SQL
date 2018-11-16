<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>hello</title>
</head>
<body>
	<form action = "<%=basePath %>/Insertuser" method = "post">
		<p>编&nbsp;号：<input type="text" name="id"></p>
		<p>昵&nbsp;称：<input type="text" name="name"></p>
		<p>姓&nbsp;名：<input type="text" name="real_name"></p>
		<p>密&nbsp;码：<input type="text" name="word"></p>
		<p>电&nbsp;话：<input type="text" name="phone"></p>
		<p>邮&nbsp;箱：<input type="text" name="mail"></p>
		<p><input type="submit" value="注册"></p>
		
	</form>
	<tr>
	<form action = "<%=basePath %>/Deleteuser" method = "post">
		<p>序&nbsp;号：<input type="text" name="id"></p>
		<p><input type="submit" value="删除"></p>
		
	</form>
	<tr>
	<form action = "<%=basePath %>/Searchuser" method = "get">
		<p>序&nbsp;号：<input type="text" name="id"></p>
		<p><input type="submit" value="查询"></p>
		
	</form>
	<tr>
	<form action = "<%=basePath %>/Updateuser" method = "post">
		<p>编&nbsp;号：<input type="text" name="id"></p>
		<p>昵&nbsp;称：<input type="text" name="name"></p>
		<p>姓&nbsp;名：<input type="text" name="real_name"></p>
		<p>密&nbsp;码：<input type="text" name="word"></p>
		<p>电&nbsp;话：<input type="text" name="phone"></p>
		<p>邮&nbsp;箱：<input type="text" name="mail"></p>
		<p><input type="submit" value="修改"></p>
		
	</form>
	
</body>
</html>
