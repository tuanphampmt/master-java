package collection.Set_Interface;



import collection.Student;

import java.util.TreeSet;

public class vd_TreeSet {

    //Các điểm quan trọng về lớp TreeSet trong java là:
    //Chỉ chứa các phần tử duy nhất giống như HashSet.
   // Thời gian truy xuất nhanh.
   // Duy trì thứ tự tăng dần.

    public static void main(String[] args) {
        TreeSet<String> treeSetA = new TreeSet<>();
        treeSetA.add("Tuan");
        treeSetA.add("Vu");
        treeSetA.add("Bin");
        // tree set đảm bảo sắp xếp tăng dần
        for (String item: treeSetA) {
            System.out.println(item);
        }


        TreeSet<Student> treeSetB = new TreeSet<Student>();

        Student student1 = new Student("Dung", 16, false );
        Student student2 = new Student("Tuan", 18, true);
        Student student3 = new Student("Bin", 19, true);


        treeSetB.add(student1);
        treeSetB.add(student2);
        treeSetB.add(student3);

        for (Student student : treeSetB) {
            System.out.println(student.toString());
        }
    }
}
