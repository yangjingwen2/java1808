// JavaScript Document
$(document).ready(function(){
	var province_option	=	'';
	var province_list	=	eval(province);
	for(var i=0;i<province_list.length;i++){
		var obj	=	province_list[i];
		province_option	+=	'<em onclick="option_province_click(this)" value="'+obj['id']+'">'+obj['name']+'</em>';
	}
	
	$("#option_province").html(province_option);
});

function	province_change(){
	var pval	=	$("#province").val();
	if(pval	!=	0){
		var city_option	=	'';
		var city_list	=	eval(city);
		for(var i=0;i<city_list.length;i++){
			var obj		=	city_list[i];
			var upid	=	obj['upid'];
			if(upid	==	pval){
				city_option	+=	'<em onclick="option_city_click(this)" value="'+obj['id']+'">'+obj['name']+'</em>';
			}
		}
		$("#text_city").html('请选择城市');
		$("#option_city").html(city_option);
		$("#text_district").html('请选择区县');
		$("#option_district").html('');
		$("#city").val(0);
		$("#district").val(0);
		$("#school_id").val(0);
	}else{
		$("#text_city").html('请选择城市');
		$("#option_city").html('');
		$("#text_district").html('请选择区县');
		$("#option_district").html('');
		$("#city").val(0);
		$("#district").val(0);
		$("#school_id").val(0);
	}
}


function	city_change(){
	var pval	=	$("#city").val();
	if(pval	!=	0){
		var city_option	=	'';
		var city_list	=	eval(district);
		for(var i=0;i<city_list.length;i++){
			var obj		=	city_list[i];
			var upid	=	obj['upid'];
			if(pval	==	upid){
				city_option	+=	'<em onclick="option_district_click(this)" district="'+obj['id']+'" school="0" >'+obj['name']+'</em>';
			}
		}
		
		if(typeof(school)	!=	"undefined"){
			var school_list	=	eval(school);
			var j	=	school_list.length;
			for(var i=0;i<j;i++){
				var obj		=	school_list[i];
				var cit		=	obj['city'];
				var dis		=	obj['district'];
				var id		=	obj['id'];
				if(pval	==	cit){
					city_option	+=	'<em onclick="option_district_click(this)" district="'+dis+'" school="'+id+'" >'+obj['name']+'</em>';
				}
			}
		}
		$("#text_district").html('请选择区县');
		$("#option_district").html(city_option);
		$("#district").val(0);
		$("#school_id").val(0);
	}else{
		$("#text_district").html('请选择区县');
		$("#option_district").html('');
		$("#district").val(0);
		$("#school_id").val(0);
	}
}

$(document).ready(function(){
	$(".select_box").click(function(event){   
		event.stopPropagation();
		$(this).find(".option").toggle();
		$(this).parent().siblings().find(".option").hide();
	});
	$(document).click(function(event){
		var eo=$(event.target);
		if($(".select_box").is(":visible") && eo.attr("class")!="option" && !eo.parent(".option").length)
		$('.option').hide();									  
	});
})

/*省份点击事件*/
function option_province_click(obj){
	var text	=	$(obj).text();
	var val		=	$(obj).attr('value');
	$(obj).parent().siblings(".select_txt").text(text);
	$("#province").val(val);
	province_change();
}
/*城市点击事件*/
function option_city_click(obj){
	var text	=	$(obj).text();
	var val		=	$(obj).attr('value');
	$(obj).parent().siblings(".select_txt").text(text);
	$("#city").val(val);
	city_change();
}
/*区县点击事件*/
function option_district_click(obj){
	var text		=	$(obj).text();
	var district	=	$(obj).attr('district');
	var school		=	$(obj).attr('school');
	$(obj).parent().siblings(".select_txt").text(text);
	$("#district").val(district);
	$("#school_id").val(school);
}