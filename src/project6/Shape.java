/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;

/**
 *
 * @author jasonfujii
 * An abstract class in to blueprint other classes
 */
public abstract class Shape {
    private int x; //x-coordinant for the shape
    private int y; //y-coordinant for the shape
    
    public Shape()
    {
        x = 0;      //For an instantialization in which no parameters are input, the x and y coordinates
        y = 0;      //will both be at the origin
    }
    
    public Shape(int x, int y)
    {
        this.x = x;     //For an instantialization in which parameters are input, those will be the 
        this.y = y;     //x and y coordinates
    }
    
    public int getX()   //getX() and getY() are accessor methods
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void setX(int x2)    //mutator methods
    {
        x = x2;
    }
    
    public void setY(int y2)
    {
        y = y2;
    }
    
    //abstract methods which will be implemented in the subclasses
    public abstract double area();          //calculate and return a double of the area.
    public abstract String display();   //displays the shape
}
