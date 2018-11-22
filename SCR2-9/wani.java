import greenfoot.*;

/**
 * Write a description of class wani here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wani extends Actor
{
    /**
     * Act - do whatever the wani wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}// Add your action code here.
    }    
}
