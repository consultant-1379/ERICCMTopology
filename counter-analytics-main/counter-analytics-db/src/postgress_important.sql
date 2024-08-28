/* To restart postgres*/
service postgresql restart
/* To execute a sql script*/
psql -p portnumber -d database -U user -f mysqlscrpt.sql 
/* To Know Postgress Sql Version */
select version();