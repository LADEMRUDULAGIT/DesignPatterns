package com.axis.fsd.App;

import com.axis.fsd.Factory.ShapeFactory;
import com.axis.fsd.Models.Shape;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============Factory Pattern============");
		ShapeFactory factory=new ShapeFactory();
		Shape shape=factory.getShape("rectangle");
		shape.draw();
	}

}
