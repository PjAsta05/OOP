import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        //setRotation(180);
    }
    
    public Enemy(int speed){
        setRotation(180);
        this.speed = speed;
    }
    public int speed = 3;
    public void act()
    {
        // Add your action code here.
        // setRotation(90);
        moveEnemy();
        removeEnemy();
        shootBullet();
        //resetPosition();
        //move(speed);
    }
    public void moveEnemy(){
        turn(60);
        move(speed);
        getX();
        getY();
        setLocation(getX()-speed,getY());
    }
    public void removeEnemy(){
        if (getX()==0){
            getWorld().removeObject(this);
        }
    }
    int bulletCount = 0;
    public void shootBullet(){
        bulletCount++;
        if (bulletCount==20){
            EnemyBullet bullet = new EnemyBullet();
            getWorld().addObject (bullet, getX()+50,getY());
            bulletCount = 0;
        }
    }
}
