package veteriner.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import veteriner.entities.concretes.Owners;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepo extends JpaRepository<Owners,Integer> {

    @Query(
            value = "SELECT * FROM owners WHERE identity_number= ?1" ,
            nativeQuery = true)
    List<String> findUser(String query_identityNumber);

    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO animals (animal_id, name, type, breed, age, info , owner_identity_number)\n" +
                    "VALUES ( '5', 'new_name', 'new_type', 'new_breed', 'new_age', 'new_info', '55858659149');" ,
            nativeQuery = true)
    void addanimal();
}
