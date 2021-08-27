package javabykiran.SpringBoot_Basics;

import java.util.ArrayList;
import java.util.HashMap;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	
    @RequestMapping("/jbk")
	public String checkMyFirstApi(){
    	 
		return "welcome";
		
	}
    @RequestMapping("/snr")
    public HashMap<Integer, String> showdata(){
    	HashMap<Integer, String>hm=new HashMap<>();
    	
    	   hm.put(1," Shankar");
    	   hm.put(2," Shankar");
    	   hm.put(3," Shankar");
    	   hm.put(4," Shankar");
    	   hm.put(5," Shankar");
    	   
    	   return hm;
    }
    
    @RequestMapping("/studentdata")
    public  ArrayList< ArrayList<Student>>studentDataShow(){
    	
    	ArrayList<Student> al=new ArrayList<>();
    	    al.add(new Student(21, "Lalit"));
    	    al.add(new Student(21, "Lalit"));
    	    al.add(new Student(21, "Lalit"));
    	    al.add(new Student(21, "Lalit"));
    	    al.add(new Student(21, "Lalit"));
    	    
      System.out.println(al);
    	    
    	    ArrayList<Student> al1=new ArrayList<>();
    	    al1.add(new Student(21, "Lalit"));
    	    al1.add(new Student(21, "Lalit"));
    	    al1.add(new Student(21, "Lalit"));
    	    al1.add(new Student(21, "Lalit"));
    	    al1.add(new Student(21, "Lalit"));
    	    
    	    ArrayList< ArrayList<Student>> alstu=new ArrayList<>();
    	          alstu.add(al);
    	          alstu.add(al1);
    	          
    	          return  alstu;
    }
    
    
  @RequestMapping("/sss")
    public ArrayList<Integer> employeeDataShow(){
		
		ArrayList<Integer> ll=new ArrayList<>();
		   ll.add(100);
		   ll.add(200);
		   ll.add(300);
		   ll.add(400);
		   ll.add(500);
		   
		   return ll;
		   
	}
    
  @RequestMapping("/nnn")
    public ArrayList<Integer> personData(){
		
		ArrayList<Integer> ll1=new ArrayList<>();
		   ll1.add(111);
		   ll1.add(222);
		   ll1.add(333);
		   ll1.add(444);
		   ll1.add(555);
		   
		   return ll1;
		   
	}
    
  @RequestMapping("/rrr")
    public ArrayList<Integer> peopleData(){
		ArrayList<Integer> ll2=new ArrayList<>();
		   ll2.add(122);
		   ll2.add(233);
		   ll2.add(344);
		   ll2.add(455);
		   ll2.add(566);
		   
		   return ll2;
		   
	}
  
  
  public void getDataFromDB(){
	  
  }
  
  
  
  
  
  
  
  
  
  
  
    
}
