import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber extends Person
{
    
    
    public Robber () 
    {
        super(20);
    }
    
    public void movement()
{
    this.setRotation(90*Greenfoot.getRandomNumber(4));
    this.move(1);
}
}
