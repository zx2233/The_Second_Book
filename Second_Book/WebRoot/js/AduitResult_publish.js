	/** 书籍发布 审核结果链接  发布书籍 功能按钮**/
	function publish(Book_Bid,User_Uid,Aduit_status,start){
		var startN;
		if(Number(start)==0){
			startN=6;
		}
		if(Aduit_status==0)
			{
				alert("此书籍还未通过审核")
			}else{
				$.ajax({
					async : false,
					url : "updateBookAduit?start="+start,
					data:{
						Book_Bid:Book_Bid,
						User_Uid:User_Uid
					},
					type : "POST",
					// data:params,// 要传递的数据
					dataType : "json",
					success : function(data) {
						$("#ajaxchange").empty();
						$.each(data,function(i,value){ // 请求成功后回调函数。
							var Aduit;
							if(value.aduit_status=="未审核"){
								Aduit=0;
							}
							var	html="<div class='Content'>" +
							"<div class='img'>" +
							"<img   src="+value.book_Image+">" +
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
							"<span class='AduitDataSpan'>审核结果:</span>"+
							"<span class='AduitDataSpan'>"+value.aduit_status+"</span>"+
							"<span class='AduitDataSpan'>发布结果:</span>"+
							"<span class='AduitDataSpan'>"+value.selling_status+"</span>"+
							"</div><div class='Aduitbutton'>" +
							"<a href='javascript:void(0)"+
							"' class='btn btn-primary'" +
							" onclick='publish("+value.book_Bid+","+value.user_Uid +","+Aduit+","+start+")'>发布书籍</a>" +
							"<p><p>" +
							"<a href='javascript:void(0)' class='btn btn-primary'  " +
							"onclick='CancelAudit("+value.book_Bid+","+value.user_Uid +","+start+")'>取消审核</a><p>" +
							"</div>" +
							"</div>";
						$("#ajaxchange").append(html);
						});
						$("#ajaxchange").append("<div class='Contentlast'>" +
								"<button  class='btn btn-primary' onclick='Next("+Number(startN-6)+")' >上一页</button> " +
								"<button  class='btn btn-primary' onclick='Next("+Number(start+6)+")' >下一页</button>" +
										"</div>");
					}
				});
			}

	}
	/** 书籍发布 审核结果链接  取消审核 功能按钮**/
	function CancelAudit(Book_Bid,User_Uid,start){
		var startN;
		if(Number(start)==0){
			startN=6;
		}
		$.ajax({
			async : false,
			url : "CancelAduit?start="+start,
			data:{
				Book_Bid:Book_Bid,
				User_Uid:User_Uid
			},
			type : "POST",
			// data:params,// 要传递的数据
			dataType : "json",
			success : function(data) {
				$("#ajaxchange").empty();
				$.each(data,function(i,value){ // 请求成功后回调函数。
					var Aduit;
					if(value.aduit_status=="未审核"){
						Aduit=0;
					}
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
					"<a href='javascript:void(0)"+
					"' class='btn btn-primary' " +
					"onclick='publish("+value.book_Bid+","+value.user_Uid +","+Aduit+","+start+")'>发布书籍</a>" +
					"<p><p>" +
					"<a href='javascript:void(0)' class='btn btn-primary'  " +
					"onclick='CancelAudit("+value.book_Bid+","+value.user_Uid +","+start+")'>取消审核</a><p>" +
					"</div>" +
					"</div>";
				$("#ajaxchange").append(html);
				});
				$("#ajaxchange").append("<div class='Contentlast'>" +
						"<button  class='btn btn-primary' onclick='Next("+Number(startN-6)+")' >上一页</button> " +
						"<button  class='btn btn-primary' onclick='Next("+Number(start+6)+")' >下一页</button>" +
								"</div>");
			}
		});
	}
	/** 审核结果  **点击下一页**/
	function Next(start){
		$("#ajaxchange").empty();
		if(start==0){
			alert("到第一页了");
		}
		$.ajax({
			async : false,
			url : "findAllBook?start="+start,
			type : "POST",
			// data:params,// 要传递的数据
			dataType : "json",
			success : function(data){ 
				$.each(data,function(i,value){ // 请求成功后回调函数。
					var Aduit;
					if(value.aduit_status=="未审核"){
						Aduit=0;
					}
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
					"<span class='AduitDataSpan'>审核结果:</span>"+
					"<span class='AduitDataSpan'>"+value.aduit_status+"</span>"+
					"<span class='AduitDataSpan'>发布结果:</span>"+
					"<span class='AduitDataSpan'>"+value.selling_status+"</span>"+
					"</div><div class='Aduitbutton'>" +
					"<a href='javascript:void(0)"+
					"' class='btn btn-primary' " +
					"onclick='publish("+value.book_Bid+","+value.user_Uid +","+Aduit+","+start+")'>发布书籍</a>" +
					"<p><p>" +
					"<a href='javascript:void(0)' class='btn btn-primary' " +
					" onclick='CancelAudit("+value.book_Bid+","+value.user_Uid +","+start+")'>取消审核</a><p>" +
					"</div>" 
					;
					$("#ajaxchange").append(html);
				});
				var startN;
				if(Number(start)==0){
					startN=6;
				}else{
					startN=start;
				}
				$("#ajaxchange").append("<div class='Contentlast'>" +
						"<button  class='btn btn-primary' onclick='Next("+Number(startN-6)+")' >上一页</button> " +
						"<button  class='btn btn-primary' onclick='Next("+Number(start+6)+")' >下一页</button>" +
								"</div>");
			}
		});
	}