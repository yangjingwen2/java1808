function	search_goods(id,val){
	if(id	==	'left_pid')	$("#left_pcid").val(0);
	$("#"+id).val($.trim(val));
	var top_name	=	$.trim($("#top_name").val());
	if(top_name	==	'请输入品牌型号搜索')	$("#left_name").val('');
	$("#left_goods_search").submit();
}

