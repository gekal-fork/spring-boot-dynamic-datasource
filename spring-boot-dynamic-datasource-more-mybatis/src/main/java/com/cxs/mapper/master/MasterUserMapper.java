package com.cxs.mapper.master;

import com.cxs.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author DELL
* @description 针对表【t_user(用户表)】的数据库操作Mapper
* @createDate 2022-12-27 12:51:32
* @Entity com.cxs.model.User
*/
public interface MasterUserMapper {

    @Insert("insert into t_user values (null, #{userName})")
    Integer insert(User user);
}




