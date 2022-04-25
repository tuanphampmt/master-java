Tổng quan về Collections trong Java

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