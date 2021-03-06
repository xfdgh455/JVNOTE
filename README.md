## 文档说明
**笔记跳转：**[博客](mokespace.cn)  
项目重新上传  
[demo]:学习过程的一些demo  
  
**项目**：  
**[SeckillShop]:** 高并发秒杀系统设计
>开发环境：jdk1.8、Intelli IDEA、tomcat9.0  
所用技术：  
&emsp;框架：springbooot、 mybatis
&emsp;其他：Druid、redis、RabbitMQ
  
**[personal-blog]:** 个人博客系统  
>开发环境：jdk1.8、Intelli IDEA、tomcat9.0  
所用技术：  
&emsp;框架：spring、springmvc、mybatis  
&emsp;其他：redis缓存数据库、solr搜索引擎技术、mysql数据库、jquery异步请求、Bootstrap前端框架  
实现功能：  
&emsp;用户注册与激活，激活方式通过邮件激活  
&emsp;用户的登录和退出  
&emsp;用户账号登录和注册时需要输入验证码验证  
&emsp;首页展示及分页，主要展示文章内容，可进行搜索，将搜索结果高亮显示  
&emsp;首页文章的点赞、踩和评论功能  
&emsp;个人主页模块，包括个人的基本信息，博客分类，发布博客，管理博客以及博客推荐等  
&emsp;书写文章功能 
&emsp;文章管理功能，包括文章的查看、修改和删除  
&emsp;个人信息修改功能  
&emsp;记录用户登录信息，包括登录的时间、IP 等  

**[Net-BooksCity]:** 网上书城  
>开发环境：jdk1.8、Intelli IDEA、tomcat9.0  
    所用知识：Javaweb
    实现功能：  
    **前台页面**：  
    &emsp;用户模块：注册、激活、登陆、退出  
    &emsp;分类模块：查看所有分类  
    &emsp;图书模块：查看所有图书、按分类查询、查询图书详细(bid查询)  
    &emsp;购物车模块：保存在session、添加购物车条目、清空所有条目、删除指定条目、我的购物车（按用户查询购物车）  
    &emsp;订单模块：生成订单、我的订单（按用户查询订单）、按id查询订单、确认收货、付款功能（只需要跳转到付款页面）、付款回调（是否成功）  
    **后台页面**：  
    &emsp;管理员：登陆  
    &emsp;分类管理：添加分类、查看所有分类、按id查询、删除分类、修改分类  
    &emsp;图书管理：查看所有图书、按id查询、删除图书、修改图书、添加图书（上传图片）  
    &emsp;订单模块：查询所有订单、按状态查询订单、发货  
