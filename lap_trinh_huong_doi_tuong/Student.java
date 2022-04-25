package lap_trinh_huong_doi_tuong;

public class Student extends Person {
    private String uni;
    public Student(String name, int age, boolean gender, String uni) {
        super(name, age, gender);
        this.uni = uni;
    }


    public void getInfo() {
        super.getInfo();
        System.out.println("Tôi học trường: " + uni);
    }

    public static void main(String[] args) {
        Student s = new Student("Tuan", 13, true, "Dai hoc bach khoa");
        s.getInfo(); // ưu tiên gọi hàm con trước
        // Tôi tên là: Tuan
        // Tuổi: 13
        // Giới tính: Nam
        // Tôi học trường: Dai hoc bach khoa
    }
}
