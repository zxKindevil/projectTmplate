package com.ibatis.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ibatis.bean.template;
import com.ibatis.dao.templateDAOImp;

public class concurrencyTest {
	public static templateDAOImp imp=new templateDAOImp();
	public static int count=1;
	
	private int id=count++;
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++)
		{
			exec.execute(
					new Thread(){
						concurrencyTest test=new concurrencyTest();
						public void run(){
							test.insert();
						}
					}
				);
		}
		
	}
	
	public void insert()
	{
		template template=new template();
		template.setStr1("test"+id);
		template.setStr2("test"+id);
		boolean ret=imp.insert(template);
		System.out.println(ret);
	}
	
	public void selectByID(){
		template template=new template();
		template.setStr1("test"+id);
		template.setStr2("test"+id);
		boolean ret=imp.insert(template);
		System.out.println(ret);
	}
}
