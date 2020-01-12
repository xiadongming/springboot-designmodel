package com.itchina.single.lazy;

public class SingleModelStaticLazySyn3Demo {

	// 添加volatile，是数据变化可见，内存共享
	private static volatile SingleModelStaticLazySyn3Demo singleModelStaticLazySyn;

	private SingleModelStaticLazySyn3Demo() {
	}
	public static SingleModelStaticLazySyn3Demo getInstance() {

		if (null == singleModelStaticLazySyn) {

			synchronized (SingleModelStaticLazySyn3Demo.class) {

				if (null == singleModelStaticLazySyn) {
					singleModelStaticLazySyn = new SingleModelStaticLazySyn3Demo();
				}
			}
		}
		return singleModelStaticLazySyn;
	}
}
