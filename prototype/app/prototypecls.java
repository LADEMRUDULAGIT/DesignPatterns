package com.axis.prototype.app;

import java.util.Scanner;

import com.axis.prototype.modal.modalcls;

public class prototypecls {
	public static void main(String[] args) {
		 Scanner br=new Scanner(System.in);
	        System.out.print("Enter Employee Id: ");  
	        int eid=Integer.parseInt(br.nextLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Name: ");  
	        String ename=br.nextLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Employee Designation: ");  
	        String edesignation=br.nextLine();  
	        System.out.print("\n");  
	       	          
	        System.out.print("Enter Employee Salary: ");  
	        double esalary= Double.parseDouble(br.nextLine());  
	        System.out.print("\n");  
	           
	        modalcls e1=new modalcls(eid,ename,edesignation,esalary);  
	          
	        e1.showRecord();  
	        e1.show();
	        System.out.println("\n");  
	        modalcls e2=(modalcls) e1.getClone();  
	        e2.showRecord();  
	} 

}
