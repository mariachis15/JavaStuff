public class Main {
    public static void main(String[] args) {

        try {
            Method.a();
        } catch (LittleException e) {
            System.out.println("We got a LittleException exception.");
        }/*catch(SuperException e) {
            System.out.println("We got a SuperException exception.");
        }*/
        try {
            Method.b();
        } catch (SuperException e) {
            System.out.println("We got a SuperException exception.");
        }
    }

}
