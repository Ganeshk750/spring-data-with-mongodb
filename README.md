# Spring-data-with-mongodb
Spring Data With MongoDB
### Database Migration

#####1. Add Mongock library in pom.xml
````
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.github.cloudyrock.mongock</groupId>
            <artifactId>mongock-bom</artifactId>
            <version>4.1.19</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
````
##### 2. Add mongock-spring-v5 and mongodb-springdata-v3-driver
````
		<dependency>
			<groupId>com.github.cloudyrock.mongock</groupId>
			<artifactId>mongock-spring-v5</artifactId>
			<version>4.2.3.BETA</version>
		</dependency>

		<dependency>
			<groupId>com.github.cloudyrock.mongock</groupId>
			<artifactId>mongodb-springdata-v3-driver</artifactId>
			<version>4.2.3.BETA</version>
		</dependency>
````
###### 3. Adding @EnableMongock annotation to our Application class
````
@SpringBootApplication
@EnableMongock
public class SpringDataWithMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataWithMongodbApplication.class, args);
	}

}
````
###### 4. Adding Log File pkg name in propeties file
````
mongock.change-logs-scan-package=com.ganesh.api.config
````
###### 5. Create One DatabaseChangeLog Class
````
@ChangeLog
public class DatabaseChangeLog {
 //
}
````