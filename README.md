# micro-service-sample
micro-service-sample, based on spring boot
including:
  1. mybatis and a plug-in for paging, named pageHelper
  2. multi database configuartions, primary db, slave db and read-only db
  3. a custom annotation used for dynamicaly chosing db from multi dbs
  4. basically some demo filters and intercepters, definited by annotations
  5. a RequestLocaleResolver for internationality
  6. logging based on slf4j and logback, with customising the log format
  7. redis connection config and sample in unit test
  8. mongodb connection config and sample in unit test, with mongodb deployed on Replica Set way
  9. etcd, zookeeper
  10. this sample does not contains the jms and mq module, for i think the guildline of spring-boot is detailed enough, http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-messaging
