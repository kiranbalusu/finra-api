package com.finra.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finra.service.EmployeeDetailService;
import com.finra.vo.EmployeeDataVO;
import com.finra.vo.EmployeeDetailVO;

@RestController
@RequestMapping(path = "/empdetails")
public class EmployeeDetailController {
	
	@Autowired
	EmployeeDetailService empDetailService;
	
	@GetMapping("/{pageNo}/{pageSize}")
	public ResponseEntity<Object> fetchEmpDetails(@PathVariable Integer pageNo, 
            @PathVariable Integer pageSize) {
		Optional<EmployeeDataVO> response = empDetailService.getEmpDetails(pageNo, pageSize);
		
		if(response.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body((Object)response);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
