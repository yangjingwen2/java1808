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
	myreg		=	/^(1[3|4|5|7|8][0-9]{9})$/
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

