FROM ubuntu

RUN apt-get update && apt-get -y install nginx vim curl

RUN rm /etc/nginx/nginx.conf

ADD nginx.conf /etc/nginx/

ADD suit-conf/*.conf /etc/nginx/suit-conf/

WORKDIR /etc/nginx

CMD nginx -g 'daemon off;'