package Week3;
import java.sql.Array;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import helpers.*;

public class Week03 
{
    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();
   Student jazeena = new Student( 21104750, "jazeena");
   //jazeena.print();

   Student onkar = new Student(12345678, "onkar");
   //onkar.print();

   Student uthman = new Student(13467895, "uthman");
   //uthuman.print();

   ArrayList<Student> students = new ArrayList<Student>();
   students.add(jazeena);
   students.add(onkar);
   students.add(uthman);
   for(Student student : students)
   {
    student.print();
   }
   
    }  
    
}
