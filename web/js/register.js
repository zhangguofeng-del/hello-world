function check(){
	var name = document.getElementById("name");
	var password1 = document.getElementById("password1");
	var password2 = document.getElementById("password2");
	var flag = false;
	if(name.value == ""){
		flag = false;
	}
	if(password1.value == ""){
		flag = false;
	}
	if(password2.value == ""){
		flag = false;
	}
	if(password1.value != password2.value){
		alert("输入的密码不一致");
		flag = false;
	}
	if(name.value != "" && password1.value != "" && password2.value != "" && password1.value == password2.value){
		flag = true;	
	}
	return flag;
}
function fos(){
	var name = document.getElementById("name");
	var password1 = document.getElementById("password1");
	var password2 = document.getElementById("password2");
	if(name.value != ""){
		document.getElementById("span1").style.display = "none";
	}
	if(password1.value != ""){
		document.getElementById("span2").style.display = "none";
	}
	if(password2.value != ""){
		document.getElementById("span3").style.display = "none";
	}
	if(name.value == ""){
		document.getElementById("span1").style.display = "inline";
	}
	if(password1.value == ""){
		document.getElementById("span2").style.display = "inline";
	}
	if(password2.value == ""){
		document.getElementById("span3").style.display = "inline";
	}
}

