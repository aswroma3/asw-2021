#!/bin/bash

# trova tutti gli enigmi di un certo autore  

# se un autore contiene spazi deve essere racchiuso tra virgolette 
AUTORE=$(echo $1 | sed -e "s/ /%20/g") 

echo "# tutti gli enigmi dell'autore $1" 
echo $(curl -s localhost:8080/enigmi/cercaenigmi/autore/$AUTORE)
echo 
