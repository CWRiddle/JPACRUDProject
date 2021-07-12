<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <!-- My CSS -->
    <link rel="stylesheet" href="css/main.css">
    <!-- Title -->
    <title>All Synths</title>
  </head>
<body>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
	<a class="navbar-brand" href="#">VST Site</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-targe="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active">
				<a class="nav-link" href="home.do">Home</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="multiResult.do">All Synths</a>
			</li>
		</ul>
	</div>
</nav>


<h1>Results: </h1>


<c:choose>
	<c:when test="${not empty synths}">
		<c:forEach items="${synths}" var="synth" >

			<ul>
			<li>ID: ${synth.id}</li>
			<li>Name: ${synth.name}</li>
			<li>Company: ${synth.company}</li>
			<li>Price: ${synth.price}</li>
			<li>Oscillators: ${synth.oscillators}</li>
			<li>Synthesis Type: ${synth.synthesisType}</li>
			<li>Has Sampler: ${synth.hasSampler}</li>
			<li>User Created: ${synth.userCreated}</li>
			</ul>

			<img src="img/${synth.image}" alt="${synth.name}" style="width:300px;height:200px;"/>
			

			<c:choose> 
				<c:when test="${synth.userCreated == true}"> 

					<!-- Update Form -->
					<form action="updateView.do" method="GET">
					<input type="hidden" value="${synth.id}" name="synthId"/>
					<input type="submit" value="update"/>
					</form>
					
					<!-- Delete Form -->
					<form action="deleteView.do" method="GET">
					<input type="hidden" value="${synth.id}" name="synthId"/>
					<input type="submit" value="delete"/>
					</form>

				</c:when>
			</c:choose>
	
		</c:forEach>
	</c:when>
		
	<c:otherwise>
		No results found.
		<form action="home.do" method="GET">
		<input type="submit" value="Ok">
		</form>
	</c:otherwise>
</c:choose>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>