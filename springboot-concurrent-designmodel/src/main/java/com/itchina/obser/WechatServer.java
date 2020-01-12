package com.itchina.obser;

import java.util.ArrayList;
import java.util.List;

//类似微信公众号
public class WechatServer implements Observeable {
	public List<Observer> oberverList;
	public String message;
	
	public WechatServer() {
		oberverList = new ArrayList<Observer>();
	}
	//微信公众号定义一个方法，用于更新公众号数据，并调用notifyObserver()，通知用户
	public void weChatUpdate(String s) {
		 this.message = s;
		notifyObserver();
	}
	@Override
	public void registerObserver(Observer observer) {
		oberverList.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		oberverList.remove(observer);
	}
	@Override
	public void notifyObserver() {
		for (Observer observer : oberverList) {
			observer.update(message);
		}
	}


}
