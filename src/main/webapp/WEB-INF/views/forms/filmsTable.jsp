<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form full">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false;-->
	<table class="table table-hover table-dark table-striped" style="margin: auto;padding:5px">
	<tr>
		<th>Номер</th>
		<th>Название</th>
		<th>Дата выпуска</th>
		<th>Жанр</th>
		<th>Режиссер</th>
		<th>Цена</th>
	</tr>
	<c:forEach var="film" items="${films}">
		<tr onclick="selectFilm(this)">
			<td><c:out value="${film.getId_film()}"></c:out></td>
			<td><c:out value="${film.getName()}"></c:out></td>
			<td><c:out value="${film.getRelease_date()}"></c:out></td>
			<td><c:out value="${film.getId_genre().getName()}"></c:out></td>
			<td><c:out value="${film.getId_producer().getName()}"></c:out></td>
			<td><c:out value="${film.getPrice()}"></c:out></td>
		</tr>
	</c:forEach>
</table>
</div>