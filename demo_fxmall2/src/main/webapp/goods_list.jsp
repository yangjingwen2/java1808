<%--
  Created by IntelliJ IDEA.
  User: yangjw
  Date: 2019/3/28
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- saved from url=(0037)http://localhost:8081/cust/goods/list -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><link href="./static/default.css" rel="stylesheet" id="lhgdialoglink">

    <title>商品信息管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- head start-->

    <link rel="shortcut icon" href="http://localhost:8081/wxb/images/favicon.ico">
    <link rel="icon" type="image/gif" href="http://localhost:8081/wxb/images/favicon.gif">
    <link href="./static/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./static/font-awesome.min.css">
    <!--[if IE 7]>
    <link rel="stylesheet" href="/customer/assets/css/font-awesome-ie7.min.css" />
    <![endif]-->
    <link rel="stylesheet" href="./static/font.css">
    <link rel="stylesheet" href="./static/ace.min.css">
    <link rel="stylesheet" href="./static/ace-rtl.min.css">
    <link rel="stylesheet" href="./static/jquery-ui-1.10.3.custom.min.css">
    <link rel="stylesheet" href="./static/jquery.gritter.css">
    <!--[if lte IE 8]>
    <link rel="stylesheet" href="/customer/assets/css/ace-ie.min.css" />
    <![endif]-->
    <link type="text/css" rel="stylesheet" href="./static/public.css">

    <script src="./static/ace-extra.min.js"></script>
    <!--[if lt IE 9]>
    <script src="/customer/assets/js/html5shiv.js"></script>
    <script src="/customer/assets/js/respond.min.js"></script>
    <![endif]-->

    <!-- 系统共用js文件 -->
    <link rel="stylesheet" type="text/css" href="./static/ymPrompt.css">
    <script type="text/javascript" src="./static/ymPrompt.js"></script>
    <script type="text/javascript" src="./static/public.js"></script>
    <script type="text/javascript" src="./static/publics.js"></script>
    <script type="text/javascript" src="./static/table.js"></script>
    <script type="text/javascript" src="./static/vdata.js"></script>

    <!-- head over-->
    <link href="./static/WdatePicker.css" rel="stylesheet" type="text/css"></head>

<body style=""><div class="" style="left: 0px; top: 0px; visibility: hidden; position: absolute;"><table class="ui_border"><tbody><tr><td class="ui_lt"></td><td class="ui_t"></td><td class="ui_rt"></td></tr><tr><td class="ui_l"></td><td class="ui_c"><div class="ui_inner"><table class="ui_dialog"><tbody><tr><td colspan="2"><div class="ui_title_bar"><div class="ui_title" unselectable="on" style="cursor: move;"></div><div class="ui_title_buttons"><a class="ui_min" href="javascript:void(0);" title="最小化" style="display: inline-block;"><b class="ui_min_b"></b></a><a class="ui_max" href="javascript:void(0);" title="最大化" style="display: inline-block;"><b class="ui_max_b"></b></a><a class="ui_res" href="javascript:void(0);" title="还原"><b class="ui_res_b"></b><b class="ui_res_t"></b></a><a class="ui_close" href="javascript:void(0);" title="关闭(esc键)" style="display: inline-block;">×</a></div></div></td></tr><tr><td class="ui_icon" style="display: none;"></td><td class="ui_main" style="width: auto; height: auto;"><div class="ui_content" style="padding: 10px;"></div></td></tr><tr><td colspan="2"><div class="ui_buttons" style="display: none;"></div></td></tr></tbody></table></div></td><td class="ui_r"></td></tr><tr><td class="ui_lb"></td><td class="ui_b"></td><td class="ui_rb" style="cursor: se-resize;"></td></tr></tbody></table></div>
<div class="navbar navbar-default" id="navbar">
    <script type="text/javascript">
        try{ace.settings.check('navbar' , 'fixed')}catch(e){}
    </script>

    <!-- head start-->

    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="http://localhost:8081/cust/index" class="navbar-brand">
                <small>
                    <i class="icon-leaf"></i>
                    微信公众号盈利平台-商户后台管理
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

        <div class="navbar-header pull-right" role="navigation">
            <ul class="nav ace-nav">

                <li class="light-blue">
                    <a data-toggle="dropdown" href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <img class="nav-user-photo" src="./static/user.jpg" alt="Jason's Photo">
                        <span class="user-info">
									<small>欢迎您,</small>
									123456
								</span>

                        <i class="icon-caret-down"></i>
                    </a>

                    <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
                        <li>
                            <a href="http://localhost:8081/cust/chpwd">
                                <i class="icon-cog"></i>
                                修改密码
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/setting">
                                <i class="icon-user"></i>
                                个人资料
                            </a>
                        </li>

                        <li class="divider"></li>

                        <li>
                            <a href="http://localhost:8081/cust/logout">
                                <i class="icon-off"></i>
                                退出登录
                            </a>
                        </li>
                    </ul>
                </li>
            </ul><!-- /.ace-nav -->
        </div><!-- /.navbar-header -->
    </div><!-- /.container -->
    <!-- head over-->
</div>

<div class="main-container" id="main-container">
    <script type="text/javascript">
        try{ace.settings.check('main-container' , 'fixed')}catch(e){}
    </script>

    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="http://localhost:8081/cust/goods/list#">
            <span class="menu-text"></span>
        </a>

        <!-- head start-->


        <div class="sidebar" id="sidebar">
            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
            </script>

            <div class="sidebar-shortcuts" id="sidebar-shortcuts">
                <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                    <button class="btn btn-success" onclick="window.location.href='/cust/report/good'">
                        <i class="icon-signal"></i>
                    </button>

                    <button class="btn btn-info" onclick="window.location.href='/cust/setting'">
                        <i class="icon-pencil"></i>
                    </button>

                    <button class="btn btn-warning" onclick="window.location.href='/cust/order/count/1'">
                        <i class="icon-group"></i>
                    </button>

                    <button class="btn btn-danger" onclick="window.location.href='/cust/chpwd'">
                        <i class="icon-cogs"></i>
                    </button>
                </div>

                <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                    <span class="btn btn-success"></span>

                    <span class="btn btn-info"></span>

                    <span class="btn btn-warning"></span>

                    <span class="btn btn-danger"></span>
                </div>
            </div><!-- #sidebar-shortcuts -->

            <ul class="nav nav-list">
                <li>
                    <a href="http://localhost:8081/cust/index">
                        <i class="icon-home"></i>
                        <span class="menu-text"> 系统首页 </span>
                    </a>
                </li>

                <li class="active open">
                    <a href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <i class="icon-list"></i>
                        <span class="menu-text"> 商品管理 </span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li class="active">
                            <a href="http://localhost:8081/cust/goods/list">
                                <i class="icon-double-angle-right"></i>
                                商品信息
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/goods/add">
                                <i class="icon-pencil"></i>
                                增加商品
                            </a>
                        </li>
                        <li>
                            <a href="http://localhost:8081/cust/goods/copy/list">
                                <i class="icon-double-angle-right"></i>
                                商品文案
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/goods/copy/add?tp=0">
                                <i class="icon-pencil"></i>
                                增加微信文案
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/goods/copy/add?tp=1">
                                <i class="icon-pencil"></i>
                                增加站内文案
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/goods/copy/add?tp=2">
                                <i class="icon-pencil"></i>
                                增加空间文案
                            </a>
                        </li>
                    </ul>
                </li>

                <li>
                    <a href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <i class="icon-tag"></i>
                        <span class="menu-text"> 订单管理 </span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">

                        <li>
                            <a href="http://localhost:8081/cust/order/list">
                                <i class="icon-double-angle-right"></i>
                                全部的订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/1">
                                <i class="icon-double-angle-right"></i>
                                已下单订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/9">
                                <i class="icon-double-angle-right"></i>
                                待跟进订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/2">
                                <i class="icon-double-angle-right"></i>
                                待发货订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/3">
                                <i class="icon-double-angle-right"></i>
                                已取消订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/4">
                                <i class="icon-double-angle-right"></i>
                                已发货订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/5">
                                <i class="icon-double-angle-right"></i>
                                已结算订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/6">
                                <i class="icon-double-angle-right"></i>
                                已拒收订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/7">
                                <i class="icon-double-angle-right"></i>
                                已签收订单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/list/8">
                                <i class="icon-double-angle-right"></i>
                                已退货订单
                            </a>
                        </li>

                    </ul>
                </li>


                <li>
                    <a href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <i class="icon-bar-chart"></i>
                        <span class="menu-text"> 统计报表</span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">

                        <li>
                            <a href="http://localhost:8081/cust/report/good">
                                <i class="icon-double-angle-right"></i>
                                商品销售统计
                            </a>
                        </li>

                    </ul>
                </li>

                <li>
                    <a href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <i class="icon-credit-card"></i>

                        <span class="menu-text">
					财务管理
				</span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">

                        <li>
                            <a href="http://localhost:8081/cust/order/count/1">
                                <i class="icon-double-angle-right"></i>
                                待结算流水
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/count/2">
                                <i class="icon-double-angle-right"></i>
                                已结算流水
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/count/3">
                                <i class="icon-double-angle-right"></i>
                                已返款流水
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/money">
                                <i class="icon-double-angle-right"></i>
                                财务返款单
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/order/paylog">
                                <i class="icon-double-angle-right"></i>
                                支付宝记录
                            </a>
                        </li>

                        <!-- <li >
                            <a href="/cust/charge/list">
                                <i class="icon-double-angle-right"></i>
                                消费与充值
                            </a>
                        </li>-->
                    </ul>
                </li>

                <li>
                    <a href="http://localhost:8081/cust/goods/list#" class="dropdown-toggle">
                        <i class="icon-group"></i>

                        <span class="menu-text">
					用户管理
				</span>

                        <b class="arrow icon-angle-down"></b>
                    </a>

                    <ul class="submenu">
                        <li>
                            <a href="http://localhost:8081/cust/setting">
                                <i class="icon-double-angle-right"></i>
                                基本信息
                            </a>
                        </li>

                        <li>
                            <a href="http://localhost:8081/cust/chpwd">
                                <i class="icon-double-angle-right"></i>
                                修改密码
                            </a>
                        </li>

                    </ul>
                </li>

            </ul>

            <!-- /.nav-list -->
            <div class="sidebar-collapse" id="sidebar-collapse">
                <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
            </div>

            <script type="text/javascript">
                try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
            </script>
        </div>
        <!-- head over-->

        <div class="main-content">
            <div class="breadcrumbs" id="breadcrumbs">
                <script type="text/javascript">
                    try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
                </script>

                <ul class="breadcrumb">
                    <li>
                        <i class="icon-home home-icon"></i>
                        <a href="http://localhost:8081/cust/index">首页</a>
                    </li>

                    <li>
                        <a href="http://localhost:8081/cust/goods/list">商品管理</a>
                    </li>

                </ul><!-- .breadcrumb -->

                <div class="nav-search" id="nav-search">
                    <form name="formSelect" method="post" action="http://localhost:8081/cust/goods/list">
								<span class="input-icon">
									<input type="text" placeholder="商品ID/名称" onkeydown="enterSubmit();" class="nav-search-input" name="searchText" id="searchText" value="">
									<i class="icon-search nav-search-icon"></i>
								</span>
                    </form>
                </div><!-- #nav-search -->

            </div>

            <div class="page-content">
                <!--<div class="page-header">
                     <button class="btn btn-sm btn-success" onclick="window.location.href='/cust/goods/add'">
                         <i class="icon-save bigger-110"></i>
                         添加
                     </button>
                 </div>-->
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->

                        <div class="row">
                            <div class="col-xs-12">
                                <div class="table-responsive">
                                    <table id="sample-table-1" class="table table-striped table-bordered table-hover">
                                        <thead>
                                        <tr>
                                            <th class="center">序 号</th>
                                            <th class="left">商品名称</th>
                                            <th class="center">价 格</th>
                                            <th class="center">分 成</th>
                                            <th class="center">
                                                <i class="icon-time bigger-110 hidden-480"></i>
                                                加入时间
                                            </th>
                                            <th class="center">推荐</th>
                                            <th class="center">置顶</th>
                                            <th class="center">状态</th>

                                            <th class="left">操 作</th>
                                        </tr>
                                        </thead>

                                        <tbody>

                                        <c:forEach var="goods" items="${goodsList}">
                                        <tr>
                                            <td class="center">1</td>
                                            <td class="left"><a href="http://localhost:8081/cust/goods/list#" onclick="window.location.href='/cust/goods/add?good_id=14886110'">${goods.goodName}</a></td>
                                            <td class="center">${goods.skuCost}</td>
                                            <td class="center">${goods.skuPmoney}</td>
                                            <td class="center">${goods.createTime}</td>
                                            <td class="center">
                                                <span class="label label-sm label-primary">未置顶</span>
                                            </td>
                                            <td class="center">
                                                <span class="label label-sm label-grey">未推荐</span>
                                            </td>
                                            <td class="center">

                                            </td>

                                            <td class="left">
                                                <div class="visible-md visible-lg hidden-sm hidden-xs btn-group" style="align:center">
                                                    <button class="btn btn-xs btn-primary" onclick="window.location.href='/cust/goods/add?good_id=14886110'">
                                                        <i class="icon-edit bigger-120"></i>
                                                    </button>

                                                    <button class="btn btn-xs btn-danger" onclick="trashGood('14886110','0')">
                                                        <i class="icon-trash bigger-120"></i>
                                                    </button>
                                                </div>
                                            </td>

                                        </tr>
                                        </c:forEach>

                                        </tbody>

                                    </table>

                                    <div class="row">

                                        <div class="col-sm-6">
                                            <div class="sender" id="sample-table-2_info">
                                                共 4 条记录，每页 5 条，共 1 页
                                            </div>
                                        </div>
                                        <div class="col-sm-6">
                                            <div class="dataTables_paginate paging_bootstrap sender">
                                                <ul class="pagination">
                                                    <li><a href="goods.do?page=1" class="active">1</a></li>
                                                    <li><a href="goods.do?page=2">2</a></li>
                                                </ul>


                                            </div>
                                        </div>

                                    </div>

                                </div><!-- /.table-responsive -->
                            </div><!-- /span -->
                        </div><!-- /row -->

                    </div><!-- /.page-content -->
                </div><!-- /.main-content -->

            </div><!-- /.main-container-inner -->

            <a href="http://localhost:8081/cust/goods/list#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="icon-double-angle-up icon-only bigger-110"></i>
            </a>
        </div><!-- /.main-container -->

        <!-- menu start-->


        <!--[if !IE]> -->
        <script src="./static/jquery-2.0.3.min.js"></script>
        <!-- <![endif]-->
        <!--[if IE]>
        <script src="/customer/assets/js/jquery-1.10.2.min.js"></script>
        <![endif]-->
        <!--[if !IE]> -->
        <script type="text/javascript">
            window.jQuery || document.write("<script src='/customer/assets/js/jquery-2.0.3.min.js'>"+"<"+"script>");
        </script>
        <!-- <![endif]-->
        <!--[if IE]>
        <script type="text/javascript">
            window.jQuery || document.write("<script src='/customer/assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");
        </script>
        <![endif]-->
        <script type="text/javascript">
            if("ontouchend" in document) document.write("<script src='/customer/assets/js/jquery.mobile.custom.min.js'>"+"<"+"script>");
        </script>
        <script src="./static/bootstrap.min.js"></script>
        <script src="./static/typeahead-bs2.min.js"></script>
        <!-- page specific plugin scripts -->
        <!--[if lte IE 8]>
        <script src="/customer/assets/js/excanvas.min.js"></script>
        <![endif]-->

        <script src="./static/jquery-ui-1.10.3.custom.min.js"></script>
        <script src="./static/jquery.ui.touch-punch.min.js"></script>
        <script src="./static/bootbox.min.js"></script>
        <script src="./static/jquery.gritter.min.js"></script>

        <!-- ace scripts -->
        <script src="./static/ace-elements.min.js"></script>
        <script src="./static/ace.min.js"></script>

        <script type="text/javascript" src="./static/WdatePicker.js"></script>
        <script type="text/javascript" src="./static/lhgdialog.min.js"></script>

        <script type="text/javascript">
            jQuery(function($) {
                $('table th input:checkbox').on('click' , function(){
                    var that = this;
                    $(this).closest('table').find('tr > td:first-child input:checkbox')
                        .each(function(){
                            if(!this.disabled){
                                this.checked = that.checked;
                                $(this).closest('tr').toggleClass('selected');
                            }
                        });
                });
            })
        </script>

        <script type="text/javascript">
            (function(config){
                config['extendDrag'] = true; // 注意，此配置参数只能在这里使用全局配置，在调用窗口的传参数使用无效
                config['lock'] = true;
                config['fixed'] = true;
                config['okVal'] = '确定';
                config['cancelVal'] = '取消';
            })($.dialog.setting);

            // 如果只设置一个或少量全局配置也可这样：
            $.dialog.setting.extendDrag = true;

        </script>
        <!-- menu over-->
        <script type="text/javascript">
            function trashGood(id,state){
                if(id == null || id==''){
                    $.dialog.alert("请先选择要删除的数据！");
                    return;
                }
                if(state!='0'){//只有为审核的商品可以上传
                    $.dialog.alert("对不起，只有未审核的商品可以删除！");
                    return;
                }
                $.dialog.confirm('<font color=red>你确定要删除商品数据吗？</font>', function(){
                    $.dialog.tips('数据处理中...',600,'loading.gif');
                    var param = "good_id="+id+"&now="+new Date().getTime();
                    jQuery.ajax({
                        type: "post",
                        cache : false,
                        url: "/cust/goods/trash",
                        data: param,
                        success: function(result){
                            if(result=='true'){
                                setTimeout('reloadPage();',500);
                            }
                            if(result=='false'){
                                $.dialog.alert("对不起，删除商品信息失败！");
                            }
                        }
                    });

                });
            }
        </script>


    </div></div><div id="ldg_dragmask" style="display: none; position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; cursor: move; opacity: 0; background: rgb(255, 255, 255); pointer-events: none;"></div><div><div id="maskLevel" style="position:absolute;top:0;left:0;display:none;text-align:center;z-index:10000;"></div><div id="ym-window" style="position:absolute;z-index:10001;display:none"><div class="ym-tl" id="ym-tl"><div class="ym-tr"><div class="ym-tc" style="cursor:move;"><div class="ym-header-text"></div><div class="ym-header-tools"></div></div></div></div><div class="ym-ml" id="ym-ml"><div class="ym-mr"><div class="ym-mc"><div class="ym-body"></div></div></div></div><div class="ym-ml" id="ym-btnl"><div class="ym-mr"><div class="ym-btn"></div></div></div><div class="ym-bl" id="ym-bl"><div class="ym-br"><div class="ym-bc"></div></div></div></div></div></body></html>
