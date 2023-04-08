import java.text.NumberFormat;
import java.util.Scanner;
public class TaiKhoan {
    private int soTaiKhoan=(int)(Math.random()*(100-10+1)+10);
    private int soTien=(int)(Math.random()*(1000000-100000+1)+100000);
    Scanner sc = new Scanner(System.in);
    KhachHang khachHang = new KhachHang("Nguyen xuan Kien","HaNoi");

    public TaiKhoan() {

    }
    public TaiKhoan(int soTaiKhoan, KhachHang khachHang, int soTien) {
        super();
        this.khachHang = khachHang;
        this.soTaiKhoan = soTaiKhoan;
        this.soTien = soTien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public int getSoTaiKhoan(){
        return soTaiKhoan;
    }

    public int getSoTien() {
        return soTien;
    }
    public String getTenKH() {
        return khachHang.getTenKH();
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", soTien=" + soTien +
                ", khachHang=" + khachHang +
                '}';
    }
    public int rutTien() {
        int phi = 5;
        int rut;
        do{
            System.out.print("Nhap so tien ban can rut: ");
            rut = sc.nextInt();
            if(rut>soTien){
                System.out.println("tai khoan ban khong du tien");
            }
        }while(rut>soTien);
        soTien = soTien - (rut + phi);
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(rut);
        System.out.println("Ban vua rut\t"+str1+"$ tu tai khoan "+getSoTaiKhoan()+". Phi la 5$.");
        System.out.println("So du tai khoan la: "+soTien+"$");
        return rut;
    }
    public int napTien(){
        int nap;
        System.out.print("Nhap so tien can nap: ");
        nap = sc.nextInt();
        soTien = soTien + nap;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(nap);
        System.out.println("ban vua nap\t"+str1+"$ vao tai khoan "+getSoTaiKhoan() );
        System.out.println("So du tai khoan la: " + soTien+"$");
        return nap;
    }
}



