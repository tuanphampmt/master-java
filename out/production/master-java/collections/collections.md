Tổng quan về Collections trong Java

- `Để lưu trữ dữ liệu theo cặp key / value, chúng ta có thể sử dụng Map Inteface.`
- `Nếu chúng ta muốn dữ liệu của mình là không trùng lặp, thì chúng ta có thể sử dụng Set Interface.`
- `Class ArrayList làm cho các mảng có thể thay đổi kích thước.`

1. Đinh nghĩa

       - Collection trong java là một bộ thư viện với rất nhiều class mạnh mẽ giúp bạn đơn giản hóa các thao tác khi làm việc với tập hợp và đồ thị.
       - Java Collection cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).
2. Set Interface

       - Set là một interface kế thừa Collection interface trong java. Set trong java là một Collection không thể chứa các phần tử trùng lặp.
       - Một số class thực thi Set Interface thường gặp:
          + HashSet lưu trữ các phần tử của nó trong bảng băm, nó không đảm bảo về thứ tự các phần tử được chèn vào.
          + TreeSet lưu trữ các phần tử của nó trong một cây, duy trì thứ tự tăng dần, về cơ bản là chậm hơn HashSet.
          + LinkedHashSet được triển khai dưới dạng bảng băm với có cấu trúc dữ liệu danh sách liên kết, duy trì thứ tự chèn.
          + EnumSet là một cài đặt chuyên biệt để sử dụng với các kiểu enum.
3. List Interface

       - List (danh sách) là cấu trúc dữ liệu tuyến tính. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index.
       - Một số class thực thi List Interface thường sử dụng:       
         + ArrayList: là 1 class dạng list được implement dựa trên mảng có kích thước thay đổi được.
         + LinkedList: là một class dạng list hoạt động trên cơ sở của cấu trúc dữ liệu danh sách liên kết đôi (double-linked list)
         + Vector: tương tự với ArrayList, tuy nhiên điểm khác biệt là Vector là đồng bộ, có thể hoạt động đa luồng
         + Stack: cũng là 1 class dạng list, Stack có cách hoạt động dựa trên cơ sở của cấu trúc dữ liệu ngăn xếp (stack) với kiểu vào ra LIFO (last-in-first-out hay vào sau ra trước).
4. Queue Interface

       - Queue (hàng đợi) là kiểu dữ liệu nổi tiếng với kiểu vào ra FIFO (first-in-first-out hay vào trước ra trước),
       - Một số class về Queue thường sử dụng:
         + LinkedList: chính là LinkedList mình đã nói ở phần List
         + PriorityQueue: là 1 dạng queue mà trong đó các phần tử trong queue sẽ được sắp xếp.
         + ArrayDeque: là 1 dạng deque (queue 2 chiều) được implement dựa trên mảng
5. Map Interface

       - Map (đồ thị/ánh xạ) là kiểu dữ liệu cho phép ta quản lý dữ liệu theo dạng cặp key-value, trong đó key là duy nhất và tương ứng với 1 key là một giá trị value. 
       - Dưới đây là một số class về Map cần chú ý:
         + TreeMap: là class thực thi giao diện Map Interface với dạng cây đỏ đen (Red-Black tree) trong đó các key đã được sắp xếp. Class này cho phép thời gian thêm, sửa, xóa và tìm kiếm 1 phần tử trong Map là tương đương nhau và đều là O(log(n))
         + HashMap: là class thực thi giao diện Map Interface với các key được lưu trữ dưới dạng bảng băm, cho phép tìm kiếm nhanh O(1).
         + EnumMap: cũng là 1 Map class nữa, tuy nhiên các key trong Map lại là các enum chứ không phải object như các dạng Map class ở trên.
         + WeakHashMap: tương tự như HashMap tuy nhiên có 1 điểm khác biệt đáng chú ý là các key trong Map chỉ là các Weak reference (hay Weak key), có nghĩa là khi phần tử sẽ bị xóa khi key được giải phóng hay không còn một biến nào tham chiếu đến key nữa.