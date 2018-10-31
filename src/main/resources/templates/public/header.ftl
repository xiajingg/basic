<header class="app-header navbar">
    <button class="navbar-toggler sidebar-toggler d-lg-none mr-auto" type="button" data-toggle="sidebar-show">
        <span class="navbar-toggler-icon"></span>
    </button>
    <a class="navbar-brand" href="/query">
        <img class="navbar-brand-full" src="/static/img/brand/logo.svg" width="89" height="25" alt="CarBlock">
        <img class="navbar-brand-minimized" src="/static/img/brand/sygnet.svg" width="30" height="30" alt="CoreUI Logo">
    </a>
    <ul class="nav navbar-nav ml-auto">
        <li class="nav-item dropdown">
        <#if Session?? && Session["email"]?exists>
            欢迎：[${Session["email"]}]
        </#if>
            <#--<a class="nav-link" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">-->
                <#--<img class="img-avatar" src="/img/brand.logo.svg" alt="admin@bootstrapmaster.com">-->
            <#--</a>-->
            <#--<div class="dropdown-menu dropdown-menu-right">-->
                <#--<a class="dropdown-item" href="#">-->
                    <#--<i class="fa fa-lock"></i> Logout</a>-->
            <#--</div>-->
        </li>
    </ul>
    <#--<button class="navbar-toggler aside-menu-toggler d-md-down-none" type="button" data-toggle="aside-menu-lg-show">-->
        <#--<span class="navbar-toggler-icon"></span>-->
    <#--</button>-->
    <#--<button class="navbar-toggler aside-menu-toggler d-lg-none" type="button" data-toggle="aside-menu-show">-->
        <#--<span class="navbar-toggler-icon"></span>-->
    <#--</button>-->
</header>
