1. Web service
- Web service là tập hợp các giao thức sử dụng để trao đổi dữ liệu giữa các ứng dụng hoặc giữa các hệ thống
- Web service thì có 2 dạng:
  + SOAP: XML
  + REST: JSON
2. Restful API
- Restful API là một tiêu chuẩn được sử dụng để thiết kế API cho các ứng dụng web hoặc app với kiểu dữ liệu là JSON.
4. Nguyên tắt khi viết API
- Tên api phải là danh từ
- HTTP method:
  + Thêm: POST
  + Sửa: PUT
  + Xóa: DELETE
  + Hiển thị dữ liệu: GET
3. Annotation
- @Controller: định nghĩa từ 1 java class thành 1 API web service trong spring boot, hiểu đơn giản là biến 1 java class thông 
thường thành 1 API trong restful web service của spring boot
- @ResponseBody: chuyển DTO thành JSON
- @RestController: kết hợp bởi @Controller và @ResponseBody
- @RequestMapping: để chỉ đường dẫn tới source chung
- @GetMapping, @PostMapping, @DeleteMapping, @PutMapping: đánh dấu phương thức này có HTTP method lần lượt là GET, POST, DELETE, PUT
- @PathVariable : lấy giá trị trên url /{id}
- @RequestParam: lấy giá trị trên url sau dấu chấm hỏi /foos?id=abc
- @Entity: biến java class thành Entity
- @Table: ánh xạ đến table trong database
- @MappedSuperclass: mapping entity với quan hệ kế thừa
- @Service: Đánh dấu một Class là tầng Service, phục vụ các logic nghiệp vụ.
- @Repository: Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.
- @Configuration: đánh dấu java class thành java config
- @NotNull: Từ chối giá trị null hoặc không có nhưng chấp nhận giá trị rỗng. Thường dùng cho kiểu (int, long, float, double, char, byte...)
- @NotEmpty: Thường cho StringBuffer, StringBuilder, Collection, Map, Array.
- @NotBlank: Thường dùng cho kiểu String. Annotation này từ chối String có giá trị null và String có độ dài là 0 sau khi đã trim 
(loại bỏ hết khoảng trắng thừa ở đầu và cuối của String)
4. Spring Data JPA
- Spring Data JPA là là một công nghệ được phát triển trên nền tảng JPA dùng để quản lý dữ liệu quan hệ. 
Nó cho phép chúng ta truy cập và lưu trữ dữ liệu giữa các object/class Java và database quan hệ
4. Entity
- Entity là một Java class tương ứng với một table trong database, mỗi entity object tương ứng với một dòng trong bảng. 
5. Repository
- Repository là tầng có nhiệm vụ giao tiếp với các DB, xử lý query và trả về các kiểu dữ liệu mà tầng Service yêu cầu.
6. Controller
- Controller là tầng giao tiếp với bên ngoài và handler các request từ bên ngoài tới hệ thống.
7. Service
- Service là tầng có nhiệm vụ thực hiện các nghiệp vụ và xử lý logic
8. DTO (Data Transfer Object)
- DTO là một phương pháp phổ biến để có thể trả dữ liệu cho người dùng từ các Rest API mà không làm lộ các dữ liệu nhạy cảm.
Nói cách khác là cung cấp vừa đủ những gì mà người dùng yêu cầu.