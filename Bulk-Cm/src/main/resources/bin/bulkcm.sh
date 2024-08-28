#!/bin/bash
################################################################################
# COPYRIGHT Ericsson 2018
#
# The copyright to the computer program(s) herein is the property of
# Ericsson Inc. The programs may be used and/or copied only with written
# permission from Ericsson Inc. or in accordance with the terms and
# conditions stipulated in the agreement/contract under which the
# program(s) have been supplied.
################################################################################

###################################################
# Version no    :  OSS
# Purpose       :  The purpose of this script to run Bulk Cm jar 
# Jira No       :  
# Gerrit Link   :
# Description   :  Created the script as a part of the netsim stub
# Date          :  05/01/2018
# Last Modified :  dheeraj.m@tcs.com
####################################################
java -Xmx1g -DpropertyFile=/netsim/ERICCMTopology/BULK_CM/config/bulkcm.properties -Dlog4j.configuration=/netsim/ERICCMTopology/BULK_CM/config/log4j.properties -jar /netsim/ERICCMTopology/BULK_CM/lib/Bulk-Cm-1.0-SNAPSHOT.jar
