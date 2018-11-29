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
public class Triangle extends Shape{
    private int base;       //holds the value for the base
    private int height;     //holds the value for the height
    
    //no-arg constructor. Calls super constructor and sets base and height to 1
    public Triangle()
    {
        super();
        base = 1;
        height = 1;
    }
    
    //arg constructor. Calls super constructor and sets base and height to the user input
    public Triangle(int x, int y, int h, int b)
    {
        super(x, y);
        height = h;
        base = b;
    }
    
    //accessor methods
    public int getHeight()
    {
        return height;
    }
    
    public int getBase()
    {
        return base;
    }
    
    //mutator methods
    public void setHeight(int h)
    {
        height = h;
    }
    
    public void setBase(int b)
    {
        base = b;
    }
    
    //Displays the triangle. Displays shape type, x and y coordinates, height, and base values
    public String display()
    {
        return "Triangle has a height of " +height+ ", a base of " +base+
                ", and an origin at (" +super.getX()+ ", " +super.getY()+ ").";
    }
    
    //calculates and returns the area of the triangle
    public double area()
    {
        return (base * height)/2.0;
    }
}
