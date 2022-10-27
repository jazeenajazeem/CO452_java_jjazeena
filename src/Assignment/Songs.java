package Assignment;

public class Songs {
    private String songname;
    private String artistname;
    private int playcount;
     
     //constuctor
     public Songs(String songname, String artistname, int playcount)
     {
        this.songname = songname;
        this.artistname = artistname;
        this.playcount = playcount;
     }
     //print method
     public void print()
     {
        System.out.println("songname"+this.songname);
        System.out.println("\tartistname"+this.artistname);
        System.out.println("\tplaycount"+this.playcount);
     }
        
    }

