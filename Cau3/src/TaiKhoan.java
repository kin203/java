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
        do{
            System.out.print("Nhap so tien ban can rut : ");
            rut = sc.nextDouble();
            if (rut > (sotien - phi)) {
                System.out.print("So du khong du de thuc hien ! Vui long thao tac lai.\n");
            }
        }while(rut > (sotien - phi));
            sotien = sotien - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(rut);
            System.out.println("Ban vua rut " + str1 + " tu tai khoan "+sotk+" Phi la $5.");
            System.out.println("So du tai khoan la : $" + sotien);
            return rut;
        }

    public double napTien() {
        double nap;
        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextDouble();
        sotien = sotien + nap;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(nap);
        System.out.println("ban vua nap " + str1 + " vao tai khoan "+sotk);
        System.out.println("So du tai khoan la : $" + sotien);
        return nap;
    }

    public double chuyenKhoan() {
        double ck = 0;
        int stk;
        int stkn;
        System.out.print("Nhap so tai khoan ban can chuyen khoan toi: ");
        stk = sc.nextInt();
        do {
            System.out.print("Chon so tai khoan nguon :");
            stkn = sc.nextInt();
            if (stkn != getSotk()) {
                System.out.print("Nhap lai tk nguon ! \n");
            }
        } while (stkn != getSotk());
        do {
            System.out.print("Nhap so tien ban can chuyen: ");
            ck = sc.nextDouble();
            if (ck > sotien) {
                System.out.print("so du khong du vui long chon lai !\n");
            }
        }while (ck > sotien);
            sotien = sotien - ck;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(ck);
            System.out.println("Ban vua chuyen di " + str1 + " tu tai khoan "+sotk+" toi tai khoan " + stk);
            System.out.println("So du tai khoan " + getSotk() + " la : $" + sotien);
            return ck;
    }
}
