package com.itchina.obser;


//被观察者接口，，观察者需要向其注册，，被观察者向观察者更新消息
public interface Observeable {
	
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObserver();

}
