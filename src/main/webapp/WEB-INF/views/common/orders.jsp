<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<table class="table-dark table-striped" border="2" style="margin: auto;padding:5px">
	<tr>
		<th>Номер заказа</th>
		<th>Фильм</th>
		<th>Клиент</th>
		<th>Дата заказа</th>
		<th>Дата Обработки</th>
		<th>Статус</th>
	</tr>
	<c:forEach var="order" items="${orders}">
		<tr>
			<th><c:out value="${order.getId_sell()}"></c:out></th>
			<th><c:out value="${order.getId_film().getName()}"></c:out></th>
			<th><c:out value="${order.getId_client().getCompany()}"></c:out></th>
			<th><c:out value="${order.getApp_date()}"></c:out></th>
			<th><c:out value="${order.getProcess_date()}"></c:out></th>
			<th><c:out value="${order.getId_status().getName()}"></c:out></th>
		</tr>
	</c:forEach>
</table>