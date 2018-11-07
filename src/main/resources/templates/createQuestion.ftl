<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta name="description" content="CoreUI - Open Source Bootstrap Admin Template">
    <meta name="author" content="Łukasz Holeczek">
    <meta name="keyword" content="Bootstrap,Admin,Template,Open,Source,jQuery,CSS,HTML,RWD,Dashboard">
    <title>Create Question</title>
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
<div class="app-body">
        <!-- Breadcrumb-->
        <div class="container-fluid">
            <div class="animated fadeIn">
                <div class="row">
                    <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <form class="form-horizontal" id="cipherdata" >
                                        <div class="form-group row">
                                            <label class="col-md-2 col-form-label">Title :</label>
                                            <div class="col-md-9 col-form-label">
                                                <input type="text" name="title" style="width: 100%;" placeholder="please input title" maxlength="200">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-2 col-form-label">name :</label>
                                            <div class="col-md-9 col-form-label">
                                                <input type="text" name="name" style="width: 100%;" placeholder="please input your name">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-2 col-form-label">plaintext :</label>
                                            <div class="col-md-9 col-form-label">
                                                <textarea style="width: 100%;height: 150px" id="text" name="text" placeholder="text"></textarea>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-2 col-form-label"></label>
                                            <div class="col-md-9 col-form-label">
                                                <input type="button" class="btn btn-primary" value="commit" onclick="doApi()" id="commit"/>

                                            </div>
                                        </div>

                                    </form>

                                </div>
                            </div>

                    </div>
                    <!-- /.col-->
                </div>
                <!-- /.row-->
            </div>
        </div>
</div>
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
function doApi() {
    $("#commit").attr("disabled", "true");
    $.ajax({
        url: "/doCreateQuestion",
        type: "POST",
        data: $("#cipherdata").serialize(),
        success: function (data) {
            if (data.data=="error"){
                alert("error");
                $("#commit").attr("disabled", false);
            } else {
                window.location.href="/listquestion";
            }
        }
    });
}

</script>