$(function() {
    $("[name=afName]").each(function(k) {
        var i = k+1;
        $(this).click(function() {
            $(this).find(".bor_img img").attr("src", "images/img_" + i + "_2.gif");
            $offseta = $(this).offset();
            $html = $(this).html();
            $("#pos").css({ "top": $offseta.top, "left": $offseta.left}).html($html).attr("class", "areas_flow_yes").show();
            $("[id^=foot_]").hide();
            $("#foot_" +i).show();
			if(i == 2){
				$("#div_express_html").css('display','none');	
			}else{
				$("#div_express_html").css('display','block');	
			}
			$("#status").val(i);
        }).mouseleave(function() {
                $("[name=afName]").attr("class", "areas_flow_no");
                $(this).find(".bor_img img").attr("src", "images/3img/img_" +i + "_1.gif")
        })
        if(k == 0) $(this).click();
    })
})