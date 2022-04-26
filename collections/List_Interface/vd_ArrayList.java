package collections.List_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class vd_ArrayList {
//    add() - thêm một phần tử vào list
//    addAll() - thêm tất cả các phần tử của list này vào list khác
//    get() - giúp truy cập ngẫu nhiên các phần tử từ list
//    set() - thay đổi các phần tử của list
//    remove() - xóa một phần tử khỏi list
//    removeAll() - xóa tất cả các phần tử khỏi list
//    clear() - xóa tất cả các phần tử khỏi list (hiệu quả hơn removeAll())
//    size() - trả về độ dài của list
//    toArray() - chuyển đổi một list thành một array
//    contains() - trả về true nếu list chứa phần tử được chỉ định
//    indexOf - vị trí của phần tử được chỉ định trong arraylis
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Tuan");
        list1.add("Vu");
        list1.add("Nguyen");
        list1.add("Huyen");

        System.out.println("list1: " + list1);

        // duyệt list
        Iterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //thêm tất cả list2 vào list1
        List<String> list2 = new ArrayList<>();
        list2.add("Long");
        list2.add("Minh");
        list1.addAll(list2);
        System.out.println("list 1 sau khi thêm list 2 vào: " + list1); //[Tuan, Vu, Nguyen, Huyen, Long, Minh]

        // lấy phần tử thứ i
        System.out.println("lấy phần tử thứ 2: " + list1.get(2)); // Nguyen

        //thay đổi phần tử thứ i
        list1.set(0, "Pham Minh Tuan");
        System.out.println("thay đổi phần tử thứ i: " + list1); // [Pham Minh Tuan, Vu, Nguyen, Huyen, Long, Minh]

        //xóa phần tử
        list1.remove("Vu");
        System.out.println("xóa phần tử " + list1); //[Pham Minh Tuan, Nguyen, Huyen, Long, Minh]

        //xóa tất cả
        list1.removeAll(list2);
        System.out.println("xóa tất cả " + list1); // [Pham Minh Tuan, Nguyen, Huyen]

        //lấy vị trí của phần tử
        System.out.println("Vi tri cua phan tu Huyen co trong mang: " + list1.indexOf("Huyen")); // 2

        //lấy vị trí của phần tử cuối
        list1.add("Nguyen");
        list1.add("Hoa");
        System.out.println("list1: " + list1); //[Pham Minh Tuan, Nguyen, Huyen, Nguyen, Hoa]
        System.out.println("Vi tri cuối cùng của phần tử Nguyen : " + list1.lastIndexOf("Nguyen")); //3

        //lấy ra mảng con index từ i đến j
        System.out.println("lấy ra mảng con index từ 0 đến 3: " + list1.subList(0,3)); //[Pham Minh Tuan, Nguyen, Huyen]


        // Tạo một Array list
        ArrayList<String> thuNuoi = new ArrayList<>(Arrays.asList("Chó", "Mèo", "Gà"));
        System.out.println("Thú nuôi: " + thuNuoi); //[Chó, Mèo, Gà]

        // Truy cập phần tử của Array list
        String phanTuMang = thuNuoi.get(1);
        System.out.println("Truy cập phần tử: " + phanTuMang); //Mèo

        // chuyển array thành arraylit
        // Tạo một mảng thông thường
        String[] arr = {"Chó", "Mèo", "Gà", "Lợn"};
        System.out.print("Array: ");

        // In mảng
        for (String thu : arr) {
            System.out.print(thu);
            System.out.print(" ");
        }

        // Tạo một ArrayList từ một Array
        ArrayList<String> thuNuoi1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\nArrayList: " + thuNuoi1);

       // lấy giao giữa 2 mảng (phần tử chùng)
        //khai báo một mảng ArrayList numbers
        List<Integer> numbers = new ArrayList<>();
        // sử dụng phương thức add() để thêm các phần tử cho mảng numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Các phần tử có trong mảng numbers: " + numbers);

        //khai báo một mảng ArrayList primeNumbers là các số nguyên tố
        List<Integer> primeNumbers = new ArrayList<>();
        // sử dụng phương thức add() để thêm các phần tử là các số nguyên tố vào mảng primeNumbers
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("Các phần tử có trong mảng primeNumbers : " + primeNumbers);

        // giữ lại các phần tử chung của hai mảng
        numbers.retainAll(primeNumbers);
        System.out.println("Các phần tử được giữ lại: " + numbers);
    }
}
