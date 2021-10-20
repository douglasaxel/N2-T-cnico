package br.com.douglasaxel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.douglasaxel.models.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
