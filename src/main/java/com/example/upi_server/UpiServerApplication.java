package com.example.upi_server;

import com.example.upi_server.client.UpiGrpcClient;
import com.example.upi_server.service.UpiGrpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UpiServerApplication {

	public static void main(String[] args) throws InterruptedException{

//		ApplicationContext context =SpringApplication.run(UpiServerApplication.class, args);
//		UpiGrpcClient upiGrpcClient =context.getBean(UpiGrpcClient.class);
//		upiGrpcClient.createTask();

		SpringApplication.run(UpiServerApplication.class, args);
	}

}
