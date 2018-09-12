package by.intexsoft.ryabov.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.intexsoft.ryabov.entity.Driver;
import by.intexsoft.ryabov.repository.DriverReposytory;
import by.intexsoft.ryabov.service.IDriverService;

/**
 * Realization of interface IDriverService
 */
@Service
public class DriverService implements IDriverService {
   @Autowired
   private DriverReposytory driverReposytory;

   /*
    * @see
    * by.intexsoft.ryabov.service.IBankService#addDriver(by.intexsoft.ryabov.entity
    * .Driver)
    */
   @Override
   public Driver addDriver(Driver driver) {
      Driver savedDriver = driverReposytory.saveAndFlush(driver);
      return savedDriver;
   }

   /*
    * @see by.intexsoft.ryabov.service.IBankService#delete(int)
    */
   @Override
   public void delete(int id) {
      driverReposytory.deleteById(id);
      ;
   }

   /*
    * @see by.intexsoft.ryabov.service.IBankService#getByName(java.lang.String)
    */
   @Override
   public Driver getByName(String name) {
      return driverReposytory.findByName(name);
   }

   /*
    * @see by.intexsoft.ryabov.service.IBankService#Edit(int)
    */
   @Override
   public Driver Edit(Driver driver) {
      return driverReposytory.saveAndFlush(driver);
   }

   /*
    * @see by.intexsoft.ryabov.service.IBankService#getAll()
    */
   @Override
   public List<Driver> getAll() {
      return driverReposytory.findAll();
   }

}
