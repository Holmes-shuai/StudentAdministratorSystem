package cn.HolmesCraft.Six;

import java.util.Scanner;

public class StudentAdministrator {
	public static void main(String[] args) {
		
		Administrator admin=new Administrator();
		
		Scanner Lol=new Scanner(System.in);
		
		System.out.println("--�붨������--");
		int number=admin.testInt();
		
		Student[] stu=new Student[number];
		
		int i = 0;
		while(!(i==99)) {
			
			System.out.println(">>��ѡ����Ҫִ�еĹ��ܣ�");
			System.out.println("10�����һ��ѧ��");
			System.out.println("11������һ��ѧ��");
			System.out.println("12������ѧ����Ÿ���ѧ��������Ϣ");
			System.out.println("13������ѧ�����ɾ��ѧ��");
			System.out.println("14������ѧ���������ѧ�����ųɼ�");
			System.out.println("15������ĳ�ųɼ���������");
			System.out.println("16���ֽܷ�������");
			System.out.println("99���˳�ϵͳ");
			
			i=admin.testInt();
			
			switch(i) {
			case 10:			
				System.out.println(">>ִ�д���ѧ���Ĳ���");
				
				System.out.println("������ѧ����������");
				String name=Lol.next();
				System.out.println("������ѧ�������䣺");
				int age=admin.testInt();
				admin.create(name, age, stu);
				admin.export(stu);
				break;
			case 11:
				System.out.println(">>ִ�в���ѧ���Ĳ���");
				
				System.out.println("��������Ҫ��ѯ��ѧ����ţ�");
				int on=admin.testInt();
				admin.select(on,stu);
				break;
			case 12:
				System.out.println(">>ִ�и���ѧ����Ϣ�Ĳ���");
				
				System.out.println("��������Ҫ���µ�ѧ����ţ�");
				int on1=admin.testInt();
				System.out.println("��������Ҫ����ѧ����������");
				String name1=Lol.next();
				System.out.println("��������Ҫ����ѧ�������䣺");
				int age1=admin.testInt();
				admin.update(on1, name1, age1, stu);
				break;
			case 13:
				System.out.println(">>ִ��ɾ��ѧ���Ĳ���");
				
				System.out.println("��������Ҫɾ����ѧ����ţ�");
				int on2=admin.testInt();
				admin.delete(on2, stu);
				admin.export(stu);
				break;
			case 14:
				System.out.println(">>ִ������ѧ���ɼ��Ĳ���");
				
				System.out.println("��������Ҫ����ɼ���ѧ����ţ�");
				int on3=admin.testInt();
				admin.input(on3, stu);
				admin.export(stu);
				break;
			case 15:
				System.out.println(">>ִ�и���ѧ��ĳ�ųɼ������Ĳ���");
				
				System.out.println("��ѡ����Ҫ���ݵĳɼ�����1.java 2.C# 3.html 4.sql��");
				int subject=admin.testInt();
				admin.subject(subject, stu);
				admin.export(stu);
				break;
			case 16:
				System.out.println(">>ִ�и����ֽܷ��������Ĳ���");
				
				admin.sum(stu);
				admin.export(stu);
				break;
			case 99:
				i=99;
				break;
			default:
				System.out.println(">>��������ȷ�����֣�");
				break;
			}
		}
	}
}