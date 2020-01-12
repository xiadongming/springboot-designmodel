package com.itchina.single.lazy;
public class SingleModelStaticLazySyn2Demo {

	private static SingleModelStaticLazySyn2Demo singleModelStaticLazySyn;

	private SingleModelStaticLazySyn2Demo() {
	}
	public static SingleModelStaticLazySyn2Demo getInstance() {
		if (null == singleModelStaticLazySyn) {
			
			synchronized (SingleModelStaticLazySyn2Demo.class) {
				singleModelStaticLazySyn = new SingleModelStaticLazySyn2Demo();
			}
		}
		return singleModelStaticLazySyn;
	}
}
