import java.util.Objects;

public class TextBook extends Publication {
    static double difficultyLevel;

    public TextBook(String title, String author, int publicationYear, double difficultyLevel) {
        super(title, author, publicationYear);
        this.difficultyLevel = difficultyLevel;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "TextBook -> " +
                "title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                ", difficulty level: " + difficultyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextBook textBook = (TextBook) o;
        return Objects.equals(title, textBook.title) && Objects.equals(author, textBook.author) && Objects.equals(publicationYear, textBook.publicationYear) && Objects.equals(difficultyLevel, textBook.difficultyLevel);
    }
}
