#!/bin/bash

# (2) crea l'immagine docker  
# prerequisito: (1) build del progetto Java

DOCKERHUB_USERNAME=aswroma3 
IMAGE_NAME=lucky-word

docker build --rm -tag ${DOCKERHUB_USERNAME}/${IMAGE_NAME} . 
