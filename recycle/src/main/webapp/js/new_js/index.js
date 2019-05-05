//首页banner
$(document).ready(function(){
	/*$("#kinMaxShow").kinMaxShow({
			height:348,
			button:{
					showIndex:false,
					normal:{background:'url(/images/new_images/tg_flash_p2.png) no-repeat 0 0',marginRight:'10px',border:'0',right:'42%',bottom:'17px'},
					focus:{background:'url(/images/new_images/tg_flash_p.png) no-repeat 0 0',border:'0'}
				},
			callback:function(index,action){
				switch(index){
				}
			}
		});*/
	
	$(".search-fenlei .set").click(function(){
		var ul=$(".search-list");
		if(ul.css("display")=="none"){
			ul.slideDown();
		}else{
			ul.slideUp();
		}
	});
	$(".search-fenlei li").click(function(){
		var li=$(this).html();
		$("#all_type").html(li);
		$(".search-list").hide();
		var arr	=	$(this).attr('class').split('-');
		suff_class	=	arr[arr.length-1];
		//alert(suff_class);
		$("#search-fenlei").attr('class','search-fenlei-'+suff_class);
		//$(".set").removeClass("select") ;   
	});
});

function nTabs(thisObj,Num){
    if(thisObj.className == "active")return;
    var tabObj = thisObj.parentNode.id;
    var tabList = document.getElementById(tabObj).getElementsByTagName("li");
    for(i=0; i <tabList.length; i++)
    {
        if (i == Num)
        {
            thisObj.className = "active";
            document.getElementById(tabObj+"_Content"+i).style.display = "block";
        }else{
            tabList[i].className = "normal";
            document.getElementById(tabObj+"_Content"+i).style.display = "none";
        }
    }
}
function show_king_list_new(obj,pid){
	$("#"+pid).find("dl").attr('class','bg');
	$(obj).attr('class','');
}

function _nav(name,id,total,is){
	 if(name	==	'nav_t'	&&	id	>1){
		$(".load_img_"+id).each(function(){
			var datasrc	=	$(this).attr('datasrc');
			$(this).attr('src',datasrc);
		})
	}
	for(var i=1;i<=total;i++){
		//alert(i);
		if(!is){
		document.getElementById(name+i).className='';
		}
		//alert(name+"_list"+i);
		document.getElementById(name+"_list"+i).style.display='none';	
	}
	if(!is){
	document.getElementById(name+id).className='on';
	
	}
	document.getElementById(name+"_list"+id).style.display='block';	
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function	top_search_goods(){
	var val	=	$.trim($("#top_name").val());
	if(val.length == 0	||	val ==	'请输入品牌型号搜索'){
		$("#top_name").val('');
		//alert("请输入品牌型号");
		//return false;
	}
	$("#top_goods_search").submit();
}

function t_click(obj,val){
	//$('#top_pid').val(val);
	$("#top_goods_search").attr('action',val);
	
}