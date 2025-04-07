package com.xworkz.calenderapp.calendar;

import com.xworkz.calenderapp.constants.Days;
import com.xworkz.calenderapp.meetings.Meetings;

public class Calendar {
    public Days days;
    public Meetings meeting;

    public void displayDetails(){

        System.out.println("meeting day is: "+days);
        System.out.println("meeting details are: ");
        meeting.displayDetails();
    }

}
