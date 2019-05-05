// JavaScript Document
var init_show_id	=	'';
function init_(){
		return document.getElementById?document.getElementById(arguments[0]):eval(arguments[0]);
	}
	
	var OverH,OverW,OverCH,OverCW,ChangeDesc,ChangeH=50,ChangeW=50,ChangeH2=2,ChangeW2=2;
	//var _Desc = '<iframe name="I" height="100%" width="100%" border="0" frameborder="0" src="30.html"> 浏览器不支持嵌入式框架，或被配置为不显示嵌入式框架。</iframe>';

	function OpenDiv(show_id,_Dw,_Dh,_Desc0) {
		init_show_id	=	show_id;
		OverH=_Dh;
		OverW=_Dw;
		//I2.window.location.href = _Desc0+'.html';
		init_(show_id).style.display='';
		OpenNow(show_id,_Dw);
		document.getElementById('mbDIV').style.display = '';
	}
	
	var Nw=10,Nh=10,Cw,Ch;
	
	function OpenNow(show_id,_Dw) {
		init_(show_id).style.width=_Dw+"px";
		var aa	=	document.documentElement.scrollTop+document.body.scrollTop;
		init_(show_id).style.left=(document.documentElement.clientWidth-_Dw)/2+"px";
		
		//init_(show_id).style.height=400+"px";
		var h_str	=	init_(show_id).style.height;
		var h_num	=	Number(h_str.replace('px',''))+40;
		//init_(show_id).style.top=aa+(document.documentElement.clientHeight-600)/2+"px";
		init_(show_id).style.top=aa+(document.documentElement.clientHeight-h_num)/2+"px";
		/*
		if (Nw>OverW-ChangeW)	ChangeW=2;
		if (Nh>OverH-ChangeH)	ChangeH=2;
		Nw=Nw+ChangeW;
		Nh=Nh+ChangeH;
 		var show_id	= init_show_id;
		
		
		if(OverW>Nw||OverH>Nh){
			if(OverW>Nw) {
				init_(show_id).style.width=Nw+"px";
				init_(show_id).style.left=(document.documentElement.clientWidth-Nw)/2+"px";
				//alert((document.documentElement.clientWidth-Nw)/2);
				
			}
			if(OverH>Nh) {
				init_(show_id).style.height=Nh+"px";
			//init_(show_id).style.top=(document.documentElement.scrollTop+(document.documentElement.clientHeight-Nh)/2)+"px";

				init_(show_id).style.top=((document.documentElement.scrollTop+document.body.scrollTop)+(document.documentElement.clientHeight-Nh)/4)+"px";
				//alert(init_(show_id).style.top);

			}
			//window.setTimeout(function(){OpenNow("+show_id+")},0);
		}else{
			
			Nw=10;Nh=10;ChangeH=50;ChangeW=50;
			alert(show_id);
			//init_(show_id).innerHTML=ChangeDesc;
		}
		*/
	}
	
	function CloseDiv(show_id) {
		OverCW = document.getElementById(show_id).offsetWidth;
		OverCH = document.getElementById(show_id).offsetHeight;
		Cw = OverCW;
		Ch = OverCH;
		CloseNow();
	}
 
	function CloseNow() {
		Cw=Cw-50;
		Ch=Ch-50;
		
		if(Cw>0||Ch>0){
			if(Cw>0) {
				init_(show_id).style.width=Cw+"px";
				init_(show_id).style.left=(document.documentElement.clientWidth-Cw)/2+"px";
			}
			if(Ch>0) {
				init_(show_id).style.height=Ch+"px";
				init_(show_id).style.top=(document.documentElement.scrollTop+(document.documentElement.clientHeight-Ch)/2)+"px";
			}
			window.setTimeout("CloseNow()",10)
		}else{
			init_(show_id).style.display='none';
			document.getElementById('mbDIV').style.display = 'none';
			//init_(show_id).innerHTML='';
		}
	}
 
	function ttt(show_id){
		document.getElementById(show_id).style.display='none';
		document.getElementById('mbDIV').style.display = 'none';
	}
	
	window.onload = function (){
		var	b_h		=	Number(document.body.scrollHeight);
		var	d_h		=	Number(document.documentElement.scrollHeight);
		var m_h		=	d_h<b_h?b_h:d_h;
		document.getElementById('mbDIV').style.height = m_h + "px";
		//document.getElementById('mbDIV').style.height = document.documentElement.scrollHeight + "px";
	};
	
	
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