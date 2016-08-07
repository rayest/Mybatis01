package cn.rayest.mybatis02.persistence;

import cn.rayest.mybatis02.model.Address;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

//Ó³ÉäÆ÷½Ó¿Ú
public interface AddressPersistence {
     Address findById(Integer id);
}
