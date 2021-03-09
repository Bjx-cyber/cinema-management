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
├── bin ‘---存放编译好的class文件’
├── db  ‘---数据库脚本’
│   └── tickets.sql
├── images ‘---电影海报和背景图片’
├── lib    ‘---jdbc jar包’
│   └── mysql-connector-java-8.0.20.jar     
├── src
   ├── com
   │   └── zwr     
   │       ├── dao    ‘---接口类’
   │       │   ├── CinemaDao.java
   │       │   ├── CommentDao.java
   │       │   ├── HallDao.java
   │       │   ├── MovieDao.java
   │       │   ├── SessionDao.java
   │       │   ├── TicketDao.java
   │       │   ├── UserDao.java
   │       │   └── impl  ‘---对应的实现类’
   │       │       ├── CinemaDaoImpl.java
   │       │       ├── CommentDaoImpl.java
   │       │       ├── HallDaoImpl.java
   │       │       ├── MovieDaoImpl.java
   │       │       ├── SessionDaoImpl.java
   │       │       ├── TicketDaoImpl.java
   │       │       ├── UserDaoImpl.java
   │       │       └── UtilDao.java
   │       ├── entity
   │       │   ├── Cinema.java
   │       │   ├── Comment.java
   │       │   ├── Hall.java
   │       │   ├── Movie.java
   │       │   ├── Session.java
   │       │   ├── Ticket.java
   │       │   └── User.java
   │       ├── main
   │       │   └── Main.java
   │       ├── service    ‘---接口类’
   │       │   ├── CinemaService.java
   │       │   ├── CommentService.java
   │       │   ├── HallService.java
   │       │   ├── MovieService.java
   │       │   ├── SessionService.java
   │       │   ├── TicketService.java
   │       │   ├── UserService.java
   │       │   └── impl   ‘---对应的实现类’
   │       │       ├── CinemaServiceImpl.java
   │       │       ├── CommentServiceImpl.java
   │       │       ├── HallServiceImpl.java
   │       │       ├── MovieServiceImpl.java
   │       │       ├── SessionServiceImpl.java
   │       │       ├── TicketServiceImpl.java
   │       │       └── UserServiceImpl.java
   │       ├── test
   │       │   ├── TestDao.java
   │       │   ├── TestService.java
   │       │   └── TestView.java
   │       └── view    ‘---所有界面编写代码’
   │           ├── AddMovie.java
   │           ├── AddSession.java
   │           ├── AdminUi.java
   │           ├── BuyTicketUi.java
   │           ├── CinemaManage.java
   │           ├── HallManage.java
   │           ├── LoginUi.class
   │           ├── LoginUi.java
   │           ├── MovieManage.java
   │           ├── MovieUi.java
   │           ├── RegisterUi.java
   │           ├── SessionManager.java
   │           ├── SessionUi.java
   │           ├── Test.java
   │           ├── TicketManager.java
   │           └── UserUi.java
   └── images
       ├── admin.png
       └── userbg.jpg

**开发者
[@ITBackkom]
