package com.xworkz.passportapp.passport;

import com.xworkz.passportapp.constants.Area;
import com.xworkz.passportapp.constants.Location;

public class Passport {
    private Location location;
    private Area area;
    private String firstName;
    private String lastName;
    private String dob;
    private String email;
    private String userId;

    private String pwd;
    private String confirmPwd;
    private String securityQuestion;
    private String securityAnswer;
    private String captcha;

     public void setLocation(Location location)
     {
        this.location=location;
    }
    public Location getLocation()
    {
        return location;
    }
    public void setArea(Area area)
    {
        this.area=area;
    }
    public Area getArea()
    {
        return area;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setDob(String dob)
    {
        this.dob=dob;
    }
    public String getDob()
    {
        return dob;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setUserId(String userId)
    {
        this.userId=userId;
    }
    public String getUserId()
    {
        return userId;
    }
    public void setPwd(String pwd)
    {
        this.pwd=pwd;
    }
    public String getPwd()
    {
        return pwd;
    } public void setConfirmPwd(String confirmPwd)
    {
        this.confirmPwd=confirmPwd;
    }
    public String getConfirmPwd()
    {
        return confirmPwd;
    }
    public void setSecurityQuestion(String securityQuestion)
    {
        this.securityQuestion=securityQuestion;
    }
    public String getSecurityQuestion()
    {
        return securityQuestion;
    }
    public void setSecurityAnswer(String securityAnswer)
    {
        this.securityAnswer=securityAnswer;
    }
    public String getSecurityAnswer()
    {
        return securityAnswer;
    }
    public void setCaptcha(String captcha)
    {
        this.captcha=captcha;
    }
    public String getCaptcha()
    {
        return captcha;
    }


}


