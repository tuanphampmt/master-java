Lập trình hướng đối tượng trong java

1. Đối tượng (Object)
             
        - Đối tượng ở đây ta thể hiểu như khái niệm bên ngoài: Con người, Xe máy, Nhà cửa…
        - Trong một đối tượng sẽ bao gồm 2 thông tin: thuộc tính và phương thức.
          + Thuộc tính: là những thông tin của đối tượng. Ví dụ: con người có họ tên, chiều cao, độ tuổi,…
          + Phương thức: là những thao tác, hành động mà đối tượng đó có thể thực hiện. Ví dụ: con người có những hành động ăn, ngủ, đi lại,…
2. Lớp (Class)
   
        - Lớp chính là định nghĩa của đối tượng, ta sẽ xây dựng lớp để tạo ra những đối tượng khác nhau. 
        - Ví dụ như: Bạn Nguyễn Văn A và Nguyễn Văn B đều là con người, mà con người thì đều có tên, tuổi, chiều cao,.. tuy nhiên thông tin lại khác nhau.
        -> Như vậy con người chính là lớp, Nguyễn Văn A và Nguyễn Văn B là đối tượng.
3. Phương thức khởi tạo (Constructor)

        - Phương phức khởi tạo (Constructor) trong java là một dạng đặc biệt của phương thức dùng để khởi tạo các đối tượng
        - Khai báo của Constructor giống với khai báo của phương thức. Chỉ khác là nó phải có cùng tên với tên class và không có giá trị trả về
        - Có hai kiểu Constructor: 
          + Constructor mặc định: không có tham số truyền vào
          + Constructor tham số
4. Phạm vi truy cập (Access modifier)

       - Phạm vi truy cập (Access modifier) là xác định độ truy cập phạm vi vào dữ liệu của các thuộc tính, phương thức hoặc class
       - Package (gói) là nhóm các class, interface hoặc các package con liên quan lại với nhau. Mục đích của package ngăn cản xung đột đặt tên, điều kiện truy cập, thuận tiện tìm kiếm và lưu trữ.
       - Có 4 loại phạm vi truy cập:
         + private: chỉ được truy cập trong phạm vi class
         + default: truy cập trong cùng package
         + protected: truy cập trong cùng package, bên ngoài package nhưng phải kế thừa
         + public: được truy cập ở mọi nơi
5. Từ khóa static
      
       - Từ khóa static được sử dụng chỉnh để quản lý bộ nhớ. Chúng ta có thể áp dụng từ khóa static với các biến, phương thức
       - Khi gọi các biến, phương thức chứa từ khóa static chúng ta chỉ cần gọi bằng cách <tên class>. thay vì new một đối tượng như biến instance
       - Từ khóa static thường được sử dụng cho thuộc tính chung của tất cả đối tượng 
       - Ví dụ: Các học sinh cùng trường học có thuộc tính chung là tên trường học giống nhau. Nếu chúng ta tạo nó là static, thì trường này sẽ chỉ sử dụng bộ nhớ một lần để lưu biến này.
6. Từ khóa this

       - Từ khóa this là một biến tham chiếu được sử dụng để tham chiếu tới đối tượng của lớp hiện tại
       - Ví dụ: Bạn Tuấn là một người siêng năng cần cù. Ngoài ra bạn ấy (this) còn rất thông minh 
7. Từ khóa final

       - Từ khóa final trong Java được sử dụng để hạn chế thao tác của người dùng.
       - Các trường hợp sử dụng:
         + Biến final: khi một biến được khai báo với từ khoá final, nó chỉ chứa một giá trị duy nhất trong toàn bộ chương trình (hay dễ hiểu hơn gọi là biến hằng).
         + Phương thức final: khi một phương thức được khai báo với từ khoá final, các class con kế thừa sẽ không thể ghi đè (override) phương thức này.
         + Lớp final: khi từ khoá final sử dụng cho một lớp, lớp này sẽ không thể được kế thừa.
         + Biến static final trống: Một biến final mà không được khởi tạo tại thời điểm khai báo được gọi là biến final trống.
8. Tính kế thừa
      
       - Kế thừa là một class thừa hưởng lại tất cả các phương thức và thuộc tính từ class khác
       - Slogan đặc trưng của kế thừa: "Cha có thì con có, con có chưa chắc cha đã có"
       - Các kiểu kế thừa:
         + Đơn kế thừa: B kế thừa A
         + Kế thừa nhiều cấp: C kế thừa B, B kế thừa A
         + Kế thừa thức bậc: B, C cùng kế thừa A
9. Từ khóa super
 
       - Từ khóa super là một biến tham chiếu, được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất
       - Trong java, từ khóa super có 3 cách sử dụng như sau:
         + Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất.
         + super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
         + Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
10. Ghi đè phương thức (Overriding)
        
        - Overriding có nghĩa là class con ghi đè một phương thức giống nhau về tên và tham số truyền vào của class cha
        - Các nguyên tắc ghi đè phương thức trong java:
          + Phương thức phải có tên giống với lớp cha.
          + Phương thức phải có tham số giống với lớp cha.
          + Lớp con và lớp cha có mối quan hệ kế thừa.
11. Nạp chồng phương thức (Overloading)

        - Overloading là nhiều phương thức trong một lớp có cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số lượng các tham số.
        - Có 2 cách Overloading trong java:
          + Thay đổi số lượng tham số truyền vào
          + Thay đổi kiểu dữ liệu của các tham số 
12. Tính đa hình

        - Đa hình là hiện tượng các đối tượng thuộc các lớp khác nhau có thể hiểu cùng một thông điệp theo các cách khác nhau.
        - Một ví dụ về đa hình trong thực tế. Ta có 3 con vật: chó, mèo, lợn. Cả 3 con vật này đều là động vật. Nhưng khi ta bảo cả 3 động vật kêu thì con chó sẽ kêu gâu gâu, con mèo sẽ kêu meo meo và con heo sẽ kêu ẹt ẹt.
        - Trong ví dụ trên 3 con vật: chó, mèo, lợn xem như là các đối tượng. Việc ta bảo 3 động vật kêu chính là thông điệp. Rõ ràng cả 3 con vật có thể hiểu cùng 1 thông điệp là kêu theo các cách khác nhau.
        - Để thể hiện được tính đa hình:
          + Các lớp phải có quan hệ kế thừa với cùng 1 lớp cha nào đó.
          + Phương thức đa hình phải được ghi đè (override) ở các lớp con.
13. Tính trừu tượng

        - Tính trừu tượng trong lập trình hướng đối tượng là chỉ nêu ra vấn đề mà không hiển thị cụ thể, chỉ hiện thị tính năng thiết yếu đối với đối tượng người dùng mà không nói quy trình hoạt động. 
        - Ví dụ: như tạo ra tính năng gửi tin nhắn, ta chỉ cần hiểu là người dùng viết tin rồi nhấn gửi đi. Còn quy trình xử lý tin nhắn gửi như thế nào thì ta chưa đề cập đến.
        - Như vậy, tính trừu tượng là che giấu thông tin thực hiện từ người dùng, họ chỉ biết tính năng được cung cấp: Chỉ biết thông tin đối tượng thay vì cách nó sử dụng như thế nào. 
        - Nó có những ưu điểm sau:
          + Cho phép lập trình viên bỏ qua những phức tạp trong đối tượng mà chỉ đưa ra những khái niệm phương thức và thuộc tính cần thiết. Ta sẽ dựa những khái niệm đó để viết ra, nâng cấp và bảo trì.
          + Nó giúp ta tập trung cái cốt lõi đối tượng. Giúp người dùng không quên bản chất đối tượng đó làm gì. 
14. Tính đóng gói

        - Tính đóng gói nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay để giá trị các thuộc tính hay có thể truy cập trực tiếp. Việc cho phép truy cập các giá trị của đối tượng tùy theo sự đồng ý của người viết ra lớp của đối tượng đó. Tính chất này đảm bảo sự bảo mật, toàn vẹn của đối tượng trong Java.\
        - Tính chất này được thể hiện qua:
          + PHẠM VI TRUY CẬP
          + SETTER VÀ GETTER
15. Abstract class

        - Abstract class được sử dụng để triển khai tính trừu tượng trong java.
        - Một abstract class được khai báo bằng từ khoá abstract.
        - Các class con thừa kế abstract class phải dùng từ khóa extends.
        - Abstract class không thể khởi tạo bằng từ khóa new.
        - Một abstract method là một method được khai báo không có thân hàm.
16. Interface

        - Interface có những đặc điểm sau:
          + Interface luôn luôn có modifier là: public interface, cho dù bạn có khai báo rõ hay không.
          + Nếu có các trường (field) thì chúng đều là: public static final, cho dù bạn có khai báo rõ hay không.
          + Các method của nó đều là method trừu tượng, nghĩa là không có thân hàm, và đều có modifier là: public abstract, cho dù bạn có khai báo hay không.
          + Interface không có Constructor
          + Các class trong java không được extends nhiều class, nhưng với có thể implement nhiều interface khác nhau.
          + Các class implement interface phải implement tất cả các method được khai báo trong interface.
