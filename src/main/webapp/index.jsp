<%--
  Created by IntelliJ IDEA.
  User: 王宁
  Date: 2022/3/20
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

private long id;
private String password;
private String email;
private String phoneNum;
private char gender;
private String username;


<form action="api/user/add" method="post">
    <input type="text" name="username" placeholder="username"><br>
    <input type="text" name="password" placeholder="password"><br>
    <input type="text" name="email" placeholder="email"><br>
    <input type="text" name="phoneNum" placeholder="phoneNum"><br>
    <input type="text" name="gender" placeholder="gender"><br>
    <input type="submit" value="保存">
</form>


<form action="api/user/get" method="post">

    <input type="text" name="id">
    <input type="text" name="id">
    <input type="text" name="id">
    <input type="text" name="id">
    <input type="submit" value="查很多">
</form>


<form action="api/user/login" method="post">
    <input type="text" name="username" placeholder="username"><br>
    <input type="text" name="password" placeholder="password"><br>
    <input type="text" name="email" placeholder="email"><br>
    <input type="text" name="phoneNum" placeholder="phoneNum"><br>
    <input type="text" name="gender" placeholder="gender"><br>
    <input type="submit" value="提交">
</form>


<form action="/api/product/add3" method="post">
    <%--    public Object t4(String name, int uid,  @RequestBody Producttype []types){--%>
    <input type="text" name="name">
    <input type="number" name="uid">
    <input type="text" name="types.name">
    <input type="text" name="types.price">
    <input type="text" name="types.photoPath">
    <input type="text" name="types.number">
    <input type="text" name="types.name">
    <input type="text" name="types.price">
    <input type="text" name="types.photoPath">
    <input type="text" name="types.number">
    <input type="submit" value="提交">


</form>

</body>
</html>
