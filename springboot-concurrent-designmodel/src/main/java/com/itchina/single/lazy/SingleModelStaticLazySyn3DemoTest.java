package com.itchina.single.lazy;
public class SingleModelStaticLazySyn3DemoTest {

	private static SingleModelStaticLazySyn3DemoTest singleModelStaticLazySyn;

	private SingleModelStaticLazySyn3DemoTest() {
	}
	public static SingleModelStaticLazySyn3DemoTest getInstance() {
		if (null == singleModelStaticLazySyn) {
			
			synchronized (SingleModelStaticLazySyn3DemoTest.class) {
				singleModelStaticLazySyn = new SingleModelStaticLazySyn3DemoTest();
			}
		}
		return singleModelStaticLazySyn;
	}
}
