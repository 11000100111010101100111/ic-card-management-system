package com.nhky.personalInformation.dao;

import com.nhky.personalInformation.pojo.FundVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 波罗的海
 * Date: 2021/11/8
 * Time: 20:57
 **/
@Repository("fundDao")
public interface FundDao {
    //分页查询余额明细列表
    //index:第几页
    //items:每页多少条
    public List<FundVO> getPageInfo(@Param("start") Integer start,@Param("end") Integer end,@Param("uid") Long uid);

    //签到、充值
    public Integer addMoney(@Param("uid") Long uid,@Param("money") String money);
    //获取账户余额
    public String getAccountBlance(@Param("uid") Long uid);
    //获取卡余额
    public String getCardBlance(@Param("uid") Long uid);
}
