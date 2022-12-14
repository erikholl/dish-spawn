package io.eho.dishspawn.repository;

import io.eho.dishspawn.model.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ChefRepository extends JpaRepository<Chef, Long> {
//    List<Chef> findAllByUserNameContainingOrderByUserNameAsc(String searchKey);

    List<Chef> findAllByUserNameContainingIgnoreCaseOrderByUserNameAsc(String searchKey);
    Optional<Chef> findChefByUserName(String username);
}
