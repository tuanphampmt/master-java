package bat_loi_ngoai_le;
import java.io.IOException;
public class tk_throws {
    void m() throws IOException {
        throw new IOException("Loi thiet bi");// checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("ngoai le duoc xu ly");
        }
    }

    public static void main(String args[]) {
        tk_throws obj = new tk_throws();
        obj.p();
        System.out.println("luong binh thuong...");
    }
}
