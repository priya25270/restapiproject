package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ToyModel;
import com.example.demo.Service.ToyServ;

@RestController
public class ToyController {
@Autowired
public ToyServ tserv;
//get mapping
@GetMapping("/getToy")
	public List<ToyModel>getToyInfo()
	{
	return tserv.getToy();
	}
@PutMapping("/updateToy")
public ToyModel updateToyInfo(@RequestBody ToyModel ca)
{
	return tserv.updateToy(ca);
}
//get all the data
@GetMapping("/getAllrows")
public List<ToyModel> getAllrows()
{
	 return tserv.getAllrows();
}
//get specific data
@GetMapping("/getSpecific/{bran}/{name}")
public List<ToyModel> getSpecrows(@PathVariable("bran") String bran,@PathVariable("name") String name)
{
	 return tserv.getSpecrows(bran, name);
}
//delete
@DeleteMapping("/deleteRow/{id}")
public String deleteRow(@PathVariable("id") int id) {
	 return tserv.deleteRowByid(id)+" id deleted";
}

//update
@PutMapping("/updateId/{bran}/{id}")
public String updateInfo(@PathVariable("bran") String bran,@PathVariable("id") int id)
{
	 return tserv.updateRow(bran, id)+" rows are updated";
}
//jql query
@GetMapping("/getjql/{name}")
public List<ToyModel> getByname (@PathVariable("name") String name){
	return tserv.getByname(name);
}
}

