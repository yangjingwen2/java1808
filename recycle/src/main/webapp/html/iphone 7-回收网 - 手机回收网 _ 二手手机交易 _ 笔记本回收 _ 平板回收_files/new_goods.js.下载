
//配件点击事件
function	pj_click(obj,pj_id){
	var name	=	$(obj).attr('name');
	var current_class	=	$(obj).attr('class');
	if(current_class	==	'selected'){
		$(obj).attr('class','');
		$("#pj_id_"+pj_id).val(0);
	}else{
		$(obj).attr('class','selected');
		$("#pj_id_"+pj_id).val(pj_id);
	}
	var pj_ids	=	'',suffix='';
	$("input[name='pj_id[]']").each(function(){
			pj_ids	+=	suffix+$(this).val();
			suffix	=	',';
	})
	$("#pj_ids").val(pj_ids);
}

//属性点击事件
function	property_click(obj,suffix,property_id){
	var name	=	$(obj).attr('name');
	$("li[name='"+name+"']").attr('class','');
	$(obj).attr('class','selected');

	$("#property_"+suffix).val(property_id);
	//自动下一步
	auto_go_next(obj);
}
//描叙点击事件
function	item_click(obj,suffix){
    	var name			=	$(obj).attr('name');
    	var current_class	=	$(obj).attr('class');
    if(current_class	==	'selected'){
        		$(obj).attr('class','');
        		$("#desc_id_"+suffix).val(0);
    }else {
        $(obj).attr('class','selected');
        $("#desc_id_"+suffix).val(suffix);
    }


	}

function auto_go_next(obj){
    var p_div_id	=	$(obj).parent().parent().parent().parent().attr('id');
    if(p_div_id		==	'property_step1'){
        var n		=	true;
        $("#"+p_div_id+" input").each(function(){if($(this).val()==0){n=false;return false;}});
        if(n)	step1_next();
    }
}

function btn_step2_next_html(){
    var n	=	$("#property_step2").find(".selected").length;
    if(n	==	0){
        $("#btn_step2_next").html('都没问题，跳过');
    }else{
        $("#btn_step2_next").html('下一步');
    }
}







//查看价格
function new_show_price(url,act,func,elem_id,ifhuanxin){
	var property_ids	=	'',psuffix	=	'';
	var desc_ids		=	'',dsuffix	=	'';
	var property_flag	=	true;
	$("input[name='property[]']").each(function(){
		if($(this).val()==0){
			property_flag	=	false;
			return;
		}
		property_ids	+=	psuffix+$(this).val();
		psuffix			=	',';
	})
	if( ! property_flag){
		alert("请选择评估参数");
		return false;
	}
	var desc_flag	=	true;
	$("input[name='desc_id[]']").each(function(){
		if($(this).val()==0){
			desc_flag	=	false;
			return false;
		}
		desc_ids	+=	dsuffix+$(this).val();
		dsuffix		=	',';
	})
	if( ! desc_flag){
		alert("请选择评估参数");
		return false;
	}

	if(desc_ids.length	==	0){
		alert("无评估参数");
		return false;
	}
	func			=	typeof(func)=='undefined'?'add':func;
	var gid			=	$("#gid").val();
	var package_id	=	$("#package_id").val();
	var pj_ids		=	$("#pj_ids").val();
	var shop_id		=	$("#shop_id").val();
	//防止频繁操作
	if($("#if_show_price")	==	0)	return false;
	$("#if_show_price").val(0);		//加锁
	if(act	==	'show_price'){		//查看价格
		var view	=	$("#view").val();	//视图文件
		if(view	==	'goods_info')	$("#loading_div").css('display','block');
		$.post(url,{'gid':gid,'package_id':package_id,'property_ids':property_ids,'desc_ids':desc_ids,'pj_ids':pj_ids},function(data){
			$("#if_show_price").val(1);	//解锁
			//alert(data);
			var obj	=	eval(data);
			if(obj[0]	==	1){
				var key			=	obj[1];
				var gourl		=	url.replace("ajax/new_get_pg_price","goods/show_price/"+key);
				location.href	=	gourl;
				return;
			}else{
				alert("数据传输有误");
			}
		})
	}else if(act	==	'addcart'){	//加入购物车
		if(func	==	'sub')	$("#btn_sub_cart").attr('disabled','disabled');
		var ifjia	=	$("#ifjia").val();

		$.post(url,{'gid':gid,'package_id':package_id,'property_ids':property_ids,'desc_ids':desc_ids,'pj_ids':pj_ids,'func':func,'ifjia':ifjia,'shop_id':shop_id},function(data){
			var obj	=	eval(data);
			//提交回购单操作
			if(func	==	'sub'){
				if(obj[0]	==	1){
					gourl			=	url.replace("ajax/addcart","order/cart");;
					location.href	=	gourl;
				}else{
					div_id		=	arguments[3]?arguments[3]:'btn_sub_cart';
					$("#"+div_id).attr('disabled',false);
					alert("数据传输有误");
				}
				return;
			}

			//添加购物车操作
			if(obj[0]	==	1){
				//购物车总信息
				var arr	= obj[1];
				$("#cart_total_items").html(arr['cart_total_items']);
				$("#cart_total").html('￥'+arr['cart_total']);

				//添加商品信息
				var item_info	= obj[2];
				var item_class	=	arr['cart_total_items']%2==0?'':'class="on"';
				var item_id		=	'cart_items_'+item_info['rowid'];
				var html=	'';
				html	+=	'<dd '+item_class+' id="'+item_id+'" onmousemove="car_dd_mousemove(this)" onmouseout="car_dd_onmouseout(this)">';
				html	+=	'<div class="img2"><img src="'+item_info['img']+'"  width="50" height="38"/></div>';
			  	html	+=	'<div class="name">'+item_info['name']+'</div>';
				html	+=	'<div class="price">回购价 <em>'+item_info['price']+'</em> 元</div>';
				html	+=	'<a href="javascript:remove_cart(\''+item_info['remove_url']+'\',\''+item_info['rowid']+'\')" class="close_btn"><span class="car_colse_img">&nbsp;</span></a>';
				html	+=	'<div class="clear"></div>';
				html	+=	'</dd>';
				$("#cart_heji").before(html);

				//加入购物车后初始我要加价
				$("#jia_price_div").attr('class','ex_btn');
				$("#ifjia").val("n");
				alert("已加入回购车");
			}else if(obj[0]	==	2){
				alert("数据传输有误");
			}else if(obj[0]	==	0){
				alert("操作失败");
			}
		});
	}
}

function new_addcart(url,act,key){
	var gid			=	$("#gid").val();
	if($("#if_show_price")	==	0)	return false;
	$("#if_show_price").val(0);		//加锁
	var typeid	=	1;
	if($("#typeid").length == 1)	typeid = $("#typeid").val();
	$.post(url,{'gid':gid,'key':key,'act':act,'typeid':typeid},function(data){
		$("#if_show_price").val(1);	//解锁
		//alert(data);
		var obj	=	eval(data);
		//提交回购单操作
		if(act	==	'sub'){
			if(obj[0]	==	1){
				gourl			=	url.replace("ajax/new_addcart","order/cart");;
				//location.href	=	gourl;
				var check_url	=	url.replace("ajax/new_addcart","ajax/check_iflogin");
				$.post(check_url,{},function(data){
					var obj	=	eval(data);
					if(obj[0]	==	0){
						login_pop(gourl);
						return;
					}else{
						gourl			=	url.replace("ajax/new_addcart","order/cart");;
						location.href	=	gourl;
						return;
					}
				})
			}else{
				div_id		=	arguments[3]?arguments[3]:'btn_sub_cart';
				$("#"+div_id).attr('disabled',false);
				alert("数据传输有误");
			}
			//return;
		}else{
			if(obj[0]	==	1){
				var arr	= obj[1];
				$(".cart_total_items").html(arr['cart_total_items']);
				$("#cart_total").html('￥'+arr['cart_total']);

				//添加商品信息
				var item_info	= obj[2];
				var item_class	=	arr['cart_total_items']%2==0?'':'class="on"';
				var item_id		=	'cart_items_'+item_info['rowid'];

				var html=	'';

				html	+=	'<tr id="'+item_id+'">';
				html	+=	'<td class="table-padding">';
				html	+=	'<div class="mui-pic">';
				html	+=	'<a href="javascript:remove_cart(\''+item_info['remove_url']+'\',\''+item_info['rowid']+'\')" class="close_btn"><img src="'+item_info['base_url']+'images/close.png" /></a>';
				html	+=	'<a href="javascript:void(0)"><img src="'+item_info['img']+'"  width="74" height="56"/></a></div></td>';
				html	+=	'<td><p><a href="javascript:void(0)">'+item_info['name']+'</a></p></td>';
				html	+=	'<td><em>￥ '+item_info['price']+'</em></td>';
				html	+=	' </tr>';
				//alert(html);
				$("#cart_tr_title").after(html);

				alert("已加入回购车");
			}else if(obj[0]	==	2){
				alert("数据传输有误");
			}else if(obj[0]	==	0){
				alert("操作失败");
			}
		}
	})

	if(act	==	'addcart'){	//加入回购车

	}else if(act	==	'sub'){

	}


}


function	mx_mousemove(obj){
	$(obj).find('.samp').show();
}
function	mx_onmouseout(obj){
	$(obj).find('.samp').hide();
}

function	car_dd_mousemove(obj){
	$(obj).children('a').children('span').attr('class','car_colse_img2');
}
function	car_dd_onmouseout(obj){
	$(obj).children('a').children('span').attr('class','car_colse_img');
}

function window_scroll(){
	if($(window).scrollTop()>647){
		$(".bar1").css({"position":"fixed","z-index":77,"top":0,"margin-top":"0px"});
		$(".car").css({"position":"fixed","z-index":77,"top":0,"margin-top":"0px"})
	}else{
		$(".bar1").removeAttr("style");
		$(".car").removeAttr("style");
	}
}

//显示评论
function show_goods_review(src){
	if($("#goods_review").attr('src')	==	''){
		$("#goods_review").attr('src',src);
	}
}

//显示回购承诺
function show_goods_chengnuo(src){
	if($("#goods_chengnuo").attr('src')	==	''){
		$("#goods_chengnuo").attr('src',src);
	}
}

//显示了解我们如何质检
function show_goods_zhijian(src){
	if($("#goods_zhijian").attr('src')	==	''){
		$("#goods_zhijian").attr('src',src);
	}
}


/*新评估start*/
function step1_next(){
	var flag	=	true;
	$("#property_step1 input").each(function(){if($(this).val()==0){flag=false;return false;}});
	if(! flag){
		alert('请选择评估参数');
		return false;
	}

	$("#property_step2").show();
	$("#property_step1").hide();
	$("#speed2").show();
	$("#speed1").hide();
}
function step2_next(){
   $("#property_step3").show();
   $("#property_step2").hide();
   $("#speed3").show();
   $("#speed2").hide();
}
function step2_back(){
   $("#property_step1").show();
   $("#property_step2").hide();
   $("#speed1").show();
   $("#speed2").hide();
}
function step3_back(){
   $("#property_step2").show();
   $("#property_step3").hide();
   $("#speed2").show();
   $("#speed3").hide();
}
/*新评估end*/

function load_show_price(url){
	var sn	=	$("#sn").val();
	var sign=	$("#sign").val();
	$.post(url,{'sn':sn,'sign':sign},function(data){
		if(data != '0'){
			var list	=	eval(data);
			var obj	=	list[0];
			$(".show_price1").html(obj['hs_price']);
			$(".show_price2").html(obj['pg_price']);
			$(".show_price3").html(obj['st_price']);
		}
	});
}


function setNumber(dom, number){
	if(number < 10)	number	=	'000'+number;
	else if(number < 100)	number	=	'00'+number;
	else if(number < 1000)	number	=	'0'+number;

	var n = String(number), len = n.length;
	var sHtml = "";

	var flag	=	false;
	for (var i = 0; i < len; ++i) {
		//位数不足要补
		sHtml += "<i>";
		var curNum = parseInt(n.charAt(i), 10);
		if(!flag && curNum > 0)	 flag = true;
		if(flag){
			for(var j = 0; j <= curNum; j++) {
				sHtml += "<em>" + j + "</em>";
			}
		}
		sHtml += "</i>";
	};
	//alert(sHtml);
	dom.html(sHtml);

	for (var i = 0; i < len; ++i) {
		var obj = dom.find("i").eq(i);
		var y = -29 * parseInt(n.charAt(i), 10);
		obj.animate({ top: y + "px"}, 1000);
	};
};

function load_show_price_extends(url){
	var sn	=	$("#sn").val();
	var sign=	$("#sign").val();
	$.post(url,{'sn':sn,'sign':sign},function(data){
		if(data != '0'){
			var list	=	eval(data);
			var obj	=	list[0];
			//$(".show_price1").html(obj['hs_price']);
			//$(".show_price2").html(obj['pg_price']);
			//$(".show_price3").html(obj['st_price']);
			//var i	=	obj['pg_price'];
			var i	=	obj['hs_price'];
			setNumber($("#pg_price"), i);
            if(Number(i)>=100)$('#jia_tip').html('下单后最高加价120元');
			$(".pg_price").html(i);
		}
	});
}