package cn.rayest.mybatis02.persistence;

import cn.rayest.mybatis02.model.Address;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

//ӳ�����ӿ�
public interface AddressPersistence {
     Address findById(Integer id);
}
