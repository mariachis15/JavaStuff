import java.util.Objects;

public class MediaResource extends Publication {
    String type;

    public MediaResource(String title, String author, int publicationYear, String type) {
        super(title, author, publicationYear);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Media Resource -> " +
                "title: " + title +
                ", author: " + author +
                ", publication year: " + publicationYear +
                ", type: " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaResource that = (MediaResource) o;
        return Objects.equals(title, that.title) && Objects.equals(author, that.author) && Objects.equals(publicationYear, that.publicationYear) && Objects.equals(type, that.type);
    }

}
