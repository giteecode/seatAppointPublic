## 基于Java+pringboot+vue的图书馆座位预约系统068

## 一、系统介绍
本项目前后端分离

本系统分为管理员、教师、用户三种角色

用户角色包含以下功能：
- 登录、注册、座位预约和举报、交流论坛、公告信息、个人中心、密码修改
- 座位预约管理、签到管理、离开信息管理、暂离座位管理、举报管理、信用分管理、信用加分管理、信用减分管理

教师角色包含以下功能：
- 登录、学生管理、座位信息管理、座位预约管理、签到管理、离开信息管理、暂离座位管理
- 举报管理、信用分管理、信用加分管理、信用减分管理、交流论坛管理、个人中心、密码修改
- 
管理员角色包含以下功能：
- 登录、学生管理、教师管理、班级信息管理、座位信息管理、座位预约管理、签到管理、离开信息管理、暂离座位管理
- 举报管理、信用分管理、信用加分管理、信用减分管理、交流论坛管理
- 个人中心、密码修改、轮播图管理、公告信息管理

## 二、所用技术

后端技术栈：

- springboot
- mybatis-plus
- mysql

前端技术栈：

- vue
- elementui
- bootstrap
- html
- axios



## 三、环境介绍

基础环境 :IDEA/eclipse, JDK 1.8, Mysql5.7及以上,Node.js(14),Maven3.6

所有项目以及源代码本人均调试运行无问题 可支持远程调试运行

## 四、页面截图

![contents](./picture/picture1.png)
![contents](./picture/picture2.png)
![contents](./picture/picture3.png)
![contents](./picture/picture4.png)
![contents](./picture/picture5.png)
![contents](./picture/picture6.png)
![contents](./picture/picture7.png)
![contents](./picture/picture8.png)
![contents](./picture/picture9.png)
![contents](./picture/picture10.png)
![contents](./picture/picture11.png)
![contents](./picture/picture12.png)
![contents](./picture/picture13.png)
![contents](./picture/picture14.png)
![contents](./picture/picture15.png)
![contents](./picture/picture16.png)
![contents](./picture/picture17.png)
![contents](./picture/picture18.png)
![contents](./picture/picture19.png)
![contents](./picture/picture20.png)
![contents](./picture/picture21.png)
![contents](./picture/picture22.png)
![contents](./picture/picture23.png)
![contents](./picture/picture24.png)
![contents](./picture/picture25.png)
![contents](./picture/picture26.png)
![contents](./picture/picture27.png)
![contents](./picture/picture28.png)

## 五、浏览地址
前台访问地址：http://localhost:8080/springboot7ss9a/front/index.html
-用户账号/密码：学生1/123456

后台访问地址：http://localhost:8081/#/login
-教师账号/密码：教师3/123456
-管理员账号/密码：admin/admin

## 六、部署教程

1. 使用Navicat或者其它工具，在mysql中创建对应名称的数据库，并执行项目的sql文件；

2. 使用IDEA/Eclipse导入项目，若为maven项目请选择maven，等待依赖下载完成；

3. 进入src/main/resources修改application.yml 里面的数据库配置

4. 启动项目后端项目

5. vscode或idea打开vue项目，

6. 在编译器中打开terminal，执行npm install 依赖下载完成后执行 npm run serve,执行成功后会显示访问地址



