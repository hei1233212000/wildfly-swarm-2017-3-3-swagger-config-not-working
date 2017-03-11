### Reproduce steps
1. mvn wildfly-swarm:run
2. check the log that you would see  

> 2017-03-11 14:11:34,991 INFO  [stdout] (main) [Swagger] Ignoring swarm package org.wildfly.swarm.generated  
> 2017-03-11 14:11:34,991 INFO  [stdout] (main) [Swagger] Ignoring swarm package org.wildfly.swarm.generated  
> 2017-03-11 14:11:34,991 INFO  [stdout] (main) [Swagger] Configuring Swagger with package another_package_in_higher_order  

where the package is wrong! It should be "bug.swaggernotworking.rest" which is defined in the META-INF/swarm.swagger.conf  
read: https://wildfly-swarm.gitbooks.io/wildfly-swarm-users-guide/content/v/2017.3.3/advanced/swagger.html
