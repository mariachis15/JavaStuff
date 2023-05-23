public class Adult extends SetterGetter {
    SetterGetter<String> nameAdultSetterGetter = new SetterGetter<>();
    SetterGetter<Integer> ageAdultSetterGetter = new SetterGetter<>();

    public void setAttribute(int adultAge, String adultName) {
        nameAdultSetterGetter.setAttribute(adultName);
        ageAdultSetterGetter.setAttribute(adultAge);
    }

    public String getAttribute() {
        return nameAdultSetterGetter.getAttribute() + " " + ageAdultSetterGetter.getAttribute();
    }
}
