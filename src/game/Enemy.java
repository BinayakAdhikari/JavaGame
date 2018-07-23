/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import static game.GameObject.World;

/**
 *
 * @author blaze
 */
public class Enemy {

    static Object get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int X, Y;
    char Avatar;
    String Race;
    int HP;
    int Attack;
    int Armor;
    int Xpos;
    int Ypos;

    public Enemy(String Race, int X, int Y) {
        this.X = X;
        this.Y = Y;
        this.Race = Race;
        
      
        
    }
    
    public static void main(String[] args)
            
   {
      Enemy E1 = new Enemy("Orc",8,2);
      Enemy E2 = new Enemy("Troll",5,5);
      Enemy E3 = new Enemy("Dragon",9,9);

      System.out.println("There's a " + E1.Race + " with " + E1.HP + " HP at " + E1.X + "," + E1.Y);
      System.out.println("There's a " + E2.Race + " with " + E2.HP + " HP at " + E2.X + "," + E2.Y);
      System.out.println("There's a " + E3.Race + " with " + E3.HP + " HP at " + E3.X + "," + E3.Y);
      
      
   }
    
    
    

     void MoveLeft() {
         if (World[Xpos+1][Ypos] == ' ')
{
   World[Xpos][Ypos] = ' ';
   Xpos++;
   World[Xpos][Ypos] = Avatar;
}
    }

    void MoveRight() {
        if (World[Xpos+1][Ypos] == ' ')
{
   World[Xpos][Ypos] = ' ';
   Xpos++;
   World[Xpos][Ypos] = Avatar;
}
    }

    void MoveUp() {
        if (World[Xpos+1][Ypos] == ' ')
{
   World[Xpos][Ypos] = ' ';
   Xpos++;
   World[Xpos][Ypos] = Avatar;
} 
    }

    void MoveDown() {
        if (World[Xpos+1][Ypos] == ' ')
{
   World[Xpos][Ypos] = ' ';
   Xpos++;
   World[Xpos][Ypos] = Avatar;
}
    }
    
    
    
    
}
