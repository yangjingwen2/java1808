// JavaScript Document
//公共js文件
function gotopage(page){
	var url	=	location.href;
	var arr	=	url.split('&currentpage=');
	var is_arr	=	url.split('?');
	var gourl	=	'';
	if(arr.length>1)
		gourl	=	arr[0]+"&currentpage="+page;
	else if(is_arr.length	>	1){
		var is_page_arr	=	url.split('?currentpage=');
		if(is_page_arr.length	> 1)
			gourl	=	is_page_arr[0]+"?currentpage="+page;
		else
			gourl	=	arr[0]+"&currentpage="+page;

	}else
		gourl	=	arr[0]+"?currentpage="+page;
		location.href=	gourl;
}

function	remove_by_id(id){
	$("#"+id).remove();
}

/*js排序函数..str为按什么排序的字段..url格式为http://www.xxx.com?op=sd&oio=xx&sort=xx-des/asc  */
function sortGo(str)
	{
		str = $.trim(str);
		var url = location.href;
		var site = url.indexOf("&sort");	//indexOf方法可返回某个指定的字符串值在字符串中首次出现的位置 没有则返回-1
		
		if(site == "-1")
		{
			if(url.indexOf("?")	==	'-1')	location.href	=	url+"?sort="+str+"-asc";
			else	location.href	=	url+"&sort="+str+"-asc";
		}else
		{	
			
			var str_sort = url.substr(site,(url.length-site));	
			var site_sort = str_sort.indexOf("-");
			var con = str_sort.substr(6,site_sort-6);
			var aORd = str_sort.substr(site_sort+1,3); 
			var url_this = url.substr(0,site);
			if(con == str)
			{	
				if(aORd == "asc")
				{
					location.href=url_this+"&sort="+str+"-des";	
				}else 
				{
					location.href=url_this+"&sort="+str+"-asc";	
				}
			}else
			{
				location.href=url_this+"&sort="+str+"-asc";		
			}
		}
		
	}
	
/**
*	城市级联
**/
function district_change(obj,level,child_id,url){
	var upid		=	$(obj).val();
	var level		=	level;
	var child_id	=	child_id;
	$("#district").html("<option value='0'>请选择</option>");
	if(upid	!=	0){
		$.post(url,{'upid':upid,'level':level},function(data){
			if(data	==	'0'){
				$("#"+child_id).html("<option value='0'>请选择</option>");
			}else{
				$('#'+child_id).html(data);
			}
		});
	}else{
		$("#"+child_id).html("<option value='0'>请选择</option>");
	}
}

/*邮箱验证*/
function check_email(email){
	var flag	=	false;
	
	var value	=	$.trim(email);
	var myreg	=	/^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	if(myreg.test(value))	flag	=	true;
	
	return flag;
}

/*验证手机号*/
function	check_mobile(mobile){
	var flag	=	false;
	var value	=	$.trim(mobile);
	//myreg		=	/^(13[0-9]{9})|(14[0-9]{9})|(15[0-9]{9})|(18[0-9]{9})$/
	myreg		=	/^(1[3|4|5|8|7][0-9]{9})$/
	if(myreg.test(value))	flag	=	true;
	return flag;
}


/*银行卡*/
function	check_bank(bank){
	var flag	=	false;
	var value	=	$.trim(bank);
	value		=	value.replace(/[ ]/g,""); 
	myreg		=	/^([0-9]{12,19})$/
	if(myreg.test(value))	flag	=	true;
	
	return flag;
}

/*身份证验证*/
function	check_id_card(id_card){
	var flag	=	false;
	var value	=	$.trim(id_card);
	myreg		=	/(^\d{15}$)|(^\d{17}([0-9]|[X|x])$)/
	if(myreg.test(value))	flag	=	true;
	
	return flag;
}


/*倒计时*/
function timer(intDiff,day_id,hour_id,minute_id,second_id){
	intDiff = parseInt(intDiff);
	window.setInterval(function(){
	var day=0,
		hour=0,
		minute=0,
		second=0;//时间默认值		
	if(intDiff > 0){
		if(day_id)	day = Math.floor(intDiff / (60 * 60 * 24));
		else		day	= 0;
		if(hour_id)	hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
		else		hour = 0;
		if(minute_id) minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
		else		minute = 0;
		second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
	}
	if (day		<=	9) day 		=	'0' + day;
	if (hour	<=	9) hour 	=	'0' + hour;
	if (minute	<=	9) minute	=	'0' + minute;
	if (second	<=	9) second	=	'0' + second;
	if(day_id)		$('#'+day_id).html(day);
	if(hour_id)		$('#'+hour_id).html(hour);
	if(minute_id)	$('#'+minute_id).html(minute);
	if(second_id)	$('#'+second_id).html(second);
	intDiff--;
	}, 1000);
}

//计算出当前密码当中一共有多少种模式 
function bitTotal(num) {
	modes = 0;
	for (i = 0; i < 4; i++) {
		if(num & 1) modes++;
		num >>>= 1;
	}
	return modes;
}
	
//bitTotal函数 
function CharMode(iN) {
	if (iN >= 48 && iN <= 57) //数字 
		return 1;
	if (iN >= 65 && iN <= 90) //大写字母 
		return 2;
	if (iN >= 97 && iN <= 122) //小写 
		return 2;
	else
		return 8; //特殊字符 
}

//返回密码的强度级别 
function checkStrong(sPW) {
	sPW	=	$.trim(sPW);
	if(sPW.length <= 5)
		return 0; //密码太短 
	Modes = 0;
	for (i = 0; i < sPW.length; i++) {
		//测试每一个字符的类别并统计一共有多少种模式. 
		Modes |= CharMode(sPW.charCodeAt(i));
	}
	return bitTotal(Modes);
}



//公共函数
function remove_cart(url,rowid){
	$.post(url,{'rowid':rowid},function(data){
		var obj	=	eval(data);
		if(obj[0]	==	1){
			var arr	= obj[1];
			$("#cart_items_"+rowid).hide("slow"); 
			$(".cart_total_items").html(arr['cart_total_items']);
			$("#cart_total").html('￥'+arr['cart_total']);
		}else if(obj[0]	==	0){
			alert("操作失败");
		}
	});
}


function open_div(title,src,div_id){
	div_id		=	arguments[2]?arguments[2]:'Loading';
	
	$("#"+div_id+"_title").text(title);
	$("#iframe_id").attr('src',src);
	OpenDiv(div_id,650,30,'');
}

function open_div_extends(title,src,div_id,w,h){
	div_id		=	arguments[2]?arguments[2]:'Loading';
	w			=	arguments[3]?arguments[3]:'650';
	h			=	arguments[4]?arguments[4]:'30';
	$("#"+div_id+"_title").text(title);
	$("#"+div_id+"_iframe_id").attr('src',src);
	OpenDiv(div_id,w,h,'');
}
 /**
  * 生成随机数
  */
  function num_rand() {
        var x = 9999; //上限
        var y = 1000; //下限
        var rand = parseInt(Math.random() * (x - y + 1) + y);
        return rand;
  }
    /**
  * ajax 请求
  *@parameter parameter array
  */
function ajax_post(url,parameter,func,js_arr){
        var par_string = '';
        var c = '';
        var re;   
        for(var key in parameter) {
            
            par_string += c+'"'+key+'":"'+parameter[key]+'"';
            c = ',';
        }
      
     if(par_string == '')return false;
      par_string = '{'+par_string+'}';   
 	 $.post(url,{'ajaxValue':par_string},function(data){
           
          func(data,js_arr);  
     }); 
    
       return;
}
 /**
  * 获得对应的值或对象
  */
 function V(tag,type){
    var oj = $('#'+tag);
    if(type == 'v'){
        
        return $.trim(oj.val());
        
    }else if(type == 'o'){
        
        return oj;
    }
 }
 function open_link_pop(url){
  var url;
  var name='联合登录';
  var iWidth='560';
  var iHeight='560';
  var iTop = (window.screen.availHeight-30-iHeight)/2;
  var iLeft = (window.screen.availWidth-10-iWidth)/2;
  window.open(url,name,'height='+iHeight+',,innerHeight='+iHeight+',width='+iWidth+',innerWidth='+iWidth+',top='+iTop+',left='+iLeft+',toolbar=no,menubar=no,scrollbars=auto,resizeable=no,location=no,status=no');
 }