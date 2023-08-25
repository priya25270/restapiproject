package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.ToyModel;

import jakarta.transaction.Transactional;

public interface ToyRepo extends JpaRepository<ToyModel, Integer>{
//native query
	@Query(value="select * from Toys",nativeQuery = true )
	public List<ToyModel>getAllrows();

	@Query(value="select * from Toys where brand=:bran and toy_name=:name",nativeQuery = true )
	public List<ToyModel> getSpecrows(@Param("bran") String bran,@Param("name") String name);
//:JQL query
	//@Query(value="select * from Toys where brand like %?1%",nativeQuery=true)
	@Query("Select h from ToyModel h where h.toyName like %?1%")
	public List<ToyModel> getByname(@Param("name") String name);
	
//Delete using native query
	@Modifying
	@Transactional
	//@Query(value = "delete from Toys where toy_id=:id",nativeQuery=true)
	@Query("Delete from ToyModel h where h.toyId=:id")
	public int deleteId(@Param("id") int id);
	
//Update the native query
		@Modifying
		@Transactional
		@Query(value="update Toys set brand=:bran where toy_id=:id",nativeQuery=true)
		public Integer updateByid(@Param("bran") String bran,@Param("id")int id);
}
