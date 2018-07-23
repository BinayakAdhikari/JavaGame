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
public class GameObject {
    static char World[][] = new char[41][21];
    int Xpos, Ypos;
    char Avatar;
    
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

