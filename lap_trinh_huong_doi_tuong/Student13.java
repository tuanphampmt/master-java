package lap_trinh_huong_doi_tuong;

public class Student13 {
    int id;
    String name;


    Student13(int id) {
        System.out.println("call Constructor mặc định");
    }


    Student13(int id, String name) {
        this(id); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    Student13() {
        System.out.println("call Constructor mặc định");
    }


    public static void main(String args[]) {
        Student13 e1 = new Student13(111, "Viet");
        Student13 e2 = new Student13(222, "Nam");
        e1.display();

    }
}
