	publish=function(Book_Bid,User_Uid){
		alert("publish12");
		alert(Book_Bid);
	}
$(document).ready(function() {
	

	
/*
	使用 delegate() 方法的事件处理程序适用于当前
	 * 或未来的元素（比如由脚本创建的新元素）。
	$("body").delegate(
			function publish(){
				alert("publish");
				alert();
				$.ajax({
					async : false,
					url : "updateBookAduit",
					data:params,
					type : "POST",
					// data:params,// 要传递的数据
					dataType : "json",
					success : function(data) {
						alert("success");
					}
				});
			}
			
			"#publish", "click", function() {
		alert("进入publish.js");
		var Book_Bid=$("#Book_Bid").val();  
		var User_Uid=$("#User_Uid").val();
		var params = $("form").serialize();
		alert(Book_Bid);
		$.ajax({
			async : false,
			url : "updateBookAduit",
			data:params,
			type : "POST",
			// data:params,// 要传递的数据
			dataType : "json",
			success : function(data) {
				alert("success");
			}
		});
	});
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
		} */
});
