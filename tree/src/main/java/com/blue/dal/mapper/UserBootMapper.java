package com.blue.dal.mapper;

import com.blue.dal.entity.UserBoot;
import com.blue.dal.entity.UserBootExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBootMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int countByExample(UserBootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int deleteByExample(UserBootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int insert(UserBoot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int insertSelective(UserBoot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    List<UserBoot> selectByExample(UserBootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    UserBoot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserBoot record, @Param("example") UserBootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int updateByExample(@Param("record") UserBoot record, @Param("example") UserBootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int updateByPrimaryKeySelective(UserBoot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot_user
     *
     * @mbggenerated Fri Dec 27 21:23:54 CST 2019
     */
    int updateByPrimaryKey(UserBoot record);
}