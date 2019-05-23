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

+application.propertis添加jdbc数据源（使用时记得修改数据库名）

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

	