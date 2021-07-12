<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new synth</title>
</head>
<body>


<form action="create.do" method="GET">

<label for="text">Name: </label>
<input type="text" name="name" value="${synth.name}"/>
<br>
<label for="company">Company: </label>
<input type="text" name="company" value="${synth.company}"/>
<br>
<label for="price">Price: </label>
<input type="text" name="price" value="${synth.price}"/>
<br>
<label for="oscillators">Oscillators: </label>
<input type="text" name="oscillators" value="${synth.oscillators}"/>
<br>
<label for="synthesisType">Synthesis Type: </label>
<input type="text" name="synthesisType" value="${synth.synthesisType}"/>
<br>
<label for="hasSampler">Has Sampler: </label>
<!--  <input type="text" name="hasSampler" value="${synth.hasSampler}"/> -->
<label for="Yes">Yes: </label>
<input type="radio" name="hasSampler" value="1"/>
<label for="No">No: </label>
<input type="radio" name="hasSampler" value="0"/>
<br>
<input type = "hidden" name="image" value="UserSynth.png"/>
<input type = "hidden" name="userCreated" value="true"/>

<input type="submit" value="Create"/>

</form>

</body>
</html>