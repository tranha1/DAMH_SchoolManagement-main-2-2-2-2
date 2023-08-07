package Main;
abstract public class BangLuong {
    protected int MaBangLuong;
    protected String TuDen;
    protected int LuongCoSo;
    protected String CanCuPhapLy;
    
    public BangLuong(){}
    
    public BangLuong(int MaBangLuong, String TuDen, int LuongCoSo, String CanCuPhapLy){
        this.MaBangLuong = MaBangLuong;
        this.TuDen = TuDen;
        this.LuongCoSo = LuongCoSo;
        this.CanCuPhapLy = CanCuPhapLy;
    }

    public int getMaBangLuong() {
        return MaBangLuong;
    }

    public String getTuDen() {
        return TuDen;
    }

    public int getLuongCoSo() {
        return LuongCoSo;
    }

    public String getCanCuPhapLy() {
        return CanCuPhapLy;
    }

    public void setMaBangLuong(int MaBangLuong) {
        this.MaBangLuong = MaBangLuong;
    }

    public void setTuDen(String TuDen) {
        this.TuDen = TuDen;
    }

    public void setLuongCoSo(int LuongCoSo) {
        this.LuongCoSo = LuongCoSo;
    }

    public void setCanCuPhapLy(String CanCuPhapLy) {
        this.CanCuPhapLy = CanCuPhapLy;
    }

    
}
