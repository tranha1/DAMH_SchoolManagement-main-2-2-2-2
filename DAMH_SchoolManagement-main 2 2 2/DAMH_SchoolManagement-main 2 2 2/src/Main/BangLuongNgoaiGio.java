package Main;
abstract public class BangLuongNgoaiGio {
    protected int MaCB;
    protected int Ky;
    protected String NamHoc;
    protected int SoTietNgoaiGio;
    protected double LuongCoSo;
    protected double Sotien1Tiet;
    protected double TongLuong;

    public BangLuongNgoaiGio(int MaCB, int Ky, String NamHoc, int SoTietNgoaiGio, double LuongCoSo, double Sotien1Tiet, double TongLuong) {
        this.MaCB = MaCB;
        this.Ky = Ky;
        this.NamHoc = NamHoc;
        this.SoTietNgoaiGio = SoTietNgoaiGio;
        this.LuongCoSo = LuongCoSo;
        this.Sotien1Tiet = Sotien1Tiet;
        this.TongLuong = TongLuong;
    }
    
    
    public BangLuongNgoaiGio(){}

    public int getMaCB() {
        return MaCB;
    }

    public int getKy() {
        return Ky;
    }

    public String getNamHoc() {
        return NamHoc;
    }

    public int getSoTietNgoaiGio() {
        return SoTietNgoaiGio;
    }

    public double getLuongCoSo() {
        return LuongCoSo;
    }

    public double getSotien1Tiet() {
        return Sotien1Tiet;
    }

    public double getTongLuong() {
        return TongLuong;
    }

    public void setMaCB(int MaCB) {
        this.MaCB = MaCB;
    }

    public void setKy(int Ky) {
        this.Ky = Ky;
    }

    public void setNamHoc(String NamHoc) {
        this.NamHoc = NamHoc;
    }

    public void setSoTietNgoaiGio(int SoTietNgoaiGio) {
        this.SoTietNgoaiGio = SoTietNgoaiGio;
    }

    public void setLuongCoSo(double LuongCoSo) {
        this.LuongCoSo = LuongCoSo;
    }

    public void setSotien1Tiet(double Sotien1Tiet) {
        this.Sotien1Tiet = Sotien1Tiet;
    }

    public void setTongLuong(double TongLuong) {
        this.TongLuong = TongLuong;
    }
    
    
    
    
    
}
