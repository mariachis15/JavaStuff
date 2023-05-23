public class Method {
    public static void a() throws LittleException {
        throw new LittleException();
    }

    public static void b() throws SuperException {
        throw new SuperException("A LittleException exception was generated.");
    }
}

