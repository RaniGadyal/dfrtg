package com.abc.Idfcmock.dao;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.Idfcmock.dto.EmpDto;
import com.abc.Idfcmock.repository.UserRepository;
@Component

public class EmpDao {
@Autowired
UserRepository repository;
	public void insert(EmpDto dto) {
		// TODO Auto-generated method stub
		
		repository.save(dto);
	}
	public String delete(EmpDto dto) {
		repository.delete(dto);
		return "data deleted successfully";
	}
	public EmpDto fetch(EmpDto dto) {
		// TODO Auto-generated method stub
	Optional<EmpDto> dto2=repository.findById(dto.getEmpid());
		return dto2.get();
	}
	



}
