package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Car;

@Repository
public interface CarDoa extends JpaRepository<Car, String> {

}
