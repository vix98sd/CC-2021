#!/bin/bash

sudo chmod 777 /etc/environment
echo DB_USER="clouduser" &>> /etc/environment
echo DB_PASSWORD="cloudpassword" &>> /etc/environment