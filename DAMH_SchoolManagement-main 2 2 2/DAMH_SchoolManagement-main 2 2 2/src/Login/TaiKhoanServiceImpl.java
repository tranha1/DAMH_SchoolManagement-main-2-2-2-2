
package Login;


/**
 *
 * @author admin
 */
public class TaiKhoanServiceImpl implements TaiKhoanService{
    private TaiKhoanSQL taiKhoanSQL = null;
    public TaiKhoanServiceImpl(){
        taiKhoanSQL = new TaiKhoanSQLImpl();
    }

    @Override
    public TaiKhoan login(String tdn, String mk) {
        return taiKhoanSQL.login(tdn, mk);
    }
    
}
