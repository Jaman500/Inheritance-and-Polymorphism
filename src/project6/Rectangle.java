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
public class Rectangle extends Shape{
    private int width;      //variable for the width of the rectangle
    private int height;     //variable for the height of the rectangle
    
    //no-arg constructor. Calls the super and makes class specific variables 1
    public Rectangle()
    {
        super();
        width = 1;
        height = 1;
    }
    
    //constructor. Calls super constructor and sets class specific variables to user input
    public Rectangle(int x, int y, int h, int w)
    {
        super(x, y);
        width = w;
        height = h;
    }
    
    //accessor methods
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    //mutator methods
    public void setWidth(int w)
    {
        width = w;
    }
    
    public void setHeight(int h)
    {
        height = h;
    }
    
    //displays the rectangle as text. Displays the shape type, x and y coordinates,
    //height, and width values
    public String display()
    {
        return "Rectangle has a height of " +height+ ", a width of " +width+ ", and an origin at ("
                +super.getX()+ ", "+ super.getY()+ ").";
    }
    
    //returns the area of the rectangle
    public double area()
    {
        return height * width;
    }
}
