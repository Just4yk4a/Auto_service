package by.intexsoft.ryabov.service;

import java.util.List;
import by.intexsoft.ryabov.entity.Driver;

/**
 *
 */
public interface IDriverService {
   Driver addDriver(Driver driver);

   void delete(int id);

   Driver getByName(String name);

   Driver Edit(Driver driver);

   List<Driver> getAll();
}
