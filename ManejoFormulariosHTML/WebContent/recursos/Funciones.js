function validarForma(forma){
	
	var usuarios=forma.usuario;
	if(usuarios.value==""|| usuarios.value=="Escribir Usuario"){
		
		alert("Debe ingresar Usuario");
		usuarios.focus();
		usuarios.select();
		return false;
	}
	
	var passwords=forma.password;
	if(passwords.value==" " || passwords.value.length < 3){
		alert ("Debe proporcionar un password mayor a 3 caracteres");
		passwords.focus();
		passwords.select();
		return false;		
	}
	
	var tecnologias=forma.tecnologia;	
	var checkSeleccionado =false;
	
	for( var i=0; i<tecnologias.length; i++){
		
		if(tecnologias[i].checked){
			
			checkSeleccionado=true;
		}
	}
	
	if(!checkSeleccionado){
		
		alert("Por favor seleccione una tecnologia");
		return false;
	}
	
	var generos=forma.genero;
	var radioSeleccionado =false;
	
	for(var i=0; i<forma.generos.length; i++){
		if(generos[i].checked){
			
			radioSeleccionado=true;
			
		}
		
	}
	
	if(!radioSeleccionado){
		
		alert("Por favor seleccione el genero");
		return false;
	}
	
	var ocupacion=forma.ocupacion;
	if(ocupacion.value==""){
		
		alert("Por favor ingrese Ocupacion");
		
		return false;
		
	}

	alert("Formulario valido, enviando datos al sevidor");
	return true;
}