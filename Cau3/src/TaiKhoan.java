import java.text.NumberFormat;
import java.util.Scanner;
public class TaiKhoan {
    private int sotk;
    private String tentk;
    private double sotien;
    Scanner sc = new Scanner(System.in);

    public TaiKhoan() {

    }

    public TaiKhoan(int sotk, String tentk, double sotien) {
        super();
        this.sotk = sotk;
        this.tentk = tentk;
        this.sotien = sotien;
    }

    public int getSotk() {
        return sotk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "sotk=" + sotk +
                ", tentk='" + tentk + '\'' +
                ", sotien=" + sotien +
                ", sc=" + sc +
                '}';
    }
//    public double napTien(){
//        System.out.println("Nhập số tài khoản khách hàng cần nạp tiền: ");
//        s = sc.nextLong();
//        for (int i = 0; i < n; i++) {
//            d = a[i].getSoTK();
//            if (s == d) {
//                System.out.println("Bạn chọn tài khoản: " + d);
//                a[i].napTien();
//            } else {
//                System.out.println("");
//            }
//        }
//    }

    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (rut <= (sotien - phi)) {
            sotien = sotien - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str1 + "Đ từ tài khoản. Phí là $5.");
            System.out.println("So du tai khoan la : $" + sotien);
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }

    public double napTien() {
        double nap;
        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextDouble();
        sotien = sotien + nap;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(nap);
        System.out.println("ban vua nap " + str1 + "vao tai khoan.");
        System.out.println("So du tai khoan la : $" + sotien);
        return nap;
    }
}
