package edu.tinzel.springclock.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.tinzel.springclock.desktop.QuartzJob;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		QuartzJob quartzJob=(QuartzJob) ctx.getBean("QuartzJob");
		quartzJob.work();
	}
}
