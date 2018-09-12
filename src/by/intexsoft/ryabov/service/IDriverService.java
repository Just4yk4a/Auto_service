package by.intexsoft.ryabov.service;

import java.util.List;

import by.intexsoft.ryabov.entity.Driver;

/**
 *
 */
public interface IDriverService {
   /**
    * Add new driver
    * 
    * @param driver, which we ant to add
    * @return new driver
    */
   Driver addDriver(Driver driver);

   /**
    * Delete driver by id
    * 
    * @param id of Driver
    */
   void delete(int id);

   /**
    * Get driver by name
    * 
    * @param name of driver
    * @return Driver object
    */
   Driver getByName(String name);

   /**
    * Edit information of driver
    * 
    * @param driver has edit information of driver
    * @return edit driver
    */
   Driver Edit(Driver driver);

   /**
    * Get list of drivers
    * 
    * @return collection of drivers
    */
   List<Driver> getAll();
}
