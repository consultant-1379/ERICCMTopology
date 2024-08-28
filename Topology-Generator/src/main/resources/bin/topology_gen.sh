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
# Purpose       :  The purpose of this script to run Topology jar
# Jira No       :
# Gerrit Link   :
# Description   :  Created the script as a part of the netsim stub
# Date          :  05/01/2018
# Last Modified :  dheeraj.m@tcs.com
####################################################

CONFIGFILE=/netsim/netsim_cfg
CRON_CHECK="FALSE"
TOPOLOGY_PROPERTIES="/netsim/ERICCMTopology/Topology_Generator/config/topology.properties"
LOG4J_PROPERTIES="/netsim/ERICCMTopology/Topology_Generator/config/log4j.properties"
TOPOLOGY_JAR="/netsim/ERICCMTopology/Topology_Generator/lib/Topology-Generator-1.0-SNAPSHOT.jar"

. ${CONFIGFILE}

set_crontab()
{
crontab -l | egrep -v '^#|topology_gen'  > /tmp/new_crontab_topo
echo "5 0 * * * /bin/bash /netsim/ERICCMTopology/Topology_Generator/bin/topology_gen.sh -c >> /netsim/ERICCMTopology/Topology_Generator/log/topology_gen.log" >> /tmp/new_crontab_topo
crontab /tmp/new_crontab_topo
rm /tmp/new_crontab_topo
}

if [[ ! -f ${TOPOLOGY_PROPERTIES} ]]; then
        echo "ERROR:  ${TOPOLOGY_PROPERTIES}  File not Found.Exit From the process."
        exit 1;
fi
if [[ ! -f ${LOG4J_PROPERTIES} ]]; then
        echo "ERROR:  ${LOG4J_PROPERTIES}  File not Found.Exit From the process."
        exit 1;
fi


while getopts  ":c" flag
do
    case "$flag" in

    c) CRON_CHECK="TRUE";;
    *) printf "Usage: %s <optional -c>" $0
           exit 1;;
    esac
done

EMULATOR_ENABLE=`echo ${edeStatsCheck} | tr '[:lower:]' '[:upper:]'`
echo "Emulator Enable : $EMULATOR_ENABLE"
if [ "$EMULATOR_ENABLE" = "TRUE" ]
    then
       echo "Topology Generation Started for Emulator"
else
   echo "Topology Generator started for Simulator"

fi

java -DpropertyFile=${TOPOLOGY_PROPERTIES} -Dlog4j.configuration=${LOG4J_PROPERTIES} -jar ${TOPOLOGY_JAR} ${EMULATOR_ENABLE}
chmod -R 777 /ossrc

if [ ${CRON_CHECK} != "TRUE" ]; then
    set_crontab
	if [ -f /netsim/ERICCMTopology/.toplogyrolloutcheck ]; then
	  rm -f /netsim/ERICCMTopology/.toplogyrolloutcheck
	fi
fi
