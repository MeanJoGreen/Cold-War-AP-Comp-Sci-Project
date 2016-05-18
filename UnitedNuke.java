public class UnitedNuke {
   int nuke = 60;
   int[] CitysNukes = {2,2,2,2,2,5,5,5,5,3,3,3,1,6,5,3,1,1,1,2};

   public int[] NukeArray() {
      return CitysNukes; 
   } 
   
   public int UseNuke(){
      int i = 6;
      for(int p = 0; p < 19; p++){
         if(i < CitysNukes[p]){
            i = CitysNukes[p];
         }
         System.out.print(i);
      }
         return nuke;
   }
   
   public int[] NukeArray() {
      return CitysNukes; 
   }  
} 
