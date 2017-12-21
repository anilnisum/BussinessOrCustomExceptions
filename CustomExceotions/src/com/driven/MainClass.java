package com.driven;

import com.rest.RestLayer;

public class MainClass {
	public static void main(String[] args) {
      RestLayer r = new RestLayer();
      String res =r.getData(101);
      System.out.println(res);
	}

	static void m1() throws Exception {
		throw new Exception();
	}

	static void m2() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void m3() {
		throw new RuntimeException();
	}
}
