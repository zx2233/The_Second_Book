	/**我的书籍，已发布链接 修改信息 功能按钮**/
	function del(the,Book_Bid,User_Uid,start){
		var theA=$(the).parent().parent().parent();
		$(the).parent().parent().parent().empty();
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
				var	html=
				"<div class='img'>" +
				"<img  src="+data.book_Image+">" +
				"</div><div class='AduitData'>" +
				"<span class='AduitDataSpan'>书籍名称:</span>"+
				"<span class='AduitDataSpan'>"+data.book_Name+"</span>"+
				"<span class='AduitDataSpan'>新旧程度:</span>"+
				"<span class='AduitDataSpan'>"+data.book_New_or_Old+"</span>"+
				"<span class='AduitDataSpan'>书籍数量:</span>"+
				"<span class='AduitDataSpan'>"+
				"<input id='Number' style='width:40px' value='"+data.book_Number+"'>" +
				"</input>"+"</span>"+
				"<span class='AduitDataSpan'>书籍价格:</span>"+
				"<span class='AduitDataSpan'>"+
				"<input id='Price' style='width:40px' value='"+data.book_Price+"'>" +
				"</input>"+"</span>"+
				"<span class='AduitDataSpan'>审核结果:</span>"+
				"<span class='AduitDataSpan'>"+data.aduit_status+"</span>"+
				"<span class='AduitDataSpan'>发布结果:</span>"+
				"<span class='AduitDataSpan'>"+data.selling_status+"</span>"+
				"</div><div class='Aduitbutton'>" +
				"<a href='javascript:void(0)"+
				"' class='btn btn-primary' onclick='PublishedUpdate("+data.book_Bid+","+start+")'>确定修改</a>" +
				"<p><p>" +
				"<a href='javascript:void(0)' class='btn btn-primary' onclick='Cancel("+start+")'>取消修改</a><p>" +
				"</div>";
					theA.append(html);
			}
		});
	}
	
