<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false";-->
	<form class="registration" onsubmit="return false;">
	
		<div class="field-wrap text-success" id="success-adding-film">
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight">Номер фильма</label>
			 <input class="registration" type="text" name="id_film" disabled autocomplete="off" 
			 required="required" value="<c:out value="${film.getId_film()}"></c:out>" />
		</div>


		<div class="field-wrap">
			<label class="registration active highlight"> Название фильма
			</label> <input class="registration" type="text" name="name"
				required="required"
				value="<c:out value="${film.getName()}"></c:out>">
		</div>


		<div class="field-wrap">
			<label class="registration active highlight"> Дата выпуска</label>
			<div class='input-group date' id='datetimepicker2' >
				<input class="registration" type="date" name="release_date" disabled required="required"
				 value=<c:out value="${film.getRelease_date()}"></c:out>>
			</div>
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight"> Жанр </label> 
			 <select class="form-control" name="genre" id="genre" required="required">
			 <option><c:out value="${film.getId_genre().getName()}"></c:out></option>
			 <c:forEach var="genre" items="${genres}" >
				<option><c:out value="${genre.getName()}"></c:out></option>
			</c:forEach>
			</select>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Режиссер </label> 
			<select class="form-control" name="producer" id="producer" required="required">
			<option>
				<c:out value="${film.getId_producer().getId_producer()}"></c:out>
				<c:out value=" ${film.getId_producer().getName()}"></c:out>
				<c:out value=" ${film.getId_producer().getLastname()}"></c:out>
			</option>
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
			<label class="registration active highlight"> Цена </label> <input
				class="registration" type="text" name="price" required="required"
				value="<c:out value="${film.getPrice()}"></c:out>">
		</div>

		<div class="top-row">
			<button  class="button button-block" onclick="updateFilm(this)">
				Обновить
			</button>
			
			<button  class="button button-block" onclick="deleteFilm(this)">
				Удалить
			</button>
		</div>

	</form>
</div>