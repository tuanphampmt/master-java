package collections.Set_Interface;

import java.util.*;

public class vd_HashSet_root {

    //Các điểm quan trọng về lớp HashSet trong java là:
    //HashSet chỉ chứa các phần tử duy nhất.
    //HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm (hash table).

    public static void main(String[] args) {
        Set<String> setA = new HashSet<String>();
        setA.add("Java");
        setA.add("Java");
        setA.add("Python");
        setA.add("Nodejs");
        setA.add("Go");

        Set<String> setB = new HashSet<String>();
        setB.add("C++");
        setB.add("C#");

        // thêm tất cả phần tử của setB vào setA
        setA.addAll(setB);

        System.out.println("Set B: " + setB); //Set B: [C#, C++]
        System.out.println("Set A: " + setA); // Set A: [C#, Java, C++, Go, Nodejs, Python]

        //Xóa tất cả phần tử khỏi set
        setB.clear();
        System.out.println("Set B: " + setB); //Set B: []

        //kiểm tra chứa phần tử chỉ định
        System.out.println("setA có chứa C# không?: " + setA.contains("C#")); //setA có chứa C# không?: true

        // kiểm tra chứa tất cả phần tử chỉ định
        Set<String> setC = new HashSet<String>();
        setC.add("Java");
        setC.add("C+++");
        System.out.println("setA có chứa tất cả phần tử của setC không?: " + setA.containsAll(setC)); //setA có chứa tất cả phần tử của setC không?: false


        // kiểm tra 2 set bằng nhau
        Set<String> setD = new HashSet<String>();
        setD.add("Java");
        setD.add("C+++");
        System.out.println("setC có bằng setD không?: " + setC.equals(setD)); //setC có bằng setD không?: true

        // kiểm tra set rổng hay không
        Set<String> setE = new HashSet<>();
        System.out.println("setE có rổng không?: " + setE.isEmpty()); //setE có rổng không?: true

        //chạy vòng lặp 1 set
            //dùng iterator
        Iterator<String> iterator = setA.iterator();
        System.out.println("Vòng Lặp setA dùng iterator: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //dùng foreach
        System.out.println("Vòng Lặp setA dùng foreach: ");
        for(String item: setA) {
            System.out.println(item);
        }

        //xóa phần tử khỏi set
        setA.remove("Java");
        System.out.println("setA sau khi xóa phần tử Java: " + setA);

        //xóa tất cả phần tử chỉnh định
        setE.add("C#");
        setE.add("C++");
        setA.removeAll(setE);
        System.out.println("setA sau khi xóa tất cả phần tử chỉ định setE: " + setA);


        // chuuển đổi set thành list
        List<String> listA = new ArrayList<String>();
        // chuyển đổi setA thành listA
        listA.addAll(setA);
        System.out.println(listA);
    }

}
