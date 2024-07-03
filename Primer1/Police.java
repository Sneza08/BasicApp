import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends Person
{
    private String up;
    private String down;
    private String left;
    private String right;
    
    
    public Police(String up,String down,String left,String right)
{
    super(3);
    this.up=up;
    this.down=down;
    this.left=left;
    this.right=right;
    
}   

 /**www
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

      super.act();
      
      if (this.isTouching(Robber.class))    // ako dodje do policajca
        {           
            Greenfoot.stop();   //kraj programa
        }
        
        
    }
    public void movement()
    {
         if (Greenfoot.isKeyDown(this.up))
        {
            this.setRotation(270);
            this.move(1); 
        }
        else if(Greenfoot.isKeyDown(this.down))
        {
            this.setRotation(90);
            this.move(1); 
            
        }
         else if(Greenfoot.isKeyDown(this.left))
        {
            this.setRotation(180);
            this.move(1); 
            
        }
         else if(Greenfoot.isKeyDown(this.right))
        {
            this.setRotation(0);
            this.move(1); 
            
        }
        
    }
}
