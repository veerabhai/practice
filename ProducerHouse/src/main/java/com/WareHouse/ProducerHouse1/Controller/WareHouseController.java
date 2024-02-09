package com.WareHouse.ProducerHouse1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WareHouse.ProducerHouse1.Entity.WareHouseEntity;
import com.WareHouse.ProducerHouse1.Pojo.WareHousePojo;
import com.WareHouse.ProducerHouse1.Service.WarehouseService;



@RestController
@RequestMapping("/WareHouse")
public class WareHouseController {
	
	@Autowired
	private WarehouseService warehouseService;
	
	@GetMapping("/getAllW_Products")
	public List<WareHousePojo> getAllW_Products()
	{
		return warehouseService.getAllW_Products();
	}

	@PostMapping("/saveW_Product")
	public String saveW_Product( @RequestBody WareHousePojo wareHousePojo)
	{
		return warehouseService.saveW_Product(wareHousePojo);
	}
	
	@GetMapping("/getAllW_Products_ById/{id}")
     public	WareHouseEntity getW_productById(@PathVariable Integer id)
     {
		return warehouseService.getW_ProductsById(id);
		}
	
	@PutMapping("/updateProduct/{id}")
	public String UpdateW_product(@RequestBody WareHouseEntity wareHouseEntity ,@PathVariable Integer id)
	{
		return warehouseService.UpdateW_product(wareHouseEntity,id);
	}
	
	
}
