package cn.rayest.mybatis02.persistence;

import cn.rayest.mybatis02.model.Grade;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

//ӳ�����ӿ�
public interface GradePersistence {
     Grade findById(Integer id);
}
