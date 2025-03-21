public class Spotify {
    
        public static String signUp(String fullName,String phoneNumber,String emailId,String dob,String gender){
            String ref = null;
            
             boolean userIdValidated = validateUserProfile(fullName,phoneNumber,emailId,dob,gender);
       
             if(userIdValidated == true)
              ref="user sign up successful";
              else
              ref="user sign up unsuccessful";
       
              return ref;
       
             }
             public static boolean validateUserProfile(String fullName,String phoneNumber, String emailId,String dob,String gender){
               boolean userValid =false;
               boolean isFullNameValid=false;
               
               boolean isPhoneNumberValid=false;
               boolean isDobValid=false;
               boolean isGenderValid=false;
               boolean isMailValid=false;
       
               if(fullName != null && fullName.length() >=3 && !fullName.isEmpty()){
                isFullNameValid=true;
       
               }
               else {
                   System.out.println("full name is invalid. Please provide valid first name");
               }
       
                if (phoneNumber !=null && phoneNumber.length()>0 && phoneNumber.length()==10){
                   isPhoneNumberValid = true;
       
               }
               else{
                   System.out.println("phone number is invalid.please provide valid phone number");
               }
               if (dob!= null && !dob.isEmpty() ){
                   isDobValid=true;
       
               }
               else{
                   System.out.println("dob is not valid.please provide valid dob");
               }
               if (gender != null && !gender.isEmpty()){
                   isGenderValid=true;
               }
               else{
                   System.out.println("gender is not valid.please provide valid gender");
               }
               if (emailId!=null && !emailId.isEmpty()){
                   isMailValid=true;
               }
               else{
                   System.out.println("mailid is not valid,please provide valid mailid");
               }
       
               if(isFullNameValid==true && isPhoneNumberValid==true && isDobValid==true && isGenderValid==true && isMailValid==true){
                   userValid=true;
       
               }
               else {
                   System.out.println("invalid");
               }  
               return userValid;
           
       }
       }
        
    
    

    

