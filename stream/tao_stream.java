package stream;

import java.util.*;
import java.util.stream.*;

public class tao_stream {
    public static void main(String[] args) {

//      1. Tạo Stream cho những kiểu primitive IntStream, LongStream hay DoubleStream.
        IntStream.range(1, 4).forEach(System.out::println); // 1 2 3
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);// 1 2 3 4
        DoubleStream.of(1, 2, 3,  4).forEach(System.out::println); // 1.0 2.0 3.0 4.0
        LongStream.range(1, 6).forEach(System.out::println); // 1 2 3 4 5
        LongStream.of(3, 6 ,7).forEach(System.out::println); // 3 6 7


//      2. Tạo Stream từ các cấu trúc dữ liệu khác
//      - Tạo Stream bằng cách sử dụng Arrays.stream
        String[] languages = {"java", "nodejs", "C++", "C#"};
        Stream<String> stream = Arrays.stream(languages);
        stream.forEach(System.out::println); // java nodejs C++ C#

//      - Tạo Stream bằng cách sử dụng Stream.of
        Stream<String> stream1 = Stream.of(languages);
        stream1.forEach(System.out::println); // java nodejs C++ C#

//      - Tạo Stream bằng cách sử dụng Collections
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
        items.stream().forEach(System.out::println); // Java C# C++ PHP Javascript

//      3. Chuyển đổi Stream sang các cấu trúc dữ liệu khác
//      - Chuyển đổi Stream sang Collections
        Stream<String> stream2 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> list1 = stream2.collect(Collectors.toList());
        System.out.println(list1); // [Java, C#, C++, PHP, Javascript]

//      - Chuyển đổi Stream sang array
        Stream<String> stream3 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        String[] strings1 = stream3.toArray(String[]::new);
        System.out.println(Arrays.toString(strings1)); // [Java, C#, C++, PHP, Javascript]

//      4. Ví dụ Intermediate operations
//      - Sử dụng filter(): Stream filter() giúp loại bỏ các phần tử dựa trên các tiêu chí nhất định.
        IntStream.of(1,2, 5, 6, 8, 10)
                .filter(item -> item % 2 == 0 )
                .forEach(System.out::println); // 2 6 8 10
//      - Sử dụng skip(), limit(): Stream limit() được sử dụng để loại bỏ các phần tử n đầu tiên của Stream . Nếu Stream này chứa ít hơn n phần tử thì luồng trống sẽ được trả lại.
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data.stream() //
                .skip(1) // C# C++ PHP Javascript
                .limit(3)
                .forEach(System.out::println);
//      - Sử dụng map: Stream map() giúp ánh xạ các phần tử tới các kết quả tương ứng.
        List<String> data1 = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript");
        data1.stream().map(String::toUpperCase).forEach(System.out::println); // JAVA C# C++ PHP JAVASCRIPT
//       - Sử dụng sorted(): Stream sorted() giúp sắp xếp các phần tử theo một thứ tự xác định.
        List<String> data2 = Arrays.asList("Tuan", "Long", "Vinh", "Bin", "Vu");
        data2.stream().sorted().forEach(System.out::println); // Tăng dần: Bin Long Tuan Vinh Vu
        data2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // Giảm dần: Vu Vinh Tuan Long Bin

//        5. Ví dụ Terminal Operations

//        - Sử dụng forEach(): Phương thức forEach() giúp duyệt qua các phần tử của Stream.
        IntStream.of(5, 1, 8, 6, 2, 3) //
                .filter(number -> number % 3 == 0) // 6 3
                .limit(6) // 6 3
                .forEach(System.out::println); //6 3

//       - Sử dụng collect(): Phương thức collect() giúp thu thập kết quả Stream sang một Collection.
        Stream<String> stream4 = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> languages2 = stream4.collect(Collectors.toList());
        System.out.println(languages2); //  [Java, C#, C++, PHP, Javascript]\

//       - Sử dụng anyMatch():
//       Phương thức này trả về true ngay khi phần tử đầu tiên thõa mãn điều kiện, những phần tử còn lại sẽ không được kiểm tra.
        List<String> data3 = Arrays.asList("Java", "C#", "C++", "Java", "Javascript");
        boolean result = data3.stream().anyMatch((s) -> s.equalsIgnoreCase("JAva"));
        System.out.println(result); // true

//       - Sử dụng allMatch():
//        Phương thức này trả về true nếu tất cả phần tử đều thõa mãn điều kiện. Nếu một phần tử không thõa điều kiện,
//        những phần tử còn lại sẽ không được kiểm tra.
        List<String> data4 = Arrays.asList("Java", "C#", "C++", "Java", "Javascript");
        boolean result2 = data4.stream().allMatch((s) -> s.equalsIgnoreCase("JAva"));
        System.out.println(result2); // false

//       - Sử dụng noneMatch():
//        Ngược lại với allMatch(), phương thức này trả về true nếu tất cả phần tử đều không thõa mãn điều kiện.
//        Nếu một phần tử thõa điều kiện, những phần tử còn lại sẽ không được kiểm tra
        List<Integer> data5 = Arrays.asList(2, 4, 6, 8, 10);
        boolean result3 = data5.stream().noneMatch((s) -> s % 2 != 0);
        System.out.println(result3); // true

//        - Sử dụng summaryStatistics();
//        Phương thức summaryStatistics() được sử dụng để lấy giá trị count, min, max, sum và average với tập dữ liệu số.
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 10);

        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount()); // 5
        System.out.println("Max: " + stats.getMax()); // 10
        System.out.println("Min: " + stats.getMin()); // 2
        System.out.println("Sum: " + stats.getSum()); // 27
        System.out.println("Average: " + stats.getAverage()); // 5.4

    }
}
