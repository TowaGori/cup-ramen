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
<<<<<<< HEAD
       if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
}
 // Add your action code here.
=======
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(270);
        move(1);
}
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(1);
}// Add your action code here.
>>>>>>> cff37f96c5e52e3bc7c33fc6e212fd5afdf085b1
    }    
}
