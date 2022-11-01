package Assignment;
import java.sql.Array;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import helpers.*;

public class Program
{
    public static void main(String[] args)

    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Program , Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
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

ArrayList<Songs>songs = new ArrayList<Songs>();
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
   String removedStr = song.remove(1);
System.out.println(song);
System.out.println(removedStr);
}
  

   
   }


}





    