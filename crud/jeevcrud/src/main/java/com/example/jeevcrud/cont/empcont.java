package com.example.jeevcrud.cont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jeevcrud.Entity.Employee;
import com.example.jeevcrud.ser.EmpService;

@RestController
@RequestMapping("/emp")//locakhost8080/emp
public class empcont {
	@Autowired
	EmpService es;
	@PostMapping("/ade")//lacalhost/emp/ade
	public Employee save(@RequestBody Employee e) {//json formate postman
		return es.add(e);
	}
	@PostMapping("/addall")
	public List<Employee>savingAll(@RequestBody List<Employee> e){
		return es.addAll(e);
	}
	@GetMapping("/get/{id}")//laocalhost8080get/2
	public Employee viewByid(@PathVariable int id) {
		return es.getById(id);
	}
	@GetMapping("/getname/{name}")
	public Employee viewByname(@PathVariable String name) {
		return es.getByname(name);
		
	}
	@GetMapping("/getAll")
	public List<Employee>viewAll(){
		return es.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		es.deleteById(id);
	}
	@PutMapping("/update")
	public Employee up(@RequestBody Employee kk){
		 return es.upadte(kk);
		
		
		
	}
	
	
	
	
	
	
	
}
