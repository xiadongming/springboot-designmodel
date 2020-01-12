package com.itchina.proxy.staticproxy;


//代理对象
public class TeacherDaoProxy implements ITeacherDao{

	private ITeacherDao teacherDao;
	
	public TeacherDaoProxy(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public void teacher() {
		System.out.println("==代理之前，做一些事情===");
		teacherDao.teacher();
		System.out.println("==代理之后，做一些事情===");
	}

}
