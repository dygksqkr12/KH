package com.kh.test.product.controller;

import com.kh.test.product.model.vo.Computer;
import com.kh.test.product.model.vo.Sugar;

public class KHFactory {

	public static void main(String[] args) {
		Computer c = new Computer(1, "KH컴퓨터", 123456);
//		System.out.println(c.makeProduck());

		Sugar s = new Sugar(2, "KH설탕", "흑설탕", 5);
//		System.out.println(s.makeProduct());

	}

}
