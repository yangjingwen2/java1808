function showMsgDiv(url,msg){
	if(url!=null && url!="" && url!="undefined"){
	   msg = url;
   }
   ymPrompt.alert({message:msg,title:'消息提醒',winPos:'rb',showMask:false,iframe:true});
}

//浏览器后退一步
function goBack(step){
   if(step){
      window.history.back(step);
   }
}

//浏览器前进一步
function goFoward(step){
   if(step){
      window.history.foward(step);
   }
}

//跳转到指定URL
function goToPage(url){
   if(url){
      window.location.href = url;
   }
}

//跳转到指定URL
function goToPPage(url){
   if(url){
      window.parent.location.href = url;
   }
}

//跳转到指定URL
function reloadPage(){
   window.location.reload;
}


/**
 * 判断是否为空
 * @param {} obj
 */
function isEmpty(obj){
    if(obj==""||obj==null||obj==undefined){
    	return true;
    }else{
        return false;
    }
}

/**
 * 判断对象是否为空
 * @param {Object} v
 * @return {TypeName} 
 */
function isNull(v){
	return v==null||typeof(v)=="undefined"||v=="";
}

/**
 * 判断对象是否不为空
 * @param {Object} v
 * @return {TypeName} 
 */
function isNotNull(v){
	return !isNull(v);
}

/**
 * 打印json数组
 * 
 * @param {}
 *            json
 * @return {}
 */
function printJson(json) {
	var str = "";
	for (var i in json) {
		str += "["+i+"]=" + json[i] + ",\n";
	}
	var param = str.substring(0,str.length-2);
	alert(param);
}

function Exceptalert(msg,type,isShowMask){
	if(isShowMask==null){
      isShowMask = true;//默认有遮罩层
	}
	if(isShowMask){
		if(type=="error"){
		   ymPrompt.errorInfo({message:msg,showMask:isShowMask,title:'错误提示信息',dragOut:false});
		   return true;
		 }
		 else if(type=="success"){
		   ymPrompt.succeedInfo({message:'<font color=green>'+msg+'</font>',showMask:isShowMask,title:'成功提示信息',dragOut:false});
		   return true;
		 }else{
		   ymPrompt.errorInfo({message:'<font color=red>'+msg+'</font>',showMask:isShowMask,title:'错误提示信息',dragOut:false});
		    return true;
		 }
	}else{
	   if(type=="error"){
		   ymPrompt.errorInfo({message:msg,showMask:isShowMask,title:'错误提示信息',dragOut:false});
		   return true;
		 }
		 else if(type=="success"){
		   ymPrompt.succeedInfo({message:'<font color=green>'+msg+'</font>',showMask:isShowMask,title:'成功提示信息',dragOut:false});
		   return true;
		 }else{
		   ymPrompt.errorInfo({message:'<font color=red>'+msg+'</font>',showMask:isShowMask,title:'错误提示信息',dragOut:false});
		    return true;
		 }
	}
}

function reloadWin(isParent){
	if(isParent){
      window.parent.location.reload();
	}else{
	  window.location.reload();
	}
}


function loading(baseUrl,isMask){
	if(isMask==null||isMask==""){
	  isMask = false;
	}
   var imgText = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='"+baseUrl+"/images/022.gif' style='width:32px;height:32px;margin-top:5px;margin-right:5px;'/><font size=2 color=#000000>系统正在处理数据，请稍后...</font>";
   ymPrompt.win({message:imgText,width:300,height:55,handler:null, showMask: isMask, btn:null,titleBar:false})
}

function logining(baseUrl,isMask){
	if(isMask==null||isMask==""){
	  isMask = false;
	}
   var imgText = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='"+baseUrl+"/images/022.gif' style='width:32px;height:32px;margin-top:5px;margin-right:5px;'/><font size=2 color=#000000>正在登录系统，请稍后...</font>";
   ymPrompt.win({message:imgText,width:300,height:55,handler:null, showMask: isMask, btn:null,titleBar:false})
}

function invading(msg,baseUrl,isMask){
	if(isMask==null||isMask==""){
	  isMask = false;
	}
   var imgText = "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src='"+baseUrl+"/images/022.gif' style='width:32px;height:32px;margin-top:5px;margin-right:5px;'/><font size=2 color=#000000>"+msg+"</font>";
   ymPrompt.win({message:imgText,width:300,height:55,handler:null, showMask: isMask, btn:null,titleBar:false})
}

function loadNowPage(tp){
if(tp){
   ymPrompt.close();
   //window.location.reload();
   }
}

function closeNowPage(ty){
    if(ty==true){
  	  window.parent.location.reload();
  	}else{
  	  parent.ymPrompt.close();
  	}
}


 function closeWin(){
   ExceptConfirm('<font color=blue>您确定取消操作吗?</font>',false,function(tp){
      if(tp=="ok"){
        reloadWin(true);
   }else{
     return false;
     }
   });
 }
 
 function closeWin1(){
    reloadWin(true);
 }
function closeWind(){
    ymPrompt.close();
 }
function ExceptConfirm(msg,showmask,func){
	if(showmask==null||showmask==""){
	 showMask = true;
	}else{
	 showmask = showmask;
	}
     ymPrompt.confirmInfo({
	   titleBar:true, //显示标题栏 
	   fixPosition:true, //不随滚动条浮动 
	   dragOut:false, //允许拖出页面 
	   autoClose:true, //点击按钮后自动关闭页面 
	   maskAlphaColor:'#000', //遮罩透明色 
	   maskAlpha:0.4, //遮罩透明度 
	   title: '确认提示', //消息框标题 
	   message: msg, //消息框按钮 
	   iframe:false, 
	   handler: func, //回调事件 
	   showMask: showmask, //是否显示遮罩 
	   winPos: 'c'//弹出窗口默认位置 
    });
}
function ExceptConfirms(msg,showmask,width,height,func){
     //alert(width+"==="+height);
	 if(showmask==null||showmask==""){
	  showMask = true;
	 }else{
	  showmask = showmask;
	 }
	 if(width==""||width==null||width==0){
	   width = 450;
	 }
	 if(height==""||height==null||height==0){
	   height = 200;
	 }
     ymPrompt.confirmInfo({
	   titleBar:true, //显示标题栏 
	   width:width,//宽度
	   height:height,//高度
	   fixPosition:true, //不随滚动条浮动 
	   dragOut:false, //允许拖出页面 
	   autoClose:true, //点击按钮后自动关闭页面 
	   maskAlphaColor:'#000', //遮罩透明色 
	   maskAlpha:0.4, //遮罩透明度 
	   title: '提示信息', //消息框标题 
	   message: msg, //消息框按钮 
	   iframe:false, 
	   handler: func, //回调事件 
	   showMask: showmask, //是否显示遮罩 
	   winPos: 'c'//弹出窗口默认位置 
    });
}

/**
 * 窗口出血方法
 * @param {} url
 * @param {} id
 * @param {} width
 * @param {} height
 * @param {} title
 * @param {} func
 * @param {} isIframe
 * @param {} isDrag
 */
function showWindow2(url,id,width,height,title,func,isIframe,isDrag){
   if(id==""||id==null){
	   id = "w1";//默认id
	}
   Dialog.open({
	   URL:url,
	   ID:id,
	   Modal:isIframe,
	   Drag:isDrag,
	   Title:title,
	   Width:width,
	   Height:height
   });
}

function showWindow(url,msg,width,height,tle,func,isIframe,btn){
	if(width==""||width==null||width==0){
	   width = 600;//默认600
	}
	if(height==""||height==null||height==0){
	   height = 400;//默认400
	}
	if(url!=null&&url!=""&&url!="undefined"){
	   msg = url;//如果url不空则使用url作为msg
	}
    ymPrompt.win({
	   titleBar:true, //显示标题栏 
	   fixPosition:true, //不随滚动条浮动 
	   dragOut:true, //允许拖出页面 
	   autoClose:true, //点击按钮后自动关闭页面 
	   maskAlphaColor:'#000', //遮罩透明色 
	   maskAlpha:0.4, //遮罩透明度 
	   title: tle, //消息框标题 
	   message: msg, //消息框按钮 
	   width: width, //宽 
	   height: height, //高 
	   btn:btn, 
	   icoCls:'', 
	   iframe:true,
	   handler: func, //回调事件 
	   showMask: true, //是否显示遮罩 
	   winPos: 'c'//弹出窗口默认位置 
    });
}


function showWin(url,msg,width,height,tle,func,mask,btn){
	if(width==""||width==null||width==0){
	   width = 600;//默认600
	}
	if(height==""||height==null||height==0){
	   height = 400;//默认400
	}
	if(url!=null&&url!=""&&url!="undefined"){
	   msg = url;//如果url不空则使用url作为msg
	}
    ymPrompt.win({
	   titleBar:true, //显示标题栏 
	   fixPosition:true, //不随滚动条浮动 
	   dragOut:true, //允许拖出页面 
	   autoClose:true, //点击按钮后自动关闭页面 
	   maskAlphaColor:'#000', //遮罩透明色 
	   maskAlpha:0.4, //遮罩透明度 
	   title: "<img src='images/comm/main (2).gif' style='margin-top:2px' align='absmiddle'/>"+" "+tle, //消息框标题 
	   message: msg, //消息框按钮 
	   width: width, //宽 
	   height: height, //高 
	   btn:btn, 
	   icoCls:'', 
	   iframe:true,
	   handler: func, //回调事件 
	   showMask: mask, //是否显示遮罩 
	   winPos: 'c'//弹出窗口默认位置 
    });
}


function showHelp(menu_id){
  if(menu_id!=""&&menu_id!=null){
    var url = "systemMenu!getHelpInfo.action?menuid="+menu_id;
    showWindow(url,null,600,450,"菜单帮助信息",closeNowPage,true);
  }else{
    Exceptalert("对不起！获取菜单帮助信息失败！",null,false);
    return false;
  }
}

/**
 * 刷新上级页面
 * @param {} fm_l 左边
 * @param {} fm_r 右边
 * @param {} num 第几层
 */
function loadParentWin(fm_l,fm_r,num){
	if(num==1){
	    window.parent.location.reload();
	}else{
        window.parent.parent.document.frames(fm_l).location.reload();
	}
    if(num==1){
       window.parent.location.reload();
	}else{
	   window.parent.parent.document.frames(fm_r).location.reload();
	}
}
/**
 * 默认选择一个下拉值
 * @param {} com_name
 * @param {} init_val
 */
function initCombox(com_name,init_val){
    var com_obj = document.getElementsByName(com_name);
    if(com_obj){
	    for(var j=0;j<com_obj.length;j++){
	         if(com_obj[j].value == init_val){
	            com_obj[j].checked = true;
	         }
	    }
    }
}

//数组字符串化
function changeArr2String(arry){
  if(arry=='undefined'||arry==null){
     return "";
  }else{
    return arry.join(",");//转换为字符串
  }
}


function uniuqe(data){
     data = data || [];
     var a = {};
     for(var i=0;i<data.length;i++){
        var v = data[i];
        if(typeof(a[v])=="undefined"){
          a[v] = 1;
        }
     }
     data.length = 0;
     for(var j in a){
       data[data.length] = j;
     }
     return data;
  }
  
  Array.prototype.isRepeate = function(){
     var i,j;
     var flag=false;
     for(i=0;i<this.length;i++){
        for(j=0;i<this.length;i++){
           if(this[i]==this[j] && i!=j){
              flag = true;
              break;
           }
        }
     }
     return flag;
  }
  
 Array.prototype.in_array=function(e){
   for(var i=0;i<this.length;i++){
     if(this[i]!=e){
        return false;
     }else{
        return true;
     }
   }
 }
 
Array.prototype.distinct = function(){
	var a = [];
	var b = [];
	for(var prop in this){
	 var d = this[prop];
	 if(d===a[prop])continue;
	 if(b[d]!=1){
	 	a.push(d);
	 	b[d]=1;
	 }
	}
	return a;

}
 
function $VD(id){
  return document.getElementById(id);
}
function $DV(id){
  return document.getElementById(id).value;
}
function reloadPage(isParent,isModalDialog,isloadLeft){
  if(isParent){
  	if(isModalDialog){
      window.close();
      window.dialogArguments.location.reload();
      if(isloadLeft){
       window.dialogArguments.parent.frmLeft.location.reload();
      }
  	}else{
  	  window.close();
      window.opener.location.reload();
  	}
  }else{
      window.location.reload();
  }
}

function getCheckBoxValue(id){
  var menu_obj = document.getElementsByName(id);
  var i;  
  var j = 0;
  var checkedArry = new Array();
  if( menu_obj !=null ){
    for(i=0;i<menu_obj.length;i++){
     if(menu_obj[i].type == 'checkbox' && menu_obj[i].checked == true){
         checkedArry[j] = menu_obj[i].value;
         j = j+1;
      }
    }
  }
  return Arr2String(checkedArry);
}

function getRadioValue(id){
  var menu_obj = document.getElementsByName(id);
  var checkedVal;
  if( menu_obj !=null ){
    for(var i=0;i<menu_obj.length;i++){
     if(menu_obj[i].type == 'radio' && menu_obj[i].checked == true){
         checkedVal = menu_obj[i].value;
         break;
      }
    }
  }
  return checkedVal;
}




function Arr2String(arry){
  if(arry=='undefined'||arry==null){
     return "";
  }else{
    return arry.join(",");//转换为字符串
  }
}

/**
 * 解析返回参数
 * @param {} msg
 * @return {}
 */
function getMsg(result){
    var bool = "";
    var msgs = "";
    var msg = new Array();
    if(result!=null && result!=""){
       bool = result.substring(0,result.indexOf("#"));
       msgs = result.substring(result.indexOf("#")+1,result.length);
       
       msg.push(bool);
       msg.push(msgs);
    }
    return msg;
}

function checkAllBox(ckid,allbox){
  var ckl = document.getElementsByName(ckid);//全选
  var ck =  document.getElementsByName(allbox);//所有checkbox
     if(ckl[0].checked){
        for(var i=0;i<ck.length;i++){
         ck[i].checked =true;
        }
     }else{
     for(var i=0;i<ck.length;i++){
          ck[i].checked =false;
        }
     }
}
 
 function checkValueInfo(type,vl){
   var bool = false; 
   var regex1 = /^[\w-]+(\.[\w-]+)*@[\w-]+(\.[\w-]+)+$/;
   var regex2 = /^[0-9]{11}$/;
   var regex3 = /^[1-9]*[1-9][0-9]*$/;
   var regex4 = /^\d{14}\d{3}?\w$/;
   var regex5 = /^[\x80-\xff]+$/;
   var regex6 = /^(\d{3}-|\d{4}-)?(\d{8}|\d{7})?$/;
   if(vl!=''&& vl!='undefined' && type=="1"){//检查邮箱格式是否正确
      bool = regex1.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的邮箱格式有误！',null,false);
        return false;
      }else{
        return true;
      }
   }
   if(vl!=''&& vl!='undefined' && type=="2"){//检查手机格式是否正确
      bool = regex2.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的手机号码格式有误！',null,false);
        return false;
      }else{
        return true;
      }
   }
   if(vl!=''&& vl!='undefined' && type=="3"){//检查QQ格式是否正确
      bool = regex3.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的QQ号码格式有误！',null,false);
        return false;
      }else{
        return true;
      }
   }
   if(vl!=''&& vl!='undefined' && type=="4"){//检查身份证格式是否正确
      bool = regex4.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的身份证号码格式有误！',null,false);
        return false;
      }else{
        return true;
      }
   }
   if(vl!=''&& vl!='undefined' && type=="5"){//检查中文字符格式是否正确
      bool = regex5.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的字符不是中文！',null,false);
        return false;
      }else{
        return true;
      }
   }
   if(vl!=''&& vl!='undefined' && type=="6"){//检查电话格式是否正确
      bool = regex6.test(vl);
      if(!bool){
        Exceptalert('对不起！你输入的电话号码格式有误！',null,false);
        return false;
      }else{
        return true;
      }
   }
 }
 
 /**验证全角**/
 function chek_qj(obj){
    var str=obj.value;
    if (str.length>0)
    {
        for (var i = str.length-1; i >= 0; i--)
        {
            unicode=str.charCodeAt(i);
            if (unicode>65280 && unicode<65375)
            {
                obj.value=str.substr(0,i);
                Exceptalert("对不起,不能输入全角字符!",null,false);
            }
        }
        
        strips(obj);
    }
 }
 
 
 function strips(obj) {
	var s = obj.value;
	var pattern = new RegExp("[`~!@#$^&*()= |%$“”\"{}':;',\\[\\].+<>/?~！@#￥……&*（）——{}【】‘；：”“'。，、？]")
	var rs = "";
	for (var i = 0; i < s.length; i++) {
		rs = rs + s.substr(i, 1).replace(pattern, '');
	}
	obj.value=rs;
}

 //alert(conv("）（￥#%……￥&%……"));
 /*转换全半角*/
 function conv(obj){
    var s = obj;
    if(s.length>0){
		while(s.indexOf("０")!=-1){s=s.replace("０","0");}
		while(s.indexOf("１")!=-1){s=s.replace("１","1");}
		while(s.indexOf("２")!=-1){s=s.replace("２","2");}
		while(s.indexOf("３")!=-1){s=s.replace("３","3");}
		while(s.indexOf("４")!=-1){s=s.replace("４","4");}
		while(s.indexOf("５")!=-1){s=s.replace("５","5");}
		while(s.indexOf("６")!=-1){s=s.replace("６","6");}
		while(s.indexOf("７")!=-1){s=s.replace("７","7");}
		while(s.indexOf("８")!=-1){s=s.replace("８","8");}
		while(s.indexOf("９")!=-1){s=s.replace("９","9");}
		
		while(s.indexOf("ａ")!=-1){s=s.replace("ａ","a");}
		while(s.indexOf("ｂ")!=-1){s=s.replace("ｂ","b");}
		while(s.indexOf("ｃ")!=-1){s=s.replace("ｃ","c");}
		while(s.indexOf("ｄ")!=-1){s=s.replace("ｄ","d");}
		while(s.indexOf("ｅ")!=-1){s=s.replace("ｅ","e");}
		while(s.indexOf("ｆ")!=-1){s=s.replace("ｆ","f");}
		while(s.indexOf("ｇ")!=-1){s=s.replace("ｇ","g");}
		while(s.indexOf("ｈ")!=-1){s=s.replace("ｈ","h");}
		while(s.indexOf("ｉ")!=-1){s=s.replace("ｉ","i");}
		while(s.indexOf("ｊ")!=-1){s=s.replace("ｊ","j");}
		while(s.indexOf("ｋ")!=-1){s=s.replace("ｋ","k");}
		while(s.indexOf("ｌ")!=-1){s=s.replace("ｌ","l");}
		while(s.indexOf("ｍ")!=-1){s=s.replace("ｍ","m");}
		while(s.indexOf("ｎ")!=-1){s=s.replace("ｎ","n");}
		while(s.indexOf("ｏ")!=-1){s=s.replace("ｏ","o");}
		while(s.indexOf("ｐ")!=-1){s=s.replace("ｐ","p");}
		while(s.indexOf("ｑ")!=-1){s=s.replace("ｑ","q");}
		while(s.indexOf("ｒ")!=-1){s=s.replace("ｒ","r");}
		while(s.indexOf("ｓ")!=-1){s=s.replace("ｓ","s");}
		while(s.indexOf("ｔ")!=-1){s=s.replace("ｔ","t");}
		while(s.indexOf("ｕ")!=-1){s=s.replace("ｕ","u");}
		while(s.indexOf("ｖ")!=-1){s=s.replace("ｖ","v");}
		while(s.indexOf("ｗ")!=-1){s=s.replace("ｗ","w");}
		while(s.indexOf("ｘ")!=-1){s=s.replace("ｘ","x");}
		while(s.indexOf("ｙ")!=-1){s=s.replace("ｙ","y");}
		while(s.indexOf("ｚ")!=-1){s=s.replace("ｚ","z");}
		while(s.indexOf("Ａ")!=-1){s=s.replace("Ａ","A");}
		while(s.indexOf("Ｂ")!=-1){s=s.replace("Ｂ","B");}
		while(s.indexOf("Ｃ")!=-1){s=s.replace("Ｃ","C");}
		while(s.indexOf("Ｄ")!=-1){s=s.replace("Ｄ","D");}
		while(s.indexOf("Ｅ")!=-1){s=s.replace("Ｅ","E");}
		while(s.indexOf("Ｆ")!=-1){s=s.replace("Ｆ","F");}
		while(s.indexOf("Ｇ")!=-1){s=s.replace("Ｇ","G");}
		while(s.indexOf("Ｈ")!=-1){s=s.replace("Ｈ","H");}
		while(s.indexOf("Ｉ")!=-1){s=s.replace("Ｉ","I");}
		while(s.indexOf("Ｊ")!=-1){s=s.replace("Ｊ","J");}
		while(s.indexOf("Ｋ")!=-1){s=s.replace("Ｋ","K");}
		while(s.indexOf("Ｌ")!=-1){s=s.replace("Ｌ","L");}
		while(s.indexOf("Ｍ")!=-1){s=s.replace("Ｍ","M");}
		while(s.indexOf("Ｎ")!=-1){s=s.replace("Ｎ","N");}
		while(s.indexOf("Ｏ")!=-1){s=s.replace("Ｏ","O");}
		while(s.indexOf("Ｐ")!=-1){s=s.replace("Ｐ","P");}
		while(s.indexOf("Ｑ")!=-1){s=s.replace("Ｑ","Q");}
		while(s.indexOf("Ｒ")!=-1){s=s.replace("Ｒ","R");}
		while(s.indexOf("Ｓ")!=-1){s=s.replace("Ｓ","S");}
		while(s.indexOf("Ｔ")!=-1){s=s.replace("Ｔ","T");}
		while(s.indexOf("Ｕ")!=-1){s=s.replace("Ｕ","U");}
		while(s.indexOf("Ｖ")!=-1){s=s.replace("Ｖ","V");}
		while(s.indexOf("Ｗ")!=-1){s=s.replace("Ｗ","W");}
		while(s.indexOf("Ｘ")!=-1){s=s.replace("Ｘ","X");}
		while(s.indexOf("Ｙ")!=-1){s=s.replace("Ｙ","Y");}
		while(s.indexOf("Ｚ")!=-1){s=s.replace("Ｚ","Z");}
		while(s.indexOf("．")!=-1){s=s.replace("．",".");}
		while(s.indexOf("　")!=-1){s=s.replace("　"," ");}
		while(s.indexOf("（")!=-1){s=s.replace("（","(");}
		while(s.indexOf("）")!=-1){s=s.replace("）",")");}
		while(s.indexOf("｛")!=-1){s=s.replace("｛","{");}
		while(s.indexOf("｝")!=-1){s=s.replace("｝","}");}
		while(s.indexOf("［")!=-1){s=s.replace("［","[");}
		while(s.indexOf("］")!=-1){s=s.replace("］","]");}
		while(s.indexOf("＜")!=-1){s=s.replace("＜","〈");}
		while(s.indexOf("＞")!=-1){s=s.replace("＞","〉");}
		while(s.indexOf("「")!=-1){s=s.replace("「","“");}
		
		while(s.indexOf("」")!=-1){s=s.replace("」","”");}
		while(s.indexOf("｀")!=-1){s=s.replace("｀","`");}
		while(s.indexOf("～")!=-1){s=s.replace("～","~");}
		while(s.indexOf("！")!=-1){s=s.replace("！","!");}
		while(s.indexOf("＠")!=-1){s=s.replace("＠","@");}
		while(s.indexOf("＃")!=-1){s=s.replace("＃","#");}
		while(s.indexOf("￥")!=-1){s=s.replace("￥","$");}
		while(s.indexOf("％")!=-1){s=s.replace("％","%");}
		while(s.indexOf("＾")!=-1){s=s.replace("＾","^");}
		while(s.indexOf("……")!=-1){s=s.replace("……","^");}
		while(s.indexOf("※")!=-1){s=s.replace("※","&");}
		while(s.indexOf("＊")!=-1){s=s.replace("＊","*");}
		while(s.indexOf("－")!=-1){s=s.replace("－","-");}
		while(s.indexOf("＿")!=-1){s=s.replace("＿","_");}
		while(s.indexOf("＋")!=-1){s=s.replace("＋","+");}
		while(s.indexOf("＝")!=-1){s=s.replace("＝","=");}
		while(s.indexOf("｜")!=-1){s=s.replace("｜","|");}
		while(s.indexOf("＼")!=-1){s=s.replace("＼","\\");}
		while(s.indexOf("■")!=-1){s=s.replace("■","-");}
		while(s.indexOf("＇")!=-1){s=s.replace("＇","’");}
		while(s.indexOf("／")!=-1){s=s.replace("／","/");}
		while(s.indexOf("；")!=-1){s=s.replace("；",";");}
		while(s.indexOf("：")!=-1){s=s.replace("：",":");}
		while(s.indexOf("，")!=-1){s=s.replace("，",",");}
		while(s.indexOf("。")!=-1){s=s.replace("，",".");}
		while(s.indexOf("？")!=-1){s=s.replace("？","?");}
     }
    return s;
  }
  
  //copy text in the window that you selected
  function copyClipboard(txt){
		if(window.clipboardData){
			window.clipboardData.clearData();
			window.clipboardData.setData("Text",txt);
		}else if(navigator.userAgent.indexOf("Opera")!=-1){
			window.location=txt;
		}else if(window.netscape){
			try{
				netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
			}catch(e){
				alert("您的firefox安全限制限制您进行剪贴板操作，请打开’about:config’将  signed.applets.codebase_principal_support’设置为true’之后重试，相对路径为firefox根目录 /greprefs/all.js");
				return false;
			}
			var clip=Components.classes['@mozilla.org/widget/clipboard;1'].createInstance (Components.interfaces.nsIClipboard);
			if(!clip)return;
			var trans=Components.classes['@mozilla.org/widget/transferable;1'].createInstance (Components.interfaces.nsITransferable);
			if(!trans)return;
			trans.addDataFlavor('text/unicode');
			var str=new Object();
			var len=new Object();
			var str=Components.classes["@mozilla.org/supports-string;1"].createInstance (Components.interfaces.nsISupportsString);
			var copytext=txt;
			str.data=copytext;
			trans.setTransferData("text/unicode",str,copytext.length*2);
			var clipid=Components.interfaces.nsIClipboard;
			if(!clip)return false;
			clip.setData(trans,null,clipid.kGlobalClipboard);
		}
	}
  //copyText method
  function copyText(id){
     var clipBoardContent;
     if(window.getSelection){
		clipBoardContent = window.getSelection();
		}else if (document.getSelection){
		clipBoardContent = document.getSelection();
		}else if (document.selection){
		clipBoardContent = document.selection.createRange().text;
		}
		if(clipBoardContent==""||clipBoardContent==null){
		   clipBoardContent = document.getElementById(id).value;
		}
     if(clipBoardContent){
		if(copyClipboard(clipBoardContent)!=false){
			Exceptalert("恭喜你！内容已经复制到剪贴板！","success",true);
			return true;
		}else{
		    Exceptalert("对不起！复制内容到剪贴板失败，请检查你的浏览器的设置！",null,true);
		    return false;
		}
	 }else{
		Exceptalert("对不起！复制内容到剪贴板失败！",null,true);
		return false;
	 }
  }
  
  
  //模态打开窗口
function openWinModalDialog(f,n,w,h,s){
    var time=new Date();
	sb = s == "1" ? "1" : "0";
	l = (screen.width - w)/2;
	t = (screen.height - h)/4;
	sFeatures = "time="+time+";left="+ l +";top="+ t +";dialogHeight="+ h +"px,;dialogWidth="+ w
			+ "px;center=1;scrollbars=" + sb + ";status=0;directories=0;channelmode=0;resizable=1;scroll=0;";
	openwin = window.showModalDialog(f , n , sFeatures );	
}
//非模态打开窗口
//f:url,n:标题w:宽h:高s:是否显示滚动条
function openWind(f,n,w,h,s){
    var time=new Date();
	sb = s == "1" ? "yes" : "no";
	l = (screen.width - w)/2;
	t = (screen.height - h)/4;
	sFeatures = "time="+time+";left="+ l +";top="+ t +";dialogHeight="+ h +"px,;dialogWidth="+ w
			+ "px;center=1;scrollbars=" + sb + ";status=0;directories=0;channelmode=0;resizable=1;scroll=0;";
	window.open (f, 'a', 'height='+h+', width='+w+', top='+t+', left='+l+', toolbar=no, menubar=no, scrollbars='+sb+', resizable=no,location=no, status=no') ;
}

/**
 * 同步获取数据方法
 * @param {} url 请求地址
 * @param {} param 请求参数
 * @param {} method 请求方法（post/get）
 * @return {}
 */
function commonLoad(url,param,method){
	var obj;var value;
	if (window.ActiveXObject) {
		obj = new ActiveXObject('Microsoft.XMLHTTP');
	} else if (window.XMLHttpRequest) {
		obj = new XMLHttpRequest();
	}
	obj.open(method, url, false);
	obj.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	obj.send(param);
	var result = obj.responseText
	return result;
}

	//只能输入数字
     function limitbox(obj, re){
		var re = re || /[^\d\.]/g;
		var vl = obj.value;
		if(re.test(vl)){
		   obj.value='';
		   Exceptalert('对不起！只能输入数字！',null,false);
		   return false;
		}else{
		  return true;
		}
	};
	
		//只能输入数字
     function limitbox1(vl, re){
		var re = re || /[^\d\.]/g;
		if(re.test(vl)){
		   Exceptalert('对不起！只能输入数字！',null,false);
		   return false;
		}else{
		  return true;
		}
	};
	
	//比较两个数字 判断是新增数据还是减少数据
 function getBtn_Str(arr1,arr2){
    var add_arr = new Array();
    var mus_arr = new Array();
    if(arr1!=null && arr2!=null){
       //先比较新的数据在老数据中是否存在    
       for(var i=0;i<arr1.length;i++){
          if(!checkItemExist(arr1[i],arr2)){
             //判断新增加的数据加入数组
             add_arr.push(arr1[i]);
          }
       }
       
       //再比较老数据在新的数据中是否存在    
       for(var j=0;j<arr2.length;j++){
          if(!checkItemExist(arr2[j],arr1)){
             //判断减少的数据加入数组
             mus_arr.push(arr2[j]);
          }
       }
    
    //转换参数
    var add_btn = Arr2String(add_arr);
    var del_btn = Arr2String(mus_arr);
    var result = "&add_item="+add_btn+"&del_item="+del_btn;
    return result;
    }
 }
 
 //判断某个元素是否已经存在与数组
 function checkItemExist(vl,arr){
    if(arr!=null && arr.length!=0){
       for(var i=0;i<arr.length;i++){
          if(arr[i]==vl){
             return true;
          }
       }
    }
 }
 
 /**
  * 提示信息
  * @param {} msg
  * @param {} color
  */
 function $AT(msg,color){
     window.parent.Dialog.alert("<font color='"+color+"'>"+msg+"</font>");
 }
 
 /**
  * 确认提示框
  * @param {} msg
  * @param {} color
  * @param {} fun
  */
 function $CF(msg,color,fun){
     window.parent.Dialog.confirm("<font color='"+color+"'>"+msg+"</font>",fun);
 }
 
 /**
  * 关闭当前窗口
  */
 function $CP(tp){
 	 if(tp!=""){
 	   parent.ymPrompt.close();
 	   window.parent.Dialog.close();
 	 }else{
       window.parent.Dialog.close();
 	 }
 }
 
 function isInArr(arr,val){
    var flag=false;
    if(isNotNull(arr)&& isNotNull(val)){
       for(var i=0;i<arr.length;i++){
          if(arr[i]==val){
             flag=true;
             break;
          }
       }
    
    }
 
 }
 
 
 function getFormQueryString(frmID){
	var frmID=document.getElementById(frmID); 
	var i,queryString = "", and = "";
	var item;var itemValue;

    var arry = ['button','submit','reset','image','file']
	for( i=0;i<frmID.length;i++ ){
	    item = frmID[i];// get form's each object
		if(item.name!='' ){
		if(item.type == 'select-one' ){
		    itemValue = item.options[item.selectedIndex].value;
		}else if( item.type=='checkbox' || item.type=='radio') {
		  if(item.checked == false ){
		     continue; 
		   }
		  itemValue = item.value;
		}else if(isInArr(arry,item.type)){
		  continue;
		}else{
		  itemValue = item.value;
		}
		  //itemValue = encodeURIComponent(itemValue);
		  if(typeof(item.name)!=undefined){
		    queryString += and + item.name + '=' + itemValue;
		    and="&";
		  }
		}
	}
  return queryString;
}


/* 
 * 判断图片类型 
 *  
 * @param ths  
 *          type="file"的javascript对象 
 * @return true-符合要求,false-不符合 
 */  
function checkImgType(ths){ 
    var vid = ths.id;
    if (ths.value == "") {  
        Exceptalert("请选择要上传图片！");  
        return false;  
    } else {  
        if (!/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/.test(ths.value)) {
            Exceptalert("图片类型必须是.gif,jpeg,jpg,png中的一种");  
            clearFile(vid);
			document.getElementById(vid).focus();
            return false;  
        }
    }  
    return true;  
}  

/* 
 * 判断excel格式类型 
 *  
 * @param ths  
 *          type="file"的javascript对象 
 * @return true-符合要求,false-不符合 
 */  
function checkExcelType(ths){ 
    var vid = ths.id;
    if (ths.value == "") {  
        Exceptalert("请选择要上传的excel文档！");  
        return false;  
    } else {  
        if (!/\.(xls|xlsx)$/.test(ths.value)) {
            Exceptalert("文档类型必须是.xls,.xlsx中的一种");  
            clearFile(vid);
			document.getElementById(vid).focus();
            return false;  
        }
    }  
    return true;  
}

/* 
 * 判断视频类型 
 *  
 * @param ths  
 *          type="file"的javascript对象 
 * @return true-符合要求,false-不符合 
 */  
function checkVideoType(ths){  
    var vid = ths.id;
    if (ths.value == "") {  
        Exceptalert("请选择要上传的视频文件！");  
        return false;  
    } else {  
        if (!/\.(avi|flv|swf|rmvb|mp4|wmv|vob)$/.test(ths.value)) {  
             Exceptalert("视频类型必须是.avi,flv,swf,mp4中的一种");  
		     clearFile(vid);
			 document.getElementById(vid).focus();
			
            return false;  
        }
    }  
    return true;  
}  

/* 
 * 判断图片大小 
 *  
 * @param ths  
 *          type="file"的javascript对象 
 * @param width 
 *          需要符合的宽  
 * @param height 
 *          需要符合的高 
 * @return true-符合要求,false-不符合 
 */  
function checkImgPX(ths, width, height) {  
    var img = null;  
    img = document.createElement("img");  
    document.body.insertAdjacentElement("beforeEnd", img); // firefox不行  
    img.style.visibility = "hidden";   
    img.src = ths.value;  
    var imgwidth = img.offsetWidth;  
    var imgheight = img.offsetHeight;  
      
    if(imgwidth != width || imgheight != height) {  
        Exceptalert("图的尺寸应该是" + width + "x"+ height);  
        ths.value = "";  
        return false;  
    }  
    return true;  
}

//现在图片的高度和宽度
function limitImgSize(sid,maxh,maxw){
   if(sid!=null){
   var obj =document.getElementById(sid);//显示图片的对象
   alert(obj);
   alert(obj.width);
   alert(obj.height);
      if(obj.width != maxw || obj.height != maxh){
         Exceptalert("图的尺寸应该是" + maxh + "x"+ maxw); 
         clearFile(sid);
      }
      
      if(obj.fileSize>300*1024){
         Exceptalert("图片大小超过限制,请限制在300KB以内"); 
         clearFile(sid);
        
      }
   }
}

function clearFile(id){
	 if(document.getElementById(id).outerHTML) {
	     document.getElementById(id).outerHTML = document.getElementById(id).outerHTML;
	  }else{
	     document.getElementById(id).value = "";
	 }
}

function getFileName(vid){
var path = document.getElementById(vid).value; 
return path.substring(path.lastIndexOf("\\")+1,path.lastIndexOf(".")); 
} 
 
//图片预览
function setPreview(obj,mid,did,w,h) {
       var imgObjPreview=document.getElementById(mid);
       if(obj.files && obj.files[0]){
               //火狐下，直接设img属性
               imgObjPreview.style.display = 'block';
               imgObjPreview.style.width = w+"px";
               imgObjPreview.style.height = h+'px';                    
               //imgObjPreview.src = docObj.files[0].getAsDataURL();
		       //火狐7以上版本不能用上面的getAsDataURL()方式获取，需要一下方式  
		       imgObjPreview.src = window.URL.createObjectURL(obj.files[0]);

       }else{
               //IE下，使用滤镜
               obj.select();
               var imgSrc = document.selection.createRange().text;
               var localImagId = document.getElementById(did);
               //必须设置初始大小
               localImagId.style.width =  w+"px";
               localImagId.style.height = h+"px";
               //图片异常的捕捉，防止用户修改后缀来伪造图片
        try{
               localImagId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
               localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
         }catch(e){
               alert("您上传的图片格式不正确，请重新选择!");
               return false;
         }
               imgObjPreview.style.display = 'none';
               document.selection.empty();
       }
       return true;
  }

