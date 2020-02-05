package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Admin;

import java.util.List;

//面向接口 自己生成实现对象
public interface AdminDAO {
    List<Admin> getAll(@Param("id") Integer id, @Param("username") String username);
    //用注解的形式给参数起名
    List<Admin> getByIdName(@Param("id") Integer id, @Param("username") String username);

    int addAdmin(Admin admin);
}
