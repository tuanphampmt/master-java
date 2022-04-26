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