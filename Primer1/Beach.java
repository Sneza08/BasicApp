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
        
        super(15 ,10, 60); 
        this.prepareTheBeach();
    
       
}
     public void endTheGame(boolean win)
     
     {
        this.removeObjects(this.getObjects(Actor.class));
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
        Greenfoot.delay(40);
        this.showText(null,x,y);
        this.prepareTheBeach();
        Greenfoot.stop();
    }
       public void act()     
       {
         this.counter-- ;   
         if (this.counter==0) {
             this.endTheGame(false);
         }
        }
       private void prepareTheBeach()
       {
           
        this.addObject(new Police("w","s","a","d"), 0,0);
        
        for (int i=0; i <10 ; i++ )
        {
            
        int x=0;
        int y=0;
        while (!this.getObjectsAt(x,y,Actor.class).isEmpty())
        {
            x= Greenfoot.getRandomNumber(this.getWidth());
            y= Greenfoot.getRandomNumber(this.getHeight());
            
        }
        this.addObject(new HiidingSpot(),x,y);
    }
        this.addObject(
        new Robber(),
        Greenfoot.getRandomNumber(this.getWidth()),
        Greenfoot.getRandomNumber(this.getHeight())
        );
        this.counter=500;
        
        }
    }

