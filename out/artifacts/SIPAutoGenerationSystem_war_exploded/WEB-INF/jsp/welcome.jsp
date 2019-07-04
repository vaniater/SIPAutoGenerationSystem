<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>三峡云视频设备码智能生成系统</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="bower_components/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="bower_components/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="bower_components/Ionicons/css/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="bower_components/datatables.net-bs/css/dataTables.bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="index2.html" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini">三峡云</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg">视频设备码智能生成系统</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <!-- Messages: style can be found in dropdown.less-->
          <%--<li class="dropdown messages-menu">
            <!-- Menu toggle button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-envelope-o"></i>
              <span class="label label-success">4</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 4 messages</li>
              <li>
                <!-- inner menu: contains the messages -->
                <ul class="menu">
                  <li><!-- start message -->
                    <a href="#">
                      <div class="pull-left">
                        <!-- User Image -->
                        <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                      </div>
                      <!-- Message title and timestamp -->
                      <h4>
                        Support Team
                        <small><i class="fa fa-clock-o"></i> 5 mins</small>
                      </h4>
                      <!-- The message -->
                      <p>Why not buy a new awesome theme?</p>
                    </a>
                  </li>
                  <!-- end message -->
                </ul>
                <!-- /.menu -->
              </li>
              <li class="footer"><a href="#">See All Messages</a></li>
            </ul>
          </li>--%>
          <!-- /.messages-menu -->

          <!-- Notifications Menu -->
          <%--<li class="dropdown notifications-menu">
            <!-- Menu toggle button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-bell-o"></i>
              <span class="label label-warning">10</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 10 notifications</li>
              <li>
                <!-- Inner Menu: contains the notifications -->
                <ul class="menu">
                  <li><!-- start notification -->
                    <a href="#">
                      <i class="fa fa-users text-aqua"></i> 5 new members joined today
                    </a>
                  </li>
                  <!-- end notification -->
                </ul>
              </li>
              <li class="footer"><a href="#">View all</a></li>
            </ul>
          </li>--%>
          <!-- Tasks Menu -->
          <%--<li class="dropdown tasks-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-flag-o"></i>
              <span class="label label-danger">9</span>
            </a>
            <ul class="dropdown-menu">
              <li class="header">You have 9 tasks</li>
              <li>
                <!-- Inner menu: contains the tasks -->
                <ul class="menu">
                  <li><!-- Task item -->
                    <a href="#">
                      <!-- Task title and progress text -->
                      <h3>
                        Design some buttons
                        <small class="pull-right">20%</small>
                      </h3>
                      <!-- The progress bar -->
                      <div class="progress xs">
                        <!-- Change the css width attribute to simulate progress -->
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
                             aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
                          <span class="sr-only">20% Complete</span>
                        </div>
                      </div>
                    </a>
                  </li>
                  <!-- end task item -->
                </ul>
              </li>
              <li class="footer">
                <a href="#">View all tasks</a>
              </li>
            </ul>
          </li>--%>
          <!-- User Account Menu -->
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
              <img src="dist/img/avatar5.png" class="user-image" alt="User Image">
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
              <span class="hidden-xs">管理员</span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <img src="dist/img/avatar5.png" class="img-circle" alt="User Image">

                <p>
                  管理员 - Web Developer
                  <small>2018/12/5</small>
                </p>
              </li>
              <!-- Menu Body -->
              <li class="user-body">
                <div class="row">
                  <div class="col-xs-4 text-center">
                    <a href="#">Followers</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Sales</a>
                  </div>
                  <div class="col-xs-4 text-center">
                    <a href="#">Friends</a>
                  </div>
                </div>
                <!-- /.row -->
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-left">
                  <a href="#" class="btn btn-default btn-flat">Profile</a>
                </div>
                <div class="pull-right">
                  <a href="#" class="btn btn-default btn-flat">Sign out</a>
                </div>
              </li>
            </ul>
          </li>
          <!-- Control Sidebar Toggle Button -->
          <%--<li>
            <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
          </li>--%>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/avatar5.png" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>管理员</p>
        </div>
      </div>


      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">导航</li>
        <li class="active"><a href="login"><i class="fa fa-table"></i> <span>查看</span></a></li>
        <li><a href="input-device"><i class="fa fa-edit"></i> <span>添加</span></a></li>
        <li><%--<li class="treeview">--%>
          <a href="manage-device"><i class="fa fa-laptop"></i> <span>管理</span>
            <%--<span class="pull-right-container">
                <i class="fa fa-angle-left pull-right"></i>
              </span>--%>
          </a>
          <%--<ul class="treeview-menu">
            <li><a href="#">Link in level 2</a></li>
            <li><a href="#">Link in level 2</a></li>
          </ul>--%>
        </li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        SIP ID编码表
        <small>详细信息</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li class="active">这里</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">

      <!--------------------------
        | Your Page Content Here |
        -------------------------->

        <div class="row">
            <div class="col-xs-12">
                <div class="box">
                    <div class="box-header">
                        <h3 class="box-title">SIP ID</h3>
                    </div>
                    <!-- /.box-header -->
                    <div class="box-body">
                        <table id="sip-id-table" class="table table-bordered table-hover">
                            <thead>
                            <tr>
                                <th>序号</th>
                                <th>设备名称</th>
                                <th>设备IP</th>
                                <th>设备地址</th>
                                <th>行政编号</th>
                                <th>区级编号</th>
                                <th>行业编号</th>
                                <th>重点类型</th>
                                <th>设备类型</th>
                                <th>接入单位</th>
                                <th>网络标识</th>
                                <th>设备序号</th>
                                <th>SIP ID编码</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>三峡电力学院</td>
                                <td>11.88.36.252</td>
                                <td>三峡电力学院</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>374</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054137421180001001</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>市科技馆</td>
                                <td>11.88.1.174</td>
                                <td>市科技馆</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>372</td>
                                <td>2</td>
                                <td>118</td>
                                <td>019</td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054137221180019001</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>工人文化宫</td>
                                <td>11.88.1.190</td>
                                <td>工人文化宫</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>372</td>
                                <td>2</td>
                                <td>118</td>
                                <td>070</td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054137221180070001
                                </td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>体育学校</td>
                                <td>11.88.18.174
                                </td>
                                <td>体育学校</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>342</td>
                                <td>2</td>
                                <td>118</td>
                                <td>002
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054134221180002001
                                </td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>市民宗局</td>
                                <td>11.88.1.184</td>
                                <td>市民宗局</td>
                                <td>4205</td>
                                <td>40</td>
                                <td>633</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054063321180001001
                                </td>
                            </tr>
                            <tr>
                                <td>6</td>
                                <td>宜昌市七中</td>
                                <td>10.21.11.59</td>
                                <td>宜昌市七中</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>371</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>1</td>
                                <td>001</td>
                                <td>42054137121181001001
                                </td>
                            </tr>
                            <tr>
                                <td>7</td>
                                <td>市民宗局</td>
                                <td>11.88.1.184</td>
                                <td>市民宗局</td>
                                <td>4205</td>
                                <td>40</td>
                                <td>633</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054063321180001001
                                </td>
                            </tr>
                            <tr>
                                <td>8</td>
                                <td>世家幼儿园</td>
                                <td>11.88.55.105</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>371</td>
                                <td>2</td>
                                <td>118</td>
                                <td>008
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054137121180008001
                                </td>
                            </tr>
                            <tr>
                                <td>9</td>
                                <td>金东山建材家居</td>
                                <td>11.88.1.186</td>
                                <td>宜昌市金东山建材家居</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>232</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054123221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>10</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>11</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>12</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>13</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>14</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>15</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>16</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>17</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>18</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>19</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            <tr>
                                <td>20</td>
                                <td>长江瑞景</td>
                                <td>11.88.19.85</td>
                                <td>世家幼儿园</td>
                                <td>4205</td>
                                <td>41</td>
                                <td>272</td>
                                <td>2</td>
                                <td>118</td>
                                <td>001
                                </td>
                                <td>0</td>
                                <td>001</td>
                                <td>42054127221180001001
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <!-- /.box-body -->
                </div>
                <!-- /.box -->
            </div>
            <!-- /.col -->
        </div>
        <!-- /.row -->

    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- To the right -->
    <div class="pull-right hidden-xs">

    </div>
    <!-- Default to the left -->
    <strong>Copyright &copy; 2007-2018 <a href="#">湖北三峡云计算中心有限责任公司</a>.</strong> All rights reserved.
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Create the tabs -->
    <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
      <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
      <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
    </ul>
    <!-- Tab panes -->
    <div class="tab-content">
      <!-- Home tab content -->
      <div class="tab-pane active" id="control-sidebar-home-tab">
        <h3 class="control-sidebar-heading">Recent Activity</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <i class="menu-icon fa fa-birthday-cake bg-red"></i>

              <div class="menu-info">
                <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>

                <p>Will be 23 on April 24th</p>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

        <h3 class="control-sidebar-heading">Tasks Progress</h3>
        <ul class="control-sidebar-menu">
          <li>
            <a href="javascript:;">
              <h4 class="control-sidebar-subheading">
                Custom Template Design
                <span class="pull-right-container">
                    <span class="label label-danger pull-right">70%</span>
                  </span>
              </h4>

              <div class="progress progress-xxs">
                <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
              </div>
            </a>
          </li>
        </ul>
        <!-- /.control-sidebar-menu -->

      </div>
      <!-- /.tab-pane -->
      <!-- Stats tab content -->
      <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
      <!-- /.tab-pane -->
      <!-- Settings tab content -->
      <div class="tab-pane" id="control-sidebar-settings-tab">
        <form method="post">
          <h3 class="control-sidebar-heading">General Settings</h3>

          <div class="form-group">
            <label class="control-sidebar-subheading">
              Report panel usage
              <input type="checkbox" class="pull-right" checked>
            </label>

            <p>
              Some information about this general settings option
            </p>
          </div>
          <!-- /.form-group -->
        </form>
      </div>
      <!-- /.tab-pane -->
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
  immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 3 -->
<script src="bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- DataTables -->
<script src="bower_components/datatables.net/js/jquery.dataTables.min.js"></script>
<script src="bower_components/datatables.net-bs/js/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="bower_components/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="bower_components/fastclick/lib/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
<script>
    $(function () {
        $('#sip-id-table').DataTable({
            'paging'      : true,
            'lengthChange': false,
            'searching'   : true,
            'ordering'    : false,
            'info'        : true,
            'autoWidth'   : false
        })
    })
</script>
</body>
</html>