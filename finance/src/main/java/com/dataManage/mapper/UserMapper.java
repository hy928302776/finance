package com.dataManage.mapper;

import com.dataManage.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>, tk.mybatis.mapper.common.MySqlMapper<User> {

}
