package com.jaisoft.aggregate;

import com.jaisoft.aggregate.infrastructure.AggregateRepository;
import com.jaisoft.aggregate.infrastructure.data.AggregateEntity;
import com.jaisoft.aggregate.infrastructure.data.SubAggregateEntity;
import com.jaisoft.aggregate.infrastructure.data.ValueObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class AggregateApplication {
	private static final Logger log = LoggerFactory.getLogger(AggregateApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AggregateApplication.class, args);
	}


	@Bean
	public CommandLineRunner demo(AggregateRepository repository) {
		return (args) -> {

			SubAggregateEntity subAggregateEntity =  new SubAggregateEntity("subAggregateName");
			ValueObject valueObject = new ValueObject("valueObjectName");
			AggregateEntity aggregateEntity = new AggregateEntity("aggregateName",subAggregateEntity, valueObject );
			repository.save(aggregateEntity);
			SubAggregateEntity subAggregateEntity2 =  new SubAggregateEntity("subAggregateName2");
			ValueObject valueObject2 = new ValueObject("valueObjectName2");
			AggregateEntity aggregateEntity2 = new AggregateEntity("aggregateName2",subAggregateEntity2, valueObject2 );
			repository.save(aggregateEntity2);
			SubAggregateEntity subAggregateEntity3 =  new SubAggregateEntity("subAggregateName3");
			ValueObject valueObject3 = new ValueObject("valueObjectName3");
			AggregateEntity aggregateEntity3 = new AggregateEntity("aggregateName3",subAggregateEntity3, valueObject3 );
			repository.save(aggregateEntity3);

			// fetch all AggregateEntitygit
			log.info("AggregateEntity found with findAll():");
			log.info("-------------------------------");
			for (AggregateEntity aggregateEntity5 : repository.findAll()) {
				log.info(aggregateEntity5.toString());
			}
			log.info("");

			// fetch an individual AggregateEntity by ID
			Optional<AggregateEntity> customer = repository.findById(1L);
			log.info("AggregateEntity found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");


		};
	}

}
