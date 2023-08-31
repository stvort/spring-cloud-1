FROM consul:1.15.3

RUN mkdir /tmp/init

COPY init/* /tmp/init/
RUN chmod 755 /tmp/init/*
RUN dos2unix /tmp/init/*

CMD /tmp/init/start.sh