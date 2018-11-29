/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author jasonfujii
 */
public class Circle extends Shape{
    private int radius; //length of the radius
    
    //For instantialization without parameters, radius becomes 1 and call the no-argument superclass constructor
    public Circle()
    {
        super();
        radius = 1;
    }
    
    //When parameters are given, call the superclass constructor and radius will be the input
    public Circle(int x, int y, int r)
    {
        super(x, y);
        radius = r;
    }
    
    //accessor methods
    public int getRadius()
    {
        return radius;
    }
    
    //calculates the area of the circle
    public double area()
    {
        return radius * radius * 3.1415;
    }
    
    //displays the circle in String form. Contains the shape type, x and y coordinates, and radius
    public String display()
    {
        return "Circle has a radius of " +radius+ " and originates at (" +super.getX()+ ", " + super.getY() + ").";
    }
}
