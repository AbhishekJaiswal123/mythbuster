FROM quay.io/quintype/docker-base:openjdk8-alpine as build
MAINTAINER Quintype Devops <devops@quintype.com>

COPY mythbuster.tar /tmp/app.tar
RUN mkdir -p /app/public/abhishek && \
    tar xf /tmp/app.tar -C /app

FROM quay.io/quintype/docker-base:openjdk8-alpine

MAINTAINER Quintype Devops <devops@quintype.com> as final

COPY --from=build --chown=app:app /app /app

WORKDIR /app

CMD ["clojures", "core.clj"]

