# Spring Security 演示

## 项目简介

- 本项目采用 [SpringBoot](http://projects.spring.io/spring-boot/) 当前最新的1.5.2.RELEASE 做基础架构支撑, 参考本项目建议有一定的 [SpringBoot](http://projects.spring.io/spring-boot/) 基础及经验.
- 教程主要面向中文用户, 如果你英文良好, 建议直接阅读官网帮助文档.
  - 官网地址：[http://projects.spring.io/spring-security/](http://projects.spring.io/spring-security/)
  - 官方文档地址：[http://docs.spring.io/spring-security/site/docs/current/reference/html/](http://docs.spring.io/spring-security/site/docs/current/reference/html/)
- 项目中Bean全部采用 [lombok](https://projectlombok.org/) 进行精简, 需要配合IDE插件使用, 在此项目不进行讨论, 如需了解更多, 参考以下链接：
  - 官方文档地址：[https://projectlombok.org/features/index.html](https://projectlombok.org/features/index.html)
  - 官方下载地址：[https://projectlombok.org/download.html](https://projectlombok.org/download.html)
  - lombok-intellij-plugin：[https://github.com/mplushnikov/lombok-intellij-plugin](https://github.com/mplushnikov/lombok-intellij-plugin)
- 教程目前在不定时进行调整和补充, 需要关注更新的请Watch、Star、Fork.
- 本项目参考到的文章：
  - <http://www.cnblogs.com/softidea/p/5991897.html>
- 地址：[https://github.com/Keveon/spring-security-demo](https://github.com/Keveon/spring-security-demo)

## 框架简介
> [Spring Security](http://projects.spring.io/spring-security/) 是Spring社区的一个顶级项目, 也是 [SpringBoot](http://projects.spring.io/spring-boot/) 官方推荐使用的Security框架. 除了常规的 `Authentication` 和 `Authorization` 之外，Spring Security还提供了诸如 `ACLs`, `LDAP`, `JAAS`, `CAS` 等高级特性以满足复杂场景下的安全需求. 虽然功能强大, Spring Security的配置并不算复杂(得益于官方详尽的文档), 尤其在3.2版本加入 `Java Configuration` 的支持之后, 可以彻底告别令不少初学者望而却步的 `XML Configuration`. 在使用层面, Spring Security提供了多种方式进行业务集成, 包括注解, `Servlet API`, `JSP Tag`, `系统API` 等.

## 准备工作

在开始提到, 本项目采用SpringBoot做基础架构支撑, 项目中使用`spring-security`的推荐方法是使用依赖关系管理系统,也就是我们平时所说的包管理器、构建工具. 下面两种工具对应的代码段可以复制并粘贴到您的项目中.
如需帮助, 请参阅我们使用 [Maven](https://spring.io/guides/gs/maven/) 和 [Gradle](https://spring.io/guides/gs/gradle/) 构建的入门指南.

###### Maven

``` Maven
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
</dependencies>
```

###### Gradle

``` Gradle
dependencies {
    compile 'org.springframework.boot:spring-boot-starter-security'
}
```

## 模块介绍
- [basic](basic): 只有最基本的入门.
- [advanced-use-sql](advanced-use-sql): 自定义表结构, 采用sql语句授权.
- [advanced-use-service](advanced-use-service): 自定义表结构的基础上, 采用实现 `Spring Security` 提供的 `UserDetailsService` 及 `PermissionEvaluator` 两个接口的方式, 配置更灵活, 更易于扩展. 

## 附录A：Github 常用按钮说明

- Watch：关注该项目, 作者有更新的时候, 会在你的 Github 主页有通知消息.
- Star：收藏该项目, 在你的头像上有一个 "Your stars" 链接, 可以看到你的收藏列表, 以方便下次进来.
- Fork：复制一份项目到自己的 Github 空间上, 你可以自己开发自己的这个地址项目, 然后 Pull Request 给项目原主人.

## 联系方式

- Github: <https://github.com/Keveon>
- OscGit: <https://git.oschina.net/keveon>
- Email：<Keveon@Keveon.com>
- QQ：   <a target="_blank" href="http://sighttp.qq.com/authd?IDKEY=545fca7ee732f622e810ce019d5a38bf6454649d43075ddf">
            <img border="0" src="http://wpa.qq.com/imgd?IDKEY=545fca7ee732f622e810ce019d5a38bf6454649d43075ddf&pic=51" alt="点击这里给我发消息" title="点击这里给我发消息"/>
         </a>
- QQ群：<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=4815a95af723fdbdf03a6f231cfca537bbbf0bec5d892d27657a8ed408466aff">
            <img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="一步一步学好java" title="一步一步学好java">
        </a>

## 结束语

- 真心感谢这些志同道合的人, 这个真的很重要, 也希望你能一起参与！
- 同时感谢那些通过私聊或其他方式指出一些错误地方的朋友, 使得该教程能得以更加完善, 真心感谢！
