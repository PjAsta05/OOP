import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveHero1();
        resetPosition();
    }
    
    public void moveHero(){
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX()-3,getY());
        }
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX()+3,getY());
        }
        
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-3);
        }
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+3);
        }
    }
    
    public void moveHero1(){
        if (Greenfoot.isKeyDown("a")){
            turn(-05);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(+5);
        }
        
        if (Greenfoot.isKeyDown("w")){
            move(+5);
        }
        if (Greenfoot.isKeyDown("s")){
            move(-5);
        }
    }
    
    public void resetPosition(){
        if (getX()==799){
            setLocation(1,getY());
        }
        if (getX()==0){
            setLocation(798,getY());
        }
        if (getY()==599){
            setLocation(getX(),1);
        }
        if (getY()==0){
            setLocation(getX(),598);
        }
    }
}
