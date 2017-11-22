<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.request.contextPath}/resources"/>
<%-- <c:set var="context" value="../../resources"/> --%>
    
<!DOCTYPE html>
<!--[if lt IE 7]>      <html lang="en" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html lang="en" class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html lang="en" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
<head>
	<!-- meta character set -->
	<meta charset="utf-8">
	<!-- Always force latest IE rendering engine or request Chrome Frame -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Marvel Studios</title>		
	
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- CSS
		================================================== -->
		
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>

		<link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


		<link rel="stylesheet" href="${context}/css/registration.css">
		<!-- Fontawesome Icon font -->
		<link rel="stylesheet" href="${context}/css/font-awesome.min.css">
		 
		<!-- bootstrap.min -->
		<link rel="stylesheet" href="${context}/css/jquery.fancybox.css">
		
		<!-- bootstrap.min -->
		<link rel="stylesheet" href="${context}/css/bootstrap.min.css">
		
		<!-- bootstrap.min -->
		<link rel="stylesheet" href="${context}/css/owl.carousel.css">
		
		<!-- bootstrap.min -->
		<link rel="stylesheet" href="${context}/css/slit-slider.css">
		
		<!-- bootstrap.min -->
		<link rel="stylesheet" href="${context}/css/animate.css">
		 
		<!-- Main Stylesheet -->
		<link rel="stylesheet" href="${context}/css/main.css">


		<script src="${context}/js/myAJAX.js"></script>
		
		
		<!-- Modernizer Script for old Browsers -->
		<script src="${context}/js/modernizr-2.6.2.min.js"></script>
		
	
			
			
	</head>
	
	<body id="body">
		<!-- preloader -->
		<div id="preloader">
			<div class="loder-box">
				<div class="battery"></div>
			</div>
		</div>
		<!-- end preloader -->

        <!--
        Fixed Navigation
        ==================================== -->
        <header id="navigation" class="navbar-inverse navbar-fixed-top animated-header">
        	<div class="container">
        		<div class="navbar-header">
        			<!-- responsive nav button -->
        			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        				<span class="sr-only">Toggle navigation</span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        			</button>
        			<!-- /responsive nav button -->

        			<!-- logo -->
        			<h1 class="navbar-brand">
        				<a href="#body">Marvel Studios</a>
        			</h1>
        			<!-- /logo -->
        		</div>

        		<!-- main nav -->
        		<nav class="collapse navbar-collapse navbar-right" role="navigation">
        			<ul id="nav" class="nav navbar-nav">
        				<li><a href="#body">Домой</a></li>
        				<li><a href="#service">Сервис</a></li>
        				<li><a href="#testimonials">Отзывы</a></li>
        				<li><a href="#price">Прайс</a></li>
        				<li><a href="#contact">Контакты</a></li>
        				<li><a href="#" data-toggle="modal" data-target="#myModal">Авторизация</a></li>
        			</ul>
        		</nav>
        		<!-- /main nav -->

        	</div>
        </header>
        <!--
        End Fixed Navigation
        ==================================== -->

        <main class="site-content" role="main">

        <!--
        Home Slider
        ==================================== -->

        <section id="home-slider">
        	<div id="slider" class="sl-slider-wrapper">

        		<div class="sl-slider">

        			<div class="sl-slide" data-orientation="horizontal" data-slice1-rotation="-25" data-slice2-rotation="-25" data-slice1-scale="2" data-slice2-scale="2">

        				<div class="bg-img bg-img-1"></div>

        				<div class="slide-caption">
        					<div class="caption-content">
        						<h2 class="animated fadeInDown">Marvel Studios</h2>
        						<span class="animated fadeInDown">Мы лучшие в киноиндустрии</span>
        						<a href="#" class="btn btn-blue btn-effect">Join US</a>
        					</div>
        				</div>

        			</div>

        			<div class="sl-slide" data-orientation="vertical" data-slice1-rotation="10" data-slice2-rotation="-15" data-slice1-scale="1.5" data-slice2-scale="1.5">

        				<div class="bg-img bg-img-2"></div>
        				<div class="slide-caption">
        					<div class="caption-content">
        						<h2>Marvel Studios</h2>
        						<span>У нас современнейшие спецэффекты и лучшие актёры</span>
        						<a href="#" class="btn btn-blue btn-effect">Join US</a>
        					</div>
        				</div>

        			</div>

        			<div class="sl-slide" data-orientation="horizontal" data-slice1-rotation="3" data-slice2-rotation="3" data-slice1-scale="2" data-slice2-scale="1">

        				<div class="bg-img bg-img-3"></div>
        				<div class="slide-caption">
        					<div class="caption-content">
        						<h2>Marvel Studios</h2>
        						<span>У нас только лучшие фантастические фильмы</span>
        						<a href="#" class="btn btn-blue btn-effect">Join US</a>
        					</div>
        				</div>

        			</div>

        		</div><!-- /sl-slider -->

                <!-- 
                <nav id="nav-arrows" class="nav-arrows">
                    <span class="nav-arrow-prev">Previous</span>
                    <span class="nav-arrow-next">Next</span>
                </nav>
            -->

            <nav id="nav-arrows" class="nav-arrows hidden-xs hidden-sm visible-md visible-lg">
            	<a href="javascript:;" class="sl-prev">
            		<i class="fa fa-angle-left fa-3x"></i>
            	</a>
            	<a href="javascript:;" class="sl-next">
            		<i class="fa fa-angle-right fa-3x"></i>
            	</a>
            </nav>


            <nav id="nav-dots" class="nav-dots visible-xs visible-sm hidden-md hidden-lg">
            	<span class="nav-dot-current"></span>
            	<span></span>
            	<span></span>
            </nav>

        </div><!-- /slider-wrapper -->
    </section>

        <!--
        End Home SliderEnd
        ==================================== -->

        <!-- about section -->
        <section id="about" >
        	<div class="container">
        		<div class="row">
        			<div class="col-md-4 wow animated fadeInLeft">
        				<div class="recent-works">
        					<h3>Управляй тендерами и своим бизнесом легко!</h3>
        					<div id="works">

        						<div class="work-item">
        							<p>Оригинальная система управления тендерами, которая формирует базу организаций, которые участвуют в государственных закупках, торгах и аукционах. <br></p>
        						</div>
        						<div class="work-item">
        							<p>Собирает следующую информацию: наименование организации, область работы компании, юр. адрес, фамилия имя отчество ответственного лица, номер для связи с контактным лицом, факс для обмена информацией, электронный ящик ответственного лица, тип организации, компетенция предприятия, финансовые возможности, все реквизитные данные. <br></p>
        						</div>
        						<div class="work-item">
        							<p>Один раз настроив поисковые запросы, Вы ежедневно сможете экономить до полутора часов своего рабочего времени. <br><br> Просматривайте результаты прямо в 1С или клиентском портале!</p>
        						</div>
        					</div>
        				</div>
        			</div>
        			<div class="col-md-7 col-md-offset-1 wow animated fadeInRight">
        				<div class="welcome-block">
        					<h3>Добро пожаловать на наш сайт</h3>								
        					<div class="message-body">
        						<img src="img/member-1.jpg" class="pull-left" alt="member">
        						<p>Сохранить собранные данные в удобном виде для последующего редактирования или экспорта на сайт.
        							Надоело каждый день проверять новые тендера? Настройте ежедневные обновления и получайте сводный список новых тендеров за прошедшие сутки сразу в 1С или клиентский портал! Подробности в бесплтной ознакомительной версии!.</p>
        						</div>
        						<a href="#" class="btn btn-border btn-effect pull-right">Узнать больше</a>
        					</div>
        				</div>
        			</div>
        		</div>
        	</section>
        	<!-- end about section -->




        	<!-- Service section -->
        	<section id="service">
        		<div class="container">
        			<div class="row">

        				<div class="sec-title text-center">
        					<h2 class="wow animated bounceInLeft">Сервис</h2>
        					<p class="wow animated bounceInRight">Преимущества нашей программы!</p>
        				</div>

        				<div class="col-md-3 col-sm-6 col-xs-12 text-center wow animated zoomIn">
        					<div class="service-item">
        						<div class="service-icon">
        							<i class="fa fa-home fa-3x"></i>
        						</div>
        						<h3>Скорость работы</h3>
        						<p>Мгновенно выводит первые несколько десятков самых релевантных (соответствующих ключевым словам) фильмов</p>
        					</div>
        				</div>

        				<div class="col-md-3 col-sm-6 col-xs-12 text-center wow animated zoomIn" data-wow-delay="0.3s">
        					<div class="service-item">
        						<div class="service-icon">
        							<i class="fa fa-tasks fa-3x"></i>
        						</div>
        						<h3>Простота</h3>
        						<p>Вы работаете напрямую с киностудией без посредников.</p>
        					</div>
        				</div>

        				<div class="col-md-3 col-sm-6 col-xs-12 text-center wow animated zoomIn" data-wow-delay="0.6s">
        					<div class="service-item">
        						<div class="service-icon">
        							<i class="fa fa-clock-o fa-3x"></i>
        						</div>
        						<h3>Гибкость настроек</h3>
        						<p>Вы можете самостоятельно настраивать вывод данных с помощью фильтров, как Вам удобно. Всего несколько кликов - и перед Вами только нужная информация.</p>
        					</div>
        				</div>

        				<div class="col-md-3 col-sm-6 col-xs-12 text-center wow animated zoomIn" data-wow-delay="0.9s">
        					<div class="service-item">
        						<div class="service-icon">
        							<i class="fa fa-heart fa-3x"></i>
        						</div>

        						<h3>Мобильность</h3>
        						<p>Вы можете отслеживать появление новых интересующих Вас фильмов с мобильных устройств!</p>							
        					</div>
        				</div>

        			</div>
        		</div>
        	</section>
        	<!-- end Service section -->



        	<!-- Testimonial section -->
        	<section id="testimonials" class="parallax">
        		<div class="overlay">
        			<div class="container">
        				<div class="row">

        					<div class="sec-title text-center white wow animated fadeInDown">
        						<h2>Что говорят люди</h2>
        					</div>

        					<div id="testimonial" class=" wow animated fadeInUp">
        						<div class="testimonial-item text-center">
        							<img src="img/member-1.jpg" alt="Our Clients">
        							<div class="clearfix">
        								<span>Василий Кушин</span>
        								<p>Мне приходилось содержать 3 человека для отслеживания актуальных тендеров по всей Беларуси. Для самих работников это была утомительная и муторная работа. Теперь мы перешли на автоматизацию, людей пришлось сократить, зато эффективность фирмы выросла. Я могу просматривать аткуальные тендеры прямо с мобильного телефона, отдыхая в сауне или на рабочем месте прямо из 1С.</p>
        							</div>
        						</div>
        						<div class="testimonial-item text-center">
        							<img src="img/member-1.jpg" alt="Our Clients">
        							<div class="clearfix">
        								<span>Генадий Вадимов</span>
        								<p>Пользовался бесплатными сервисами по поиску тендеров, они работают, но сложность состоит в том, что приходится лазить по куче сайтов и тратить кучу времени. Здесь же я просто указываю ключевые слова, нажимаю кнопку поиск и вижу результат!</p>
        							</div>
        						</div>
        					</div>

        				</div>
        			</div>
        		</div>
        	</section>
        	<!-- end Testimonial section -->

        	<!-- Price section -->
        	<section id="price">
        		<div class="container">
        			<div class="row">

        				<div class="sec-title text-center wow animated fadeInDown">
        					<h2>Прайс</h2>
        					<p>Наши цены для вашей компании</p>
        				</div>

        				<div class="col-md-4 wow animated fadeInUp">
        					<div class="price-table text-center">
        						<span>"Человек-паук: возвращение домой"</span>
        						<div class="value">
        							<span>$</span>
        							<span>1000</span><br>
        						</div>
        						<ul>
        							<li><a href="#">Заказать</a></li>
        						</ul>
        					</div>
        				</div>

        				<div class="col-md-4 wow animated fadeInUp" data-wow-delay="0.4s">
        					<div class="price-table featured text-center">
        						<span class="price-film">"Тор: Рагнарёк"</span>
        						<div class="value">
        							<span>$</span>
        							<span>1500</span><br>
        						</div>
        						<ul>
        							<li><a href="#">Заказать</a></li>
        						</ul>
        					</div>
        				</div>

        				<div class="col-md-4 wow animated fadeInUp" data-wow-delay="0.8s">
        					<div class="price-table text-center">
        						<span>"Мстители: война бесконечности"</span>
        						<div class="value">
        							<span>$</span>
        							<span>2000</span><br>
        						</div>
        						<ul>
        							<li><a href="#">Заказать</a></li>
        						</ul>
        					</div>
        				</div>

        			</div>
        		</div>
        	</section>
        	<!-- end Price section -->




        	<!-- Contact section -->
        	<section id="contact" >
        		<div class="container">
        			<div class="row">

        				<div class="sec-title text-center wow animated fadeInDown">
        					<h2>Контакты</h2>
        				</div>


        				<div class="col-md-7 contact-form wow animated fadeInLeft">
        					<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d26619.145699744728!2d27.48474841314923!3d53.86380766975609!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x395be9292c50af81!2z0J7QsdGJ0LXQttC40YLQuNC1INCR0JPQo9CY0KAg4oSWIDQ!5e0!3m2!1sru!2sby!4v1506680993384" width="600px" height="350px" frameborder="0" style="border:0" allowfullscreen></iframe>

        	
        				</div>

        				<div class="col-md-5 wow animated fadeInRight">
        					<address class="contact-details">
        						<h3>Наши контакты</h3>						
        						<p><i class="fa fa-pencil"></i>Phoenix Inc.<span>PO Box 345678</span> <span>Little Lonsdale St, Melbourne </span><span>Australia</span></p><br>
        						<p><i class="fa fa-phone"></i>Phone: (415) 124-5678 </p>
        						<p><i class="fa fa-envelope"></i>website@yourname.com</p>
        					</address>
        				</div>

        			</div>
        		</div>
        	</section>
        	<!-- end Contact section -->



        </main>

        <footer id="footer">
        	<div class="container">
        		<div class="row text-center">
        			<div class="footer-content">
					<p> 
							Design And developed By <a href="https://vk.com/artur_minchukov">Artur Minchukov</a>. All rights Reserved
					</p>
				</div>
			</div>
		</div>
	</footer>
	

	<!-- Выпадающее окно-->
	<!-- <div/ id="modal_form"> --><!-- Сaмo oкнo --> 
		<!-- <span id="modal_close">X</span> --> <!-- Кнoпкa зaкрыть --> 


        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

              <!-- Modal content-->
        <div class="modal-content">
       

                <!-- Форма регистрации -->
        		<div class="form">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                          <!--   <h4 class="modal-title">Modal Header</h4> -->
                        </div>
                    
        			<ul class="tab-group">
        				<li class="tab active"><a href="#signup">Sign Up</a></li>
        				<li class="tab"><a href="#login">Log In</a></li>
        			</ul>

        			<div class="tab-content">
        				<div id="signup">   
        					<h1 class="registration">Sign Up for Free</h1>

        					<form class="registration"  id="registration_form"  name="registration_form" >

        						<div class="top-row">
        							<div class="field-wrap">
        								<label class="registration">
        									Имя<span class="req">*</span>
        								</label>
        								<input class="registration" name="first_name" type="text" required autocomplete="off" />
        							</div>

        							<div class="field-wrap">
        								<label class="registration">
        									Фамилия<span class="req">*</span>
        								</label>
        								<input class="registration" name="last_name" type="text"required autocomplete="off"/>
        							</div>
        						</div>

        						<div class="field-wrap">
        							<label class="registration">
        								Адрес эл. почты<span class="req">*</span>
        							</label class="registration">
        							<input class="registration" name="email" type="email"required autocomplete="off"/>
        						</div>

                                <div class="field-wrap">
                                    <label class="registration">
                                       Организация<span class="req">*</span>
                                    </label class="registration">
                                    <input class="registration"  name="company" type="text"required autocomplete="off"/>
                                </div>

                                <div class="field-wrap">
                                    <label class="registration">
                                       Страна<span class="req">*</span>
                                    </label class="registration">
                                    <input class="registration" name="country" type="text"required autocomplete="off"/>
                                </div>

                                <div class="field-wrap">
                                    <label class="registration">
                                       Адрес
                                    </label class="registration">
                                    <input class="registration" name="address" type="text" autocomplete="off"/>
                                </div>

                                <div class="field-wrap">
                                    <label class="registration">
                                       Телефон
                                    </label class="registration">
                                    <input class="registration" name="phone" type="text" autocomplete="off"/>
                                </div>

        						<div class="field-wrap">
        							<label class="registration">
        								Введите пароль<span class="req">*</span>
        							</label>
        							<input class="registration" name="password" type="password"required autocomplete="off"/>
        						</div>

                                <div class="field-wrap">
                                    <label class="registration">
                                        Повторите пароль<span class="req">*</span>
                                    </label>
                                    <input class="registration" name="confirm_password" type="password"required autocomplete="off"/>
                                </div>

        						<button  class="button button-block" onclick="register(this)">Зарегистрироваться</button>

        					</form>

        				</div>

        				<div id="login">   
        					<h1 class="registration">Welcome Back!</h1>

        					<form action="authorize" method="POST" class="registration"  id="authorization_form" name="authorization_form">

        						<div class="field-wrap">
        							<label class="registration">
        								Email Address<span class="req">*</span>
        							</label>
        							<input class="registration" id="emailId" name="email" type="email" required autocomplete="off"/>
        						</div>

        						<div class="field-wrap">
        							<label class="registration">
        								Password<span class="req">*</span>
        							</label>
        							<input class="registration" id="passwordId" name="password" type="password" required autocomplete="off"/>
        						</div>

        						<p class="registration" class="forgot"><a href="#">Forgot Password?</a></p>

        						<!-- <input type="submit" value="Log in">Log In -->
        						<button class="button button-block" onclick="authorize(this)">Log In</button>

        					</form>
                    </div>
				</div>

			</div><!-- tab-content -->

		  </div> <!-- /form -->
     </div>
	</div>
	<div id="overlay"></div><!-- Пoдлoжкa -->

			
		<!-- scripts -->
		
			<%-- <script src="${context}/js/registration.js"></script>
			<script src="${context}/js/main.js"></script> --%>
			
			
			<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
	        
			<!-- Essential jQuery Plugins
			================================================== -->
			<!-- Main jQuery -->
			<script src="${context}/js/jquery-1.11.1.min.js"></script>
			<!-- Twitter Bootstrap -->
			<script src="${context}/js/bootstrap.min.js"></script>
			<!-- Single Page Nav -->
			<script src="${context}/js/jquery.singlePageNav.min.js"></script>
			<!-- jquery.fancybox.pack -->
			<script src="${context}/js/jquery.fancybox.pack.js"></script>
			<!-- Google Map API -->
			<script src="http://maps.google.com/maps/api/js?sensor=false"></script>
			<!-- Owl Carousel -->
			<script src="${context}/js/owl.carousel.min.js"></script>
			<!-- jquery easing -->
			<script src="${context}/js/jquery.easing.min.js"></script>
			<!-- Fullscreen slider -->
			<script src="${context}/js/jquery.slitslider.js"></script>
			<script src="${context}/js/jquery.ba-cond.min.js"></script>
			<!-- onscroll animation -->
			<script src="${context}/js/wow.min.js"></script>
			<!-- Custom Functions -->
				
			<script>
				<%@ include file="../../resources/js/registration.js"%>
			</script>
				
			<script>
				<%@ include file="../../resources/js/main.js"%>
			</script>
	 
	 	
		
		<!-- Скрипт валидации данных -->
      

		
	</body>
</html>
