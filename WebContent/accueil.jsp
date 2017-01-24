<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Essai Ajax</title>
<script>
	function appelAjax() {
		//alert("on est dans appel");
		var xhr;
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4) {
				// recuperation balise span 
				var span = document.getElementById("affichage");
				if (xhr.status == 200) {
					// on remplit le corps du span avec ce qui vient du serveur
					span.innerHTML = xhr.responseText;
				}
			}
		};
		
		// .value car on veut récupérer la valeur de l'input qui est un objet HTMLInputElement
		
		vr valeurSaisie= document.getElementById('saisie').value;
		xhr.open("GET", "CompleteSaisie?saisie="
				+ valeurSaisie, true);
		xhr.send(null);
	}
</script>
</head>
<body>
	texte :
	<input type="text" id="saisie" onkeyup="appelAjax();" />
	<br />
	<span id="affichage"></span>

</body>
</html>