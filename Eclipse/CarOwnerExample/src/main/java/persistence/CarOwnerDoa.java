package persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.CarOwner;

@Repository
public interface CarOwnerDoa extends JpaRepository<CarOwner, String>{

}
