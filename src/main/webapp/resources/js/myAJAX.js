
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