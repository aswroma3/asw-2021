#!/bin/bash

# calcola il mio indirizzo IP (sulla rete 10.11.1.xx)
# Ubuntu 16.04 
# MY_IP_ADDR=$(ifconfig  | grep 'inet addr:'| grep -v '127.0.0.1' | cut -d: -f2 | awk '{ print $1}' | grep '10.11.1.')
# Ubuntu 18.04 
# MY_IP_ADDR=$(ifconfig  | grep 'inet' | grep -v 'inet6' | grep -v '127.0.0.1' | cut -d: -f2 | awk '{ print $2}' | grep '10.11.1.')
# ubuntu 20.04 
MY_IP_ADDR=$(ip address | grep 10.11.1. | awk '{ print $2 }' | cut -d/ -f1)

if [ -z "$DOCKER_HOST_IP" ] ; then
    echo "please do source set-docker-host-ip.sh"
    export DOCKER_HOST_IP=${MY_IP_ADDR}
fi

# Script per avviare Postgres e Kafka con Docker Compose

echo Starting infrastructure...

# docker-compose up -d zookeeper kafka
docker-compose up -d 
