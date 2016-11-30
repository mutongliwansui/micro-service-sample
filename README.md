# micro-service-sample
micro-service-sample, based on spring boot

## including:
  1. mybatis and a plug-in for paging, named pageHelper
  2. multi database configuartions, primary db, slave db and read-only db
  3. a custom annotation used for dynamicaly chosing db from multi dbs
  4. using druid from alibaba as the datasource
  5. basically some demo filters and intercepters, definited by annotations
  6. a RequestLocaleResolver for internationality
  7. logging based on slf4j and logback, with customising the log format
  8. redis connection config and sample in unit test
  9. mongodb connection config and sample in unit test, with mongodb deployed on Replica Set way
  10. etcd, zookeeper
  11. this sample does not contains the jms and mq module, for i think the guildline of spring-boot is detailed enough, http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-messaging

## deploying and running
  1. requires mongodb envriment and redis, java 8, maven 3
  2. packaging: mvn package, this cmd will run all the unit test, if u donot want to run the unit test, just run mvn package -DskipTests, the in target/ dir, u will find a jar file, just move this jar to any host with java 8, run the application: java -jar xx.jar
  3. locally, u can also run the application by: mvn spring-boot:run
