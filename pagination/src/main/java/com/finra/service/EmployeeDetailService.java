package com.finra.service;

import java.util.List;
import java.util.Optional;

import com.finra.vo.EmployeeDataVO;
import com.finra.vo.EmployeeDetailVO;


public interface EmployeeDetailService {
	
	public Optional<EmployeeDataVO> getEmpDetails(Integer pageNo, Integer pageSize);

}
