package com.example.jeevcrud.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jeevcrud.Entity.Employee;

public interface Emprepo extends JpaRepository <Employee,Integer>{

	

	

	Employee findByName(String name);

	

}
