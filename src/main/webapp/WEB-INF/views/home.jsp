<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Link Hub - A link sharing portal</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        .changethisone span {
            background-color: #FFF;
            border-radius: 20px;
        }

        .changethisone input {
            border-right-style: none;
            border-left-style: none;
        }

        #pad {
            padding-top: 10px;
        }
    </style>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12" style="border-radius:10px;background-color:gray">
            <div class="row">
                <div class="col-md-3">
                    <h3><a href=# style="color:whitesmoke;text-decoration:underline">Link Sharing</a></h3>
                </div>
                <div class="col-md-6">
                </div>
                <div class="col-md-3" id="pad">
                    <div class="input-group changethisone">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-search"></i>
                                </span>
                        <input type="text" class="form-control" placeholder="Search"/>
                        <span class="input-group-addon">
                            <i class="glyphicon glyphicon-remove-sign"></i>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-7" style="padding:20px;">
            <div class="row" style="padding:10px">
                <div class="col-md-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-12">
                            <strong>Recent shares</strong>
                        </div>
                    </div>
                    <div class="row" style="padding:0; margin:14px 0px;">
                        <div class="col-md-2" style="padding:0; padding-left:10px">
                            <i class="glyphicon glyphicon-user"
                               style="display:inline-block;border:1px solid black;font-size:110px;"></i>
                        </div>
                        <div class="col-md-10">
                            <div class="row">
                                <div class="col-md-3">
                                    Uday Pratap Singh
                                </div>
                                <div class="col-md-7" style="color:gray;font-size:12px;padding: 2px;">
                                    @uday 5min
                                </div>
                                <div class="col-md-2">
                                    <a href="#">Grails</a>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
                                    incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                                    exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10 " style="font-size:16px;">
                                    <i class="fa fa-facebook-square" style="color:blue"></i>
                                    <i class="fa fa-twitter" style="color:#00aced"></i>
                                    <i class="fa fa-google-plus" style="color:red"></i>
                                </div>
                                <div class="col-md-2" style="text-decoration: underline">
                                    <a href="#">View Post</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row" style="padding:0; margin:4px 0px;">
                        <div class="col-md-2" style="padding:0; padding-left:10px">
                            <i class="glyphicon glyphicon-user"
                               style="display:inline-block;border:1px solid black;font-size:110px;"></i>
                        </div>
                        <div class="col-md-10">
                            <div class="row">
                                <div class="col-md-3">
                                    Uday Pratap Singh
                                </div>
                                <div class="col-md-7" style="color:gray;font-size:12px;padding: 2px;">
                                    @uday 5min
                                </div>
                                <div class="col-md-2">
                                    <a href="#">Grails</a>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
                                    incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                                    exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10" style="font-size:16px;">
                                    <i class="fa fa-facebook-square" style="color:blue"></i>
                                    <i class="fa fa-twitter" style="color:#00aced"></i>
                                    <i class="fa fa-google-plus" style="color:red"></i>
                                </div>
                                <div class="col-md-2" style="text-decoration: underline">
                                    <a href="#">View Post</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row" style="padding:10px">
                <div class="col-md-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-10">
                            <strong>Top Posts</strong>
                        </div>
                        <div class="col-md-2 col-lg-2" style="padding-bottom:0px;">
                            <select name="Sortby" class="form-control" required="required"
                                    style="border:1px solid black;color:black;padding:1px;">
                                <option value="Today">Today</option>
                                <option value="Week">Week</option>
                                <option value="Month">Month</option>
                                <option value="Year">Year</option>
                            </select>
                        </div>
                    </div>
                    <div class="row" style="padding:0; margin:14px 0px;">
                        <div class="col-md-2 col-lg-2" style="padding:0; padding-left:10px">
                            <i class="glyphicon glyphicon-user"
                               style="display:inline-block;border:1px solid black;font-size:110px;"></i>
                        </div>
                        <div class="col-md-10 col-lg-10">
                            <div class="row">
                                <div class="col-md-3 col-lg-3">
                                    Uday Pratap Singh
                                </div>
                                <div class="col-md-7 col-lg-7" style="color:gray;font-size:12px;padding: 2px;">
                                    @uday 21July2016
                                </div>
                                <div class="col-md-2 col-lg-2">
                                    <a href="#">Grails</a>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12 col-lg-12">
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
                                    incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                                    exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-10 col-lg-10" style="font-size:16px;">
                                    <i class="fa fa-facebook-square" style="color:blue"></i>
                                    <i class="fa fa-twitter" style="color:#00aced"></i>
                                    <i class="fa fa-google-plus" style="color:red"></i>
                                </div>
                                <div class="col-md-2 col-lg-2" style="text-decoration: underline">
                                    <a href="#">View Post</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-5 col-lg-5" style="padding:20px;">
            <div class="row" style="padding:10px">
                <div class="col-md-12 col-lg-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-12 col-lg-12">
                            <strong>Login</strong>
                        </div>
                    </div>
                    <form:form name="registerUser" method="post" role="form" data-toggle="validator"
                               action="/home/userLogin" modelAttribute="userLoginDto">
                        <div class="row">
                            <div class="col-md-12 col-lg-12" style="padding: 6px">
                                <div class="row" style="padding:2px">
                                    <div class="col-md-12">
                                        ${errorLogin}
                                    </div>
                                </div>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="txtUserName" id="txtUserName">Email/Username*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="text" style="width:100%" path="txtUserName"
                                                    required="required"/>
                                        <div id="txtUserNameError"></div>
                                    </div>
                                </div>

                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="txtPassword">Password*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="text" style="width:100%" path="txtPassword"
                                                    required="required"/>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-8 col-lg-8"
                                         style="text-align: center; text-decoration: underline">
                                        <a href="#">Forgot password</a>
                                    </div>
                                    <div class="col-md-4 col-lg-4">
                                        <input type="submit" value="Login"
                                               style="width:100%;border-radius: 7px; border:1px solid black"
                                               id="loginBtn">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form:form>
                </div>
            </div>
            <div class="row" style="padding:10px">
                <div class="col-md-12 col-lg-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-12 col-lg-12">
                            <strong>Register</strong>
                        </div>
                    </div>


                    <form:form action="/home/registerUser" id="userRegistrationForm" name="registerUser" method="post"
                               modelAttribute="userRegisterDto">
                        <div class="row">
                            <div class="col-md-12 col-lg-12" style="padding: 6px">
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="firstName">First Name*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="text" style="width:100%" name="firstName" path="firstName"
                                                    required="required"/>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="lastName">Last Name*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="text" style="width:100%" name="lastName" path="lastName"
                                                    required="required"/>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="userName" id="userName">Username*</form:label>

                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="text" style="width:100%" name="userName" path="userName"
                                                    required="required"/>
                                        <div id="userNameRegisterError"></div>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="mail">Email*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="email" style="width:100%" name="email" id="userMail"
                                                    path="mail" required="required"/>
                                        <div id="userEmailRegisterError"></div>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="userPassword">Password*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="password" style="width:100%" id="registrationPassword"
                                                    name="userPassword"
                                                    path="userPassword" required="required"/>
                                    </div>
                                </div>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-4 col-lg-4">
                                        <form:label path="cnfPassword">Confirm Password*</form:label>
                                    </div>
                                    <div class="col-md-8 col-lg-8">
                                        <form:input type="password" style="width:100%" name="cnfPassword"
                                                    path="cnfPassword" id="confirmPassword" required="required"/>
                                        <div id="confirmPasswordError"></div>
                                    </div>
                                </div>
                                <br>
                                    <%--<div class="row" style="padding:2px">--%>
                                    <%--<div class="col-md-4 col-lg-4">--%>
                                    <%--<form:label path="photo">Photo</form:label>--%>
                                    <%--</div>--%>
                                    <%--<div class="col-md-8 col-lg-8">--%>
                                    <%--<form:input type="file" style="width:100%" name="photo" path="photo"/>--%>
                                    <%--</div>--%>
                                    <%--</div>--%>
                                <br>
                                <div class="row" style="padding:2px">
                                    <div class="col-md-8 col-lg-8"
                                         style="text-align: center; text-decoration: underline">
                                    </div>
                                    <div class="col-md-4 col-lg-4">
                                        <input type="submit" value="Register"
                                               style="width:100%;border-radius: 7px; border:1px solid black"
                                               id="registerBtn">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form:form>


                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("#loginBtn").prop('disabled', true);
        $("#registerBtn").prop('disabled', true);
        //Event for unique login username
        $("input[id='txtUserName']").keyup(function () {
            $.ajax({
                url: "/home/checkLoginUserName",
                type: 'GET',
                data: {"userName": $("input[id='txtUserName']").val()},
                quietMillis: 2000,
                success: function (res) {
//                    data=res.toString();
                    if (res === "true") {
                        $("#txtUserNameError").css("color", "green").html("Proceed forward");
                        $("#loginBtn").prop('disabled', false);
                    } else {
                        $("#txtUserNameError").css("color", "red").html("Incorrect username/email");
                        $("#loginBtn").prop('disabled', true);
                    }
                    //alert(res);
                }
            });
        });

        var userCheck = 0;
        var mailCheck = 0;
        var confirmPasswordCheck=0;


        function validateRegisterationForm() {
            if (userCheck === 1 && mailCheck === 1 && confirmPasswordCheck===1) {
                if ((("input[id='userMail']") === "") || (("input[id='userName']") === ""))
                    $("#registerBtn").prop('disabled', true);
                else
                    $("#registerBtn").prop('disabled', false);
            }
            else
                $("#registerBtn").prop('disabled', true);
        }

        $("input[id='userName']").keyup(function () {
            if ($(this).val() === "")
                $("#userNameRegisterError").css("color", "red").html("Cannot be left blank");
            else {
                $.ajax({
                    url: "/home/checkRegisterUserName",
                    type: 'GET',
                    data: {"userName": $("input[id='userName']").val()},
                    quietMillis: 2000,
                    success: function (res) {
                        if (res === "false") {
                            $("#userNameRegisterError").css("color", "green").html("Proceed forward user name available");
                            userCheck = 1;
                        } else {
                            $("#userNameRegisterError").css("color", "red").html("Try something else user name not available");
                            userCheck = 0;
                        }
                        validateRegisterationForm();
                    }
                });
            }
        });

        $("input[id='userMail']").keyup(function () {
            $.ajax({
                url: "/home/checkRegisterUserMail",
                type: 'GET',
                data: {"userMail": $("#userMail").val()},
                quietMillis: 2000,
                success: function (res) {
                    if ($("input[id='userMail']").val() === "")
                        $("#userEmailRegisterError").css("color", "red").html("Cannot be left blank");
                    else {
                        if (res === "false") {
                            $("#userEmailRegisterError").css("color", "green").html("Proceed forward email available");
                            mailCheck = 1;
                        } else {
                            $("#userEmailRegisterError").css("color", "red").html("Try something else email not available");
                            mailCheck = 0;
                        }
                        validateRegisterationForm();
                    }
                }
            });
        });
        $("#confirmPassword").keyup(function () {
            if($(this).val()===$("#registrationPassword").val())
                confirmPasswordCheck=1;
            else
                confirmPasswordCheck=0;
            validateRegisterationForm();
        });
    });
</script>
</body>
</html>
