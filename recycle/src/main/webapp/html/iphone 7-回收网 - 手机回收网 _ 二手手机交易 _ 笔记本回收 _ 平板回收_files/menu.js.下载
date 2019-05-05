$(document).ready(function(){

 

	 

	$('.medium dd').mousemove(function(){

	$(this).find('.medium-txt').fadeIn();

	});

	 $('.medium dd').mouseleave(function(){

	$(this).find('.medium-txt').stop(true).fadeOut();

	});

	 

   



    $(".repurchase-l>dl>dd").mouseover(function(){ 

    $(".repurchase-l>dl>dd").each(function(i){ 

    $(this).removeClass("h_nav_over"); 

    }); 

    $(this).addClass("h_nav_over"); 

    }).mouseout(function(){ 

    $(this).addClass("h_nav_over"); 



});



/*===侧导航==*/

  $(".mui-mbar-gwc").click(function(){

      if($(".mui-mbar").css("right") == "0px")

      {

        $(".mui-mbar").animate({"right":"-264px"});

      }

      else

      {

        $(".mui-mbar").animate({"right":"0px"});

      }

    });

 /*在线客服、投诉建议、二维码、返回顶部*/

   $(".mui-mbar-all").hover(function(){
	     $(this).find(".mui-mbar-all").css({"background":"#333030"});
	     $(this).find(".mui-mbar-last").show().animate({"left":"-75px","opacity":"1"});
	 },function(){
		 $(this).find(".mui-mbar-last").stop(true).animate({"left":"-110px","opacity":"0"},function(){
		     $(this).css({"display":"none"}) 
		 });
		 $(this).find(".mui-mbar-all").css({"background":"none"})
	});
 
 

 
 $(".mui-mbar-weixin").hover(function(){
	$(".mui-mbar-weixin").css({"background":"#333030"})
	$(".mui-weima").show().animate({"left":"-188px","opacity":"1"});
	},function(){
	 $(".mui-weima").stop(true).animate({"left":"-220px","opacity":"0"},function(){
	 $(this).css({"display":"none"})
	 });
	$(".mui-mbar-weixin").css({"background":"none"});
});
 

 

  // *协商记录* //

	 $(".negotiation_m").click(function(){

	  $(this).next(".negotiation_txt").slideToggle("fast");

	 });

 

 });

 

 

 

 

//回到顶部

function goTop(){

	$('html,body').animate({'scrollTop':0},600); 

}; 



 

 //=====================全局函数========================//

//Tab控制函数

function tabs(tabId, tabNum){

	//设置点击后的切换样式

	$(tabId + " .tab li").removeClass("curr");

	$(tabId + " .tab li").eq(tabNum).addClass("curr");

	

	//根据参数决定显示内容

	$(tabId + " .tabcon").hide();

	$(tabId + " .tabcon").eq(tabNum).show();

}

//=====================全局函数========================//

