package Login;

 

import Main.GiaoVienJFrame;
import Main.CanBoJFrame;
import Main.GiaoDien;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 

/**
*
* @author admin
*/
public class TaiKhoanController {
    private Dialog dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    public JPasswordField jtfMatKhau;
    private JLabel jlbMsg;
    private TaiKhoanService taiKhoanService = null;
    public static int index = 0;

 

    public TaiKhoanController(Dialog dialog, JButton btnSubmit, JTextField jtfTenDangNhap, JPasswordField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;
        taiKhoanService = new TaiKhoanServiceImpl();
    }


    //bấm đăng nhập
    public void setEvent(){
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //nếu tên đăng nhập và mật khẩu rỗng thì báo ra msg
                if(jtfTenDangNhap.getText().length() == 0 || jtfMatKhau.getPassword().length == 0){
                    jlbMsg.setText("Vui lòng nhập dữ liệu bắt buộc");
                }

                //nếu taiKhoanService.login trả về taiKhoan null => tài khoản đăng nhập k được lưu trong database, không hợp lệ
                else{
                    char[] password = jtfMatKhau.getPassword();
                    String matkhau = new String(password);
                   //System.out.println("du lieu dang nhap: "+jtfTenDangNhap.getText()+" - "+matkhau);
                    TaiKhoan taiKhoan = taiKhoanService.login(jtfTenDangNhap.getText(), matkhau);
                    if(taiKhoan==null){
                        jlbMsg.setText("Dữ liệu nhập vào sai");
                    }else{
                        if(!taiKhoan.isTinhTrang()){ //tình trạng 1 là ok, 0 là tình trạng bị khoá
                        jlbMsg.setText("Tài khoản hiện bị tạm khóa");
                        }else {
                            dialog.dispose();
                            index = taiKhoan.getIDTaiKhoan();
                            if(1 == taiKhoan.getIDTaiKhoan() || taiKhoan.getIDTaiKhoan() == 2){
                            GiaoDien frame = new GiaoDien();
                            frame.setVisible(true);
                            }
                            else {
                                GiaoVienJFrame frame2 = new GiaoVienJFrame();
                            frame2.setVisible(true);
                            }
                        }
                    }
                }
            }

 

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

 

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));

 

            }


        });
    }

 

    
}