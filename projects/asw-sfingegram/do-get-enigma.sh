#!/bin/bash

# trova un enigma 

ID=${1:-1} 

echo "# trova l'enigma $ID" 
echo $(curl -s localhost:8080/enigmi/enigmi/${ID})
echo 

echo "# trova la soluzione l'enigma $ID" 
echo $(curl -s localhost:8080/enigmi/enigmi/${ID}/soluzione)
echo 
