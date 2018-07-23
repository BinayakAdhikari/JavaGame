/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author blaze
 */
public class Game
        
        
{
  
    public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      String Choice = "";

      // creating the player will initialize the world
      Player Kirk = new Player("Kirk",'K');

      ArrayList<Enemy> Enemies = new ArrayList<>();
      Enemies.add(new Enemy("Orc",12,2));
      
      while (!Choice.equals("q"))
      {
         Kirk.PrintWorld();
         System.out.println("Enter your command: ");
         Choice = in.nextLine();

         if (Choice.equals("a"))
            Kirk.MoveLeft();
         if (Choice.equals("d"))
            Kirk.MoveRight();
         if (Choice.equals("w"))
            Kirk.MoveUp();
         if (Choice.equals("s"))
            Kirk.MoveDown();
      }
      
      for (int i=0; i<Enemies.size(); i++)
         {
            if ((Enemies.get(i).Ypos == Kirk.Ypos && (Enemies.get(i).Xpos == Kirk.Xpos+1)) || // player is to the left
               (Enemies.get(i).Ypos == Kirk.Ypos && (Enemies.get(i).Xpos == Kirk.Xpos-1)) ||  // player is to the right
               (Enemies.get(i).Xpos == Kirk.Xpos && (Enemies.get(i).Ypos == Kirk.Ypos+1)) ||  // player is above
               (Enemies.get(i).Xpos == Kirk.Xpos && (Enemies.get(i).Ypos == Kirk.Ypos-1)))    // player is below
            {
               Enemies.get(i).HP -= Kirk.Attack;    // Player attacks Enemy
               Kirk.HP -= Enemies.get(i).Attack;    // Enemy attacks Player
               if (Enemies.get(i).HP <= 0)    // Enemy dies    
               {
                  Player.World[Enemies.get(i).Xpos][Enemies.get(i).Ypos] = ' ';
                  Enemies.remove(i);
               }
               
            }
         }
   }
}
  


