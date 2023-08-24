package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ShopModel;
import com.example.demo.Service.ShopService;

@RestController
public class ShopController {
@Autowired
public ShopService sserv;
//post mapping
@PostMapping("/postShop")
public String postHotel(@RequestBody ShopModel cr)
{
	sserv.saveShops(cr);
	return "data saved";
}
//get mapping
@GetMapping("/getCater")
	public List<ShopModel>getShopInfo()
	{
	return sserv.getShop();
	}
//getUserByID
@GetMapping("/users/{ShopId}")
public ResponseEntity<?> getUserById(@PathVariable int ShopId){
	Optional<ShopModel>shope=sserv.getShopId(ShopId);
	
	if(shope!=null)
	{
		return ResponseEntity.ok(shope); //Return the user's data if available
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shop not available with ID");
}
//put mapping
@PutMapping("/updateShop")
public ShopModel updateShopInfo(@RequestBody ShopModel ca)
{
	return sserv.updateshop(ca);
}
@PutMapping("/updateShopif/{id}")
public ResponseEntity<String> updateHotelInfor(@PathVariable int id,@RequestBody ShopModel ca){
	   boolean updated=sserv.updateShopif(id,ca);
			   if(updated)
			   {
				  return ResponseEntity.ok("Shop with ID "+id+" updated successfully");
			   }
			   else
			   {
				  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shop with ID "+id+" not found and not updated");
			   }
	   }
@GetMapping("/sortAsc/{name}")
public List<ShopModel>sortasc(@PathVariable("name") String shopName)
{
	   return sserv.sortByAsc(shopName);
}
@GetMapping("/sortDsc/{name}")
public List<ShopModel>sortdsc(@PathVariable("name") String shopName)
{
	   return sserv.sortByDsc(shopName);
}
//Pagination

@GetMapping("/pagination/{num}/{size}")
public List<ShopModel>paginationEx(@PathVariable("num")int num,@PathVariable("size")int size)
{
	   return sserv.pagination(num, size);
}
@GetMapping("/pagination/{num}/{size}/{name}")
public List<ShopModel> paginationAndSorting(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name") String shopName){
	return sserv.paginationAndSorting(num, size,shopName);
}
}

