package Assignment;
import java.sql.Array;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

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
Songs lynnAnderson = new Songs("RoseGarden", "lynnAnderson", 908765430);
 //lynnanderson.print();
Songs EddyArnold = new Songs("TheCattleCall", "EddyArnold", 987656540);
 //eddy.print();
 Songs Asia = new Songs("HeartOfTheMoment", "Asia", 7865430);
//asia.print();
Songs Ateens = new Songs("UpsideDown", "Ateens", 89765430);
//ateens.print();
Songs Beck = new Songs("Loser", "Beck", 897653456);
   //beck.print();
Songs BikiniKill = new Songs("RebelGirl", "BikiniKill", 7865430);
//bikini.print();

Songs Mariah = new Songs("Hero", "Mariah", 90876540);
   //mariah.print();
   Songs Ray= new Songs("WhatsISay", "Ray", 128764000);
//ray.print();
Songs Eric=new Songs("Layla", "Eric", 678006540);
//Eric.print();
Songs ColdChisel=new Songs("KheSanh", "ColdChisel", 87697630);
//ColdChisel.print();
Songs TheDoors=new Songs("LightMyire", "TheDoors", 890766670);
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
   song.print();
  
    




   //public Songs getsSongs (int i) 
   //{
      
      //for(Songs song:songs);
   
     // if song.getsSongs(playcount>500000);
      //song.print();
   
     //else
     // {
        // return null;
     // }
      
  // }
   

   //String removedStr = song.remove(1);
//System.out.println(song);
//System.out.println(removedStr);

  

}
   
public static Songs remove(String songname)
{
 Songs found = FindBY(songname);
 if (songs !=null) 
 songs.remove(found);
 else
 System.out.println("Could not find song");
}

}





    