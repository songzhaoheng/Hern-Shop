package com.hern.util;

import java.util.UUID;

/**
 * @program: hern-shop
 * @description: UUID生成
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-02-22 20:18
 **/
public class UUIDUtil {

	public static String getUUID(){
		String str=UUID.randomUUID().toString();
		str=str.replace("-", "");
		return str;
	}
}
