<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<div class="form">
	<form class="registration" onsubmit="return false;">


		<div class="field-wrap">
			<label class="registration active highlight">Название фильма</label>
			 <select class="form-control" id="sel1" name="film">
			 <c:forEach var="film" items="${films}">
				<option><c:out value="${film.getName()}"></c:out></option>
			</c:forEach>
			</select>
		</div>

		

		<button onclick="doOrder(this)" class="button button-block" >
		Заказать
		</button>

	</form>
</div>