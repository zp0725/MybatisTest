import dao.AdminDAO;
import dao.ShopDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Admin;
import pojo.Shop;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String path ="mybatis.xml";
        InputStream is=null;
        try {
             is =Resources.getResourceAsStream(path);
             SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
             SqlSession session=factory.openSession();
//             AdminDAO dao=session.getMapper(AdminDAO.class);
            ShopDAO dao=session.getMapper(ShopDAO.class);
            List<Shop> shops=dao.getAll();
            for (Shop s:shops){
                System.out.println(s);
            }

//             Admin admin=new Admin();
//             admin.setId(10042);
//             admin.setUsername("admin111");
//             dao.addAdmin(admin);

//             List<Admin> lists=dao.getAll(null,null);
//             List<Admin> lists=dao.getByIdName(10001,"admin1");
//             for(Admin a:lists){
//                 System.out.println(a);
//             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
