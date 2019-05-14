## 爬虫服务

### 目录结构

meituan:  集成了美团的业务接口 

xhs: 集成小红书提取sign字段的算法和 shield字段的接口

CrawlService ：将这些meituan，xhs 这种散列的工程，合并一个集合项目，便于项目管理方便

CrawlService：张为在Docker中启动，爬虫端通过网络服务来调用

### CrawlService

#### 1.小红书 爬虫服务：

>代码存于CrawlService工程的包 com.module.xhs中
>
>PyMain:
>
>XHSModule：

#### 2.美团外卖APP 爬虫服务

>代码存于CrawlService工程的包 com.module.meituan中
>
>

#### 3.淘宝APP 爬虫服务











