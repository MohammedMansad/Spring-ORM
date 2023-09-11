package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentdao=(StudentDao) context.getBean("studentDao");
      
       
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       boolean x=true;
       while(x)
       {
    	   
    	   System.out.println("Press 1 to add new Student");
    	   System.out.println("Press 2  for display all student");
    	   System.out.println("Press 3 for get the details of Single Student");
    	   System.out.println("Press 4 for delete the student");
    	   System.out.println("Press 5 for update Student");
    	   System.out.println("Press 6  for exit");
    	   
    	   try
    	   {
    		   
    		  int input = Integer.parseInt(br.readLine());
    		  switch (input)
    		  {
			case 1:
				//to add new  student
				break;
			case 2:
				//to display all student
				 break;
			case 3:
				//to get the details of single student
				break;
				
			case 4:
				//press 4 for delete the student
				break;
				
			case 5:
				//to update the student
				break;
			case 6:
				//to exit
				
				x=false;
				break;
				
			
			}
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("Invalid input try with another one");
    		   System.out.println(e.getMessage());
    	   }
       }
       
       
       
    }
}
