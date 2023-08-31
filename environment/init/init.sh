#!/bin/sh

echo "wait until port is available"

while ! nc -z localhost 8500; do   
  sleep 1
done

echo "executing consul kv command"

consul kv put config/quotes-web-app/app/pageTitle "Нихао"
consul kv put config/quotes-service/quotes/prefix "Один мудрец сказал: "