#!/bin/bash

# inizializza il db delle connessioni 

# connessioni con autori 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Alice\", \"autore\": \"Azimut\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Alice\", \"autore\": \"Il Mancino\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Barbara\", \"autore\": \"Turandot\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Barbara\", \"autore\": \"Il Valletto\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Carlo\", \"autore\": \"Dendi\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessioniconautori" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Donatella\", \"autore\": \"Dendi\"}"
echo 

# connessioni con tipi  

curl -X POST "http://localhost:8080/connessioni/connessionicontipi" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Alice\", \"tipo\": \"Cambio\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessionicontipi" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Alice\", \"tipo\": \"Anagramma\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessionicontipi" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Barbara\", \"tipo\": \"Indovinello\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessionicontipi" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Carlo\", \"tipo\": \"Anagramma\"}"
echo 

curl -X POST "http://localhost:8080/connessioni/connessionicontipi" -H "accept: */*" -H "Content-Type: application/json" \
     -d "{ \"utente\": \"Enrico\", \"tipo\": \"Anagramma\"}"
echo 


