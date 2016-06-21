import java.util.*;
public class City {
   final Random random = new Random();
   private boolean destroyed;
   private int population;
   private String name;
   private int nuke;
   

   public City(String n, int pop){
      destroyed = false;
      population = pop;
      name = n;
      nuke = random.nextInt(7);
   }
    
   public boolean compareTo (String target) {
   // compare name to target return true if equal, false otherwise
      if (target.equals(name)){
         return true; 
      }
      else {
         return false;
      }
   }
   
   public int getNukes (){ 
      if (destroyed == true) { 
          return 0;
      }
      return nuke;
   }
   
   public String getName (){ 
      return name;
   }
   
   public int getPopulation(){
      return population; 
   }
   
   public void die(){
      destroyed = true;
   }
}
