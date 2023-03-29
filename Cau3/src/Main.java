import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaiKhoan tk=new TaiKhoan();
        int k, b, n = 0;
        long s, d, c, f;
        System.out.println("Nhập : ");
        System.out.println("Nhập số tài khoản: ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        tk.setTentk(sc.nextLine());
        System.out.print("Nhap so tien dang co trong tai khoan: ");
        tk.setSotien(sc.nextDouble());
        tk.rutTien();
    }
}