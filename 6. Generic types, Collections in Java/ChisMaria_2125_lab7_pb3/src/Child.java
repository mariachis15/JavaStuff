public class Child {
    SetterGetter<String> nameChildSetterGetter = new SetterGetter<>();
    SetterGetter<Integer> ageChildSetterGetter = new SetterGetter<>();

    public void setAttribute(int childAge, String childName) {
        nameChildSetterGetter.setAttribute(childName);
        ageChildSetterGetter.setAttribute(childAge);
    }

    public String getAttribute() {
        return nameChildSetterGetter.getAttribute() + " " + ageChildSetterGetter.getAttribute();
    }
}

