package telran.java2022.karafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "2albczoj-default")
    public void processMessage(String message) {
        System.out.println(message);
    }
}
