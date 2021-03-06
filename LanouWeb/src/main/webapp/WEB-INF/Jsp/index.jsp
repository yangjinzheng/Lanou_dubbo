<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="viewport" content="user-scalable=no,width=device-width,initial-scale=1,maximum-scale=1">
    <title>蓝鸥E家</title>
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="css/selectFilter.css" />
    <style type="text/css">
        #pos-area{
            width: 100%;
            text-align: left;
            margin: 10px;
            border: solid 1px #009DDC;
            height: 100px;
        }
        #demo{
            padding: 8px;
            font-size: small;
            margin-bottom: 10px;
        }
        #dressBtn{width: 15%; height: 37px; float: left; margin-left: 5px;}
        .item {
            width: 100%;
            height: 37px;
            float: left;
            margin-bottom: 18px;
        }
    </style>
    <script src="js/bmob-min.js"></script>
    <script src="js/bmob.js"></script>
    <script src="js/bmobSocketIo.js"></script>
    <script src="js/bmobSocketIo-min.js"></script>
    <script src="js/jquery-1.10.2.js"></script>
    <script type="text/javascript" src="//3gimg.qq.com/lightmap/components/locationPicker2/js/main-62c2e3b971.js"></script>
    <script type="text/javascript" src="https://apis.map.qq.com/tools/geolocation/min?key=IGXBZ-YWMCP-TEUDY-VICJ6-LRMD5-DAB5L&referer=ReUser"></script>
    <script type="text/javascript">
        $(function () {
            Bmob.initialize("c9ae1039ac7da75fac0b1d49b3d60329", "3fc0687a643ab73f1502c92f502aa991");
            $("#order_Submit").click(function () {
                var name = $("#user_name").val();
                var phone = $("#phone").val();
                var address = $("#dress").val();
                var type = $("#type_select").val();
                if(name==""||phone==""||address==""){
                    alert("信息不完整！！");
                }
                else {
                    $.ajax({
                        type: "POST",
                        url: "submit",
                        data: {
                            "name": name,
                            "phone": phone,
                            "address": address,
                            "type": type,
                        },
                        success: function (data) {
                            window.location.href = "/success";
                        }
                    })
                }
            })
        })


    </script>
</head>
<body>
<div class="login_cont">
    <!--<div class="login_nav">
        <div class="nav_slider">
            <a href="#" class="signup focus">注册</a>
            <a href="#" class="signin">登录</a>
        </div>
    </div>-->
    <form>
        <div class="input_signup active">
            <input style="margin-bottom: 18px;" class="input" id="user_name" type="text" aria-label="姓名" placeholder="姓名">
            <!--<div class="hint">请填写姓名</div>-->
            <!--<input class="input" id="user_email" type="text" aria-label="邮箱" placeholder="邮箱">
            <div class="hint">请填写邮箱</div>-->
            <input style="margin-bottom: 18px;" class="input" id="phone" type="text" class="account" aria-label="手机号（仅支持中国大陆）" placeholder="手机号（仅支持中国大陆）">
            <!--<div class="hint">请填写手机号</div>-->
            <!--<input class="input" id="dress" onclick="getCurLocation()" type="text" aria-label="地址" placeholder="地址" />
            <div class="hint">请输入地址</div>-->
            <div>
                <input style="margin-bottom: 18px; width: 80%; float: left;" class="input" id="dress" type="text" placeholder="地址"/>
                <img id="dressBtn" src="images/addrss.png"></img>
            </div>

            <div class="item">
                <div class="filter-box">
                    <div class="filter-text">
                        <input style="margin-bottom: 0px;" class="filter-title" type="text" readonly placeholder="pleace select" />
                        <i class="icon icon-filter-arrow"></i>
                    </div>
                    <select name="filter" id="type_select">
                        <option value="metal" selected>金属</option>
                        <option value="plastic">塑料制品</option>
                        <option value="glass">玻璃制品</option>
                        <option value="domastic">废旧家电</option>
                        <option value="other">其他种类</option>
                    </select>
                </div>
            </div>

            <!--<div class="hint">请输入地址</div>-->
            <!--<input class="input" id="password" type="password" aria-label="密码" placeholder="密码（不少于 6 位）">
            <div class="hint">请填写符合格式的密码</div>
            <input class="input" id="repassword" type="password" aria-label="密码" placeholder="再次输入密码">
            <div class="hint">请再次输入密码</div>-->
            <input style="text-align: center;" type="button" class="button" id="order_Submit" name="button" value="提交" />
        </div>
    </form>
    <form>
        <div class="input_signin">
            <input class="input" id="login_user_name" type="text" aria-label="用户名" placeholder="用户名">
            <div class="hint">请输入用户名</div>
            <input class="input" id="login_password" type="password" aria-label="密码" placeholder="密码">
            <div class="hint">请输入密码</div>
            <input type="submit" id="button" class="button"  name="button" value="登录">
            <div class="forget">
                <a href="forget.html">忘记密码？</a>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="js/login.js"></script>
<!--<script type="text/javascript" src="js/form.js"></script>-->
<script type="text/javascript" src="js/config.js"></script>
<script type="text/javascript" src="js/login_ajax.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/selectFilter.js"></script>
<script type="text/javascript">
    //本小插件支持移动端哦

    //这里是初始化
    $('.filter-box').selectFilter({
        callBack : function (val){
            //返回选择的值
            console.log(val+'-是返回的值')
        }
    });
</script>
<script type="text/javascript">
    $(function () {

        $("#dressBtn").click(function () {
            var username = $("#user_name").val()+" "+$("#phone").val();
            var myurl = "http://58.87.89.177:8080/index?myuser="+username;
            window.location.href = "http://apis.map.qq.com/tools/locpicker?search=1&type=0&policy=1&backurl="+myurl+"&key=OB4BZ-D4W3U-B7VVO-4PJWW-6TKDJ-WPB77&referer=myapp";
        })

        $("#dress").val(decodeURIComponent(getQueryStr('city'))+decodeURIComponent(getQueryStr('name')));
        var attrstr = decodeURIComponent(getQueryStr('myuser'));
        var attrs = attrstr.split(" ");
        $("#user_name").val(attrs[0]);
        $("#phone").val(attrs[1]);
    })
</script>


</body>
</html>