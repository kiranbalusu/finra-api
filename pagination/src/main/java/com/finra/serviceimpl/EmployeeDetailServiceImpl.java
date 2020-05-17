package com.finra.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.finra.common.FinraLogger;
import com.finra.mapper.EmployeeDetailMapper;
import com.finra.model.EmployeeDetail;
import com.finra.repository.EmployeeDetailRepository;
import com.finra.service.EmployeeDetailService;
import com.finra.vo.EmployeeDataVO;
import com.finra.vo.EmployeeDetailVO;

@Service
public class EmployeeDetailServiceImpl implements EmployeeDetailService{
	FinraLogger logger=new FinraLogger(EmployeeDetailServiceImpl.class);
	@Autowired
	EmployeeDetailRepository empDetailRepo;
	
	@Override
	public Optional<EmployeeDataVO> getEmpDetails(Integer pageNo, Integer pageSize)
	{
		EmployeeDataVO empDataVO = new EmployeeDataVO();
		Pageable paging = PageRequest.of(pageNo, pageSize);
		Page<EmployeeDetail> pagedResult = empDetailRepo.findAll(paging);
		Long totalCount = empDetailRepo.count();
						
		List<EmployeeDetailVO> empDetailVO = EmployeeDetailMapper.INSTANCE.VotodomainObject(pagedResult.getContent());
		empDataVO.setEmployeeDetailVO(empDetailVO);
		empDataVO.setTotalCount(totalCount.intValue());
		
		return Optional.ofNullable(empDataVO);
	}

}
