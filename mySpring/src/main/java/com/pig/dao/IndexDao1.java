package com.pig.dao;

import org.springframework.stereotype.Component;

/**
 * @Author: pig
 * @Date: 2019/12/27$
 */
@Component
public class IndexDao1 implements IndexDao{
	@Override
	public void query() {
		System.out.println("宏 别想她了，你也要有自己的生活");
	}
}
