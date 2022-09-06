package br.com.papait.bruno.springkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@KafkaListener(topics = "ecommerce.compras", groupId = "ecommerce_groupId")
	public void consumer(String message) {
		System.out.println("Message received: " + message);
	}
}
