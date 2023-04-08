import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        KhachHang kh=new KhachHang();
        TaiKhoan tk=new TaiKhoan();
        int b;
        int exit=0;
//        System.out.println(" ma khach hang: "+kh.getMaKH());
//        System.out.print("Nhap ten khach hang: ");
//        kh.setTenKH(sc.nextLine());
//        System.out.print("Nhap dia chi khach hang: ");
//        kh.setDiaChi(sc.nextLine());
        System.out.println("ten khach hang : "+tk.getTenKH());
        System.out.println("so tai khoan: "+tk.getSoTaiKhoan());
        System.out.println("tai san dang so huu la: "+tk.getSoTien());
        do{
            System.out.println("chon chuc nagn ban can");
            System.out.println("==========================\n"+"1.Nap Tien.\n"+"2.Rut Tien.\n"+"So khac de thoat.\n"+"======================");
            b=sc.nextInt();
            switch (b){
                case 1 -> tk.napTien();
                case 2 -> tk.rutTien();
                default -> {
                    System.out.println("BYE!!!");
                    exit = 1;
                }
            }
        }while(exit == 0);
    }
}