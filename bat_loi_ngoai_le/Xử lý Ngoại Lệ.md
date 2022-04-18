Xử lý Ngoại Lệ
1. Cú pháp

    try {
    
       // code có thể ném ra ngoại lệ
    } catch (Exception e) {
    
       // code xử lý ngoại lệ
    } finally {
    
       // code trong khối này luôn được thực thi
    }
2. Có hai loại ngoại lệ chính là:

       - Checked Exception
       - Unchecked Exception
- Checked Exception
        
      - Các lớp extends từ lớp Throwable được gọi là checked exception, ví dụ như Exception, SQLException vv. 
      - Các checked exception được kiểm tra tại compile-time.
- Unchecked Exception
     
      - Các lớp extends từ RuntimeException được gọi là unchecked exception, ví dụ: NullPointerException
      - Các ngoại lệ unchecked được kiểm tra tại runtime.
- Ghi chú: 

      - Run-time: là thời điểm chương trình đang chạy
      - Compile-time: là thời điểm source code đang được compile
      - Thông thường run time và compile time được nhắc tới khi nói tới lỗi. Lỗi run time tức là lỗi khi chạy mới thấy, tức lỗi logic. 
      - Lỗi compile time là lỗi compile là thấy ngay, tức là lỗi cú pháp
3. Từ khóa throw trong java

       - Từ khoá throw trong java được sử dụng để ném ra một ngoại lệ cụ thể.
       - Cú pháp: throw new IOException("File không tồn tại"); 
4. Từ khóa throws trong java

       - Từ khóa throws trong java được sử dụng để khai báo một ngoại lệ.
       - Ném một ngoại lệ ra ngoài và được xử lý ở một hàm khác