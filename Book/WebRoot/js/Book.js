  $(document).ready(function(){
//	$(".delete").click(function() {
//		var href = $(this).attr("href");
//		$("#formdelete").attr("action", href).submit();
//		return false;
//	})
	  //$("#btn").attr('disabled',true)
	$("#btn").click(function() {
		alert("进入book.js");
		//把表单的数据进行序列化  
		var params = $("form").serialize();
		//使用jQuery中的$.ajax({});Ajax方法  
		alert(params);
		$.ajax({
			async: true, 
			url : "addUser_Book",
			type : "POST",
            data:params,// 要传递的数据  
			//dataType : "json",
			success : function(data) { //请求成功后回调函数。  
				alert("success");
				alert(JSON.stringify(data));//json对象转换成json字符串
			}


		});
	});
});
