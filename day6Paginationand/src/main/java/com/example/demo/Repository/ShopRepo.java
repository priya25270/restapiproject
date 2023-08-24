package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ShopModel;

public interface ShopRepo extends JpaRepository<ShopModel, Integer> {

}
