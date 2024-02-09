package com.WareHouse.ProducerHouse1.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.jdbc.Expectations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.WareHouse.ProducerHouse1.Entity.WareHouseEntity;
import com.WareHouse.ProducerHouse1.Pojo.WareHousePojo;
import com.WareHouse.ProducerHouse1.Repo.WareHouseRepo;




@Service

public class WarehouseService {
	
	@Autowired
	private WareHouseRepo warehouseRepo;

	
	public List<WareHousePojo> getAllW_Products() {
		// TODO Auto-generated method stub
		
		List<WareHousePojo>detailsto=new ArrayList<WareHousePojo>();
		List<WareHouseEntity> allProductDetails = warehouseRepo.findAll();
		
    for (WareHouseEntity wareHouseEntity : allProductDetails) {
    	
    	   WareHousePojo pojo =new WareHousePojo();
    	  pojo.setW_Id( wareHouseEntity.getW_Id());
    	  pojo.setW_ProductId(wareHouseEntity.getW_ProductId());
			pojo.setW_ProductNAme(wareHouseEntity.getW_ProductNAme());
			pojo.setW_Productprice(wareHouseEntity.getW_Productprice());
			detailsto.add(pojo);
			
		}
		
    return detailsto;
		
		
	}

	public String saveW_Product(WareHousePojo wareHousePojo) {
		// TODO Auto-generated method stub
		
		WareHouseEntity wareHouseEntity=new WareHouseEntity();
		
		wareHouseEntity.setW_Id(wareHousePojo.getW_Id());
		wareHouseEntity.setW_ProductId(wareHousePojo.getW_ProductId());
		wareHouseEntity.setW_ProductNAme(wareHousePojo.getW_ProductNAme());
		wareHouseEntity.setW_Productprice(wareHousePojo.getW_Productprice());
		
		
		 warehouseRepo.save(wareHouseEntity);
		 return "done";
	}

	public WareHouseEntity getW_ProductsById(Integer id) {
		// TODO Auto-generated method stub
		Optional<WareHouseEntity>ProductById=warehouseRepo.findById(id);
		if(ProductById.isPresent())
		{
			return ProductById.get();
		}
		else {
		return null;
		}
	}

	public String UpdateW_product(WareHouseEntity wareHouseEntity, Integer id) {
		// TODO Auto-generated method stub
		Optional<WareHouseEntity>ProductById=warehouseRepo.findById(id);
		if(ProductById.isPresent())
		{
		WareHousePojo wareHousePojo=new WareHousePojo();
			return" ";
		}
		else {
		return null;
		}
	}
	

}
