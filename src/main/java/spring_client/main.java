package spring_client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_model.Employee;

public class main{
	public static void main (String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("application_context.xml");
		Employee bean=ioc.getBean("e1",Employee.class);
		System.out.println(bean);
		
//		Employee bean1=ioc.getBean("e2",Employee.class);
//		System.out.println(bean1);
		
		
		// or we can written as 
		
//		Employee bean2=ioc.getBean("e3",Employee.class);
//		bean2.setId(3);
//		bean2.setName("Bean2");
//		bean2.setGender("malee3");
//		System.out.println(bean2);
//		System.err.println();
		
		
		// input by user
		// or we can written as 
//		System.out.println("Enter the ID");
//		Scanner sc=new Scanner(System.in);
//		int id=sc.nextInt();
//		
//		System.out.println("enter the name");
//		Scanner scc=new Scanner(System.in);
//		String name=scc.nextLine();
//		System.out.println("enter the Gender");
//		Scanner sccc=new Scanner(System.in);
//		String gender=sccc.nextLine();
//		
//		Employee bean3=ioc.getBean("e3",Employee.class);
//		bean3.setId(id);
//		bean3.setName(name);
//		bean3.setGender(gender);
//		System.out.println(bean2);
		
		System.out.println("are you want to add more data YES press1 / or 2 NO");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
//		String isJavaFun=input;
//		boolean isJavaFun = true;
//		boolean isFishTasty = false;
		
		if(input==1){
			int i=0;
			for(i=1;i<=10;i++) {
				System.out.println("Enter the ID");
				Scanner ssc=new Scanner(System.in);
				int id=ssc.nextInt();
				
				System.out.println("enter the name");
				Scanner scc=new Scanner(System.in);
				String name=scc.nextLine();
				System.out.println("enter the Gender");
				Scanner sccc=new Scanner(System.in);
				String gender=sccc.nextLine();
				
				Employee bean3=ioc.getBean("e3",Employee.class);
				bean3.setId(id);
				bean3.setName(name);
				bean3.setGender(gender);
				System.out.println(bean3);
				System.out.println();
			}
		}
		else {
			System.out.println("Thankyou your program has been succesfull completed");
		}
	}
//	System.out.println(bean3);
	
}