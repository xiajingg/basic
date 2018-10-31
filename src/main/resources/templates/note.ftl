<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="CoreUI - Open Source Bootstrap Admin Template">
    <meta name="author" content="Łukasz Holeczek">
    <meta name="keyword" content="Bootstrap,Admin,Template,Open,Source,jQuery,CSS,HTML,RWD,Dashboard">
    <title>Notes</title>
    <!-- Icons-->
    <link href="/static/node_modules/@coreui/icons/css/coreui-icons.min.css" rel="stylesheet">
    <link href="/static/node_modules/flag-icon-css/css/flag-icon.min.css" rel="stylesheet">
    <link href="/static/node_modules/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="/static/node_modules/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">
    <!-- Main styles for this application-->
    <link href="/static/css/style.css" rel="stylesheet">
    <link href="/static/vendors/pace-progress/css/pace.min.css" rel="stylesheet">
</head>
<body class="app header-fixed sidebar-fixed aside-menu-fixed sidebar-lg-show">
    <#include "public/header.ftl"/>
<div class="app-body">
      <#include "public/left.ftl"/>
    <main class="main">
        <!-- Breadcrumb-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">Home</li>
            <li class="breadcrumb-item active">Notes</li>
        </ol>
        <div class="container-fluid">
            <div class="card-body">
                <strong>
                    <button class="btn btn-primary" type="button" onclick="createNote()">Create</button>
                </strong><br>
            </div>
            <div class="animated fadeIn">
                <div class="row">
                    <div class="col-lg-12">

                        <div class="card">
                            <#list notePOS as notePO>
                                <a href="/noteDetail?id=${notePO.id}">
                                    <div class="card-header">
                                        <strong>${notePO.title}</strong>
                                        <strong style="float: right">${notePO.time} / ${notePO.userid}</strong>
                                    </div>
                                </a>
                            </#list>
                        </div>

                    <#--<#list page.content as order>-->
                    <#--<div class="card">-->
                    <#--<div class="card-header">-->
                    <#--<strong><a href="#">Order ID: ${order.id}</a></strong>-->
                    <#--<#if order.orderStatus==10 && order.paymentStatus==0 && order.sellerStatus==0 && order.tradingStatus==10>-->
                    <#--<button class="btn btn-sm bg-success" onclick="toOrderDetail('${order.id}')"-->
                    <#--style="float: right">-->
                    <#--合约生成中-->
                    <#--</button>-->
                    <#--</#if>-->
                    <#--<#if order.orderStatus==20 && (order.paymentStatus==10 || order.paymentStatus==20 || order.paymentStatus==30) && order.sellerStatus==0 && order.tradingStatus==10>-->
                    <#--<button class="btn btn-sm bg-success" onclick="toOrderDetail('${order.id}')"-->
                    <#--style="float: right">-->
                    <#--待授权支付-->
                    <#--</button>-->
                    <#--</#if>-->
                    <#--<#if order.orderStatus==20 && order.paymentStatus==40 && order.sellerStatus==10 && order.tradingStatus==10>-->
                    <#--<button class="btn btn-sm bg-success" onclick="toOrderDetail('${order.id}')"-->
                    <#--style="float: right">-->
                    <#--卖家确认中-->
                    <#--</button>-->
                    <#--</#if>-->
                    <#--<#if order.tradingStatus==20>-->
                    <#--<button class="btn btn-sm bg-success" onclick="toOrderDetail('${order.id}')"-->
                    <#--style="float: right">-->
                    <#--订单已完成-->
                    <#--</button>-->
                    <#--</#if>-->
                    <#--&lt;#&ndash;<#if order.orderStatus==10 && order.paymentStatus==0 && order.sellerStatus==0 && order.tradingStatus==10>&ndash;&gt;-->

                    <#--</#if>-->
                    <#--</div>-->
                    <#--<div class="card-body">-->
                    <#--<form class="form-horizontal" action="" method="post">-->
                    <#--<div class="form-group row">-->
                    <#--<label class="col-md-2 col-form-label">Data :</label>-->
                    <#--<div class="col-md-9 col-form-label">-->
                    <#--User: ${order.sellerTotal} Data Block: ${order.blockTotal}-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--<div class="form-group row">-->
                    <#--<label class="col-md-2 col-form-label">Price :</label>-->
                    <#--<div class="col-md-9 col-form-label">-->
                    <#--Unit: 1,000 CAR / Data Block 100 CAR / Transfer-->
                    <#--Total ${order.totalPrice} CAR-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--<div class="form-group row">-->
                    <#--<label class="col-md-2 col-form-label">Create Time :</label>-->
                    <#--<div class="col-md-9 col-form-label">-->
                    <#--${order.createdTimeStamp?number_to_datetime?string('yyyy-MM-dd HH:mm:ss')}-->
                    <#--UTC-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</form>-->
                    <#--<#if order.paymentStatus==40>-->
                    <#--<div class="form-group row">-->
                    <#--<label class="col-md-2 col-form-label">截止时间 :</label>-->
                    <#--<div class="col-md-9 col-form-label">-->
                    <#--<button class="btn bg-success col-md-4" type="button" data-toggle="collapse"-->
                    <#--data-target="#collapseExample" aria-expanded="false"-->
                    <#--aria-controls="collapseExample"-->
                    <#--onclick="countDown('countDown${order_index}','${(order.expirationTime)?c}')"-->
                    <#--id="countDown${order_index}" style="color:white;">-->
                    <#--订单完成倒计时：-->
                    <#--</button>-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</#if>-->
                    <#--<div class="form-group row">-->
                    <#--<label class="col-md-2 col-form-label">已完成-->
                    <#--: ${(order.blockConsentNumber!0)}</label>-->
                    <#--<div class="col-md-3 col-form-label">-->
                    <#--<div class="progress mb-3">-->
                    <#--<div class="progress-bar" role="progressbar"-->
                    <#--style="width: ${(order.blockConsentNumber!0)/(order.blockTotal)*100}%;"-->
                    <#--aria-valuenow="25" aria-valuemin="0"-->
                    <#--aria-valuemax="100">${(order.blockConsentNumber!0)/(order.blockTotal)*100}-->
                    <#--%-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--<div class="card-footer">-->
                    <#--<button class="btn btn-sm btn-primary" onclick="toOrderDetail('${order.id}')">-->
                    <#--<i class="fa fa-dot-circle-o"></i> Detail-->
                    <#--</button>-->
                    <#--&lt;#&ndash;<button class="btn btn-sm btn-danger" type="reset">&ndash;&gt;-->
                    <#--&lt;#&ndash;<i class="fa fa-ban"></i> Reset&ndash;&gt;-->
                    <#--&lt;#&ndash;</button>&ndash;&gt;-->
                    <#--</div>-->
                    <#--</div>-->
                    <#--</#list>-->


                    <#--page.getNumber()==0时是第一页, 为了方便看 直接写成page.getNumber()+1 为当前页-->

                    <#--page end-->

                    </div>
                    <!-- /.col-->
                </div>
                <!-- /.row-->
            </div>
        </div>
    </main>
</div>
<#include "public/bottomMenu.ftl">
<!-- CoreUI and necessary plugins-->
<script src="/static/node_modules/jquery/dist/jquery.min.js"></script>
<script src="/static/node_modules/popper.js/dist/umd/popper.min.js"></script>
<script src="/static/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/static/node_modules/pace-progress/pace.min.js"></script>
<script src="/static/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"></script>
<script src="/static/node_modules/@coreui/coreui/dist/js/coreui.min.js"></script>
</body>
</html>
<script>
    // $(function () {
    //     //1秒执行一次start
    //     setInterval(start
    //             , 1000);
    // })
    //
    // //找到所有button去点击一次
    // function start() {
    //     for (i = 0; i < 5; i++) {
    //         $("#countDown" + i).click();
    //     }
    // }
    //
    // //button调用点击修改时间
    // function countDown(a, bu) {
    //     GetRTime(a, bu);
    // }
    //
    // //修改时间
    // function GetRTime(id, time) {
    //     var EndTime = time;//new Date('2015/12/31 10:00:00');
    //     var NowTime = new Date();//当前时间
    //     var t = EndTime - NowTime.getTime();
    //     if (t > 0) {
    //         var d = Math.floor(t / 1000 / 60 / 60 / 24);//天
    //         var h = Math.floor(t / 1000 / 60 / 60 % 24);//时
    //         var m = Math.floor(t / 1000 / 60 % 60);//分
    //         var s = Math.floor(t / 1000 % 60);//秒
    //         if (parseInt(h) < 10 && parseInt(h) > 0) {
    //             h = "0" + h;
    //         }
    //         if (parseInt(m) < 10 && parseInt(m) > 0) {
    //             m = "0" + m;
    //         }
    //         if (parseInt(s) < 10 && parseInt(s) > 0) {
    //             s = "0" + s;
    //         }
    //         $("#" + id).text("订单剩余时间: " + d + "天 " + h + ":" + m + ":" + s);
    //     } else {
    //         $("#" + id).removeClass("bg-success");
    //         $("#" + id).addClass("bg-secondary");
    //         $("#" + id).text("订单剩余时间: " + 0 + "天 " + 0 + ":" + 0 + ":" + 0);
    //
    //     }
    // }


    function findOrder(page, totalpage) {
        if (page < 1) {
            page = 1;
        }
        ;
        if (page > totalpage) {
            page = totalpage;
        }
        window.location.href = "/orders?page=" + page;
    }

    function createNote() {
        window.location.href = "/createNote"
    }


</script>