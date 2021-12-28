package veteriner.repositories;

import veteriner.entities.concretes.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AnimalsRepo extends JpaRepository<Animals,Integer> {

}
