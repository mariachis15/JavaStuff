import java.util.Objects;

public class Book extends Publication {
    String category;

    public Book(String title, String author, int publicationYear, String category) {
        super(title, author, publicationYear);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book -> " +
                "title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                ", category: " + category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publicationYear, book.publicationYear) && Objects.equals(category, book.category);
    }

}
