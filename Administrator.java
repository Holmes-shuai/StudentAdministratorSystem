package cn.HolmesCraft.Six;

import java.util.Scanner;
import java.util.Arrays;

public class Administrator {

	static String msg="\t���\t����\t����\tjava\tc#\thtml\tsql\t�ܷ�\tƽ����";

	Scanner Lol= new Scanner(System.in);


	public int testInt() {     //���������ַ��Ƿ�Ϊint���ͣ���¼��
		while(!Lol.hasNextInt()) {
			System.out.println("������һ����Ȼ����");
			Lol.next();	
		}
		return Lol.nextInt();
	}

	public boolean find(int on,Student[] air) {   //���ĳ����Ƿ���ѧ������
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

	public void export(Student[] air) { //��ӡѧ�����
		System.out.println(msg);
		for(int i=0;i<air.length;i++) {
			if(air[i]!=null) {
				System.out.println(air[i].toString());
			}
		}
	}

	public void create(String name,int age,Student[] air) {     //���ѧ���ķ���
		Student stu=new Student();
		stu.setName(name);
		stu.setAge(age);
		if(this.testAir(air)!=999999999) {
			stu.setOn(this.testAir(air));
			air[this.testAir(air)]=stu;
		}else {
			System.out.println(">>�Ѵ�ϵͳ���洢ѧ�������޷����ѧ����");
		}
	}

	public int testAir(Student[] air) {     //��������Ƿ��п���,�����ؿ��������λ��
		for(int i = 0;i<air.length;i++) {
			if(air[i]==null) {
				return i;
			}
		}
		return 999999999;
	}

	public void select(int on,Student[] air) {   //����ĳ���ѧ���ķ���
		if(this.find(on, air)) {
			System.out.println(msg);
			System.out.println(air[on]);
		}else {
			System.out.println(">>�ñ�ŵ�ѧ��������");
		}
	}

	public void update(int on,String name,int age,Student[] air) {   //����ѧ��������Ϣ�ķ���
		if(this.find(on, air)) {
			air[on].setAge(age);
			air[on].setName(name);
			System.out.println(msg);
			System.out.println(air[on]);
		}else {
			System.out.println(">>�ñ�ŵ�ѧ��������");
		}
	}

	public void delete(int on,Student[] air) {  //ɾ��ѧ���ķ���
		if(this.find(on, air)) {
			air[on]=null;
			System.out.println(">>��ɾ��");
		}else {
			System.out.println(">>�ñ�ŵ�ѧ��������");
		}
	}

	public void input(int on,Student[] air) {  //����ѧ���ɼ���Ϣ�ķ���
		if(this.find(on, air)) {
			System.out.println("���������java�ɼ���");
			air[on].setJava(this.testInt());
			System.out.println("���������C#�ɼ���");
			air[on].setC_shar(this.testInt());
			System.out.println("���������html�ɼ���");
			air[on].setHtml(this.testInt());
			System.out.println("���������sql�ɼ���");
			air[on].setSql(this.testInt());
			air[on].setSum();
			air[on].setAvg();
			System.out.println(">>¼�����");
		}else {
			System.out.println(">>�ñ�ŵ�ѧ��������");
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