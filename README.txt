Script til oprettelse af database ligger i SQL mappen under resources og hedder
'script.sql'

For at få indsat data i tabellerne skal både 'samsokv_kandidat.sql' og 'samsokv_parti.sql'

JUnit tests ligger i test mappen. 

Dette skal ligge i application.properties fil (Min er ikke pushed pga. data sikkerhed)

spring.jpa.hibernate.ddl-auto=update

spring.datasource.url=jdbc:mysql://localhost:3306/samsokv
spring.datasource.username=*Indsæt brugernavn her*
spring.datasource.password=*Indsæt adgangskode her*
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true


server.error.include-message=always

spring.jackson.serialization.indent-output=true
