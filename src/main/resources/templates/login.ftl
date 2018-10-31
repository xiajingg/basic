<!DOCTYPE html>
<!--
* CoreUI - Free Bootstrap Admin Template
* @version v2.0.0
* @link https://coreui.io
* Copyright (c) 2018 creativeLabs Łukasz Holeczek
* Licensed under MIT (https://coreui.io/license)
-->

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="CoreUI - Open Source Bootstrap Admin Template">
    <meta name="author" content="Łukasz Holeczek">
    <meta name="keyword" content="Bootstrap,Admin,Template,Open,Source,jQuery,CSS,HTML,RWD,Dashboard">
    <title>Login</title>
    <script src="/static/node_modules/jquery/dist/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            //alert("页面加载之前")
        });
    </script>
    <!-- Icons-->
    <link href="/static/node_modules/@coreui/icons/css/coreui-icons.min.css" rel="stylesheet">
    <link href="/static/node_modules/flag-icon-css/css/flag-icon.min.css" rel="stylesheet">
    <link href="/static/node_modules/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="/static/node_modules/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">
    <!-- Main styles for this application-->
    <link href="/static/css/style.css" rel="stylesheet">
    <link href="/static/vendors/pace-progress/css/pace.min.css" rel="stylesheet">
</head>
<style type="text/css">
    input:-webkit-autofill {
        box-shadow: 0 0 0px 1000px rgba(0,0,0,1) inset !important;
        -webkit-box-shadow: 0 0 0px 1000px rgba(0,0,0,1) inset !important;
        border: 1px solid #CCC!important;
        -webkit-text-fill-color: white;
    }

</style>
<body class="app flex-row align-items-center"
      style="background: url('/static/img/cut/background.png') repeat-y center top;min-heigth:min-height:100%; height:auto !important; height:100%;">
<div class="container" style="margin-top: 0px">
<#--<div class="container" align="center">-->
<#--<img src="/static/img/cut/upperPart.png">-->
<#--</div>-->
    <div class="row justify-content-center" style="margin-top: 260px;">
        <div class="col-md-8">
            <div class="card-group">
                <form class="card p-4" action="/dologin" method="post" style="background: rgba(0,0,0,0.5); border: none">
                    <div class="card-body">
                        <h1 style="color: rgba(255, 255, 255, 1)">Login</h1>
                        <p class="text-muted">Sign In to your account</p>
                        <i style="color: red" hidden="hidden" id="email-i">username can not be empty</i>
                    <#--<i style="color: red" hidden="hidden" id="email-formart">Email format is incorrect</i>-->
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text" style="background: black">
                                    <i class="icon-user"></i>
                                </span>
                            </div>
                            <input id="username" name="email_input" class="form-control" type="text"
                                   placeholder="username" style="background: black">
                        </div>
                        <i style="color: red" hidden="hidden" id="pwd-i">password can not be empty</i>
                        <div class="input-group mb-4">
                            <div class="input-group-prepend">
                    <span class="input-group-text" style="background: black">
                      <i class="icon-lock"></i>
                    </span>
                            </div>
                            <input id="pwd" name="pwd_input" class="form-control" type="password"
                                   placeholder="password" onkeyup="judgeEnter()" style="background: black">
                        </div>
                        <div class="row">
                            <div class="col-6">
                                <button id="login_but" class="btn btn-primary px-4" type="button"
                                        style="background-color: #27c096; border: none" onclick="dologin()">
                                    Login
                                </button>
                            </div>
                            <div class="col-6 text-right">
                                <button class="btn btn-link px-0" type="button" style="color: #27c096">Forgot
                                    password?
                                </button>
                            </div>
                        </div>
                    </div>
                </form>
                <div class="card text-white bg-primary py-5 d-md-down-none"
                     style="width:44%; background: rgba(39,192,150,0.6)!important; border: none">
                    <div class="card-body text-center">
                        <div style="color:black;">
                            <h2>Sign up</h2>
                            <p>We are not open for registration yet.</p>
                            <!-- <button class="btn btn-primary active mt-3" type="button">Register Now!</button> -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- CoreUI and necessary plugins-->

<script src="/static/node_modules/popper.js/dist/umd/popper.min.js"></script>
<script src="/static/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/static/node_modules/pace-progress/pace.min.js"></script>
<script src="/static/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"></script>
<script src="/static/node_modules/@coreui/coreui/dist/js/coreui.min.js"></script>
</body>
</html>
<script>
    //换行按钮 登录
    function judgeEnter() {

        if (event.keyCode == 13) {
            dologin();
        }
    }

    function dologin() {
        $("#email-i").attr("hidden", "hidden");
        $("#email-formart").attr("hidden", "hidden");
        $("#pwd-i").attr("hidden", "hidden");
        var flag = false;
        //验证email是否为空
        var username = $("#username").val();
        if (username == "") {
            $("#email-i").removeAttr("hidden");
            flag = true;
        }
        //验证密码是否为空
        var pwd = $("#pwd").val();
        if (pwd == "") {
            $("#pwd-i").removeAttr("hidden");
            flag = true;
        }
        if (flag) {
            return;
        }


        $("#login_but").attr("disabled", "true");
        $.ajax({
            url: "/dologin",
            type: "POST",
            data: {"username": username, "pwd": pwd},
            success: function (json) {
                if (json == "ok") {
                    window.location.href = "/customers/info"
                }else if(json == "group"){
                    window.location.href = "/dealership/info"
                } else {
                    alert("username or password error");
                    $("#login_but").attr("disabled", false);
                }
            }
        });
    }
</script>