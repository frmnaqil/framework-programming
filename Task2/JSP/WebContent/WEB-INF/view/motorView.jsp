<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>Form Result</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- Bootstrap core CSS -->
	<link href="<c:url value="/resources/bootstrap.min.css"/>" rel="stylesheet" >

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/signin.css"/>" rel="stylesheet">
  </head>
  <body class="text-center">
    <div class="container">
  		<img class="mb-4" src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
  		<div class="h2 mb-3 font-weight-bold">Motor Insert Data Result</div>
  			<div class="row">
  				<div class="h4 col-6 text-right">Name</div>
  				<div class="h4 col-6 text-left">${name}</div>
  			</div>
  			<div class="row">
  				<div class="h4 col-6 text-right" >Wheel</div>
  				<div class="h4 col-6 text-left">${wheel}</div>
  			</div>
  			<div class="row">
  				<div class="h4 col-6 text-right">Engine Capacity</div>
  				<div class="h4 col-6 text-left">${engineCapacity}cc</div>
  			</div>
  			<div class="row">
  				<div class="h4 col-6 text-right">Transm. Gear</div>
  				<div class="h4 col-6 text-left">${transmissionGear}</div>
  			</div>
  			<div class="row">
  				<div class="h4 col-6 text-right">Max. Speed</div>
  				<div class="h4 col-6 text-left">${maxSpeed}km/h</div>
  			</div>
  		<p class="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
	</div>
</body>
</html>