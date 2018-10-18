
springboot集成mybatis
https://blog.csdn.net/a67474506/article/details/52013771
test


mvn clean package -Dmaven.test.skip=true
scp target/qinfo.jar gy@39.105.63.115:/usr/gy/javaapp


cd javaapp
rm -rf qinfo.jar
ps -ef | grep qinfo
kill -9 processid
nohup java -jar qinfo.jar > /dev/null 2>&1 &

访问：
http://gsmzzk.com:8080/info