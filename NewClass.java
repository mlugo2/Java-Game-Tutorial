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
public class NewClass extends StateBasedGame {
    
    public static final String gamename = "Ham Blaster!";
    public static final int menu = 0;
    public static final int play = 1;
    
    public NewClass(String gamename)
    {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }
    
    public void initStatesList(GameContainer gc) throws SlickException
    {
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.enterState(menu);
    }
    
    public static void main(String[] args)
    {
        AppGameContainer appgc;
        try
        {
            appgc = new AppGameContainer(new NewClass(gamename));
            appgc.setDisplayMode(640, 360, false);
            appgc.start();
        }catch(SlickException e)
        {
            e.printStackTrace();
        }
        
    }


    
}