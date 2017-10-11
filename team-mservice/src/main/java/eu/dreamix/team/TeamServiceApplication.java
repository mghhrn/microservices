
package eu.dreamix.team;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(
        basePackageClasses = {TeamServiceApplication.class, Jsr310JpaConverters.class}
)
@EnableDiscoveryClient
@SpringBootApplication
public class TeamServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamServiceApplication.class, args);
    }
}