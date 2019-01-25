package com.eric.coupon.service;

import com.eric.coupon.bean.CouponReceive;
import com.eric.seckill.common.model.CommonResult;
import com.eric.seckill.common.model.feign.CouponQueryResponse;
import com.eric.seckill.common.model.feign.UsingCouponRequest;

import java.util.List;

/**
 * @author wang.js on 2019/1/25.
 * @version 1.0
 */
public interface CouponReceiveService {

	/**
	 * 根据优惠券号获取优惠券信息
	 *
	 * @param couponSns
	 * @return
	 */
	CommonResult<List<CouponQueryResponse>> findCoupons(List<String> couponSns);

	/**
	 * 批量保存
	 * @param couponReceives
	 * @param couponNum
	 */
	boolean insertBatch(List<CouponReceive> couponReceives, Integer couponNum);

	/**
	 * 标记优惠券状态为正在使用中
	 * @param request
	 * @return
	 */
	CommonResult<List<Void>> markAsUsing(UsingCouponRequest request);
}
