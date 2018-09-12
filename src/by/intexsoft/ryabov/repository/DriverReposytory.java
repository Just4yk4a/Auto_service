package by.intexsoft.ryabov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import by.intexsoft.ryabov.entity.Driver;

/**
 * Realizes a repository for the Driver
 */
public interface DriverReposytory extends JpaRepository<Driver, Integer> {
   @Query("select d from Driver d where d.name =:name")
   Driver findByName(@Param("name") String name);
}
