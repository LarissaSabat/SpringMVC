<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Leitor de mentes</title>
</head>
<body>
	<form action="/numerodasorte/segredo" method="post">
		<div>
			<label>Nome</label>
			<input type="text" name="nome"></input>
		</div>
		<div>
			<label>Diga um número</label>
			<input type="text" name="numeroDaSorte"></input>
		</div>
		<button type="submit"> Guarde meu segredo!!</button>
	</form>
</body>
</html>