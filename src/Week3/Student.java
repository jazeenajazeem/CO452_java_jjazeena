package Week3;

public class Student {
    private int id;
    private String name;

    //constuctor
    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
   //print method
   public void print()
   {
    System.out.println("id"+this.id);
   System.out.println("name"+this.name);
 
}  
   
}
