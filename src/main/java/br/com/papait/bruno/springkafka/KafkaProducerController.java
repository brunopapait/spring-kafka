package br.com.papait.bruno.springkafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class KafkaProducerController {

	private final KafkaTemplate<String, String> kafkaProducerService;

	public KafkaProducerController(KafkaTemplate<String, String> kafkaProducerService) {
		this.kafkaProducerService = kafkaProducerService;
	}

	@GetMapping("/producer/{message}")
	public void producer(@PathVariable String message) {
		this.kafkaProducerService.send("ecommerce.compras", message);
	}

}
