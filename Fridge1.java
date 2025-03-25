public class Fridge1 {
    
        static boolean isConnected=false;
       static int currentTemp=0;
      
    
        public static void onOrOff()
        {
            
         if(isConnected==false)
            {
               System.out.println("ac is connected");
                isConnected=true;
            }
            else{
                System.out.println("ac is not connected");
             isConnected=false;
            }}
    
            public static void incTemp()
    
            {
                int maxTemp=6;
                if(isConnected==true){
                    if(currentTemp<maxTemp)
               { 
                currentTemp=currentTemp+1;
                System.out.println("current temp is "+currentTemp);
            }
                else
               System.out.println(" max temp reached ");
        }
        else{
        System.out.println("turn on the AC");
        return ;
    }    } 
        
    
    
    public static void decTemp()
            {
                int minTemp=0;
                if(isConnected==true){
                    if(currentTemp>minTemp)
               { 
                currentTemp=currentTemp-1;
                System.out.println("current temp is "+currentTemp);
            }
                else
               System.out.println(" min temp reached ");
        }
        else{
        System.out.println("turn on the AC");
        return ;
          
            }
        
            
            }
        
    }
    
    
    
            
    
        
    
           
    

