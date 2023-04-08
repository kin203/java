public class HinhTron implements Doituonghinhhoc{
    int r;
    public HinhTron(){}
    public HinhTron(int r){
        super();
        this.r=r;
    }
    public float tinhdientich() {
        //   return (float)Math.pow(r,2)*(float)Math.PI;
        return r*r*(float)Math.PI;
    }
    public float tinhchuvi(){
        return 2*(float)Math.PI*r;
    }
}
