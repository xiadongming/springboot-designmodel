package com.itchina.obser;

public class ObserverTest {
	
	public static void main(String[] args) {
		
		WechatServer wechatServer = new WechatServer();
		User user = new User();
		User2 user2 = new User2();
		
		wechatServer.registerObserver(user);
		wechatServer.registerObserver(user2);
		
		wechatServer.weChatUpdate("微信公众号更新消息");
		
		
	}

}
