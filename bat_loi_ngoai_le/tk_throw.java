package bat_loi_ngoai_le;

public class tk_throw {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
