import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class UserFile {
    private String name;
    private String extension;
    private int fileType;
    private int dimension;

    public UserFile() {

    }

    public UserFile(String name, String extension, int fileType, int dimension) {
        this.name = name;
        this.extension = extension;
        this.fileType = fileType;
        this.dimension = dimension;
    }

    public static List<UserFile> sortByDimension(List<UserFile> files) {
        for (int i = 0; i < files.size() - 1; i++) {
            for (int j = i + 1; j < files.size(); j++) {
                if (files.get(i).getDimension() > files.get(j).getDimension()) {
                    Collections.swap(files, i, j);
                }
            }
        }
        return files;
    }

    @Override
    public String toString() {
        return "UserFile -> " +
                "name : " + name +
                ", extension: " + extension +
                ", fileType : " + fileType +
                ", dimension : " + dimension;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getFileType() {
        return fileType;
    }

    public void setFileType(int fileType) {
        this.fileType = fileType;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
