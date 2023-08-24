package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Transientmodel;
import com.example.demo.Repository.SweetRepo;

@Service
public class Sweetserv {
@Autowired
public SweetRepo srepo;
//post the data
	public String savesweet(Transientmodel t)
	{
		  srepo.save(t);
		  return "Data is saved to the database";
	}
	//get the data
    public List<Transientmodel>getsweet()
		{
			  return srepo.findAll();
		}
		//getUserByID
		public Optional<Transientmodel>getSweetId(int sweetId)
		{
			  Optional<Transientmodel>sweet=srepo.findById(sweetId);
			  if(sweet.isPresent())
			  {
				  return sweet;
			  }
			  return null;
		}
}
