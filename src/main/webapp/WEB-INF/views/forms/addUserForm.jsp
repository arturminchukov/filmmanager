<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false;-->
	<form class="registration" onsubmit="return false;">
	
		<div class="field-wrap text-success" id="success-adding-film">
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight">Адресс электронной почты</label>
			 <input class="registration" type="text" name="email" autocomplete="off" required="required"/>
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight">Пароль</label>
			 <input class="registration" type="text" name="password" autocomplete="off" required="required"/>
		</div>


		<div class="field-wrap">
			<label class="registration active highlight"> Роль </label> 
			 <select class="form-control" name="role" required="required">
				 <c:forEach var="role" items="${roles}">
					<option><c:out value="${role.getName()}"></c:out></option>
				</c:forEach>
			</select>
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Статус </label> 
			 <select class="form-control" name="status" required="required">
				 <c:forEach var="status" items="${statuses}">
					<option><c:out value="${status.getName()}"></c:out></option>
				</c:forEach>
			</select>
		</div>

		<button  class="button button-block" onclick="addUser(this)">
			Добавить
		</button>

	</form>
</div>