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
        .dropdown-submenu {
            position: relative;
        }

        .dropdown-submenu .dropdown-menu {
            top: 0;
            left: 100%;
            margin-top: -1px;
        }

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

            <!--HEADER  -->
            <div class="row">
                <div class="col-md-5">
                    <h3><a href=# style="color:whitesmoke;text-decoration:underline">Link Sharing</a></h3>
                </div>
                <div class="col-md-3" id="pad">
                    <div class="input-group changethisone">
                                <span class="input-group-addon">
                                    <i class="glyphicon glyphicon-search"></i>
                                </span>
                        <input type="text" class="form-control" placeholder="Search" id="search"/>
                        <span class="input-group-addon">
                            <i class="glyphicon glyphicon-remove-sign"></i>
                        </span>
                    </div>
                </div>
                <div class="col-md-2">
                    <i class="glyphicon glyphicon-comment"
                       style="display:inline-block;padding-top: 16px;font-size: 20px;color:#FFF"></i>
                    <i class="glyphicon glyphicon-envelope"
                       style="display:inline-block;padding-top: 16px;font-size: 20px;color:#FFF;margin-left:2px;"></i>
                    <i class="glyphicon glyphicon-link"
                       style="display:inline-block;padding-top: 16px;font-size: 20px;color:#FFF;margin-left:2px;"></i>
                    <i class="glyphicon glyphicon-file"
                       style="display:inline-block;padding-top: 16px;font-size: 20px;color:#FFF;margin-left:2px;"></i>
                </div>

                <div class="col-md-2">

                    <div class="dropdown" style="display:inline-block;padding-top: 12px;font-size: 20px;">
                        <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown">
                            <span class="glyphicon glyphicon-user"></span>
                            Tutorials
                            <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="#">Profile</a></li>
                            <li><a tabindex="-1" href="#">Users</a></li>
                            <li><a tabindex="-1" href="#">Topics</a></li>
                            <li><a tabindex="-1" href="#">Posts</a></li>
                            <li><a tabindex="-1" href="/logoutToHome">Logout</a></li>
                        </ul>
                    </div>

                </div>
            </div>
            <!--END OF HEADER  -->

        </div>
    </div>
    <div class="row">


        <!--START OF COLUMN 1  -->
        <div class="col-md-7" style="padding:20px;">
            <!--START OF USER DETAILS BLOCK  -->


            <div class="row" style="padding:10px">

                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"
                     style="border:1px solid black; border-radius: 10px 10px 10px 10px">
                    <br/>
                    <div class="row">

                        <div class="col-md-2 col-lg-2">

                            <i class="glyphicon glyphicon-user"
                               style="display:inline-block;border:1px solid black;font-size:110px;">
                            </i>

                        </div>
                        <div class="col-md-10 col-lg-10">
                            <div class="row">
                                <div class="col-md-12">

                                </div>
                            </div>
                        </div>
                    </div>
                    <br/>
                </div>

            </div>


            <!--END OF USER DETAILS BLOCK  -->

            <div class="row" style="padding:10px">
                <div class="col-md-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-12">
                            <strong>Recent shares</strong>
                        </div>
                    </div>
                    <div class="row" style="padding:0; margin:14px 0px;">
                        <div class="col-md-2" style="padding:0; padding-left:0px">
                            <i class="glyphicon glyphicon-user"
                               style="display:inline-block;border:1px solid black;font-size:110px;">
                            </i>
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
        <!--END OF COLUMN 1  -->

        <!--START OF COLUMN 2  -->
        <div class="col-md-5 col-lg-5" style="padding:20px;">
            <div class="row" style="padding:10px">
                <div class="col-md-12 col-lg-12" style="border:1px solid black; border-radius: 10px 10px 0px 0px">
                    <div class="row"
                         style="background-color: lightgrey ;border-radius: 10px 10px 0px 0px;padding:4px;border-bottom:1px solid black">
                        <div class="col-md-12 col-lg-12">
                            <strong>Login</strong>
                        </div>
                    </div>
                    <div class="row">




                    </div>
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
                    <div class="row">





                    </div>
                </div>
            </div>
        </div>
        <!--END OF COLUMN 2  -->

    </div>
</div>
<script>
    $(document).ready(function () {
        $.ajax({
            url: "/dashboard/getUserDetails",
            type: 'GET',
            data: {"userName": "${sessionScope.get("userName")}"},
            quietMillis: 2000,
            success: function (res) {

            }
        });
    })
</script>
</body>
</html>

