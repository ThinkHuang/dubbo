# dubbo
1. 首先下载zookeeper的release版本
2. 修改../conf/下的zoo_sample.cfg中的dataDir目录指向一个已经存在的目录
3. 修改zoo_sample.cfg文件为zoo.cfg
4. 返回到../bin/下启动zkServer服务
5. 在eclipse中创建一个maven项目，取名为dubbo
6. 为dubbo创建子模块dubbo-a,dubbo-b和dubbo-api
7. 将dubbo-api单独打成jar包，然后添加到dubbo-a和dubbo-b的依赖中。注意也需要将dubbo-api-xxx.jar放入到maven repository中的对应的路径中
8. 按照网上配置，配置dubbo-server.xml和dubbo-client.xml将consumer和provider分别注册到zookeeper中
9. 先启动dubbo-b服务，然后启动dubbo-a服务，可以看到服务正常启动

遇到的问题？
1. consumer没有被注入到spring容器中，这时候是由于dubbo-client.xml中未将service注入到spring容器中，需要检查路径是否匹配。provider也是同理。
2. no provider for service...?这是由于服务端未能正确注入到zookeeper中。
