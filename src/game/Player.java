/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author blaze
 */
public class Player {
    
    public int Xpos, Ypos;
    int HP;
    int Attack;
    String Name;
    char Avatar;
    int Armor;
    int Gold;
   static char World[][] = new char[41][21];
    
    
    

    public Player(String kirk, char c) {
    
        
        
       // set entire world to spaces
for (int x=1; x<=40; x++)
   for (int y=1; y<=20; y++)
      World[x][y] = ' ';

// don't forget to put the player into the world
Xpos=2;  Ypos=2;  World[2][2]=Avatar;

// line perimeter of world with trees @
for (int x=1; x<=40; x++)
{  World[x][1] = '@';  World[x][20] = '@';  }
for (int y=1; y<=20; y++)
{  World[1][y] = '@';  World[40][y] = '@';  }

// draw a lake at a random location ~
int a = (int)(Math.random()*30)+4;
int b = (int)(Math.random()*10)+3;
World[a][b] = '~'; World[a+1][b] = '~'; World[a+2][b] = '~';
World[a][b+1] = '~'; World[a+1][b+1] = '~'; World[a+2][b+1] = '~';
World[a][b+2] = '~'; World[a+1][b+2] = '~'; World[a+2][b+2] = '~';
    
}

    Player(String kirk, char c, int i, int i0) {
      
    }

    void PrintWorld() {
        for (int y=1; y<=20; y++)
{
   for (int x=1; x<=40; x++)
   {
      System.out.print(World[x][y]);
      // optionally put a space
      if (x < 40) System.out.print(" ");
   }
   System.out.println();
} //To change body of generated methods, choose Tools | Templates.
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
