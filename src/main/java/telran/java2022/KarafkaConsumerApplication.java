package telran.java2022;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
@KafkaListener(topics = "2albczoj-default")
public class KarafkaConsumerApplication {

	final KafkaTemplate<String, String> kafkaTemplate;

	@Value("2albczoj-default")
	String topic;

	public static void main(String[] args) {
		SpringApplication.run(KarafkaConsumerApplication.class, args);
	}

	public void sendMessage(String message) {
		kafkaTemplate.send(topic, message);
		System.out.println(message);
	}

}
