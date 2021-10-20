package br.com.douglasaxel.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.douglasaxel.models.Car;
import br.com.douglasaxel.repositories.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carsRepository;
	
	public Car insertOrUpdate(Car cars) {
		return carsRepository.save(cars);
	}
	
	public List<Car> findAll(){
		List<Car> cars = new ArrayList<Car>();
		carsRepository.findAll().forEach(cars::add);
		return cars;
	}
	
	public  Optional<Car> findOne(int id){
		return carsRepository.findById(id);
	}
	
	public void remove(int id) {
		carsRepository.deleteById(id);
	}
}