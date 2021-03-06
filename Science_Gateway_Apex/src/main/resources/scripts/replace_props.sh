#!/bin/bash

##############################################
# Script to replace properties before build. #
##############################################

# Retrieving the values from env variables.
username=$LOGIN_USER
login_key_path=$LOGIN_PRIVATE_KEY_PATH
login_key_passphrase=$LOGIN_KEY_PASSPHRASE
mailto_email=$NOTIFICATION_EMAIL
aws_db_password=$AWS_DB_PASSWORD

# Replacing in karst properties.
sed -i 's~$user~'"$username"'~g' ../karst_config.properties
sed -i 's~$path~'"$login_key_path"'~g' ../karst_config.properties
sed -i 's~$passphrase~'"$login_key_passphrase"'~g' ../karst_config.properties

# Replacing in bigred2 properties.
sed -i 's~$user~'"$username"'~g' ../bigred2_config.properties
sed -i 's~$path~'"$login_key_path"'~g' ../bigred2_config.properties
sed -i 's~$passphrase~'"$login_key_passphrase"'~g' ../bigred2_config.properties

# Replacing in karst email properties.
sed -i 's~$email~'"$mailto_email"'~g' karst/sendmail.properties

# Replacing in bigred2 email properties.
sed -i 's~$email~'"$mailto_email"'~g' bigred2/sendmail.properties

# Replacing DB password properties.
sed -i 's~$awsdbpass~'"$aws_db_password"'~g' ../META-INF/persistence.xml

