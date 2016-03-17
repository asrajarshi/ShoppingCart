$(document).ready(function(){
	$("#f1").submit(function(){
	runThis();
	})
});

function runThis(){
	
	var bs1 = "Add to the Cart";
	var bs2 = "Add tot e wish list";
	var btn1 = $('<input/>').attr({type:"button", value: bs1});
	var btn2 = $('<input/>').attr({type:"button", value: bs2});
	$("#b1").append(btn1);
	$("#b2").append(btn2);
	btn1.click(function(){
		document.getElementById("p").innerHTML = 
		"<a href = 'http://localhost:8081/AmazonLike/jsp/login.jsp'>log in</a> &nbsp; <a href = 'http://localhost:8081/AmazonLike/jsp/guest.jsp'>guest</a> &nbsp; <a href = 'http://localhost:8081/AmazonLike/Singup.html'>Sign up</a>";
		})
	btn2.click(function(){
		document.getElementById("p").innerHTML = "<a href = 'http://localhost:8081/AmazonLike/jsp/login.jsp'>log in</a>  &nbsp; <a href = 'http://localhost:8081/AmazonLike/Singup.html'>Sign up</a>";
		})	
}
