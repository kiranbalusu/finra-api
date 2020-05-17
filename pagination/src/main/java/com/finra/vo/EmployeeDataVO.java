package com.finra.vo;

import java.util.List;

public class EmployeeDataVO {
	
	private Integer totalCount;
	private List EmployeeDetailVO;
	
	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List getEmployeeDetailVO() {
		return EmployeeDetailVO;
	}

	public void setEmployeeDetailVO(List employeeDetailVO) {
		EmployeeDetailVO = employeeDetailVO;
	}

	public EmployeeDataVO() {
	}

}
