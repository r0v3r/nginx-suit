FROM ubuntu

RUN apt-get update && apt-get -y install nginx vim curl

RUN rm /etc/nginx/nginx.conf

ADD nginx.conf /etc/nginx/

ADD suit-conf/*.conf /etc/nginx/suit-conf/

ADD app-dist/*.jar /nginx-suit/app.jar

WORKDIR /etc/nginx

CMD service nginx start

CMD java -jar /nginx-suit/app.jar