package com.polyglot.apppay.message;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
@Component
public class TransactionConsumerListener implements AcknowledgingMessageListener<Integer, String> {
	@Override
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord, Acknowledgment acknowledgment) {

	}

//	 private Logger log = LoggerFactory.getLogger(TransactionConsumerListener.class);
//	 @Autowired
//	    private IAccountService accountService;
//	    @Autowired
//	    private ObjectMapper objectMapper;
//
//	    @Override
//		@KafkaListener(topics = "${spring.kafka.template.default-topic}")
//		public void onMessage(ConsumerRecord<Integer, String> data, Acknowledgment acknowledgment) {
//			// TODO Auto-generated method stub
//	        try {
//
//	            log.info("****************************************************************");
//	            log.info("****************************************************************");
//	            log.info("Consumer Receives in Microservice Account");
//	            log.info("ConsumerRecord : {}", data.value());
//
//	            TransactionRequest requestEvent = objectMapper.readValue(data.value(), TransactionRequest.class);
//
//	            log.info("Id Transaction: {} -  Type: {} - Ammount: {}", requestEvent.getId(), requestEvent.getType(),
//	                    requestEvent.getAmount());
//
//	            double newAmount = 0;
//	            Operation operation = new Operation();
//	            operation = accountService.findById(requestEvent.getAccountId());
//	            switch (requestEvent.getType()) {
//	            case "deposit":
//	                newAmount = operation.getTotalAmount() + requestEvent.getAmount();
//	                break;
//
//	            case "withdrawal":
//	                newAmount = operation.getTotalAmount() - requestEvent.getAmount();
//	                break;
//	            }
//	            operation.setTotalAmount(newAmount);
//	            log.info("Update account {}", requestEvent.getAccountId());
//	            accountService.update(operation);
//
//	            //Commit kafka
//
//	            acknowledgment.acknowledge();
//	            log.info("****************************************************************");
//	            log.info("****************************************************************");
//
//	        } catch (JsonProcessingException e) {
//	            e.printStackTrace();
//	        }
//
//	    }
	}
