package com.itchina.single.lazy;

public class SingleModelStaticLazySynDemo {

	private static SingleModelStaticLazySynDemo singleModelStaticLazySyn ;
	
	private SingleModelStaticLazySynDemo() {
		
	}
	public static synchronized SingleModelStaticLazySynDemo getInstance() {
		
		if( null == singleModelStaticLazySyn) {
			singleModelStaticLazySyn = new SingleModelStaticLazySynDemo();
		}
		return singleModelStaticLazySyn;
	}
	
}
