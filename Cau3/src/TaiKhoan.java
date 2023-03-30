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
            System.out.println("Bạn vừa rút " + str1 + " từ tài khoản. Phí là $5.");
            System.out.println("So du tai khoan la : $" + sotien);
        } else {
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
    public double chuyenKhoan() {
        double ck =0;
        int stk;
        int stkn;
        System.out.print("Nhập số tai khoan ban can chuyen khoan toi: ");
        stk = sc.nextInt();
        do {
            System.out.print("\nChon so tai khoan nguon :");
            stkn = sc.nextInt();
            if(stkn!=getSotk()) {
                System.out.print("Nhap lai tk nguon ! \n");
            }
            }while (stkn != getSotk());
        System.out.print("Nhập số tiền bạn cần chuyen: ");
        ck = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (ck <= (sotien)) {
            sotien = sotien - ck;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(ck);
            System.out.println("Bạn vừa chuyen " + str1 + " từ tài khoản. toi tai khoan " + stk);
            System.out.println("So du tai khoan " + getSotk() + " la : $" + sotien);
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return chuyenKhoan();
        }
        return ck;
        }
    }
