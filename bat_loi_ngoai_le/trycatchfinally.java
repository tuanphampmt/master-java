package bat_loi_ngoai_le;

public class trycatchfinally {


    public static void main(String[] args) {
        try {
            System.out.println("thực hiện chương trình, nếu lỗi nhảy xuống catch");
            int x = 1/0;
        } catch(Exception e) {
            System.out.println("loi chia cho 0");
        } finally {
            System.out.println("luon luon thực hiện");
        }
    }
}
