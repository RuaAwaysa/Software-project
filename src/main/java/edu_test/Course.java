package edu_test;

import java.text.SimpleDateFormat;

public class Course {
	String id ; 
	String name ; 
	String teacherid ; 
       int numofStudent; 
      SimpleDateFormat formatter ;  
      String date ; 
      int numofstudent ;
      int price;

    public Course(String id , String name , String teacherid, String d) {
        this.date = d;
    	this.id = id ;
    	this.name =name ;
    	this.teacherid =teacherid ;

    	this.numofstudent = 30 ; 
    	this.price = 50  ;
    }


}
