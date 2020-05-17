package com.finra.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.finra.mapper.EmployeeDetailMapper;
import com.finra.model.EmployeeDetail;
import com.finra.repository.EmployeeDetailRepository;
import com.finra.service.EmployeeDetailService;
import com.finra.vo.EmployeeDataVO;
import com.finra.vo.EmployeeDetailVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployerDetailServiceImplTests {
	
	@Autowired
	private EmployeeDetailService employeeDetailService;
	
	@MockBean
	EmployeeDetailRepository empDetailRepo;
	
	@Before
	public void setUp()
	{
		when(empDetailRepo.findAll()).thenReturn(Stream.of(new EmployeeDetail(1, "Accounting", "smith@gmail.com"), new EmployeeDetail(2, "Research", "john@gmail.com")).collect(Collectors.toList()));
		when(empDetailRepo.count()).thenReturn((long) 12);
	}
	
	@Test
	public void getEmpDetailsTest()
	{
		//EmployeeDataVO empDataVO = new EmployeeDataVO();
		Pageable paging = PageRequest.of(0, 2);
		List<EmployeeDetail> pagedResult = empDetailRepo.findAll();
		Long totalCount = empDetailRepo.count();
				
		assertEquals(2, pagedResult.size());
		assertEquals(12, totalCount.intValue());
		
	}
	
	
	

}
