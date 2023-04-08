public class Main {
    public static void main(String[] args) {
        NhanVien nv=new NhanVien(01, "Nguyen Xuan Kien", 50000);
        System.out.println(nv);
        System.out.println("luong 1 nam cua be nhan vienla: "+nv.luongtheonam());
        System.out.println("luong duoc tang cua nhan vien la: "+nv.tangluong());
    }
}