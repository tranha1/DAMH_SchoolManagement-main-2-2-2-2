package Main;
import static Login.TaiKhoanController.index;
//import static Main.ConnectionSQL.getConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author admin
 */
public class ConnectionSQL {
    static String url="jdbc:mysql://localhost:3306/schoolmanagement";
    static String user="root";
    static String password="";
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    
    


    //Tạo phương thức List để lấy dữ liệu từ cơ sở dữ liệu
    public static List<CanBo> findAllCanBo(){
        List<CanBo>canboList=new ArrayList<>();
        String query = "SELECT*FROM canbo";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 CanBo st = new CanBo(rs.getInt("MaCB"), rs.getString("HoTen"), rs.getString("SoDT"),  
                        rs.getString("DiaChi"), rs.getString("NamSinh"), rs.getString("ChucVu"), 
                        rs.getString("SoTaiKhoan"), rs.getInt("Bac")) {
                 };
                canboList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return canboList;
    }
    
    
    
    public static List<QuaTrinhCongTac> findAllQuaTrinh(){
        List<QuaTrinhCongTac>quatrinhluongList=new ArrayList<>();
        String query = "SELECT*FROM quatrinhluong";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 QuaTrinhCongTac st = new QuaTrinhCongTac(rs.getInt("MaCB") ,rs.getInt("MaQTLuong") ,rs.getString("MaCV"), rs.getInt("ThoiGianBatDau"), rs.getInt("ThoiGianKetThuc")) {
                 };
                quatrinhluongList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return quatrinhluongList;
    }
    
    
    
    public static List<BangLuong> findAllBangLuong(){
        List<BangLuong>bangluongList=new ArrayList<>();
        String query = "SELECT*FROM bangluong";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 BangLuong st = new BangLuong(rs.getInt("MaBangLuong") ,rs.getString("TuDen") ,rs.getInt("LuongCoSo"), rs.getString("CanCuPhapLy")) {
                 };
                bangluongList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return bangluongList;
    }
    
    
    
    public static List<BangLuongChiTiet> findAllBangLuongChiTiet(){
        List<BangLuongChiTiet>bangluongchitietList=new ArrayList<>();
        String query = "SELECT*FROM bangluongchitiet";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong") ,rs.getInt("MaCB") ,rs.getInt("Thang"),rs.getInt("Nam"),rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"),rs.getInt("PhuCapChucVu"),rs.getInt("TongLuong")) {
                 };
                bangluongchitietList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return bangluongchitietList;
    }
    
    
    
//    public static List<BangLuongNgoaiGio> findAllBangLuongNgoaiGio(){
//        List<BangLuongNgoaiGio>bangluongngoaigioList=new ArrayList<>();
//        String query = "SELECT*FROM bangluongngoaigio";
//        try{
//            Connection conn =getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()){
//                 BangLuongNgoaiGio st = new BangLuongNgoaiGio(rs.getInt("MaBLNG") ,rs.getInt("Ky") ,rs.getInt("Nam"), rs.getInt("LuongToiThieu")) {
//                 };
//                bangluongngoaigioList.add(st);
//            }
//            
//        } catch (Exception e){
//        }
//        return bangluongngoaigioList;
//    }
    
    

    
    
    
    
    //Tạo phương thức thêm mới hàng dữ liệu trong cơ sở dữ liệu
    public static void InsertCanBo(CanBo st){
        String query = "INSERT INTO canbo(MaCB, HoTen, SoDT, DiaChi, NamSinh, ChucVu, SoTaiKhoan, Bac) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaCB());
            pstmt.setString(2, st.getHoTen());
            pstmt.setString(3, st.getSoDT());
            pstmt.setString(4, st.getDiaChi());
            pstmt.setString(5, st.getNamSinh());
            pstmt.setString(6, st.getChucVu());
            pstmt.setString(7, st.getSoTaiKhoan());
            pstmt.setInt(8, st.getBac());
            pstmt.execute();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    public static void InsertQuaTrinh(QuaTrinhCongTac st){
        String query = "INSERT INTO quatrinhluong(MaCB, MaCV, ThoiGianBatDau, ThoiGianKetThuc) VALUES (?, ?, ?, ?)";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaCB());
            pstmt.setString(2, st.getMaCV());
            pstmt.setInt(3, st.getThoiGianBatDau());
            pstmt.setInt(4, st.getThoiGianKetThuc());
            pstmt.execute();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void InsertBangLuong(BangLuong st){
        String query = "INSERT INTO bangluong(TuDen,LuongCoSo,CanCuPhapLy) VALUES ( ?, ?, ?)";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, st.getTuDen());
            pstmt.setInt(2, st.getLuongCoSo());
            pstmt.setString(3, st.getCanCuPhapLy());
            pstmt.execute();conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void InsertBangLuongChiTiet(BangLuongChiTiet st){
        String query1 = "select * from bangluongchitiet where MaBangLuong = '"+st.getMaBangLuong()+"' and MaCB='"+st.getMaCB()+"' and Thang='"+st.getThang()+"' and Nam='"+st.getNam()+"' and LuongCoSo='"+(int)st.getLuongCoSo()+"' and LuongCung='"+(int)st.getLuongCung()+
                "' and PhuCapThamNien='"+st.getPhuCapThamNien()+"' and PhuCapChucVu='"+st.getPhuCapChucVu()+"'";
        try{
            Connection conn1 = getConnection();
            Statement stmt1 = conn1.createStatement();
            ResultSet rs1 = stmt1.executeQuery(query1);
            while(rs1.next()){
                return;
            }
            conn1.close();
        }catch(Exception e){}
        
        
        
        String query = "INSERT INTO bangluongchitiet(MaBangLuong,MaCB,Thang,Nam,LuongCoSo,LuongCung,PhuCapThamNien,PhuCapChucVu,TongLuong) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaBangLuong());
            pstmt.setInt(2, st.getMaCB());
            pstmt.setInt(3, st.getThang());
            pstmt.setInt(4, st.getNam());
            pstmt.setDouble(5,st.getLuongCoSo());
            pstmt.setDouble(6, st.getLuongCung());
            pstmt.setDouble(7, st.getPhuCapThamNien());
            pstmt.setDouble(8, st.getPhuCapChucVu());
            pstmt.setDouble(9, st.getTongLuong());
            pstmt.execute();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
//    public static void InsertBangLuongNgoaiGio(BangLuongNgoaiGio st){
//        String query = "INSERT INTO bangluongngoaigio(MaBLNG,Ky,Nam,LuongToiThieu) VALUES (?, ?, ?, ?)";
//        try{
//            Connection conn = getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.setInt(1, st.getMaBLNG());
//            pstmt.setInt(2, st.getKy());
//            pstmt.setInt(3, st.getNam());
//            pstmt.setInt(4, st.getLuongToiThieu());
//       
//            pstmt.execute();
//        } catch (Exception e){
//        }
//    }
    
    

    
    
    
    public static void DeleteCanBo(CanBo st){
        String query = "DELETE FROM canbo WHERE MaCB = '"+st.getMaCB()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    
    public static void DeleteQuaTrinh(QuaTrinhCongTac st){
        String query = "DELETE FROM quatrinhluong WHERE MaCB = '"+st.getMaCB()+"'"+" and ThoiGianBatDau = '"+st.getThoiGianBatDau()+"' and ThoiGianKetTHuc = '"+st.getThoiGianKetThuc()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void DeleteBangLuong(BangLuong st){
        String query = "DELETE FROM bangluong WHERE MaBangLuong = '"+st.getMaBangLuong()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void DeleteBangLuongChiTiet(BangLuongChiTiet st){
        String query = "DELETE FROM bangluongchitiet WHERE MaBangLuong = '"+st.getMaBangLuong()+"' AND MaCB = '"+st.getMaCB()+"'";
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
//    public static void DeleteBangLuongNgoaiGio(BangLuongNgoaiGio st){
//        String query = "DELETE FROM bangluongngoaigio WHERE MaBLNG = '"+st.getMaBLNG()+"'";
//        try {
//            Connection conn = getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.executeUpdate();
//        } catch (Exception e){
//        }
//    }
    
    

    
    
    
    
    
    
    //update thông tin cán bộ dựa theo mã cán bộ
    public static void UpdateCanBo(CanBo st){
        String query = "UPDATE canbo set MaCB=?, HoTen=?, SoDT=?, DiaChi=?, NamSinh=?, ChucVu=?, SoTaiKhoan=?, Bac=? WHERE MaCB='"+st.getMaCB()+"'";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaCB());
            pstmt.setString(2, st.getHoTen());
            pstmt.setString(3, st.getSoDT());
            pstmt.setString(4, st.getDiaChi());
            pstmt.setString(5, st.getNamSinh());
            pstmt.setString(6, st.getChucVu());
            pstmt.setString(7, st.getSoTaiKhoan());
            pstmt.setInt(8, st.getBac());
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void UpdateQuaTrinh(QuaTrinhCongTac st){
        String query = "UPDATE quatrinhluong set MaCB=?, MaCV=?, ThoiGianBatDau=?, ThoiGianKetThuc=? WHERE ThoiGianBatDau='"+st.getThoiGianBatDau()+"'";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaCB());
            pstmt.setString(2, st.getMaCV());
            pstmt.setInt(3, st.getThoiGianBatDau());
            pstmt.setInt(4, st.getThoiGianKetThuc());
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void UpdateBangLuong(BangLuong st){
        String query = "UPDATE bangluong set TuDen=?, LuongCoSo=?, CanCuPhapLy=? WHERE MaBangLuong='"+st.getMaBangLuong()+"'";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, st.getTuDen());
            pstmt.setInt(2, st.getLuongCoSo());
            pstmt.setString(3, st.getCanCuPhapLy());
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
    public static void UpdateBangLuongChiTiet(BangLuongChiTiet st){
        String query = "UPDATE bangluongchitiet set MaBangLuong=?, MaCB=?, Thang=?, Nam=? WHERE MaBangLuong = '"+st.getMaBangLuong()+" AND MaCB = "+st.getMaCB()+"'";
        try{
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, st.getMaBangLuong());
            pstmt.setInt(2, st.getMaCB());
            pstmt.executeUpdate();
            conn.close();
        } catch (Exception e){
        }
    }
    
    
    
//    public static void UpdateBangLuongNgoaiGio(BangLuongNgoaiGio st){
//        String query = "UPDATE bangluongngoaigio set MaBLNG=?, Ky=?, Nam=?, LuongToiThieu=? WHERE MaBangLuong='"+st.getMaBLNG()+"'";
//        try{
//            Connection conn = getConnection();
//            PreparedStatement pstmt = conn.prepareStatement(query);
//            pstmt.setInt(1, st.getMaBLNG());
//            pstmt.setInt(2, st.getKy());
//            pstmt.setInt(3, st.getNam());
//            pstmt.setInt(4, st.getLuongToiThieu());
//            pstmt.executeUpdate();
//        } catch (Exception e){
//        }
//    }
    
    

    
    
    
    //Tạo phương thức tìm kiếm dựa theo cột dữ liệu
    public static List<CanBo> SearchCanBo(CanBo s){
        List<CanBo>canbol=new ArrayList<>();
        String query = "SELECT*FROM canbo WHERE canbo.HoTen='"+s.getHoTen()+"' OR canbo.ChucVu='"+s.getChucVu()+"'";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 CanBo st = new CanBo(rs.getInt("MaCB"), rs.getString("HoTen"), rs.getString("SoDT"), 
                        rs.getString("DiaChi"), rs.getString("NamSinh"), rs.getString("ChucVu"), 
                        rs.getString("SoTaiKhoan"), rs.getInt("Bac")) {
                 };
                canbol.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return canbol;
        }
    
    
    
    public static List<QuaTrinhCongTac> SearchQuaTrinh(QuaTrinhCongTac s){
        List<QuaTrinhCongTac>quatrinhList=new ArrayList<>();
        String query = "SELECT*FROM quatrinhluong WHERE quatrinhluong.MaCV='"+s.getMaCV()+"' or quatrinhluong.ThoiGianBatDau='"+s.getThoiGianBatDau()+"'   or quatrinhluong.ThoiGianKetThuc='"+s.getThoiGianKetThuc()+"'";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 QuaTrinhCongTac st;
                st = new QuaTrinhCongTac(rs.getInt("MaCB"), rs.getInt("MaQTLuong"), rs.getString("MaCV"), rs.getInt("ThoiGianBatDau"), rs.getInt("ThoiGianKetThuc")) {
                };
                quatrinhList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return quatrinhList;
        }  



 




public static List<BangLuongChiTiet> SearchBangLuongChiTiet(BangLuongChiTiet s){
        List<BangLuongChiTiet>bangluongchitietList=new ArrayList<>();
        if(s.getMaCB() == 0 && s.getThang() == 0 && s.getNam() !=0){
            String query = "select * from bangluongchitiet where bangluongchitiet.Nam ='"+s.getNam()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")){};
                    bangluongchitietList.add(st);
                }
                conn.close();
            }catch(Exception e){
                
            }
            return bangluongchitietList;
        }
        
        else if(s.getMaCB() == 0 && s.getThang() != 0 && s.getNam() !=0){
            String query1 = "select * from bangluongchitiet where bangluongchitiet.Nam ='"+s.getNam()+"' and bangluongchitiet.Thang='"+s.getThang()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query1);
                while(rs.next()){
                    BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")){};
                    bangluongchitietList.add(st);
                }
                conn.close();
            }catch(Exception e){
                
            }
            return bangluongchitietList;
        }
        
        
        else if(s.getMaCB()!=0 && s.getThang() == 0 && s.getNam() ==0){
            String query2 = "select * from bangluongchitiet where bangluongchitiet.MaCB ='"+s.getMaCB()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query2);
                while(rs.next()){
                    BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")){};
                    bangluongchitietList.add(st);
                }
                conn.close();
            }catch(Exception e){
                
            }
            return bangluongchitietList;
        }
        
        else if(s.getMaCB()!=0 && s.getThang() != 0 && s.getNam() !=0){
            String query3 = "select * from bangluongchitiet where bangluongchitiet.MaCB ='"+s.getMaCB()+"' and bangluongchitiet.Thang='"+s.getThang()+"' and bangluongchitiet.Nam='"+s.getNam()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query3);
                while(rs.next()){
                    BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")){};
                    bangluongchitietList.add(st);
                }
                conn.close();
            }catch(Exception e){
                
            }
            return bangluongchitietList;
        } 
        
        
        else if(s.getMaCB()!=0 && s.getThang() == 0 && s.getNam() !=0){
            String query3 = "select * from bangluongchitiet where bangluongchitiet.MaCB ='"+s.getMaCB()+"' and bangluongchitiet.Nam='"+s.getNam()+"'";
            try{
                Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query3);
                while(rs.next()){
                    BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"), rs.getInt("Thang"), rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"), rs.getInt("PhuCapThamNien"), rs.getInt("PhuCapChucVu"), rs.getInt("TongLuong")){};
                    bangluongchitietList.add(st);
                }
                conn.close();
            }catch(Exception e){
                
            }
            return bangluongchitietList;
        } 
        
        
        
        
        return bangluongchitietList;
        }  




//    public static List<BangLuongNgoaiGio> SearchBangLuongNgoaiGio(BangLuongNgoaiGio s){
//        List<BangLuongNgoaiGio>bangluongngoaigioList=new ArrayList<>();
//        String query = "SELECT*FROM bangluongngoaigio WHERE bangluongngoaigio.MaBLNG='"+s.getMaBLNG()+"'";
//        try{
//            Connection conn =getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()){
//                 BangLuongNgoaiGio st = new BangLuongNgoaiGio(rs.getInt("MaBLNG"), rs.getInt("Ky"),rs.getInt("Nam"), rs.getInt("LuongToiThieu") ) {
//                 };
//                bangluongngoaigioList.add(st);
//            }
//        } catch (Exception e){
//        }
//        return bangluongngoaigioList;
//        }


 
    
    
    
    
    
    
    public static List<CanBo> findCaNhan(){
         
        List<CanBo>canboList=new ArrayList<>();
            String query = "SELECT*FROM canbo WHERE canbo.MaCB = '"+index +"'";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 CanBo st = new CanBo(rs.getInt("MaCB"), rs.getString("HoTen"), rs.getString("SoDT"),  
                        rs.getString("DiaChi"), rs.getString("NamSinh"), rs.getString("ChucVu"), 
                        rs.getString("SoTaiKhoan"), rs.getInt("Bac")) {
                 };
                canboList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return canboList;
    }
    
    
    
    public static List<BangLuongChiTiet> findAllBangLuongUserChiTiet(){
        List<BangLuongChiTiet>bangluongchitietList=new ArrayList<>();
        String query = "SELECT*FROM bangluongchitiet WHERE MaCB = '"+index +"'";
        try{
            Connection conn =getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                 BangLuongChiTiet st = new BangLuongChiTiet(rs.getInt("MaBangLuong"), rs.getInt("MaCB"),rs.getInt("Thang"),rs.getInt("Nam"), rs.getInt("LuongCoSo"), rs.getInt("LuongCung"),rs.getInt("PhuCapThamNien"),rs.getInt("PhuCapChucVu"),rs.getInt("TongLuong")) {
                 };
                bangluongchitietList.add(st);
            }
            conn.close();
        } catch (Exception e){
        }
        return bangluongchitietList;
    }
    
    
    
    
    




}




        