import java.util.Objects;

public class Magazine extends Publication {
    String theme;

    public Magazine(String title, String author, int publicationYear, String theme) {
        super(title, author, publicationYear);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Magazine -> " +
                "title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                ", theme: " + theme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(title, magazine.title) && Objects.equals(author, magazine.author) && Objects.equals(publicationYear, magazine.publicationYear) && Objects.equals(theme, magazine.theme);
    }

}
