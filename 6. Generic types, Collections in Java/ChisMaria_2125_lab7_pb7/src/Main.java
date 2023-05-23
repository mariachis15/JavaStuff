import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VirtualLibrary<Publication> virtualLibrary = new VirtualLibrary<>();
        virtualLibrary.addItem(new Magazine("Vogue", "Condé Nast Publications", 2021, "fashion"));
        virtualLibrary.addItem(new Book("Pride and Prejudice", "Jane Austen", 1813, "romance"));
        for (Publication publication : virtualLibrary.getStock()) {
            System.out.println(publication);
        }
        List<Publication> publications = new ArrayList<>();
        publications.add(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954, "SF"));
        publications.add(new Article("Butter and Margarine: What's the difference?", "Kit Chapman", 2023, "RSC Education"));
        publications.add(new MediaResource("Medical Student Outreach Program", "American Medical Association", 2022, "podcast"));
        publications.add(new Magazine("The New Yorker", "Condé Nast Publications", 1985, "American culture"));
        publications.add(new TextBook("Spark Mathematics - Learner's book", "Alex O. Obondi", 2017, 7));
        virtualLibrary.addItems(publications);
        for (Publication publication : publications) {
            System.out.println(publication);
        }
        System.out.println();
        int position = 3;
        System.out.println("The item from position " + position + " is: " + virtualLibrary.getItem(position));
        System.out.println();
        Book newBook = new Book("The of the Rings", "J.R.R. Tolkien", 1954, "SF");
        System.out.println("The object you want to find is: " + newBook);
        if (virtualLibrary.verifyItem(newBook) == true) {
            System.out.println("The object exists in the library.");
        } else System.out.println("The object does not exist in the library.");
    }
}
