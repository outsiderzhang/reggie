package com.zhang.reggie.mapper;

import com.zhang.reggie.entity.AddressBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 13269
* @description 针对表【address_book(地址管理)】的数据库操作Mapper
* @createDate 2022-08-27 14:33:00
* @Entity com.zhang.reggie.entity.AddressBook
*/
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}




