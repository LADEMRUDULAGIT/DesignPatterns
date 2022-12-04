package com.axis.singleton.app;

import com.axis.singleton.modal.Singleton;

public class SingletonPatterrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj=Singleton.createobj();
		Singleton obj1=Singleton.createobj();
		obj.msg();
		obj1.msg();
		System.out.println(obj.hashCode()+" "+obj1.hashCode());
	}

}
