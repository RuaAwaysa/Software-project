package edu_test;


import java.util.logging.Logger;
public class Admin {
	 private static final Logger logger = Logger.getLogger("mylogger");
	  String name;
	String password;
	String gmail;
		String id;
		String phone;
  center c=new center();
	 ExtraService e;
    boolean logstate=true;
    String str="Admin login is required";
   String str2= "alrey Exisit";
   String str3="Student ";
   String str4=" registered succefully";
   String str5="res =";
	StringBuilder res;
   public Admin() {
	   
	   
   }
   
   
   
   public Admin(String name , String passw, String gmail , String id) {
	this.name=name;
	this.password=passw;
	this.gmail=gmail;
	this.id=id;
	
} 
  

	public String Admin(Admin u) {
		
		if(!logstate) {
			
			return str;
		}
		else {
			for(int i=0;i<c.students.size();i++) {
				if(u.id.equals(c.students.get(i).id)) {
			        

					return str2 ;
				}
			}
			c.adminlisttable.add(u);
			
			return "user registered succefully";
		}
		
	}
  
  
  
  
  public String login(String name , String password) {
	   
  
	   
    for(int i=0;i<c.adminlisttable.size();i++)
    {
    	if((name.equals(c.adminlisttable.get(i).name)) && (password.equals(c.adminlisttable.get(i).password )) ) {
    
				c.adminlisttable.get(i).logstate = true;
			
				return "login success";
				
		    
	}
    	else if((name.equals(c.adminlisttable.get(i).name)) && !(password.equals(c.adminlisttable.get(i).password )))
{
	c.adminlisttable.get(i).logstate = false;
	 return "login fails";
		
    }
 
  }
 return "login fails";
 
 
  }
  
  String addcourse(Course crs) {
		if(!logstate) {
			
			return str;
		}
		else {
			for(int i=0;i<c.courses.size();i++) {
				if(crs.id.equals(c.courses.get(i).id)) {
			
       return "Student "+crs.name +str2;
				}
			}
		c.courses.add(crs);
		
			return str3 + crs.name + str4;
		}
		
	
		
	}

  
	
public String registerstudent(Student s) {
		
		if(!logstate) {
			
			return str;
		}
		else {
			for(int i=0;i<c.students.size();i++) {
				if(s.id.equals(c.students.get(i).id)) {
			

					return str3+s.name +str2;
				}
			}
		c.students.add(s);
		
			return str3 + s.name + str4;
		}
		
	}

public String registerteacher(Teacher t) {
	
	if(!logstate) {
		
		return "Admin login is required";
	}
	else {
		for(int i=0;i<c.teachers.size();i++) {
			if(t.id.equals(c.teachers.get(i).id)) {
		

				return "Teacher "+t.name +str2;
			}
		}
	c.teachers.add(t);
	
		return "Teacher " + t.name + str4;
	}
	
}

public String search (Admin adm) {

	for(int i=0;i<c.adminlisttable.size();i++) {
		if(adm.id.equals(c.adminlisttable.get(i).id)) {
			return "Admin "+adm.name+str4;}
		}	
	return "Admain "+adm.name+ str2;
}

public String showservice() {
	
	res = new StringBuilder();
	for(int i=0; i<c.service.size();i++) {

		res.append("|").append(c.service.get(i).id).append("|").append(c.service.get(i).name)
		   .append("|").append(c.service.get(i).price).append("|-");

	
	}
	
    logger.info(str5+res);
	
	return res.toString();
}
public String showstudent() {
	StringBuilder resl= new StringBuilder();

	for(int i=0; i<c.students.size();i++) {

		resl.append(c.students.get(i).id).append("|").append(c.students.get(i).name)
		   .append("|").append(c.students.get(i).password).append("|").append(c.students.get(i).email)
		   .append("|").append(c.students.get(i).classdegree).append("|").append(c.students.get(i).phone)
		   .append("|").append(c.students.get(i).address).append("-");
	
	
	}
	

	return resl.toString();
}


public StringBuilder showTeacher() {
	StringBuilder resl1 = new StringBuilder();
	for(int i=0; i<c.teachers.size();i++) {
	
		resl1.append("|").append(c.teachers.get(i).id).append("|").append(c.teachers.get(i).name)
		   .append("|").append(c.teachers.get(i).password).append("|").append(c.teachers.get(i).id)
		   .append("|").append(c.teachers.get(i).phone).append("|-");

	}
	
	 logger.info(str5+resl1);
	return res;
}



public String searchService(String string) {

	for(int i=0;i<c.service.size();i++) {
		if(c.service.get(i).id.equals(string)) {
			return "Not ADDED";}
		}	
	return  "ADDED SUCSSECFULLY";
}

public void addextraservice(String ide ,String namee  , String pricee) {
	
 e=new ExtraService(ide , namee ,pricee);
 
 c.service.add(e); 
	}


 
}
















