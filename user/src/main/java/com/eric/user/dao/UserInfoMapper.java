package com.eric.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eric.user.bean.UserInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author wang.js on 2019/1/16.
 * @version 1.0
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

	/**
	 * 查询用户的余额
	 *
	 * @param userInfoId
	 * @return
	 */
	Integer findUserBalanceByUserInfoId(@Param("userInfoId") String userInfoId);

	/**
	 * 更新用户余额
	 *
	 * @param userInfoId
	 * @param balance
	 * @return
	 */
	int updateUserBalance(@Param("userInfoId") String userInfoId, @Param("balance") int balance);

	/**
	 * 根据用户id查询用户信息id
	 *
	 * @param userId
	 * @return
	 */
	String findUserInfoIdByUserId(@Param("userId") String userId);

	/**
	 * 根据用户信息id获取用户的积分
	 *
	 * @param userInfoId
	 * @return
	 */
	Integer findUserPointByUserInfoId(@Param("userInfoId") String userInfoId);

	/**
	 * 修改用户积分
	 *
	 * @param userInfoId
	 * @param point
	 * @param userLevel
	 * @return
	 */
	int updateUserPoint(@Param("userInfoId") String userInfoId, @Param("point") int point,
	                    @Param("userLevel") String userLevel);

	/**
	 * 根据用户id获取用户等级
	 *
	 * @param userId
	 * @return
	 */
	String findUserLevelIdByUserId(@Param("userId") String userId);
}
