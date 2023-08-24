package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ShopModel;
import com.example.demo.Repository.ShopRepo;

@Service
public class ShopService {
@Autowired
public ShopRepo srep;
//post
public String saveShops(ShopModel sm) {
	srep.save(sm);
	return "Data is saved to the database";
}
//get
public List<ShopModel>getShop(){
	return srep.findAll();
}
//get by id
public Optional<ShopModel>getShopId(int ShopId){
	Optional<ShopModel>shope=srep.findById(ShopId);
	if(shope.isPresent()) {
		return shope;
	}
	return null;
}
//put
public ShopModel updateshop(ShopModel m) {
	return srep.saveAndFlush(m);
}
//put by id
public boolean updateShopif(int ShopId,ShopModel m) {
	if(srep.existsById(ShopId)) {
		srep.save(m);
	return true;
}
	return false;
	}
//sort
public List<ShopModel>sortByAsc(String shopName)
{
	return srep.findAll(Sort.by(shopName).ascending()); 
}
public List<ShopModel>sortByDsc(String shopName){
	return srep.findAll(Sort.by(shopName).descending());
}

//pagination
public List<ShopModel>pagination(int pageNum,int pageSize)
{
	Page<ShopModel>cont=srep.findAll(PageRequest.of(pageNum,pageSize));
	return cont.getContent();
}

//pagination and sorting
public List<ShopModel>paginationAndSorting(int pageNum,int pageSize,String name)
{
	Page<ShopModel>cont1=srep.findAll(PageRequest.of(pageNum,pageSize,Sort.by(name)));
	return cont1.getContent();
}
}

