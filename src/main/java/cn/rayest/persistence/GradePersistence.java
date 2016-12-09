package cn.rayest.persistence;

import cn.rayest.model.Grade;

/**
 * Created by Rayest on 2016/6/24 0024.
 */

public interface GradePersistence {
    Grade findById(Integer id);
}
