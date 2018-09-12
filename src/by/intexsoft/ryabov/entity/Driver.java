package by.intexsoft.ryabov.entity;

import javax.persistence.*;

/**
 * Realizes the entity of the Driver
 */
@Entity
public class Driver {
   @Id
   private int id;

   @Column
   private String name;

   /**
    * @return the id
    */
   public int getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName(String name) {
      this.name = name;
   }

}
