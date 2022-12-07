package telran.java2022.karafka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import telran.java2022.karafka.model.SampleMessage;

@Service
@RequiredArgsConstructor
public class Producer {

	final KafkaTemplate<String, String> kafkaTemplate;

	@Value("2albczoj-default")
	String topic;

	public void sendMessage(SampleMessage message) {
		kafkaTemplate.send(topic, message.getMessage());
		System.out.println("Sent sample message [" + message + "] to " + topic);
	}
}
