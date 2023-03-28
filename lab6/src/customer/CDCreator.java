package customer;

import java.util.Scanner;
import java.util.Vector;

public class CDCreator {
    Scanner in = new Scanner(System.in);
    int nextMovie;
    int nextMovieCode;
    int nextAlbum;
    int nextAlbumCode;
    Vector<music.CompactDisc> cd = new Vector<music.CompactDisc>();
    Vector<movies.CompactDisc> vcd = new Vector<movies.CompactDisc>();

    void displayAllMusic() {
        for(int i = 0; i < cd.size(); i++) {
            music.CompactDisc cur = cd.get(i);
            System.out.printf("%s\t%s\t%f\t%d\n", cur.title, cur.artist, cur.price, cur.code);
        }
    }
    void displayAllMovies() {
        for(int i = 0; i < cd.size(); i++) {
            movies.CompactDisc cur = vcd.get(i);
            System.out.printf("%s\t%f\t%d\n", cur.title, cur.price, cur.code);
        }
    }
    void addMusicCD() {
        music.CompactDisc req = new music.CompactDisc();
        System.out.print("Music Title: ");
        req.title = in.next();
        System.out.print("Music Artist: ");
        req.artist = in.next();
        System.out.print("Music Price: ");
        req.price = in.nextDouble();
        System.out.print("Music Code: ");
        req.code = in.nextInt();

        cd.add(req);

        System.out.println("Music successfully added");
    }
    void addMovieCD() {
        movies.CompactDisc req = new movies.CompactDisc();
        System.out.print("Movie Title: ");
        req.title = in.next();
        System.out.print("Movie Price: ");
        req.price = in.nextDouble();
        System.out.print("Movie Code: ");
        req.code = in.nextInt();

        vcd.add(req);

        System.out.println("Movie successfully added");
    }
}
