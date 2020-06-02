# 这篇帖子介绍
起初这个项目是想封装一些Flink开发中常用的UDF/UDTF/UDAF函数，但是在学习的过程中发现系统介绍Flink的相关资料不是很多。查阅各种文档和书籍后，决定把学习的过程记录下来。

所以这个项目中主要包含了Flink相关的以下内容：

	1. Flink简介
	2. Flink安装
	3. Flink快速入门
	4. Flink常用API以及代码实例
	5. Flink相关知识点介绍
	6. Flink实时数据分析平台 
	   前端：NodeJs+Vue+Webpack+Iview, 后端：SpringBoot+Jpa+MySql+Kafka+Flink>

## Flink简介

Apache Flink官方文档地址：https://ci.apache.org/projects/flink/flink-docs-release-1.9/zh/

Apache Flink源码地址：https://github.com/apache/flink

Flink是一个开源的流处理框架，具有分布式、高性能、高可用等特点。
Flink源码主要是由Java语言实现的，同时支持流处理和批处理。Flink的主要应用于流式数据分析场景，例如实时ETL、实时报表、监控预警、在线系统等场景。

## Flink安装
Flink的安装部署分为两种模式：单机模式和集群模式。集群模式又细分为Standalone、Flink on Yarn模式，其中Flink on Yarn模式需要依赖Hadoop集群。在学习了解Flink的时候，我选择的是单机模式。
安装环境：

## Flink快速入门
Flink-Hello World,

## Flink架构
Flink架构分为4层，Deploy层、Core层、Api层、Library层。

 1. Deploy层：主要涉及Flink的部署集群模式；
 2. Core层：是Flink计算的核心逻辑实现层；
 3. Api层：是对外接口层，提供了流处理Api和批处理Api。不说业务场景，但从使用上来说差不太多；
 4. Library层：应用框架层，在Api层之上构建的满足特定应用的计算框架，面向流处理的CEP(复杂事件处理)、基于SQL-like的操作；面向批处理支持的

FlinkML(机器学习库)、Gelly(图处理)、Table操作。

![Flink架构图](./images/flink-framework-pic.jpeg)

从架构图可以看出，Flink为我们提供了流处理和批处理两种任务入口。

## Flink常用API
Flink中提供了4种不同层次的Api，如图所示。每种API适用的业务changing不同，这4中API如下：

 1. 底层API：提供了对时间和状态的细粒度操作，主要应用于对一些复杂事件的逻辑处理；
 2. 核心API: 主要提供了流处理和批处理操作入口，可用于针对实时计算和离线数据分析场景；
 3. TableAPI: 可以通过DataStream或DataSet构件内存表，为灵活的处理两种业务逻辑提供可能；
 4. SQL: Flink的SQL是基于Apache Calcite实现了标准的SQL语法，使用起来比API更加灵活易用。结合Table使用SQL，让我们处理逻辑像写SQL一样方便，对拟与常用数据Flink提供了UDF入口，用java或Scala可以灵活的写出各种UDF。

### 流处理API
### 批处理API
### Table/Sql相关API

## Flink状态管理

## Flink窗口

## Flink时间

## Flink并行度
