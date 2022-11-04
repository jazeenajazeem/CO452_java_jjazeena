package Assignment;
import java.sql.Array;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner14;

import helpers.*;

public class Program
{
   public static ArrayList<Songs> songs;
    public static void main(String[] args)

    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("Jazeena's Song Lists");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" CO452/2 programming Concepts ");
        System.out.println();
        System.out.println(" CW1 Assignment");
        System.out.println();
Songs lynnAnderson = new Songs("RoseGarden", "lynnAnderson", 8765430);
 //lynnanderson.print();
Songs EddyArnold = new Songs("TheCattleCall", "EddyArnold", 7656540);
 //eddy.print();
 Songs Asia = new Songs("HeartOfTheMoment", "Asia", 7865430);
//asia.print();
Songs Ateens = new Songs("UpsideDown", "Ateens", 9765430);
//ateens.print();
Songs Beck = new Songs("Loser", "Beck", 653456);
   //beck.print();
Songs BikiniKill = new Songs("RebelGirl", "BikiniKill", 865430);
//bikini.print();

Songs Mariah = new Songs("Hero", "Mariah", 876540);
   //mariah.print();
   Songs Ray= new Songs("WhatsISay", "Ray", 8764000);
//ray.print();
Songs Eric=new Songs("Layla", "Eric", 8006540);
//Eric.print();
Songs ColdChisel=new Songs("KheSanh", "ColdChisel", 7697630);
//ColdChisel.print();
Songs TheDoors=new Songs("LightMyire", "TheDoors", 2766670);
//theDoors.print();

songs = new ArrayList<Songs>();

   songs.add(lynnAnderson);
   songs.add(EddyArnold);
   songs.add(Asia);
   songs.add(Ateens);
   songs.add(Beck);
   songs.add(BikiniKill);
   songs.add(Mariah);
   songs.add(Ray);
   songs.add(Eric);
   songs.add(ColdChisel);
   songs.add(TheDoors);

 
   for(Songs song:songs)
   
   {
   song.print();
   }
  
   
   System.out.println("Attempt to remove song 1 and 6:");
   songs.remove(1);
   songs.remove(6);


   for(Songs song:songs)
   {
   song.print();
   }

} 
   public static void playcount() 
   {
       
   //int choice = InputReader.getInt("/n select the songs (playcount<1000000)");
      int playcount = 0;
      for(Songs song:songs)
      {
         if (playcount > 1000000);
        
          song.print();
          playcount++;    
      }
   }
        
}
  