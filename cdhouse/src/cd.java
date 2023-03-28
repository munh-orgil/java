import java.util.Scanner;
import java.util.Vector;
public class cd {
    Scanner in = new Scanner(System.in);
    Vector<cd> cds = new Vector<cd>();
    
    String cdCollectionName;
    String cdType;
    String cdTitle;
    Float cdPrice;
    int cdId;
    String releasedDate;

    int cdLimit = 10;
    public void AddCD() {
        if(cds.size() >= cdLimit) {
            System.out.println("Unable to add CD");
            return;
        }
        cd req = new cd();
        System.out.print("Collection name: ");
        req.cdCollectionName = in.next();
        System.out.print("CD Type: ");
        req.cdType = in.next();
        System.out.print("CD Title: ");
        req.cdTitle = in.next();
        System.out.print("CD Price: ");
        req.cdPrice = in.nextFloat();
        System.out.print("CD ID: ");
        req.cdId = in.nextInt();
        System.out.print("Released Date: ");
        req.releasedDate = in.next();

        cds.add(req);
        System.out.println("Successfully added to the catalog!");
    }

    public void SearchCD() {
        System.out.print("Search Text: ");
        String searchText = in.next();

        for(int i = 0; i < cds.size(); i++) {
            cd cur = cds.get(i);

            if(cur.cdTitle.equals(searchText)) {
                System.out.printf("Collection name: %s\n", cur.cdCollectionName);
                System.out.printf("CD Type: %s\n", cur.cdType);
                System.out.printf("CD Title: %s\n", cur.cdTitle);
                System.out.printf("CD Price: %f\n", cur.cdPrice);
                System.out.printf("CD ID: %d\n", cur.cdId);
                System.out.printf("Released Date: %s\n", cur.releasedDate);
            }
        }
    }

    public void ListCD() {
        for(int i = 0; i < cds.size(); i++) {
            cd cur = cds.get(i);

            System.out.printf("Collection name: %s\n", cur.cdCollectionName);
            System.out.printf("CD Type: %s\n", cur.cdType);
            System.out.printf("CD Title: %s\n", cur.cdTitle);
            System.out.printf("CD Price: %f\n", cur.cdPrice);
            System.out.printf("CD ID: %d\n", cur.cdId);
            System.out.printf("Released Date: %s\n", cur.releasedDate);
        }
    }
}
