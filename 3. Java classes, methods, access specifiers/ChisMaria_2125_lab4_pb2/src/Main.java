public class Main {
    public static void main(String[] args) {
        char[] array = {'r', 'a', 'i', 'n'};
        String object = "Flower";
        int integer = 4;
        X x = new X(array, object, integer);
        System.out.println("Print the attributes of the object:");
        for (int i = 0; i < x.getArray().length; i++) {
            System.out.print(x.getArray()[i] + " ");
        }
        System.out.println();
        System.out.println(x.object);
        System.out.println(x.integer);

        x.finalize();

        X x1 = new X(array, object, integer);
        x1.object = "Pizza";
        x1.integer = 9;
        x1.setArray(new char[]{'f', 'o', 'o', 'd'});
        for (int j = 0; j < x1.getArray().length; j++) {
            System.out.print(x1.getArray()[j] + " ");
        }
        System.out.println();
        System.out.println(x1.object);
        System.out.println(x1.integer);

    }

}
