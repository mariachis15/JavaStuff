public class Retired extends SetterGetter {
    SetterGetter<String> nameRetiredSetterGetter = new SetterGetter<>();
    SetterGetter<Integer> ageRetiredSetterGetter = new SetterGetter<>();

    public void setAttribute(int ageRetired, String nameRetired) {
        nameRetiredSetterGetter.setAttribute(nameRetired);
        ageRetiredSetterGetter.setAttribute(ageRetired);
    }

    public String getAttribute() {
        return nameRetiredSetterGetter.getAttribute() + " " + ageRetiredSetterGetter.getAttribute();
    }
}
