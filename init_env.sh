#!/bin/bash
set -a
source .env
set +a

export FLYWAY_URL=$DB_URL
export FLYWAY_USER=$DB_USER
export FLYWAY_PASSWORD=$DB_PASSWORD