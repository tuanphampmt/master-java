package collections.Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class vd_HashMap {

//    Những điểm quan trọng về lớp HashMap trong java là:
//    HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
//    Nó chứa các key duy nhất.
//    Nó có thể có 1 key là null và nhiều giá trị null.
//    Nó duy trì các phần tử KHÔNG theo thứ tự chèn.


//    void clear()	Xóa tất cả các phần tử của HashMap.
//    Object clone()	Trả về một bản copy của HashMap.
//    boolean containsKey(Object key)	Trả về true nếu HashMap chứa một phần tử có key được chỉ định.
//    boolean containsValue(Object value)	Trả về true nếu HashMap chứa một phần tử có giá trị (value) được chỉ định.
//    Set entrySet()	Trả về Collection view các ánh xạ có trong HashMap.
//    Object get(Object key)	Trả về giá trị của key được chỉ định.
//    boolean isEmpty()	Trả về true nếu HashMap trống.
//            Set keySet()	Trả về một Set interface chứa tất cả các key của HashMap.
//    Object put(Object key, Object value)	Thêm một cặp key-value vào HashMap.
//    void putAll(Map t)	Sao chép các phần tử của Map được chỉ định vào HashMap.
//    Object remove(Object key)	Xóa một phần tử có key được chỉ định ra khởi HashMap.
//    int size()	Trả về số phần tử của HashMap.
//    Collection values()	Trả về Collection của các giá trị có trong HashMap.
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Tuan");
        map.put(2, "Long");
        map.put(3, "Minh");
        map.put(4, "Hang");

        //lặp map sử dụng keySet()
        System.out.println("lặp map sử dụng keySet()");
        Set<Integer> keys = map.keySet();
        for(Integer key: keys) {
            System.out.println(key + " - " + map.get(key));
        }

        //lặp map sử dụng entrySet()
        System.out.println("lặp map sử dụng entrySet()");
        for(Map.Entry<Integer, String> en: map.entrySet()) {
            System.out.println(en.getKey() + " - " + en.getValue());
        }

        //lặp map sử dụng iterator
        System.out.println("lặp map sử dụng keySet().iterator()");
        Iterator<Integer> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " - " + map.get(key));
        }

        //lặp map sử dụng iterator
        System.out.println("lặp map sử dụng entrySet().iterator()");
        Iterator<Map.Entry<Integer, String>> iterator2 = map.entrySet().iterator();

        while (iterator2.hasNext()) {
            Map.Entry<Integer, String> entry  = iterator2.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        //lặp map sử dụng foreach
        System.out.println("lặp map sử dụng foreach");
        map.forEach((key, value) -> System.out.println(key + " - " + value));
        System.out.println("lặp map sử dụng keySet().foreach");
        map.keySet().forEach(k -> System.out.println(k + " - " + map.get(k)));

        //lặp map sử dụng stream
        System.out.println("lặp map sử dụng stream");
        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

        //truy cập phần tử
        System.out.println("truy cập phần tử theo key là 2: "+ map.get(2)); //Long

        //cập nhật phần tử
        map.put(1, "Phạm Minh Tuấn");
        System.out.println("phần tử key là 1 sau khi cập nhật : "+ map.get(1)); //Phạm Minh Tuấn

        //xóa phần tử theo key
        map.remove(4);
        System.out.println("map sau khi xóa phần tử key là 4: " + map); //{1=Phạm Minh Tuấn, 2=Long, 3=Minh}

        //kiểm tra chứa key chỉ định
        System.out.println("map có chứa key là 4 không?: " + map.containsKey(4)); // false

        //kiểm tra chứa value chỉ định
        System.out.println("map có chứa value là Pham Minh Tuan không?: " + map.containsValue("Phạm Minh Tuấn")); // true
    }
}
