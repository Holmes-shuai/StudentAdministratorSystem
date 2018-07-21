package cn.HolmesCraft.Six;

import java.util.Scanner;
import java.util.Arrays;

public class Administrator {

	static String msg="\t编号\t姓名\t年龄\tjava\tc#\thtml\tsql\t总分\t平均分";

	Scanner Lol= new Scanner(System.in);


	public int testInt() {     //测试输入字符是否为int类型，并录入
		while(!Lol.hasNextInt()) {
			System.out.println("请输入一个自然数！");
			Lol.next();	
		}
		return Lol.nextInt();
	}

	public boolean find(int on,Student[] air) {   //检测某编号是否有学生存在
		if(0<=on&&on<air.length) {
			for(int i=0;i<air.length;i++) {
				if(air[i]!=null) {
					if(air[on]==air[i]) {
						return true;
					}
				}else {
					return false;
				}
			}
			return false;
		}
		return false;
	}

	public void export(Student[] air) { //打印学生表格
		System.out.println(msg);
		for(int i=0;i<air.length;i++) {
			if(air[i]!=null) {
				System.out.println(air[i].toString());
			}
		}
	}

	public void create(String name,int age,Student[] air) {     //添加学生的方法
		Student stu=new Student();
		stu.setName(name);
		stu.setAge(age);
		if(this.testAir(air)!=999999999) {
			stu.setOn(this.testAir(air));
			air[this.testAir(air)]=stu;
		}else {
			System.out.println(">>已达系统最大存储学生量，无法添加学生。");
		}
	}

	public int testAir(Student[] air) {     //检测数组是否有空余,并返回空余数组的位置
		for(int i = 0;i<air.length;i++) {
			if(air[i]==null) {
				return i;
			}
		}
		return 999999999;
	}

	public void select(int on,Student[] air) {   //查找某编号学生的方法
		if(this.find(on, air)) {
			System.out.println(msg);
			System.out.println(air[on]);
		}else {
			System.out.println(">>该编号的学生不存在");
		}
	}

	public void update(int on,String name,int age,Student[] air) {   //更新学生基本信息的方法
		if(this.find(on, air)) {
			air[on].setAge(age);
			air[on].setName(name);
			System.out.println(msg);
			System.out.println(air[on]);
		}else {
			System.out.println(">>该编号的学生不存在");
		}
	}

	public void delete(int on,Student[] air) {  //删除学生的方法
		if(this.find(on, air)) {
			air[on]=null;
			System.out.println(">>已删除");
		}else {
			System.out.println(">>该编号的学生不存在");
		}
	}

	public void input(int on,Student[] air) {  //输入学生成绩信息的方法
		if(this.find(on, air)) {
			System.out.println("请输入你的java成绩！");
			air[on].setJava(this.testInt());
			System.out.println("请输入你的C#成绩！");
			air[on].setC_shar(this.testInt());
			System.out.println("请输入你的html成绩！");
			air[on].setHtml(this.testInt());
			System.out.println("请输入你的sql成绩！");
			air[on].setSql(this.testInt());
			air[on].setSum();
			air[on].setAvg();
			System.out.println(">>录入完成");
		}else {
			System.out.println(">>该编号的学生不存在");
		}
	}

	public void subject(int subject,Student[] air) {
		switch(subject) {
		case 1:
			for(int i=0;i<air.length;i++) {
				for(int j=i+1;j<air.length;j++) {
					if(air[i]!=null&&air[j]!=null) {
						if(air[i].getJava()<air[j].getJava()) {
							Student a=air[i];
							air[i]=air[j];
							air[j]=a;
						}
					}
				}
			}
			break;
		case 2:
			for(int i=0;i<air.length;i++) {
				for(int j=i+1;j<air.length;j++) {
					if(air[i]!=null&&air[j]!=null) {
						if(air[i].getC_shar()<air[j].getC_shar()) {
							Student a=air[i];
							air[i]=air[j];
							air[j]=a;
						}
					}
				}
			}
			break;
		case 3:
			for(int i=0;i<air.length;i++) {
				for(int j=i+1;j<air.length;j++) {
					if(air[i]!=null&&air[j]!=null) {
						if(air[i].getHtml()<air[j].getHtml()) {
							Student a=air[i];
							air[i]=air[j];
							air[j]=a;
						}
					}
				}
			}
			break;
		case 4:
			for(int i=0;i<air.length;i++) {
				for(int j=i+1;j<air.length;j++) {
					if(air[i]!=null&&air[j]!=null) {
						if(air[i].getSql()<air[j].getSql()) {
							Student a=air[i];
							air[i]=air[j];
							air[j]=a;
						}
					}
				}
			}
			break;
		}
	}
	
	public void sum(Student[] air) {
		for(int i=0;i<air.length;i++) {
			for(int j=i+1;j<air.length;j++) {
				if(air[i]!=null&&air[j]!=null) {
					if(air[i].getSum()<air[j].getSum()) {
						Student a=air[i];
						air[i]=air[j];
						air[j]=a;
					}
				}
			}
		}
	}
}
