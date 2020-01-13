function check(){
	var userName = document.getElementById("name").value;
	var userPassword = document.getElementById("password").value;
	if(userName == "" || userPassword == ""){
		alert("用户名或密码不能为空!");
		return false;
	}
	else{
		return true;
	}
}

