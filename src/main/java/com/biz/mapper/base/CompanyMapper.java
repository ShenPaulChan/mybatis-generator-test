package com.biz.mapper.base;

import com.biz.domain.base.Company;

public interface CompanyMapper {
    /**
     *
     * @mbggenerated 2017-09-30
     */
    int deleteByPrimaryKey(Integer departId);

    /**
     *
     * @mbggenerated 2017-09-30
     */
    int insert(Company record);

    /**
     *
     * @mbggenerated 2017-09-30
     */
    int insertSelective(Company record);

    /**
     *
     * @mbggenerated 2017-09-30
     */
    Company selectByPrimaryKey(Integer departId);

    /**
     *
     * @mbggenerated 2017-09-30
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     *
     * @mbggenerated 2017-09-30
     */
    int updateByPrimaryKey(Company record);
}