<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v3.8.5">
    <title>Form Insert</title>

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
    <form:form class="form-signin" action="addVehicleMotor" method="POST" modelAttribute="VehicleMotor">
  <img class="mb-4" src="<c:url value="/resources/Bootstrap.svg"/>" alt="" width="72" height="72">
  <h1 class="h3 mb-3 font-weight-normal">Insert Motor Data</h1>
  	<form:input type="text" path="name" class="form-control" placeholder="Name" value="" required="required"/>
  	<form:input type="text" path="wheel" class="form-control" placeholder="Wheel" value="" required="required"/>
  	<form:input type="text" path="engineCapacity" class="form-control" placeholder="Engine Capacity" required="required"/>
  	<form:input type="text" path="transmissionGear" class="form-control" placeholder="Transmission Gear" required="required"/>
  	<form:input type="text" path="maxSpeed" class="form-control" placeholder="Maximum Speed" required="required"/>
  	<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  <p class="mt-5 mb-3 text-muted">&copy; 2017-2019</p>
	</form:form>
</body>
</html>
