package com.woorifis.day2.controller;

import java.util.ArrayList;
import java.util.List;

// 멤버변수가 없고 기능만 stateless 규정 싱글턴

public class MakeGugu {

	private static MakeGugu gugu = new MakeGugu();

	private MakeGugu() {}
	
	public static MakeGugu getInstance() {
		return gugu;
	}

	public List<Integer> getGugu(int dan) {

		List<Integer> gugu = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			gugu.add(dan * (i + 1));
		}
		return gugu;

	}
}
