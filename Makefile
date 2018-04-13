#!/usr/bin/env bash

default: run

status:
	ps -ef |grep tomcat

log:
	echo "============== Tail logs for Tomcat"
	tail -f ./tomcat/apache-tomcat-8.5.30/logs/catalina.out

start: stop
	echo "will start dev app"
	scripts/run.sh
	make log

stop:
	echo "will stop dev app"
	./tomcat/apache-tomcat-8.5.30/bin/catalina.sh stop


.PHONY: start, stop, status, log
