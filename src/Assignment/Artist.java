package Assignment;

public class Artist {
    private String songname;
    private String Artistname;
    private int playcount;
     
     //constuctor
     public Artist(String songname, String Artistname, int playcount)
     {
        this.songname = songname;
        this.Artistname = Artistname;
        this.playcount = playcount;
     }
     //print method
     public void print()
     {
        System.out.println(("songname"+this.songname));
        System.out.println("Artistname"+this.Artistname);
        System.out.print("playcount"+this.playcount);
     }
        
    }

