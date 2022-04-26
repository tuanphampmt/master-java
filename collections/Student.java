package collections;

public class Student implements Comparable<Student>  {
    String name;
    int age;
    boolean gender;

    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student@name=" + name + ",age=" + age + ",gender=" + gender;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
