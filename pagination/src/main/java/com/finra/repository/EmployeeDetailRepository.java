package com.finra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finra.model.EmployeeDetail;


public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, Integer>{

}
