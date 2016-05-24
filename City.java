import java.util.*;
public class City {
   final Random random = new Random();

   public void makeCity(String name, int pop, int order){
      boolean destroyed = false;
      int population = pop;
      int placement = order;
      int nuke = random.nextInt(7);
      int country = 1;
      if (placement <20){
         country = 2;
      }
   }  
}
    
