package com.abc.Idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.Idfcmock.dao.EmpDao;
import com.abc.Idfcmock.dto.EmpDto;


@RestController
public class Empcontroller {
	@Autowired
	EmpDao dao;
	@PostMapping("/insert")
	public void insert(@RequestBody EmpDto dto) {
//		System.out.println(dto.getEmpid());
//		System.out.println(dto.getEmpname());
//		System.out.println(dto.getEmppwd());
		
		dao.insert(dto);
	}
	
	@DeleteMapping("/delete")
	public String daletedata(@RequestBody EmpDto dto ) {
		String msg=dao.delete(dto);
		return msg;

	}
	
	@GetMapping("/fetch")
	public EmpDto fetchdata(@RequestBody EmpDto dto ) {
		EmpDto dto2=dao.fetch(dto);
		return dto2;
	}
}
