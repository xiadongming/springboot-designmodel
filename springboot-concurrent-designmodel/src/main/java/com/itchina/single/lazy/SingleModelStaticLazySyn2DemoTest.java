package com.itchina.single.lazy;

public class SingleModelStaticLazySyn2DemoTest {

	private static SingleModelStaticLazySyn2DemoTest singleModelStaticLazySyn ;
	
	private SingleModelStaticLazySyn2DemoTest() {
		
	}
	public static synchronized SingleModelStaticLazySyn2DemoTest getInstance() {
		
		if( null == singleModelStaticLazySyn) {
			singleModelStaticLazySyn = new SingleModelStaticLazySyn2DemoTest();
		}
		return singleModelStaticLazySyn;
	}
	
}
