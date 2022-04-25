package lap_trinh_huong_doi_tuong;

public class tk_static {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    tk_static(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        tk_static s1 = new tk_static(111, "Thông");
        tk_static s2 = new tk_static(222, "Minh");

        s1.display();
        s2.display();
    }
}
