
/*******************************系统共用js函数文件***********************/
/**
 * 鼠标点击事件
 * @param {} obj
 */
function focusEvent(obj) {
	if (obj.id == "username" || obj.id == "password" || obj.id == "captcha") {
		document.getElementById("tips").innerHTML = "";
		document.getElementById("tips").style.display = "none";
	}
}
/**
 * 鼠标失去焦点事件
 * @param {} obj
 */
function blurEvent(obj) {
	if (obj) {
		var id = obj.id;
		var vl = document.getElementById(id).value;
		if (id == "username" && (vl == "" || vl == null)) {
			document.getElementById("tips").innerHTML = "<font color=yellow>对不起，登录账号不能为空！</font>";
			document.getElementById("tips").style.display = "";
		}
		if (id == "password" && (vl == "" || vl == null)) {
			document.getElementById("tips").innerHTML = "<font color=yellow>对不起，账号密码不能为空！</font>";
			document.getElementById("tips").style.display = "";
		}
		if (id == "captcha" && (vl == "" || vl == null)) {
			document.getElementById("tips").innerHTML = "<font color=yellow>对不起，验证码不能为空！</font>";
			document.getElementById("tips").style.display = "";
		}
	}
}
/**
 * 重置表单
 */
function setFrom() {
	document.getElementById("username").value = "";
	document.getElementById("password").value = "";
	document.getElementById("captcha").value = "";
}
/**
 * 回车提交
 * @param {} event
 */
function onEnter(event) {
	if (event.keyCode == 13) {
		checkSub();
	}
}
/**
 * 提交表单
 */
function checkSub() {
	var acc = document.getElementById("username").value;
	var pwd = document.getElementById("password").value;
	var chc = document.getElementById("captcha").value;
	if (acc == null || pwd == null|| chc == null || acc == "" || pwd == "" || chc == "") {
		document.getElementById("tips").innerHTML = "<font color=yellow>对不起，请输入登录信息！</font>";
		document.getElementById("tips").style.display = "";
	} else {
		document.getElementById("tips").innerHTML = "系统登录中...";
		document.getElementById("tips").style.display = "";
		document.form1.action = "./login!userLogin.ct";
		document.form1.submit();
	}
}
/**
 * 初始化操作
 */
function init() {
	document.form1.username.select();
}


//设置cookie
function setCookie(name, value) {
	var Days = 30; //此 cookie 将被保存 30 天
	var exp = new Date(); //new Date("December 31, 9998");
	exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1000);
	document.cookie = name + "=" + escape(value) + ";expire*=" + exp.toGMTString();
}

//获取cookie
function getCookie(name) {
	var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
	if (arr != "") {
		if (arr) {
			return unescape(arr[2]);
		}
	}
	return "";
}

//删除cookie
function deleteCookie(name) {
	var exp = new Date();
	exp.setTime(exp.getTime() - 1);
	var cval = getCookie(name);
	if (cval != null) {
		document.cookie = name + "=" + escape(name) + ";expire*=" + exp.toGMTString();
	}
}

function showAlert(msg) {
	bootbox.dialog({
    message: "<span class='icon-remove bigger-130 red'>" + msg + "</span>",
    closeButton:false,
    buttons: {
        "OK": {
            "label": "知道了",
            "className": "btn-sm btn-danger",
            "callback": function() {
                //回调
            }
        }
    }
});
}

function showSAlert(msg) {
	bootbox.dialog({
    message: "<span class='icon-ok bigger-130 green'>" + msg + "</span>",
    closeButton:false,
    buttons: {
        "OK": {
            "label": "知道了",
            "className": "btn-sm btn-info",
            "callback": function() {
                //回调
            }
        }
    }
});
}

//实现图片预览
function previewImage(file, w, h, vid) {
	var MAXWIDTH = w;
	var MAXHEIGHT = h;
	var div = document.getElementById(vid);
	if (file.files && file.files[0]) {
		div.innerHTML = "<img id=imghead>";
		var img = document.getElementById("imghead");
		img.onload = function () {
			var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
			img.width = rect.width;
			img.height = rect.height;
			img.style.marginLeft = rect.left + "px";
			img.style.marginTop = rect.top + "px";
		};
		var reader = new FileReader();
		reader.onload = function (evt) {
			img.src = evt.target.result;
		};
		reader.readAsDataURL(file.files[0]);
	} else {
		var sFilter = "filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\"";
		file.select();
		var src = document.selection.createRange().text;
		div.innerHTML = "<img id=imghead>";
		var img = document.getElementById("imghead");
		img.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = src;
		var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
		status = ("rect:" + rect.top + "," + rect.left + "," + rect.width + "," + rect.height);
		div.innerHTML = "<div id=divhead style='width:" + rect.width + "px;height:" + rect.height + "px;margin-top:" + rect.top + "px;margin-left:" + rect.left + "px;" + sFilter + src + "\"'></div>";
	}
}
function clacImgZoomParam(maxWidth, maxHeight, width, height) {
	var param = {top:0, left:0, width:width, height:height};
	if (width > maxWidth || height > maxHeight) {
		rateWidth = width / maxWidth;
		rateHeight = height / maxHeight;
		if (rateWidth > rateHeight) {
			param.width = maxWidth;
			param.height = Math.round(height / rateWidth);
		} else {
			param.width = Math.round(width / rateHeight);
			param.height = maxHeight;
		}
	}
	param.left = Math.round((maxWidth - param.width) / 2);
	param.top = Math.round((maxHeight - param.height) / 2);
	return param;
}


function checkVal(obj) {
	obj.value = obj.value.replace(/[^\.\d]/g, "");
	if (obj.value.split(".").length > 2) {
		obj.value = obj.value.split(".")[0] + "." + obj.value.split(".")[1];
	}
}

function checkVal2(obj) {
	obj.value = obj.value.replace(/[^\d]/g, "");
}

