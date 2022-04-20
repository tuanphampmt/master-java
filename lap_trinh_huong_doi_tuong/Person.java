package lap_trinh_huong_doi_tuong;

public class Person {
    String name;
    int age;
    boolean gender;

    public void an() {
        System.out.println(this.name + " dang an");
    }

    public void ngu() {
        System.out.println(this.name + " toi dang ngu");
    }

    public Person(String name, int age, boolean gender) {
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


    public static void main(String[] args) {
        Person p1 = new Person("tuan", 18, true);
        Person p2 = new Person("bin", 17, false);
        p1.an();
        p1.ngu();
        p2.an();
        p2.ngu();
    }
}
