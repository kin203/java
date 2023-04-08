public class NhanVien {
    private int manv;
    private String hoten;
    private double luong;
    public NhanVien(int manv, String hoten, double luong){
        super();
        this.manv=manv;
        this.hoten=hoten;
        this.luong=luong;
    }
    public int getManv(){
        return manv;
    }
    public String gethoten(){
        return hoten;
    }
    public void sethoten(String hoten) {
        this.hoten = hoten;
    }

    public double getluong() {
        return luong;
    }

    public void setluong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "manv=" + manv +
                ", hoten='" + hoten + '\'' +
                ", luong=" + luong +
                '}';
    }
    public  double luongtheonam(){
        return this.luong*12;
    }
    public double tangluong(){
        return this.luong=this.luong*0.5;
    }

}
