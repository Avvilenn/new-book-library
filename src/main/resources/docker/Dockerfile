FROM pluribuslabs/centos7-oracle-jdk-8
RUN yum install -y openssh-clients; \
 yum upgrade -y; \
 yum clean all
VOLUME ["/tmp" "/var/log"]
ADD online-book-library.jar online-book-library.jar
LABEL version="1.0.0-SNAPSHOT"
ENTRYPOINT ["java","-Xmx100m","-jar","/online-book-library.jar"]
