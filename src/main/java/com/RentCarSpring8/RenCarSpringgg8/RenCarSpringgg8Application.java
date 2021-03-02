package com.RentCarSpring8.RenCarSpringgg8;

import cars.repository.MercedesRentalRepository;
import rentProces.RentalProcessor;
import request.RentRequest;
import request.RentRequestRetriver;
import service.MailService;
import service.MercedesRentalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RenCarSpringgg8Application {

	public static void main(String[] args) {
		SpringApplication.run(RenCarSpringgg8Application.class, args);

		RentRequestRetriver rentRequestRetriver = new RentRequestRetriver();

		RentRequest rentRequest1 = rentRequestRetriver.retrive1();

		RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),new MercedesRentalService(),new MercedesRentalRepository());
		rentalProcessor.process(rentRequest1);

		rentRequest1.toString();
	}
}
