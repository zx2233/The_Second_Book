/** 书籍发布  审核结果 链接 显示本用户全部审核中的书籍**/
$(document).ready(function() {
//	$("body").delegate("#publish","click", function(){
//		alert("进入publish.js");
//	});
	$("#AduitClick").click(function() {
		$("#ajaxchange").empty();
		$.ajax({
			async : false,
			url : "findAllBook",
			type : "POST",
			// data:params,// 要传递的数据
			dataType : "json",
			success : function(data){ 
				$.each(data,function(i,value){ // 请求成功后回调函数。
					var	html="<div class='Content'>" +
					"<div class='img'>" +
					"<img  src="+value.book_Image+">" +
					"</div><div class='AduitData'>" +
					"<input type='hidden' id='Book_Bid' value='"+value.book_Bid+"'/>" +
					"<input type='hidden' id='User_Uid' value='"+value.user_Uid+"'/>" +
					"<span class='AduitDataSpan'>书籍名称:</span>"+
					"<span class='AduitDataSpan'>"+value.book_Name+"</span>"+
					"<span class='AduitDataSpan'>新旧程度:</span>"+
					"<span class='AduitDataSpan'>"+value.book_New_or_Old+"</span>"+
					"<span class='AduitDataSpan'>书籍数量:</span>"+
					"<span class='AduitDataSpan'>"+value.book_Number+"</span>"+
					"<span class='AduitDataSpan'>书籍价格:</span>"+
					"<span class='AduitDataSpan'>"+value.book_Price+"</span>"+
/*					"<span class='AduitDataSpan'>书籍描述:</span>"+
					"<span class='AduitDataSpan'>"+value.book_Description+"</span>"+*/
					"<span class='AduitDataSpan'>审核结果:</span>"+
					"<span class='AduitDataSpan'>"+value.aduit_status+"</span>"+
					"<span class='AduitDataSpan'>发布结果:</span>"+
					"<span class='AduitDataSpan'>"+value.selling_status+"</span>"+
					"</div><div class='Aduitbutton'>" +
					"<a href='javascript:void(0)"+/*"'updateBookAduit?Book_Bid="+value.book_Bid+"&User_Uid="+value.user_Uid+*/
					"' class='btn btn-primary' onclick='publish("+value.book_Bid+","+value.user_Uid +")'>发布书籍</a>" +
					"<p><p>" +
					"<a href='' class='btn btn-primary'>取消审核</a><p>" +
					"</div>" +
					"</div>";
				$("#ajaxchange").append(html);
				});
			}
		});
	});

});
