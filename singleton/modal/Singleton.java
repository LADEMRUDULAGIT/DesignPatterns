package com.axis.singleton.modal;

public class Singleton {
	private static Singleton obj=null;
	private Singleton() {}
    public static Singleton createobj() {
		if(obj==null) {
			obj=new Singleton();
		}
		return obj;
	}
    public void msg() {
    	System.out.println("this is singletoncls");
    }
}
