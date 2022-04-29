package collections.List_Interface;

import java.util.LinkedList;
import java.util.List;

public class vd_LinkedList {

   // Những điểm cần ghi nhớ về lớp LinkedList:
   //Các phần tử trong LinkedList được gọi là node, mỗi node cần lưu trữ 3 thông tin: tham chiếu phần tử trước nó,
    //giá trị của phần tử và một tham chiếu tới phần tử kế tiếp.
   // Lớp LinkedList trong java có thể chứa các phần tử trùng lặp.
    //Lớp LinkedList duy trì thứ tự của phần tử được thêm vào.
   // Lớp LinkedList là bất đồng bộ (non-synchronized).
   // Trong java lớp LinkList, thao tác nhanh vì không cần phải dịch chuyển nếu bất kỳ phần tử nào bị xoá khỏi danh sách.
   // Lớp LinkedList trong java có thể được sử dụng như list (danh sách), stack (ngăn xếp) hoặc queue (hàng đợi).

    //Chúng ta sẽ sử dụng ArrayList khi ứng dụng của chúng ta cần truy xuất phần tử nhiều hơn cập nhật và xóa phần tử và chúng
    // ta sẽ sử dụng LinkedList khi ứng dụng của chúng ta cần cập nhật và xóa phần tử nhiều hơn là truy cập phần tử.
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("Tuan");
        list1.add("Vu");
        list1.add("Nguyen");
        list1.add("Huyen");
    }
}
