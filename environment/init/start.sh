#!/bin/sh

/tmp/init/init.sh &

consul agent -dev -client=0.0.0.0