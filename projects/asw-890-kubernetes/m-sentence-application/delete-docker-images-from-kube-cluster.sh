#!/bin/bash

# docker -H kube-1 image rm  aswroma3/sentence-sentence:2021-kube
# docker -H kube-1 image rm  aswroma3/sentence-sentence-async:2021-kube
# docker -H kube-1 image rm  aswroma3/sentence-word:2021-kube
# docker -H kube-1 image rm  aswroma3/sentence-apigateway:2021-kube

docker -H kube-2 image rm  aswroma3/sentence-sentence:2021-kube
docker -H kube-2 image rm  aswroma3/sentence-sentence-async:2021-kube
docker -H kube-2 image rm  aswroma3/sentence-word:2021-kube
docker -H kube-2 image rm  aswroma3/sentence-apigateway:2021-kube

docker -H kube-3 image rm  aswroma3/sentence-sentence:2021-kube
docker -H kube-3 image rm  aswroma3/sentence-sentence-async:2021-kube
docker -H kube-3 image rm  aswroma3/sentence-word:2021-kube
docker -H kube-3 image rm  aswroma3/sentence-apigateway:2021-kube

