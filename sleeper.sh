#!/bin/bash
for run in {1..10}
do
echo $run
sleep 0.2
done
date +"%H:%M:%S"
ps -ef | wc -l
cat /etc/os-release | head -1
cat /etc/os-release | head -1 | grep -o Alpine
