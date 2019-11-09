<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-07
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="${path}/css/reset.css" rel="stylesheet">
    <link href="${path}/css/main.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>
<div class="main">
    <img src="${path}/img/2.png">

    <div class="basic">
        <a href="https:www.baidu.com"></a>
    </div>
    <div class="introduce">
        <a href="https:www.taobao.com"></a>
    </div>
    <div class="work">
        <a href="https:www.163.com"></a>
    </div>
    <div class="project">
        <a href="${path}/jsp/experience.jsp"></a>
    </div>
    <div class="education">
        <a href="${path}/jsp/education.jsp"></a>
    </div>

</div>
</body>
</html>