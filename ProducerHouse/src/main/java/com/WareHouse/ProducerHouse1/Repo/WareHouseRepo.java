package com.WareHouse.ProducerHouse1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WareHouse.ProducerHouse1.Entity.WareHouseEntity;

@Repository
public interface WareHouseRepo extends JpaRepository<WareHouseEntity, Integer> {

}
