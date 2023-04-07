package com.abc.Idfcmock.dto;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class EmpDto {
	@Id
	private int empid;	
private String empname;

private String emppwd;
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmppwd() {
	return emppwd;
}
public void setEmppwd(String emppwd) {
	this.emppwd = emppwd;
}

}
