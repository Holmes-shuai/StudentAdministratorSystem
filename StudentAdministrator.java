package cn.HolmesCraft.Six;

import java.util.Scanner;

public class StudentAdministrator {
	public static void main(String[] args) {
		
		Administrator admin=new Administrator();
		
		Scanner Lol=new Scanner(System.in);
		
		System.out.println("--请定义人数--");
		int number=admin.testInt();
		
		Student[] stu=new Student[number];
		
		int i = 0;
		while(!(i==99)) {
			
			System.out.println(">>请选择你要执行的功能：");
			System.out.println("10：添加一个学生");
			System.out.println("11：查找一个学生");
			System.out.println("12：根据学生编号更新学生基本信息");
			System.out.println("13：根据学生编号删除学生");
			System.out.println("14：根据学生编号输入学生各门成绩");
			System.out.println("15：根据某门成绩进行排序");
			System.out.println("16：总分进行排序");
			System.out.println("99：退出系统");
			
			i=admin.testInt();
			
			switch(i) {
			case 10:			
				System.out.println(">>执行创建学生的操作");
				
				System.out.println("请输入学生的姓名：");
				String name=Lol.next();
				System.out.println("请输入学生的年龄：");
				int age=admin.testInt();
				admin.create(name, age, stu);
				admin.export(stu);
				break;
			case 11:
				System.out.println(">>执行查找学生的操作");
				
				System.out.println("请输入你要查询的学生编号：");
				int on=admin.testInt();
				admin.select(on,stu);
				break;
			case 12:
				System.out.println(">>执行更新学生信息的操作");
				
				System.out.println("请输入你要更新的学生编号：");
				int on1=admin.testInt();
				System.out.println("请输入你要更新学生的姓名：");
				String name1=Lol.next();
				System.out.println("请输入你要更新学生的年龄：");
				int age1=admin.testInt();
				admin.update(on1, name1, age1, stu);
				break;
			case 13:
				System.out.println(">>执行删除学生的操作");
				
				System.out.println("请输入你要删除的学生编号：");
				int on2=admin.testInt();
				admin.delete(on2, stu);
				admin.export(stu);
				break;
			case 14:
				System.out.println(">>执行输入学生成绩的操作");
				
				System.out.println("请输入你要输入成绩的学生编号：");
				int on3=admin.testInt();
				admin.input(on3, stu);
				admin.export(stu);
				break;
			case 15:
				System.out.println(">>执行根据学生某门成绩排名的操作");
				
				System.out.println("请选择你要根据的成绩：（1.java 2.C# 3.html 4.sql）");
				int subject=admin.testInt();
				admin.subject(subject, stu);
				admin.export(stu);
				break;
			case 16:
				System.out.println(">>执行根据总分进行排名的操作");
				
				admin.sum(stu);
				admin.export(stu);
				break;
			case 99:
				i=99;
				break;
			default:
				System.out.println(">>请输入正确的数字！");
				break;
			}
		}
	}
}