package com.abc.Idfcmock.repository;



import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import com.abc.Idfcmock.dto.EmpDto;

@Repository
public interface UserRepository extends JpaRepository<EmpDto, Integer> {
	

}
