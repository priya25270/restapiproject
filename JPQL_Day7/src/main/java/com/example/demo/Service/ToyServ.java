package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ToyModel;
import com.example.demo.Repository.ToyRepo;

@Service
public class ToyServ {
@Autowired
public ToyRepo trepo;
public List<ToyModel> getToy(){
	return trepo.findAll();
}
public ToyModel updateToy(ToyModel hm) {
	return trepo.saveAndFlush(hm);
}
//get all the data
	public List<ToyModel> getAllrows()
	{
		return trepo.getAllrows();
	}
	
	//get specific rows
	public List<ToyModel> getSpecrows(String bran,String name)
	{
		return trepo.getSpecrows(bran, name);
	}
	//delete the data
	public int deleteRowByid(int id) {
		return trepo.deleteId(id);
	}
	//update the data
	public Integer updateRow(String bran,int id) {
		return trepo.updateByid(bran, id);
	}
	//JQL query
	public List<ToyModel> getByname(String name){
		return trepo.getByname(name);
	}


}
