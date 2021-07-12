<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <!-- My CSS -->
    <link rel="stylesheet" href="css/stylesheet.css">
    <!-- Title -->
    <title>VST Site</title>
  </head>
 
 
<body class="bg-dark">

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

<h1>VSTs are future of modern music!</h1>
<form action="singleResult.do" method="GET">
<label for="synthId">Search synths by id:</label>
<input type="text" name="synthId"/>
<input type="submit" value="search"/>
</form>

<form action="keywordSearch.do" method="GET">
<label for="keyword">Search by keyword</label>
<input type="text" name="keyword"/>
<input type="submit" value="search"/>
</form>


<form action="multiResult.do" method="GET">
<label for="show all">Show all synths:</label>
<input type="submit" name="show all"/>
</form>

<form action="createSynth.do" method="GET">
<input type="submit" value="Add synth"/>
</form>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

</body>
</html>