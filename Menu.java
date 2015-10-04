/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
/**
 *
 * @author Brando
 */
public class Menu extends BasicGameState{
        
    public Menu(int state)
    {
     
    }
    
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException
    {
        
    }
    
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException
    {
        g.drawString("Are you ready to blast some ham!" ,50, 50);
        g.drawRect(50,100,60,120); // x,y, width, height
        
        Image mario = new Image("res\\Mario.png");
        g.drawImage(mario, 200, 100);
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
    {
    }
    
    public int getID()
    {
        return 0;
    }
}
