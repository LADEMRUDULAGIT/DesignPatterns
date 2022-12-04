package com.axis.iterator.app;

import com.axis.iterator.modal.CollectionofNames;
import com.axis.iterator.modal.Iterator;

public class EmployeeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionofNames cmpnyRepository = new CollectionofNames();  
        
        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){  
            String name = (String)iter.next();  
            System.out.println("Name : " + name);  
         }      
	}
	

}
