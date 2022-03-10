package persistence;

import entities.product;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDoa extends JpaRepository<product, Integer> {
	
	@Query("from product where price>=?1")
	public List<product> searchForPriceOver(double searchPrice);
	
	@Transactional
	@Modifying
	@Query("delete from product where name=?1")
	public void deleteProductByName(String name);
}
