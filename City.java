//* City.java
 //* Assignment: Cold War
 //*this is where the oject city gets created. Methode array() in coldwar2 calls this to allocate citys to arrays. 
 //* @version 6/21/2016
 //* @author:David McCauley
 //*/
import java.util.*;
public class City {
   final Random random = new Random();
   private boolean destroyed;
   private int population;
   private String name;
   private int nuke;
   
   //creates the object
   public City(String n, int pop){
      destroyed = false;
      population = pop;
      name = n;
      nuke = random.nextInt(7) + 5;
   }
    
   public boolean compareTo (String string) {
   // compare name to target return true if equal, false otherwise
      if (string.equals(name)){
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
      if (destroyed == true) {
          return 0;
      } 
      return population; 
   }
   
   public int getCasualties(){
      if (destroyed == false) {
          return 0;
      } 
      return population; 
   }
   
   public void nuked(){
      destroyed = true;
   }
   
   public boolean isNuked(){
      return destroyed;
   }
}
