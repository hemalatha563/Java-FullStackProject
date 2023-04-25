package com.example.FullStackproject.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.FullStackproject.model.SwiggyDetails;

/*@Repository-is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects  
JPA Repository is mainly used for managing the data in a Spring Boot Application*/
/*JpaRepository<Table,Primarykey datatype>
/*JpaRepository<SwiggyModel,Integer>*/

@Repository
public interface RestaurantRepository extends JpaRepository<SwiggyDetails,Integer> {
	List<SwiggyDetails> findByRestaurantNameContaining(String restaurantName);
	List<SwiggyDetails> findByfoodType(String FoodType);
}
