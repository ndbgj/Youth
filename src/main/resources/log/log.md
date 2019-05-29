# 开发日志

### 20190523
+ 添加包 

```text
src/main/java
	com.youth
	com.youth.controller
	com.youth.dao
	com.youth.domain
	com.youth.service
src/test/java
	com.youth.test
```

+ 添加日志文件夹

```text
	src/main/resources/log
```

+ 添加类

```text
	com/youth/Application.java
```

+ application.propertis添加jdbc数据源（使用时记得修改数据库名）

+ pom文件中添加依赖

```text
	spring-boot-devtools
	<optional> 值为true时项目将防止devtools传递性地应用于其他模块

	spring-boot-maven-plugin
	#添加fork属性
```

+ application.properties

```text
	#添加那个目录的文件需要restart
	spring.devtools.restart.additional-paths=src/main/java

	#排除那个目录的文件不需要restart
	spring.devtools.restart.exclude=static/**,public/*
```
+ pom文件添加依赖

```text
	添加thymeleaf引擎模块 spring-boot-starter-thymeleaf
	加入Mybaitis-plus依赖 mybatis-plus
	mybatis-plus-generator(代码生成器）
```

+ src/main/java 添加类

```text
	com.youth.dao包新增Test类
			  .controller新增ControllerTest控制类
			  .domain新增TestMapper
			  .service新增TestService
```

+src/main/resources 创建文件/文件夹

```text
	在templates目录下创建thymeleaf文件夹
	thymeleaf下加入index.html
	#Html网页必须为	<!DOCTYPE html>开头
			并且引入模板<html xmlns:th="http://www.thymeleaf.org">

```

+ application.properties

```text
	#设置模板目录
	spring.thymeleaf.prefix=classpath:/templates/thymeleaf 
	#文件后缀
	spring.thymeleaf.suffix=.html
	#配置模板使用HTML5检查.html文件 ，HTML5太严格如开发中使用不太严格的HTML格式 将此替换为LEGACYHTML5
	spring.thymeleaf.mode=HTML5
	#设置编码格式
	spring.thymeleaf.encoding=UTF-8
	#文件格式
	spring.thymeleaf.servlet.content-type=text/html; charset=utf-8
	#缓存设置开发时为false（实时刷新页面）
	spring.thymeleaf.cache=false
```
