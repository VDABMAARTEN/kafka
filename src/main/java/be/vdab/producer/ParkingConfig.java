package be.vdab.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class ParkingConfig {
    @Bean
    NewTopic parkingTopic() {
        return TopicBuilder.name("parkings").partitions(10).build();
    }
}
