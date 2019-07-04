package com.cg.eis.Dao;
import java.util.ArrayList;
import com.cg.eis.bean.Employee;
public class DataLayer {
    ArrayList<Employee> a=new ArrayList<Employee>();
    ArrayList<String> a1=new ArrayList<String>();
    Employee e=new Employee();

 

    public void finalStore(Employee e) 
    
    {  
        a.add(e);
        
    }
    public Employee returnEmployee()
    {
    	Employee e1=(Employee)a.get(0);
    	return e1;
    }
 

    public void addInsurance(String s) 
    {
        a1.add(s);
        
    }
    public String returnInsurance()
    {
        
        String s1=(String)a1.get(0);
        return s1;
        
    }

 


}