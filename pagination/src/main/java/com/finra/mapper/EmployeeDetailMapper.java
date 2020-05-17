package com.finra.mapper;

import static org.mapstruct.NullValueMappingStrategy.RETURN_DEFAULT;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.finra.model.EmployeeDetail;
import com.finra.vo.EmployeeDetailVO;

@Mapper
public interface EmployeeDetailMapper {
public static EmployeeDetailMapper INSTANCE = Mappers.getMapper(EmployeeDetailMapper.class);
	
	@IterableMapping(nullValueMappingStrategy = RETURN_DEFAULT) 
	List<EmployeeDetailVO> domainToVoList(List<EmployeeDetail> empDetail);
	
	@IterableMapping(nullValueMappingStrategy = RETURN_DEFAULT) 
	List<EmployeeDetailVO> VotodomainObject(List<EmployeeDetail> empDetail);

}
