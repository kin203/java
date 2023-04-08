public class KiemTra {
    public static void main(String []args){
        HinhTron h= new HinhTron(10);
        Hinhtronthaydoi htd=new Hinhtronthaydoi(10);
        System.out.println("dien tich hinh tron la: "+h.tinhdientich());
        System.out.println("chu vi hinh tron la "+h.tinhchuvi());
        System.out.println("hinh tron thay doi "+htd.thaydoikichthuoc((float)1.4)*h.tinhdientich());
    }
}