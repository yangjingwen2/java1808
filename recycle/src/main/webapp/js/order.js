function checkfrom(){
	//联系方式
	if($("input[name='member_addr']:checked").length	==	0){
		alert("请选择联系方式");
		return false;
	}
	
	var radio_addr_val	=	$("input[name='member_addr']:checked").val();
	if(radio_addr_val	==	0){
		if($.trim($("#link_name").val()) == ''){
			alert("请输入联系人");
			$("#link_name").focus();
			return false;
		}
		
		if(!check_mobile($("#mobile").val())){
			alert("手机号码有误");
			$("#mobile").focus();
			return false;
		}
	
		if($.trim($("#province").val()) == 0){
			alert("请选择省份");
			$("#province").focus();
			return false;
		}
		
		if($.trim($("#city").val()) == 0){
			alert("请选择城市");
			$("#city").focus();
			return false;
		}
		
		if($.trim($("#district").val()) == 0	&&	$.trim($("#school_id").val()) == 0){
			alert("请选择区县");
			$("#district").focus();
			return false;
		}
		
		//选择回购网联系快递　
		if($("#express_true").attr('checked')){
			if($.trim($("#address").val()) == ''){
				alert("请输入详细地址");
				$("#address").focus();
				return false;
			}
			else if($.trim($("#stime").val()) == ''){
				alert("请输入上门取件时间");
				$("#stime").focus();
				return false;	
			}else if($.trim($("#etime").val()) == ''){
				alert("请输入上门取件时间");
				$("#etime").focus();
				return false;	
			}
		}
		//上门交易提示城市
		if($("#ifalipay").val() == 's' && ($.trim($("#province").val()) != '6' || $.trim($("#city").val()) != '77')){
			alert('温馨提示：目前仅支持深圳地区当面交易，其它地区请选择支付宝担保交易或官方担保交易。');
			return false;
		}
	}

	//输入验证码
	/*var verifycode = $.trim($('input[name=verifycode]').val());
	if(verifycode == ''){alert('请输入验证码');$('#verifycode').focus();return false;}*/
	
	//选择货到付款
	if($("#ifalipay").val()=='n'){	//货到付款->银行账户
		//收款银行账号
		if($("input[name='member_bank']:checked").length	==	0){
			alert("请选择收款银行账号");
			return false;
		}
		
		var radio_bank_val	=	$("input[name='member_bank']:checked").val();
		if(radio_bank_val	==	0){
			if($.trim($("#bankname").val()) == 0){
				alert("请选择银行名称");
				$("#bankname").focus();
				return false;
			}else if($.trim($("#realname").val()) == ''){
				alert("请输入开户姓名");
				$("#realname").focus();
				return false;
			}else if($.trim($("#card_sn").val()) == ''){
				alert("请输入银行账号");
				$("#card_sn").focus();
				return false;	
			}
		}
	}
	
	//选择支付宝担保交易
	if($("#ifalipay").val()=='y'){
		if($.trim($("#alipay_realname").val()) == ''){
			alert("请输入支付宝户名");
			$("#alipay_realname").focus();
			return false;
		}
		
		if($.trim($("#alipay_username").val()) == ''){
			alert("请输入收款支付宝账号");
			$("#alipay_username").focus();
			return false;
		}
	}
	
	//选择当面交易
	if($("#ifalipay").val()=='s' && $("input[name='mianjiao_method']:checked").val()==2){
		if($.trim($("#yu_time").val()) == ''){
			alert("请选择上门日期");
			$("#yu_time").focus();
			return false;
		}
		
		if($("input[name='mianjiao_hour']:checked").length	==	0){
			alert("请选择上门时间点");
			return false;
		}
	}
	
	//保险
	if($("#ifbaoxian").attr('checked')){
		if($.trim($("#baoxian_name").val()) == ''){
			alert("请输入您的姓名");
			$("#baoxian_name").focus();
			return false;	
		}
		
		if($.trim($("#baoxian_card_id").val()) == ''){
			alert("请输入您的身份证");
			$("#baoxian_card_id").focus();
			return false;	
		}
	}
	
	$("#sub_button").attr('disabled','disabled');	//防止网络延迟重复提交
	$("#myFrom").submit();
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

$(document).ready(function(){
    //解锁指引
   $('.guide').hover(function(){
           $('.alertTips').show();
   },function(){
           $('.alertTips').hide();
   });   
   $("input[name='lock']").click(function(){
      var  v= $(this).val();
      if(v=="n"){
          $("input[name='pwd']").show();
      }else{
          $("input[name='pwd']").hide();
      }
   })
   
});
