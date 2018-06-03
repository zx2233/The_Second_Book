	/**我的书籍，已发布链接 修改信息 功能按钮**/
	del=function(the,Book_Bid,User_Uid){
		alert(Book_Bid);
		$(the).parent().parent().prev().empty();
		$.ajax({
			async : false,
			url : "UpdatePublished",
			data:{
				Book_Bid:Book_Bid,
				User_Uid:User_Uid
			},
			type : "POST",
			dataType : "json",
			success : function(data) {
			var	html="<div class='AduitData'>" +
/*					"<input type='hidden' id='Book_Bid' value='"+data.book_Bid+"'/>" +
					"<input type='hidden' id='User_Uid' value='"+data.user_Uid+"'/>" +*/
					"<span class='AduitDataSpan'>书籍名称:</span>"+
					"<span class='AduitDataSpan'>"+data.book_Bid+"</span>"+
					"<span class='AduitDataSpan'>新旧程度:</span>"+
					"<span class='AduitDataSpan'>"+data.book_New_or_Old+"</span>"+
					"<span class='AduitDataSpan'>书籍数量:</span>"+
					"<span class='AduitDataSpan'>"+data.book_Number+"</span>"+
					"<span class='AduitDataSpan'>书籍价格:</span>"+
					"<span class='AduitDataSpan'>"+data.book_Price+"</span>"+
					"<span class='AduitDataSpan'>审核结果:</span>"+
					"<span class='AduitDataSpan'>"+data.aduit_status+"</span>"+
					"<span class='AduitDataSpan'>发布结果:</span>"+
					"<span class='AduitDataSpan'>"+data.selling_status+"</span>"+
					"</div><div class='Aduitbutton'>" +
					"<a href='javascript:void(0)"+
					"' class='btn btn-primary' onclick='Unpublish("+data.book_Bid+","+data.user_Uid +")'>不在售卖</a>" +
					"<p><p>" +
					"<a href='javascript:void(0)' class='btn btn-primary' onclick='del(this,"+data.book_Bid+")'>修改信息</a><p>" +
					"</div>";
					$(the).parent().parent().prev().append(html);
			}
		});
	}
		