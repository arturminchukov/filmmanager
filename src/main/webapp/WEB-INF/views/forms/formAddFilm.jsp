<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false;-->
	<form class="registration" onsubmit="return false;">
	
		<div class="field-wrap text-success" id="success-adding-film">
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight">Название фильма</label>
			 <input class="registration" type="text" name="name" autocomplete="off" required="required"/>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Дата выпуска</label>
			<div class='input-group date' id='datetimepicker2' >
				<input type="date" name="date" required="required">
			</div>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Жанр </label> 
			 <select class="form-control" name="genre" id="genre" required="required">
			 <c:forEach var="genre" items="${genres}">
				<option><c:out value="${genre.getName()}"></c:out></option>
			</c:forEach>
			</select>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Режиссер </label> 
			<select class="form-control" name="producer" id="producer" required="required">
			 <c:forEach var="producer" items="${producers}">
				<option>
					<c:out value="${producer.getId_producer()}"></c:out>
					<c:out value=" ${producer.getName()}"></c:out>
					<c:out value=" ${producer.getLastname()}"></c:out>
					</option>
			</c:forEach>
			</select>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Стоимость </label> <input
				class="registration" type="number" name="price" autocomplete="off" required="required"/>
		</div>

		<button  class="button button-block" onclick="addFilm(this)">
			Добавить
		</button>

	</form>
</div>