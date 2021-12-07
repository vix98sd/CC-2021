FROM ubuntu:20.04
RUN apt-get update && apt-get install htop && apt-get -y install neofetch
COPY test.sh /usr/src
WORKDIR /usr/src
ENTRYPOINT [ "bash", "test.sh" ]