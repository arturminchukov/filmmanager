<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form full">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false;-->
	<table class="table table-hover table-dark table-striped" style="margin: auto;padding:5px">
	<tr>
		<th>Номер заказа</th>
		<th>Фильм</th>
		<th>Клиент</th>
		<th>Дата заказа</th>
		<th>Статус</th>
	</tr>
	<c:forEach var="order" items="${orders}">
		<tr onclick="selectOrder(this)">
			<td><c:out value="${order.getId_sell()}"></c:out></td>
			<td><c:out value="${order.getId_film().getName()}"></c:out></td>
			<td><c:out value="${order.getId_client().getCompany()}"></c:out></td>
			<td><c:out value="${order.getApp_date()}"></c:out></td>
			<td><c:out value="${order.getId_status().getName()}"></c:out></td>
		</tr>
	</c:forEach>
</table>
</div>