<#-- 传一个 stepBarStatus 过来 0代表blue(当前步骤) 1代表green(完成) 2代表grey(未执行)
     一共6步, 传6个数字   例:102222
-->
<link href="/css/step-bar.css" rel="stylesheet">
<div class="card" style="border: none">
    <div class="card-body">
        <div class="row">
            <ul class="nav" style="margin:auto">
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(0,1)=="0">blue-arrow</#if><#if stepBarStatus?substring(0,1)=="1">green-arrow</#if><#if stepBarStatus?substring(0,1)=="2">grey-arrow</#if>  step-bar">
                        <i class="font-2xl cui-magnifying-glass"></i>
                        <span class="step-bar-font">Data<br>Selection</span>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(1,2)=="0">blue-arrow</#if><#if stepBarStatus?substring(1,2)=="1">green-arrow</#if><#if stepBarStatus?substring(1,2)=="2">grey-arrow</#if> step-bar">
                        <i class="font-2xl cui-task"></i>
                        <span class="step-bar-font">Order<br>Confirmation</span>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(2,3)=="0">blue-arrow</#if><#if stepBarStatus?substring(2,3)=="1">green-arrow</#if><#if stepBarStatus?substring(2,3)=="2">grey-arrow</#if> step-bar">
                        <i class="font-2xl icon-note"></i>
                        <span class="step-bar-font">Contract<br>Initialization</span>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(3,4)=="0">blue-arrow</#if><#if stepBarStatus?substring(3,4)=="1">green-arrow</#if><#if stepBarStatus?substring(3,4)=="2">grey-arrow</#if> step-bar">
                        <i class="font-2xl icon-wallet"></i>
                        <span class="step-bar-font">Payment<br>Authorization</span>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(4,5)=="0">blue-arrow</#if><#if stepBarStatus?substring(4,5)=="1">green-arrow</#if><#if stepBarStatus?substring(4,5)=="2">grey-arrow</#if> step-bar">
                        <i class="font-2xl icon-user-following"></i>
                        <span class="step-bar-font">User<br>Agreement</span>
                    </div>
                </li>
                <li class="nav-item">
                    <div class="<#if stepBarStatus?substring(5,6)=="0">blue-arrow</#if><#if stepBarStatus?substring(5,6)=="1">green-arrow</#if><#if stepBarStatus?substring(5,6)=="2">grey-arrow</#if> step-bar">
                        <i class="font-2xl cui-arrow-bottom"></i>
                        <span class="step-bar-font">Data<br>Download</span>
                    </div>
                </li>
            </ul>
        </div>
        <!-- /.row-->
    </div>
</div>