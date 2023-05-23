public class Student implements Comparable<Student> {
    private String name;
    private int group;
    private float grade;

    public Student(String name, int group, float grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    public Student() {

    }

    @Override
    public int compareTo(Student student) {
        if (student.getGrade() == this.getGrade()) {
            return this.getName().compareTo(student.getName());
        }
        if (this.getGrade() > student.getGrade()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name + " " + group + " " + grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

}


