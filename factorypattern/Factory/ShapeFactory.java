package com.axis.fsd.Factory;

import com.axis.fsd.Models.Circle;
import com.axis.fsd.Models.Rectangle;
import com.axis.fsd.Models.Shape;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		return null;
	}
}
