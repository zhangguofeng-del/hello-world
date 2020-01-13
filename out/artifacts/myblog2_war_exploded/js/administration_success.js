function a(str){
	document.getElementById(str).style.backgroundColor = "gray";
}
function b(str){
	document.getElementById(str).style.backgroundColor = "#2f353f";
}
var count = 0;
function showUl(){
	count++ ;
	if(count%2 == 1){
		document.getElementById("ul1").style.visibility = "visible";
	}
	if(count%2 == 0){
		document.getElementById("ul1").style.visibility = "hidden";
	}
	
}
var clock = true;
function c(str){
	if(clock == true){
		document.getElementById("i"+str).src = "../jpg/t"+str+"_1.gif";
		document.getElementById("li"+str).style.backgroundColor = "#272c35";
		document.getElementById("a"+str).style.color = "#fff";
		clock = false;
	}

}
function d(str){
	if(clock == false){
		document.getElementById("i"+str).src = "../jpg/t"+str+".gif";
		document.getElementById("li"+str).style.backgroundColor = "#2e343f";
		document.getElementById("a"+str).style.color = "#a6b0c2";
		clock = true;
	}
	
}
function light(str){
	document.getElementById("i"+str).src = "../jpg/t"+str+"_1.gif";
	document.getElementById("li"+str).style.backgroundColor = "#272c35";
	document.getElementById("a"+str).style.color = "#fff";
	clock = true;
}
