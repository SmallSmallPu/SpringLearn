# 工程简介
#####001、如何创建一个Springboot框架Web项目
#####002、使用springboot框架集成springMVC
#####003、使用springboot框架的核心配置文件application.properties
#####004、使用springboot框架的核心配置文件application.yml或者application.yaml
#####006、多环境下核心配置文件的使用（yml,yaml）
#####007、springboot在核心配置文件application.properties自定义配置，以及获取自定义的值
#####008、springboot在核心配置文件将自定义配置映射到一个对象
#####009、springboot框架集成jsp
#####010、springboot框架集成mybatis
        a、添加mybatis依赖，Mysql驱动,mybatis-generator依赖以及插件
        b、使用Mybatis提供的逆向工程生产实体bean,映射文件、DAO接口
        c、在maven控制台中找到mybatis-generator插件，双击执行
#####012_015、Springboot集成Mybatis框架，最主要的两个注解，@Mapper以及@MapperScan，最常用的是015框架
        a、关于Mapper映射文件存放的位置的写法有以下两种。
            1、将Mapper接口以及Mapper映射文件放到src/main/java同一目录下，
               还需要在pom文件中手动指定资源文件夹路径resources
            2、将Mapper接口和Mapper映射文件分开存放
                Mapper接口放在src/main/java下
                Mapper映射文件放在resoures/mapper目录下
                在application核心配置文件中指定mapper映射文件存放到位置
#####016、springboot项目下使用事务
        事务是一个完整的功能，也叫做是一个完整的业务
        事务只跟什么SQL语句有关系？事务只跟DML语句有关系：增删改
#####017、springMVC中的常用注解
#####018、springboot中使用RESTful风格
#####019、springboot集成redis
        a、添加操作redis数据类型的依赖
        b、在springboot核心配置文件中添加Redis的配置


# 延伸阅读

