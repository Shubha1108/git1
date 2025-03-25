public class Speaker {
    static boolean isConnected=false;
   static int currentVolume=0;
  

    public static void onOrOff()
    {
        
     if(isConnected==false)
        {
           System.out.println("speaker is connected");
            isConnected=true;
        }
        else{
            System.out.println("speaker is not connected");
         isConnected=false;
        }}

        public static void incVolume()

        {
            int maxVolume=10;
            if(isConnected==true){
                if(currentVolume<maxVolume)
           { 
            currentVolume=currentVolume+1;
            System.out.println("current volume is "+currentVolume);
        }
            else
           System.out.println(" max volume reached ");
    }
    else{
    System.out.println("turn on the speaker");
    return ;
}    } 
    


public static void decVolume()
        {
            int minVolume=0;
            if(isConnected==true){
                if(currentVolume>minVolume)
           { 
            currentVolume=currentVolume-1;
            System.out.println("current volume is "+currentVolume);
        }
            else
           System.out.println(" min volume reached ");
    }
    else{
    System.out.println("turn on the speaker");
    return ;
      
        }
    
        
        }
    
}



        

    

       