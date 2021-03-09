**电影院管理系统

**项目简介

一个基于java + mysql，包含基本功能的电影院管理系统

**功能特性
* 用户
  * 查找电影（支持模糊查询）
  * 查看电影详情
  * 购买影票，退订影票
  * 查找场次
* 管理员
  * 影院增删查改
  * 场次增删查改
  * 电影增删查改
  * 影票管理
* 购票优惠功能
* 电影评论功能

**环境依赖
java + mysql + Eclipse/Intellij IDEA

**部署步骤
* 克隆项目到本地，用Eclipse/IntelliJ IDEA打开
* 本地MySQL环境配置好，用Mysql Workbench或其他软件运行文件夹db下的数据库脚本，建立好数据库
* 进入项目，进入目录‘src/com/zwr/dao/impl/UtilDao’，修改代码第16行 （URL为自己建立好的数据库的URL）

**目录结构描述
├── bin
│   ├── META-INF
│   │   └── ticket.kotlin_module
│   ├── com
│   │   └── zwr
│   │       ├── dao
│   │       │   └── impl
│   │       ├── entity
│   │       ├── main
│   │       ├── service
│   │       │   └── impl
│   │       ├── test
│   │       └── view
│   └── images
│       ├── admin.png
│       └── userinfobg.jpg
├── db
│   └── tickets.sql
├── images
│   ├── HomeImg.jpg
│   ├── ayzc.jpg
│   ├── bg.jpg
│   ├── btn.png
│   ├── build.png
│   ├── ct.jpg
│   ├── dongwu.jpg
│   ├── fuchou.jpg
│   ├── haqs.jpg
│   ├── hxjy.jpg
│   ├── img.jpg
│   ├── jdz.jpg
│   ├── loginbg.jpg
│   ├── prxd.jpg
│   ├── rzdf.jpg
│   ├── ss2.jpg
│   ├── touhao.jpg
│   ├── ttnkh.jpg
│   ├── ttnkh1.jpg
│   ├── userinfobg.jpg
│   ├── wobu.jpg
│   ├── xbyz.jpg
│   ├── xglc.jpg
│   ├── xjcy.jpg
│   ├── xjzw.jpg
│   ├── zhanla.jpg
│   ├── zhuluo.jpg
│   └── zjcj.jpg
├── lib
│   └── mysql-connector-java-8.0.20.jar
├── src
│   ├── com
│   │   └── zwr
│   │       ├── dao
│   │       │   ├── CinemaDao.java
│   │       │   ├── CommentDao.java
│   │       │   ├── HallDao.java
│   │       │   ├── MovieDao.java
│   │       │   ├── SessionDao.java
│   │       │   ├── TicketDao.java
│   │       │   ├── UserDao.java
│   │       │   └── impl
│   │       │       ├── CinemaDaoImpl.java
│   │       │       ├── CommentDaoImpl.java
│   │       │       ├── HallDaoImpl.java
│   │       │       ├── MovieDaoImpl.java
│   │       │       ├── SessionDaoImpl.java
│   │       │       ├── TicketDaoImpl.java
│   │       │       ├── UserDaoImpl.java
│   │       │       └── UtilDao.java
│   │       ├── entity
│   │       │   ├── Cinema.java
│   │       │   ├── Comment.java
│   │       │   ├── Hall.java
│   │       │   ├── Movie.java
│   │       │   ├── Session.java
│   │       │   ├── Ticket.java
│   │       │   └── User.java
│   │       ├── main
│   │       │   └── Main.java
│   │       ├── service
│   │       │   ├── CinemaService.java
│   │       │   ├── CommentService.java
│   │       │   ├── HallService.java
│   │       │   ├── MovieService.java
│   │       │   ├── SessionService.java
│   │       │   ├── TicketService.java
│   │       │   ├── UserService.java
│   │       │   └── impl
│   │       │       ├── CinemaServiceImpl.java
│   │       │       ├── CommentServiceImpl.java
│   │       │       ├── HallServiceImpl.java
│   │       │       ├── MovieServiceImpl.java
│   │       │       ├── SessionServiceImpl.java
│   │       │       ├── TicketServiceImpl.java
│   │       │       └── UserServiceImpl.java
│   │       ├── test
│   │       │   ├── TestDao.java
│   │       │   ├── TestService.java
│   │       │   └── TestView.java
│   │       └── view
│   │           ├── AddMovie.java
│   │           ├── AddSession.java
│   │           ├── AdminUi.java
│   │           ├── BuyTicketUi.java
│   │           ├── CinemaManage.java
│   │           ├── HallManage.java
│   │           ├── LoginUi.class
│   │           ├── LoginUi.java
│   │           ├── MovieManage.java
│   │           ├── MovieUi.java
│   │           ├── RegisterUi.java
│   │           ├── SessionManager.java
│   │           ├── SessionUi.java
│   │           ├── Test.java
│   │           ├── TicketManager.java
│   │           └── UserUi.java
│   └── images
│       ├── admin.png
│       └── userinfobg.jpg
└── ticket.iml
**开发者
[@ITBackkom]
