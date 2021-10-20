package br.com.douglasaxel.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglasaxel.models.Car;
import br.com.douglasaxel.services.CarService;

@RestController
@RequestMapping("/carro")
public class CarController {
	@Autowired
	private CarService carsService;
	
	@PostMapping
	public Car insertCars(@RequestBody Car cars) {
		return carsService.insertOrUpdate(cars);
	}
	
	@PutMapping
	public Car update(@RequestBody Car cars) {
		return carsService.insertOrUpdate(cars);
	}
	
	@GetMapping
	public List<Car> findAll(){
		return carsService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Car> findOne(@PathVariable int id){
		return carsService.findOne(id);
	}
	
	@DeleteMapping("{id}")
	public void remove(@PathVariable int id) {
		carsService.remove(id);
	}
	
}