public class FaceBook {
    

        public static String signUp(String firstName,String lastName,String phoneNumber,String emailId,String dob,String gender){
            String ref = null;
            
             boolean userIdValidated = validateUserProfile(firstName,lastName,phoneNumber,emailId,dob,gender);
       
             if(userIdValidated == true)
              ref="user sign up successful";
              else
              ref="user sign up unsuccessful";
       
              return ref;
       
             
       
             }
             public static boolean validateUserProfile(String firstName,String lastName,String phoneNumber, String emailId,String dob,String gender){
               boolean userValid =false;
               boolean isFirstNameValid=false;
               boolean isLastNameValid=false;
               boolean isPhoneNumberValid=false;
               boolean isDobValid=false;
               boolean isGenderValid=false;
               boolean isMailValid=false;
       
               if(firstName != null && firstName.length() >=3 && !firstName.isEmpty()){
                   isFirstNameValid=true;
       
               }
               else {
                   System.out.println("first name is invalid. Please provide valid first name");
               }
       
               if (lastName!=null && lastName.length()>=1 && !lastName.isEmpty()){
                   isLastNameValid=true;
               }
               else{
                   System.out.println("last name is invalid, Please provide valid last name");
               }
       
               if (phoneNumber !=null && !phoneNumber.isEmpty() && phoneNumber.length()==10){
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
               if (emailId!=null && !emailId.isEmpty()){
                   isMailValid=true;
               }
               else{
                   System.out.println("mailid is not valid,please provide valid mailid");
               }
       
               if(isFirstNameValid==true && isLastNameValid==true && isPhoneNumberValid==true && isDobValid==true && isGenderValid==true && isMailValid==true){
                   userValid=true;
       
               }
               else {
                   System.out.println("invalid");
               }  
               return userValid;
           
       }
       }
    

