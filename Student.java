package cn.HolmesCraft.Six;

public class Student {
	private int on;//编号
	private String name;//姓名
	private int age;//年龄
	private int java;//java成绩
	private int c_shar;//c#成绩
	private int html;//html成绩
	private int sql;//sql成绩
	private int sum;//总分
	private double avg; //平均分
	public String toString() {
		String msg="\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"+
				this.c_shar+"\t"+this.html+"\t"+this.sql+"\t"+this.getSum()+"\t"+this.getAvg();
		return msg;
		
	}
	public int getOn() {
		return this.on;
	}
	public void setOn(int on) {
		this.on=on;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJava() {
		return this.java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getC_shar() {
		return this.c_shar;
	}
	public void setC_shar(int c_shar) {
		this.c_shar = c_shar;
	}
	public int getHtml() {
		return this.html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getSql() {
		return this.sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getSum() {
		return this.sum;
	}
	public void setSum() {
		this.sum = this.java+this.c_shar+this.html+this.sql;
	}
	public double getAvg() {
		return this.avg;
	}
	public void setAvg() {
		this.avg = this.sum/4;
	}
}