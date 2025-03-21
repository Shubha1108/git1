public class Instagram {
    
    
        public static String signUp(String fullName,String phoneNumber,String emailId,String password,String confirmPassword,String dob,String gender){
            String ref = null;
            
             boolean userIdValidated = validateUserProfile(fullName,phoneNumber,emailId,password,confirmPassword,dob,gender);
       
             if(userIdValidated == true)
              ref=" sign up successful";
              else
              ref=" sign up unsuccessful";
       
              return ref;
       
             
       
             }
             public static boolean validateUserProfile(String fullName,String phoneNumber, String emailId,String password,String confirmPassword,String dob,String gender){
               boolean userValid =false;
               boolean isFullNameValid=false;
               boolean isPasswordValid=false;
               boolean isConfirmPasswordValid=false;
               boolean isPhoneNumberValid=false;
               boolean isDobValid=false;
               boolean isGenderValid=false;
               boolean isMailValid=false;
       
               if(fullName != null && fullName.length() >=3 ){
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
               if (dob!= null ){
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
               if (emailId!=null){
                   isMailValid=true;
               }
               else{
                   System.out.println("mailid is not valid,please provide valid mailid");
               }
               if(password!=null && password.length()>=6 && !password.isEmpty()){
                isPasswordValid=true;
               }
               else{
                System.out.println("password is invalid.provide valid password");
               }
               if(confirmPassword!=null && confirmPassword==password && !confirmPassword.isEmpty()){
                isConfirmPasswordValid=true;
               }
               else{
                System.out.println("confirm password is invalid.provide valid password");
               }
       
               if(isFullNameValid==true && isPhoneNumberValid==true && isDobValid==true && isGenderValid==true && isMailValid==true && isPasswordValid==true){
                   userValid=true;
       
               }
               else {
                   System.out.println("invalid");
               }  
               return userValid;
           
       }
       }
        
    
    
    


    

