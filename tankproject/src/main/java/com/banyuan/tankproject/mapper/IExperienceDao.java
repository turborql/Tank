package com.banyuan.tankproject.mapper;


import com.banyuan.tankproject.domain.DO.Experience;

/**
 * @author edz
 */
public interface IExperienceDao {
    /**
     * 增加并保存用户
     */
    void saveExperience(Experience experience);

}
