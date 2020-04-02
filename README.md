## 遇到的问题

1. 父类如何引用同版本的子类

    没解决

2. 子类不得不增加spring的主类，并且target jar 有28m ，怎么避免？

​     没解决

3. 前后端分离后，restful 应该怎么设计

4. 用graphql ？

    GraphQL的主要缺点是它使用单个端点，而不是遵循HTTP规范进行缓存。在网络级别进行缓存很重要，因为它可以减少到服务器的通信量或使通过CDN经常访问的数据保持在客户端附近。
    此外，它不是简单应用程序的最佳解决方案，因为它增加了类型，查询，解析器的复杂性，而使用REST可以使事情变得更加简单。
    
5. 连service的接口都放在facade类中，facade太膨胀了，有没有更好的做法。

    没有

6. 怎么避免提交数据库 地址和密码到github



Error日志



1. 初始 jdbc 测试

    使用 lombok @Data  和 jpa @Entity 注解， 因为entity 定义在另一个modules 中 ，所以需要在需要使用entity 的application 前加注释 @EntityScan(basePackageClasses= Cat.class)

```
UnsatisfiedDependencyException: Error creating bean with name 'catServiceImpl': Unsatisfied dependency expressed through field 'catDAO'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'catDAO': Invocation of init method failed; nested exception is java.lang.IllegalArgumentException: Not a managed type: class com.zzj.catkg.facade.entity.Cat
```

2. 子模块cat 找不到 另一个子模块的类  war 依赖 jar 打包方式的类，但是相似pom配置的另一个程序是可以的，唯一区别在<artifactId>spring-boot-starter-data-jpa</artifactId>

    ```
    程序包com.zzj.catkg.facade.entity不存在
    看了下maven 开始有警告信息
     'dependencies.dependency.version' for org.junit.jupiter:junit-jupiter:jar is either LATEST or RELEASE (both of them are being deprecated) @ com.zzj:catkg:0.0.1, Z:\0_My_Project\catkg\pom.xml, line 90, column 22
     
     mvn dependency:tree
     确认是存在的
     
     看到maven的文档说，是能自动拓扑排序，保证依赖项先编译的
     
     最后没找到问题的解决方法，改依赖结构， 和上级pom改组合模式
    ```

    TODO  facade 和 根目录的Pom 存在需要保证相同的依赖，不够优雅



## 记录

### 创建mysql环境

```
docker run --name catsql -p 3306:3306 --net host -e MYSQL_ROOT_PASSWORD=xxx -d mysql:8.0.11 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci
mysql -h xxxxx -u root -p
create database catkg_db character set 'UTF8';

use catkg_db;
show tables;
DESCRIBE table;
```

### 参考内容

1. spring data jpa 做测试可以在https://github.com/spring-projects/spring-data-examples 这里看到