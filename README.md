# datax-elasticsearch

datax的elacticsearch读写插件

# Quick Start

* 使用maven编译：
```
mvn -U clean package assembly:assembly -Dmaven.test.skip=true
```
* 将编译打包后的插件放到datax目录相应的位置


# Support Data Channels 

| 类型           | 数据源        | Reader(读) | Writer(写) |文档|
| ------------ | ---------- | :-------: | :-------: |:-------: |
|       无结构化数据存储       | Elasticsearch       |   √      |     √     |[读](https://github.com/Kestrong/datax-elasticsearch/blob/master/elasticsearchreader/doc/elasticsearchreader.md)、[写](https://github.com/Kestrong/datax-elasticsearch/blob/master/elasticsearchwriter/doc/elasticsearchwriter.md)|

# 参考文档

* [DataX官方文档](https://github.com/alibaba/DataX)
