package com.example.upi_server.service;

import com.example.upi_server.entity.Upi;
import com.example.upi_server.repo.UpiRepo;
import com.grpc.CreateRequest;
import com.grpc.CreateResponse;
//import com.grpc.CreateTaskRequest;
//import com.grpc.CreateTaskResponse;
import com.grpc.UpiServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;


@GrpcService
public class UpiGrpcService extends UpiServiceGrpc.UpiServiceImplBase {

    @Autowired
    private UpiRepo upiRepo;

    @Override
    public void createTask(CreateRequest request, StreamObserver<CreateResponse> responseObserver) {

    System.out.println("Received CreateTask request with title: " + request.getName()+","+request.getAddress());

        Upi upi =new Upi();
        upi.setName(request.getName());
        upi.setAddress(request.getAddress());
        Upi create =upiRepo.save(upi);

        CreateResponse response = CreateResponse.newBuilder()
                .setName(create.getName())
                .setAddress(create.getAddress())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
