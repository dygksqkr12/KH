package com.kh.test.fruit.controller;

import java.util.ArrayList;

import com.kh.test.fruit.model.vo.Fruit;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", "달콤"));
		list.add(new Fruit("오렌지", "상큼"));
		list.add(new Fruit("키위", "상큼"));
		
		System.out.println("값 삽입 : " + list);
		
		list.remove(0);
		System.out.println("값 삭제1 : " + list);
		
		list.remove(new Fruit("사과", "달콤"));
		System.out.println("값 삭제2 : " + list);
	}

}
