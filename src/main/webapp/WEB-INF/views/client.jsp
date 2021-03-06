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
		
		<link rel="stylesheet" href="${context}/css/manager.css">


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
	<header id="navigation" class="navbar-inverse animated-header">
		<div class="container">
			<div class="navbar-header">
				<!-- responsive nav button -->
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
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
					<li>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" id="menu1"
								type="button" data-toggle="dropdown">
								Заказы <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#" onclick='getOrders("showClientOrders")'>Просмотреть
										заказы</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#" onclick='getOrders("showProcessOrders")'>Заказы на
										обработке</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">Отклоненные заказы</a></li>
							</ul>
						</div>
					</li>
					<li>
						<div class="dropdown">
							<button class="btn btn-primary dropdown-toggle" id="menu1"
								type="button" data-toggle="dropdown">
								Поиск <span class="caret"></span>
							</button>
							<ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">Поиск фильма</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">Поиск фильмов по актеру</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">Поиск фильма про режиссеру</a></li>
							</ul>
						</div>
					</li>
					<li><a href="#" id="go"><c:out value="${email}"></c:out></a></li>
				</ul>
			</nav>
			<!-- /main nav -->

		</div>
	</header>
	<!--
        End Fixed Navigation
        ==================================== -->


	<!--=====================================
         Menu and the main part-->
	<main class="site-content" role="main">
	<div class="container-fluid text-center ">

		<div class="col-md-10 center-block" id="dynamic-content"></div>


		<div class="col-md-2 sidenav">
			<div class="well">
				<div>
					<!-- Trigger the modal with a button -->
					<button type="button" class="btn btn-danger btn-lg"
						 onclick="getOrderForm()">Сделать заказ</button>
				</div>
			</div>
		</div>
	</div>
	</main>

	<!--END Menu and the main part
            ==========================-->


    <!-- ============================================ 
        footer -->

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
	 

		
	</body>
</html>
