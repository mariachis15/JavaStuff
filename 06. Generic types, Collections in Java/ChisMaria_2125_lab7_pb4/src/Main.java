import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> fileTypes = new Hashtable<>();
        //0 - image     1 - text       2 - app
        fileTypes.put("image", ".jpg, .jpeg, .png, .gif");
        fileTypes.put("text", ".txt, .doc, .docx, .pdf");
        fileTypes.put("app", ".exe, .msi, .apk, .dmg");
        for (Map.Entry<String, String> fileType : fileTypes.entrySet()) {
            System.out.println(fileType.getKey() + ": " + fileType.getValue());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the objects: ");
        List<UserFile> files = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            UserFile file = new UserFile();
            file.setName(sc.nextLine());
            file.setExtension(sc.nextLine());
            file.setFileType(sc.nextInt());
            file.setDimension(sc.nextInt());
            sc.nextLine();
            files.add(file);
        }
        files = UserFile.sortByDimension(files);
        for (UserFile file : files) {
            System.out.println(file);
        }
    }
}
