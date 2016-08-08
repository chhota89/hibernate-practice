package com.bridgelabz.hibernatepractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bridgelabz.hibernateutil.HibernateUtility;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.ClientAppts;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.StockDailyRecord;
import com.bridgelabz.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//creating configuration  
    	 Session session=new AnnotationConfiguration()  
    	         .configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
    	 Transaction t=session.beginTransaction();  

    	 //Save the data in database.
        /*Student student = new Student();  
        student.setFirstName("Bob");  
        student.setAge(26);  
          
        session.save(student);  
        t.commit();  */
    	 
    	 
    	 //Display student
    	 /*List<Student> students = session.createQuery("from Student").list(); 
          for(Student stu:students){
        	  System.out.println(stu.getFirstName()+"  "+stu.getAge());
          }*/
    	 
    	 //Update the student object
    	 /*Student student = (Student) session.get(Student.class, 3);  
         student.setFirstName("Zet");  
         student.setAge(45);   
         session.update(student);
         t.commit();*/
    	 
    	 //Delete the student object
    	 /*Student student = (Student) session.get(Student.class, 3);   
         session.delete(student);
         t.commit();*/
    	 
    	 //Search the query 
    	 /*String hql = "from Student as o where o.firstName=?";
    	 Query query = session.createQuery(hql);
    	 query.setParameter(0, "Bob1");
    	 List<Student> results = query.list();
    	 for(Student stu:results){
       	  System.out.println(stu.getFirstName()+"  "+stu.getAge());
         }*/
         
    	 //One to One hibernate mapping.
    	 /*Appointment a1=new Appointment();
    	 a1.setAppoientment_type("Ortho");
    	 
    	 ClientAppts c1=new ClientAppts();
    	 c1.setName("Mohmad");
    	 c1.setAppointment(a1);
    	  
    	 session.save(c1);  
         t.commit();*/
    	 
    	 
    	 Stock stock=new Stock();
    	 stock.setStockCode("R122");
    	 stock.setStockName("Nokia");
    	 session.save(stock);
    	 
    	 StockDailyRecord stockDailyRecord1=new StockDailyRecord();
    	 stockDailyRecord1.setPriceOpen(12.12f);
    	 stockDailyRecord1.setStock(stock);
    	 stockDailyRecord1.setDate(new Date());
    	 session.save(stockDailyRecord1);
    	 
    	 StockDailyRecord stockDailyRecord2=new StockDailyRecord();
    	 stockDailyRecord2.setPriceOpen(10.0f);
    	 stockDailyRecord2.setStock(stock);
    	 stockDailyRecord2.setDate(new Date());
    	 session.save(stockDailyRecord2);
    	    	 
    	 List<StockDailyRecord> set=new ArrayList<>();
    	 set.add(stockDailyRecord1);
    	 set.add(stockDailyRecord2);
    	 
    	 //stock.setStockDailyRecords(set);
    	 t.commit();
    	 
    	 Stock stockdet = (Stock) session.get(Stock.class, 1);
    	 System.out.println(stockdet.getStockCode()+" "+stockdet.getStockName());
    	 //System.out.println(stockdet.getStockDailyRecords().get(0).getPriceOpen());
         
        session.close();  
        
    }
}
