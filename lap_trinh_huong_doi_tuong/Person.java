package lap_trinh_huong_doi_tuong;

public class Person {
    String name;
    int age;
    boolean gender;

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void getInfo() {
        System.out.println("Tôi tên là: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + (gender? "Nam": "Nữ"));
    }
}
