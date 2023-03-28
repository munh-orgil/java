package customer;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int choice;
        CDCreator cdCreator = new CDCreator();
        while(!exit) {
            System.out.println("1. Add a new Music CD to the collection");
            System.out.println("2. Add a new Movie CD to the collection");
            System.out.println("3. Display all music CD's in the collection");
            System.out.println("4. Display all Movie CD's in the collection");
            System.out.println("5. Exit the application");
            choice = in.nextInt();
            switch(choice){
                case 1: {
                    cdCreator.addMusicCD();
                    break;
                }
                case 2: {
                    cdCreator.addMovieCD();
                    break;
                }
                case 3: {
                    cdCreator.displayAllMusic();
                    break;
                }
                case 4: {
                    cdCreator.displayAllMovies();
                    break;
                }
                case 5: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Wrong input!");
                }
            }
        }
        in.close();
    }
}
