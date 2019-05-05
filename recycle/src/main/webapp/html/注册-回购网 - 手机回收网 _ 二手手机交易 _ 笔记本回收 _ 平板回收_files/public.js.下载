/* 只能由汉字，字母，数字和下横线组合 */
function mtl_checkuser(str){  
    var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3]|_|[a-zA-Z0-9@.])*$");
	if(!re1.test(str)){
		return false;
	}else{
		return true;
	}
}

/* 判断字符长度，一个汉字为2个字符 */
function mtl_strlen(s){
	var l = 0;
	var a = s.split("");
	for (var i=0;i<a.length;i++){
		if (a[i].charCodeAt(0)<299){
			l++;
		}else{
			l+=2;
		}
	}
   
	return l;

}

/**
  $Id: 检查Email是否合法
  retrun true,false
*/
function mtl_checkemail(str) {
	var re = /^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
	return re.test(str);
}
/*验证手机号*/
function	check_mobile(mobile){
    
	myreg	=	/^(1[3|4|5|8|7][0-9]{9})$/;	
	return myreg.test(mobile);
}
/*验证qq*/
function	check_qq(qq){
    
	myreg	=	/^[1-9]\d{5,12}$/;	
	return myreg.test(qq);
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
/* 加入收藏 */
function mtl_addfavorite(url, title) {
    var vDomainName=window.location.href;
    var description=document.title;
    try{//IE
        window.external.AddFavorite(vDomainName,description);
    }catch(e){//FF
        window.sidebar.addPanel(description,vDomainName,"");
    }
}
/**
 * 
 *操作提示
 *
 */
 function mtl_tip(id,txt,boxcolor,txtcolor,type){
    
    var oj  = $('#'+id);
    var tip = $('#'+id+' span');
      oj.css('background',boxcolor);
      tip.html(txt);
      tip.css('color',txtcolor);
      if(type == 'hidden'){
        
           setTimeout(function(){        
              oj.css('background','');
              tip.html('');
              tip.css('color','');              
           },8500);       
      }
      type = '';
      return false;

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
 /**
  * 清空输入框
  */
 function C(tag,txt,tip_box_id,tip_txt){
    
    var oj = V(tag,'o');
    if(txt != ''){
        
        if(oj.val() == txt && oj.val() != ''){
            
             oj.val('');
             if(tip_box_id !='' && tip_txt !='')
                  mtl_tip(tip_box_id,tip_txt,null,null);
            
             
        }
        
    }
    return;
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
function gotopage(page){
	var url	=	location.href;
    var url =   url.replace('#page_m','');
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
		location.href=	gourl+'#page_m';
}

 /**
  * 全选
  */
function checkAll(t,tname){
	tname = tname?tname:'id[]';
	var tcheck = $(t).is(':checked');
	$("input[name='"+tname+"']").prop('checked',tcheck);
 
}
/**
 * 搜索条件提交
 */
 function search_form(url,txt){
       var val_oj  =    V('search_input','o');
       var val     =    val_oj.val();     
       if(val == txt  || val    ==  '') {
                
                val_oj.val('');
               
        
       }
       
       $("#searchFrom").attr('action',url);         
       $("#searchFrom").submit();
       if(val    ==  '')val_oj.val(txt);
           	
        
       
        	   
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
  function box_show(url,tip){
     
	open_div_extends(tip,url,'Loading_child');	
   
  }
  function sense_box_show(url,tip){
 	sense_open_div_extends(tip,url,'Sense_loading_child');
  }
 function form_sub(url,form_id,btn_id,method){
          var form_oj = V(form_id,'o');
          var method;
          if(!method){
            method='POST';
          }
          form_oj.attr('action',url);
          form_oj.attr('method',method);
          form_oj.submit();
          V(btn_id,'o').attr('disabled','disabled');
          return;
          
    
 }
 /**
  * 加载数据
  */
  function load_data(id,url){
    
            $(function(){ 
                $("#"+id).load(url,null,function(){
                    
                   
                }); 
            }); 
    
  }
  
/**
* iframe
*/
function load_iframe(show_id,iframe_id,url,w,h){
	$(function(){ 
		var html = '<iframe id="'+iframe_id+'" name="'+iframe_id+'" src="'+url+'" width="'+w+'" border="0" frameborder="0" height="'+h+'" ></iframe>'    		
        var windowHeight = document.body.offsetHeight; 
       
	    $(window.parent.document).find("#"+iframe_id).attr('height',windowHeight);
        V(show_id,'o').html(html);
		return;
	});  
}       
/* 不能含非法字符*/
function check_in_info(str){  
	var re1 = new RegExp('^([\u4E00-\uFA29]|[\uE7C7-\uE7F3]|_|[a-zA-Z0-9@.,，\“\”\"\".。?？；;！!" ","　","\t","\n","\r"《》‘’“”=])*$');
	if(!re1.test(str)){
		return false;
	}else{
		return true;
	}
}


/*公共下拉选择赋值函数*/
function public_select_option_click(obj,hidd_id){
	var text	=	$(obj).text();
	var val		=	$(obj).attr('value');
	$(obj).parent().siblings(".select_txt").text(text);
	$("#"+hidd_id).val(val);
}
/**
   * 自动加载
   */  
function to_load(func){
    
    $(document).ready(function(){
        
        func;
        
    });
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
 function get_goods_dress(p,c,d,id){
    var dress_val;
		var province_val	=	get_pcd_address(p);							
		var city_val		=	get_pcd_address(p,c);
    if(d!='0')
    var d_val		    =	get_pcd_address(p,c,d);
    if(province_val ==  city_val){            
            dress_val           =   city_val;            
    }else{            
            dress_val           =   province_val+'&nbsp;'+city_val;
    }
    if(d!='0')
    dress_val           =   dress_val+'&nbsp;'+d_val;
    if(id=='')id='one';
    $("#text_dress_"+id).html(dress_val); 
        
  }

//只允许输入整数
function txt_int_onkeyup(id,def,max_val,mi_val){
	var args 	=	arguments[1] ? arguments[1] : 0;
	var mx		=	arguments[2] ? arguments[2] : 0;
	var mi		=	arguments[3] ? arguments[3] : 0;
	if(window.event.keyCode>40 ||	window.event.keyCode<37){
		$("#"+id).val($("#"+id).val().replace(/[^(0-9)]/g,''));
		var this_val	=	Number($("#"+id).val());
		if(this_val	>	mx)	$("#"+id).val(args);
		if(this_val	<	mi)	$("#"+id).val(args);
		if(this_val	==	0)	$("#"+id).val(args);
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