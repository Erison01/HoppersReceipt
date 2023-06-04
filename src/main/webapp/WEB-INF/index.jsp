<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1>Customer Name: <c:out value="${Name}"/></h1>
<h2>Item Name: <c:out value="${Item}"/></h2>
<h2>Price: <c:out value="${Price}"/></h2>
<h2>Description: <c:out value="${Description}"/></h2>
<h2>Vendor: <c:out value="${Vendor}"/></h2>
</body>
</html>