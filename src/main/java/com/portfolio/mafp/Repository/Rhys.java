
package com.portfolio.mafp.Repository;

import com.portfolio.mafp.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Rhys extends JpaRepository<hys , Integer> {
    
  public Optional<hys> findByNombre(String nombre);
  public boolean existsByNombre(String nombre);
}