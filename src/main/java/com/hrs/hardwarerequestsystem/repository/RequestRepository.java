package com.hrs.hardwarerequestsystem.repository;

import com.hrs.hardwarerequestsystem.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request,Integer> {

}
