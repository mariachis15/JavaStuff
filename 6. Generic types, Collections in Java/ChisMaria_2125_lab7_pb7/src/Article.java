import java.util.Objects;

public class Article extends Publication {
    String source;

    public Article(String title, String author, int publicationYear, String source) {
        super(title, author, publicationYear);
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Article -> " +
                "title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                ", source: " + source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(title, article.title) && Objects.equals(author, article.author) && Objects.equals(publicationYear, article.publicationYear) && Objects.equals(source, article.source);
    }

}
