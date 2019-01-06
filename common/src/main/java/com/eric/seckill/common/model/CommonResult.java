package com.eric.seckill.common.model;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * 通用结果返回
 *
 * @author wang.js
 * @date 2018/12/18
 * @copyright yougou.com
 */
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommonResult<T> extends BaseResult {

	/**
	 * 返回数据结果对象
	 */
	private T data;

	/**
	 * 查询成功返回数据
	 *
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> CommonResult success(T data) {
		CommonResult<T> result = new CommonResult<>();
		result.setData(data);
		return result;
	}

	/**
	 * 查询失败
	 *
	 * @param message
	 * @param code
	 * @param <T>
	 * @return
	 */
	public static <T> CommonResult fail(String message, String code) {
		CommonResult<T> result = new CommonResult<>();
		result.setMessage(message);
		result.setCode(code);
		return result;
	}
}
