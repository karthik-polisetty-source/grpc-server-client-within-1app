package com.example.upi_server.client;

import com.grpc.CreateRequest;
import com.grpc.CreateResponse;

import com.grpc.UpiServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class UpiGrpcClient {

public void createTask(){

    ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9090)
            .usePlaintext().build();

    UpiServiceGrpc.UpiServiceBlockingStub stub =UpiServiceGrpc.newBlockingStub(managedChannel);

    CreateRequest request = CreateRequest.newBuilder()
           .setName("john").setAddress("goa")
            .build();




    CreateResponse response1 = stub.createTask(request);

    System.out.println(response1);

    managedChannel.shutdown();
}
}
