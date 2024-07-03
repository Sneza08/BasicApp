import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{

    private int counter;
    
    public Beach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15 ,10, 60); 
        this.addObject(new Police("w","s","a","d"), 0,0);
        //this.addObject(new Police("up","down","left","right"), 1,1);
        this.addObject(
        new Robber(),
        Greenfoot.getRandomNumber(this.getWidth()),
        Greenfoot.getRandomNumber(this.getHeight()));
    
       this.counter=100;
}
     public void endTheGame(boolean win)
     
     {
        int x=this.getWidth()/2;
        int y=this.getHeight()/2;
        String message;
        if (win) {
            message= "The Robber was caught. You won!";
        }else
        {
         message = "The Robber escaped. You lost!";
        }
        this.showText(message, x,y);
        Greenfoot.stop();
    }
       public void act()     
       {
         this.counter-- ;   
         if (this.counter==0) {
             this.endTheGame(false);
         }
        }
       
    }

