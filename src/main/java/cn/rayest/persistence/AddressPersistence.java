package cn.rayest.persistence;

import cn.rayest.model.Address;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

public interface AddressPersistence {
    Address findById(Integer id);
}
