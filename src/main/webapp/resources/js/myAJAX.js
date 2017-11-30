
/*авторизация*/
function authorize(ob){
		var email = ob.form.email.value;
		var password = ob.form.password.value;
		alert("work");
		$.ajax({
			type: "POST",
			url: "authorize",
			data: {
				'email': email,
				'password': password,
				'isValid':"true"
			}
		});		
};

/* регистрация*/
function register(ob){
	var email = ob.form.email.value;
	var password = ob.form.password.value;
	var fname =ob.form.first_name.value;
	var lname = ob.form.last_name.value;
	var company = ob.form.company.value;
	var country = ob.form.country.value;
	var address = ob.form.address.value;
	var phone = ob.form.phone.value;
	var confirm_password = ob.form.confirm_password.value;
	if (password == confirm_password) {
		$.ajax({
			type : "POST",
			url : "registration",
			data : {
				'email' : email,
				'password' : password,
				'first_name':fname,
				'last_name':lname,
				'company':company,
				'country':country,
				'address':address,
				'phone':phone
			},
			success: function(data){
				$('#registration_form').html(data);
			}
		});
	}
	else
		alert("Пароли не совпадают");
};


/*Загрузка таблицы с заказами из базы данных*/
function getOrders(path){
	alert("work");
	$.ajax({
		type: "POST",
		url: path,
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
};

/*загрузка формы для добавления заказа*/
function getOrderForm(){
	alert("work");
	$.ajax({
		type: "POST",
		url: "getOrderForm",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
};
/*загрузка формы для добавления фильма*/
function loadFormAddFilm(){
	alert("work");
	$.ajax({
		type: "POST",
		url: "loadFormFilm",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
};

/*Запрос на добавление нового фильма*/
function addFilm(ob){
	var name = ob.form.name.value;
	var date = ob.form.date.value;
	var genre = ob.form.genre.value;
	var producer = ob.form.producer.value;
	var price = ob.form.price.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "addFilm",
			data : {
				'name' : name,
				'release_date' : date,
				'genre':genre,
				'producer':producer,
				'price':price
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
};

/*Запрос на создание заказа*/
function doOrder(ob){
	var film = ob.form.film.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "doOrder",
			data : {
				'film' : film
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
};

/*Запрос на форму необработанных заказов*/
function getProcessOrder(){
	alert('work');
	$.ajax({
			type : "POST",
			url : "processOrders",
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
};

/*Одобрить заказ*/
function acceptOrder(ob){
	var id_sell = ob.form.id_sell.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "acceptOrder",
			data : {
				'id_sell' : id_sell
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
};

/*Отклонить заказ*/
function declineOrder(ob){
	var id_sell = ob.form.id_sell.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "declineOrder",
			data : {
				'id_sell' : id_sell
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
};

/*Выбранный запрос заказа из таблицы посылается на сервер*/
function selectOrder(ob){
	var selectedOrder=ob.innerHTML;
	$.ajax({
		type:"POST",
		url:"selectOrder",
		data:{
			'order':selectedOrder
		},
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}


/*Запрос на список фильмов*/
function loadAllFilms(){
	$.ajax({
		type:"POST",
		url:"loadAllFilms",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}

/*Выбранный фильм из таблицы посылается на сервер*/
function selectFilm(ob){
	var selectedFilm=ob.innerHTML;
	$.ajax({
		type:"POST",
		url:"selectFilm",
		data:{
			'film':selectedFilm
		},
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}

/*Запрос на обновление фильма*/
function updateFilm(ob){
	var id_film = ob.form.id_film.value;
	var name = ob.form.name.value;
	var release_date = ob.form.release_date.value;
	var genre = ob.form.genre.value;
	var producer = ob.form.producer.value;
	var price = ob.form.price.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "updateFilm",
			data : {
				'id_film':id_film,
				'name' : name,
				'release_date' : release_date,
				'genre':genre,
				'producer':producer,
				'price':price
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
}

/*Запрос на удаление фильма*/
function deleteFilm(ob){
	var id_film = ob.form.id_film.value;
	alert('work');
	$.ajax({
			type : "POST",
			url : "deleteFilm",
			data : {
				'id_film':id_film,
			},
			success: function(data){
				$('#dynamic-content').html(data);
			}
		});
}

/*======================ADMIN VIEW==========================================================*/
/*загрузить таблицу со всеми пользователями*/
function showAllusers(){
	$.ajax({
		type:"POST",
		url:"showAllusers",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}


/*Загрузить форму для добавления пользователя*/
function addUserForm(){
	$.ajax({
		type:"POST",
		url:"addUserForm",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}

/*запрос на добавление нового пользователя*/ 
function addUser(ob){
	var email = ob.form.email.value;
	var password = ob.form.password.value;
	var role = ob.form.role.value;
	var status = ob.form.status.value;
	$.ajax({
		type:"POST",
		url:"addUser",
		data:{
			'email':email,
			'password':password,
			'role':role,
			'status':status
		},
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
}

/*Загрузка таблицы с заказами из базы данных только тех которые делал клиент*/
/*function getClientOrders(){
	alert("work");
	$.ajax({
		type: "POST",
		url: "showClientOrders",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
};*/

/*Загрузка таблицы с заказами из базы данных только тех которые делал клиент 
 * и которые находятся на обработке тоесть без даты обработки*/
/*function getProcessClientOrders(){
	alert("work");
	$.ajax({
		type: "POST",
		url: "showProcessOrders",
		success:function(data){
			$('#dynamic-content').html(data);
		}
	});
};*/
