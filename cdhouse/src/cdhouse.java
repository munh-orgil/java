import java.util.Scanner;
public class cdhouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int choice;
        cd CD = new cd();
        while(!exit) {
            System.out.println("1. Add CD to the catalog");
            System.out.println("2. Search CD by CD title");
            System.out.println("3. Display the catalog");
            System.out.println("4. Exit");
            choice = in.nextInt();
            switch(choice){
                case 1: {
                    CD.AddCD();
                    break;
                }
                case 2: {
                    CD.SearchCD();
                    break;
                }
                case 3: {
                    CD.ListCD();
                    break;
                }
                case 4: {
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
