# CloudConfig
###spring-cloud-config 提供一个有服务端和客户端分布式中心化配置。
###    为所有应用环境集中管理额外的属性文件。
###    默认实现使用git管理


$ cd $HOME
$ mkdir config-repo
$ cd config-repo
$ git init .
$ echo info.foo: bar > application.properties
$ git add -A .
$ git commit -m "Add application.properties"