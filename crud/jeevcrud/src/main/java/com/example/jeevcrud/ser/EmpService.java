package com.example.jeevcrud.ser;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jeevcrud.Entity.Employee;
import com.example.jeevcrud.rep.Emprepo;

@Service
public class EmpService {
	@Autowired
	Emprepo erpo;
	//employee save
	public Employee add(Employee e) {
		return erpo.save(e);
	}
	public List<Employee>addAll(List<Employee> e){
		return erpo.saveAll(e);
	}
	//store two or maor valus
	//get emp details
	public Employee getById(int id) {
		return erpo.findById(id).get();
	}
	//get enp name
	public Employee getByname(String name) {
	return erpo.findByName(name);

}
	//get all enp
	public List<Employee>getAll()
	{
	return erpo.findAll();	
	}
	//delete by id
	public void deleteById(int id) {
		erpo.deleteById(id);
		System.out.println("id deleted");
	}
	public Employee upadte(Employee e){
        Employee ee=erpo.findById( e.getId()).orElse(null);
        ee.setId(e.getId());
        ee.setName(e.getName());
        ee.setLocation(e.getLocation());
        ee.setEmail(e.getEmail());
        return erpo.save(ee);
	}
	
	}
