package com.lucas.simple_factory;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {

    private ShapeFactory shapeFactory;

    @Before
    public void setUp() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void getShape_WhenShapeTypeIsNull_ShouldReturnNull() {
        Shape shape = shapeFactory.getShape(null);
        assertNull("Shape should be null when shapeType is null", shape);
    }

    @Test
    public void getShape_WhenShapeTypeIsCircle_ShouldReturnCircle() {
        Shape shape = shapeFactory.getShape("CIRCLE");
        assertNotNull("Shape should not be null when shapeType is CIRCLE", shape);
        assertTrue("Shape should be an instance of Circle when shapeType is CIRCLE", shape instanceof Circle);
        shape.draw();
    }

    @Test
    public void getShape_WhenShapeTypeIsRectangle_ShouldReturnRectangle() {
        Shape shape = shapeFactory.getShape("RECTANGLE");
        assertNotNull("Shape should not be null when shapeType is RECTANGLE", shape);
        assertTrue("Shape should be an instance of Rectangle when shapeType is RECTANGLE", shape instanceof Rectangle);
        shape.draw();
    }

    @Test
    public void getShape_WhenShapeTypeIsSquare_ShouldReturnSquare() {
        Shape shape = shapeFactory.getShape("SQUARE");
        assertNotNull("Shape should not be null when shapeType is SQUARE", shape);
        assertTrue("Shape should be an instance of Square when shapeType is SQUARE", shape instanceof Square);
        shape.draw();
    }

    @Test
    public void getShape_WhenShapeTypeIsNotRecognized_ShouldReturnNull() {
        Shape shape = shapeFactory.getShape("TRIANGLE");
        assertNull("Shape should be null when shapeType is not recognized", shape);
    }

    @Test
    public void getShape_WhenShapeTypeIsMixedCase_ShouldReturnCorrectShape() {
        Shape shape = shapeFactory.getShape("rEcTangle");
        assertNotNull("Shape should not be null when shapeType is RECTANGLE in mixed case", shape);
        assertTrue("Shape should be an instance of Rectangle when shapeType is RECTANGLE in mixed case", shape instanceof Rectangle);
    }
}
