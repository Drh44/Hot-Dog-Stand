public class HotDogStand
/* Author: Dylan Hesser
version: 1.00
This program allows for a set of hot dog stands to be tracked including the total sales from each hot dog stand */
{
   public static int totalSold =  0 ;
    public int numSold;
   public int idNum;
   
   
      public HotDogStand()
      {
         numSold = 0;
         idNum = 0;
         
         }
         
         public HotDogStand (int numSold,int idNum )
         {
            this.idNum = idNum;
            this.numSold = numSold;
            
            
            }
            
            
            
            public void setNumSold ( int numSold )
            {
               this.numSold = numSold ;
               }
               
            public void setIdNum ( int idNum)
            { 
               this.idNum = idNum ;
               }
               public void setTotalSold ( int totalSold)
               {
                  this.totalSold = totalSold ;
                     }
         
            public int getnumSold ()
            { 
               return this.numSold;
               }
               
               public int getIdNum ()
               {
                  return this.idNum ;
                  }
                  
                  
               public static int getTotalSold ()
               {
                  return totalSold;
                  }
                  
                   public void justSold()
   {
      this.justSold(1);
   }
   
   public void justSold(int quantity)
   {
      this.numSold += quantity;
      totalSold += quantity;
   }

                  
                public String toString ()
                 { 
                  return String.format ( " %d  %d hotdogs sold ", this.idNum, this.numSold ) ;
                  }
                  
                
               
               
         } 
         