package by.intexsoft.ryabov.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import by.intexsoft.ryabov.entity.Driver;
import by.intexsoft.ryabov.service.IDriverService;

/**
 * 
 */
@RestController
@RequestMapping("/")
public class GeneralController {
   @Autowired
   private IDriverService driverService;
   private static final Logger log = LoggerFactory.getLogger(GeneralController.class.getName());

   /**
    * Send message on main page
    * 
    * @return message "Hello guys!!!"
    */
   @GetMapping
   public String Hello() {
      return "Hello guys!!!";
   }

   /**
    * Show list of drivers
    * 
    * @return list of drivers
    */
   @GetMapping("drivers")
   public String drivers() {
      log.info("Get list of drivers");
      String nameDrivers = "";
      for (Driver driver : driverService.getAll()) {
         nameDrivers += driver.getName() + "<br />";
      }
      return nameDrivers;
   }
}
