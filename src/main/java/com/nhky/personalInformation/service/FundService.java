package com.nhky.personalInformation.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: 波罗的海
 * Date: 2021/11/8
 * Time: 20:57
 **/
public interface FundService {
    //根据UID获取此人对应账户余额
    public String getBalance(String uid);

    //分页查询余额明细列表
    //index:第几页
    //items:每页多少条
    public String getPage(Integer index,Integer items,String  uid);

    //每日签到
    public String daily(String uid);

    //充值
    //uid : 充值人id
    //money : 充值金额
    //return : 充值时间、充值人名称、充值金额、充值类型、充值卡id

    public String add( String uid,Float money);
}