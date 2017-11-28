<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="form">
<!--  Чтобы страница не обновлялась после отправки формы используем  конструкцию onsubmit="return false";-->
	<form class="registration" onsubmit="return false;">
	
		<div class="field-wrap text-success" id="success-adding-film">
		</div>
		
		<div class="field-wrap">
			<label class="registration active highlight">Номер заказа</label>
			 <input class="registration" type="text" name="id_sell" disabled autocomplete="off" 
			 required="required" value="<c:out value="${order.getId_sell()}"></c:out>" />
		</div>

		<div class="field-wrap">
			<label class="registration active highlight"> Фильм</label>
			<div class='input-group date' id='datetimepicker2' >
				<input class="registration" type="text" name="film" required="required" disabled
				value="<c:out value="${order.getId_film().getName()}"></c:out>">
			</div>
		</div>


		<div class="top-row">
			<div class="field-wrap">
				<label class="registration active highlight"> Компания клиента </label> <input
					class="registration" type="text" name="client" required="required"
					disabled
					value="<c:out value="${order.getId_client().getCompany()}"></c:out>">
			</div>

			<div class="field-wrap">
				<label class="registration active highlight"> Имя клиента </label> <input
					class="registration" type="text" name="client" required="required"
					disabled
					value="<c:out value="${order.getId_client().getName()}"></c:out>">
			</div>
		</div>


		<div class="field-wrap">
			<label class="registration active highlight"> Дата заказа</label>
			<div class='input-group date' id='datetimepicker2' >
				<input class="registration" type="date" name="dateOrder" disabled required="required"
				 value=<c:out value="${order.getApp_date()}"></c:out>>
			</div>
		</div>

		<button  class="button button-block" onclick="acceptOrder(this)">
			Accept
		</button>
		
		<button  class="button button-block" onclick="declineOrder(this)">
			Decline
		</button>

	</form>
</div>