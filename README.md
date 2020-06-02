# Flink-Easy-Function
通用的Flink自定义Function,UDF,UDAF,UDTF

## Flink简介
Flink是一个开源的流处理框架，具有分布式、高性能、高可用等特点。
Flink源码主要是由Java语言实现的，同时支持流处理和批处理。Flink的主要应用于流式数据分析场景，例如实时ETL、实时报表、监控预警、在线系统等场景。

## Flink安装
Flink的安装部署分为两种模式：单机模式和集群模式。集群模式又细分为Standalone、Flink on Yarn模式，其中Flink on Yarn模式需要依赖Hadoop集群。在学习了解Flink的时候，我选择的是单机模式。

## Flink快速入门

## Flink架构
Flink架构分为4层，Deploy层、Core层、Api层、Library层。
Deploy层：主要涉及Flink的部署集群模式；
Core层：是Flink计算的核心逻辑实现层；
Api层：是对外接口层，提供了流处理Api和批处理Api。不说业务场景，但从使用上来说差不太多；
Library层：应用框架层，在Api层之上构建的满足特定应用的计算框架，面向流处理的CEP(复杂事件处理)、基于SQL-like的操作；面向批处理支持的FlinkML(机器学习库)、Gelly(图处理)、Table操作。
![Flink架构图](./images/flink-framework-pic.jpeg)

### 架构介绍

## Flink常用API

## Flink状态管理

## Flink窗口

## Flink时间

## Flink并行度

