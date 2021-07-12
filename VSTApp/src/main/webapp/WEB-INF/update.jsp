<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="update.do" method="GET">

<input type="hidden" name="id" value="${synth.id}"/>
<label for="text">Name: </label>
<input type="text" name="name" value="${synth.name}"/>
<label for="company">Company: </label>
<input type="text" name="company" value="${synth.company}"/>
<label for="price">Price: </label>
<input type="text" name="price" value="${synth.price}"/>
<label for="oscillators">Oscillators: </label>
<input type="text" name="oscillators" value="${synth.oscillators}"/>
<label for="synthesisType">Synthesis Type: </label>
<input type="text" name="synthesisType" value="${synth.synthesisType}"/>
<label for="hasSampler">Has Sampler: </label>
<input type="text" name="hasSampler" value="${synth.hasSampler}"/>

<input type="submit" value="Update"/>

</form>

</body>
</html>