############### Please Read this before Executing Topology and Bulk-CM Generator #######


Prerequisite - Genstats rollout was completed successfully on this server 

1.Unzip the ERICCMTopology.zip at any location on OSS SImulator server :

	unzip ERICCMTopology.zip

2. Move ERICCMTopology directory into netsim directory :

	mv ERICCMTopology /netsim
	
3. Change the permission of netsim directory :

	chmod -R 777 /netsim
	
4. 
   4.1 To Generate Topology Execute the topology_gen.sh script (Note : user_input.xml at location /netsim/etc should contain required simulations to generate topology ) :

			bash /netsim/ERICCMTopology/Topology_Generator/bin/topology_gen.sh 
			
	4.2 check the output topology generation at : 
	
		/eniq/data/pmdata/eniq_oss_1/lte/topologyData/ERBS        (Note: oss id and Network/Node type is based on simulations added in user_input.xml)
	
	4.3 Check the Topology Generation log at : /netsim/ERICCMTopology/Topology_Generator/log
	
5. 
   5.1 To Generate Bulk CM Execute the bulkcm.sh script (Note : user_input.xml at location /netsim/etc should contain required simulations to generate bulk cm ):

			bash /netsim/ERICCMTopology/BULK_CM/bin/bulkcm.sh 
			
	5.2 check the output bulk cm generation at : 
	
		/eniq/data/pmdata/eniq_oss_1/bulkcm/
	
	5.3 Check the Bulk CM Generation log at :
	 
		/netsim/ERICCMTopology/BULK_CM/log 
	