#!/bin/bash

# trova tutti gli enigmi di un certo tipo  

# se un tipo contiene spazi deve essere racchiuso tra virgolette 
TIPO=$(echo $1 | sed -e "s/ /%20/g") 

echo "# tutti gli enigmi di tipo $1" 
echo $(curl -s localhost:8080/enigmi/cercaenigmi/tipo/$TIPO)
echo 
