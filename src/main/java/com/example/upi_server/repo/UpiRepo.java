package com.example.upi_server.repo;

import com.example.upi_server.entity.Upi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UpiRepo extends JpaRepository<Upi,Long> {

}
