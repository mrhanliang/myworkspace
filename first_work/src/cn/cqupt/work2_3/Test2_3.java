package cn.cqupt.work2_3;

public class Test2_3 {
	public static void main(String args[]){
		char a = 'A';
		float f = 123.12345678F;
		double d = 123456.12345678;
		long x = 5678;
		System.out.printf("%c%n%10.2f%n%10.3f%n%d%n%d",a,f,d,x,x=x+2);
		//%d-----输出整型数；
		//%md-----输出整型数占m列；
		//%c-----输出字符串；
		//%f-----输出浮点数；
		//%m.nf-----输出浮点数占m列保留小数点后n位；
		//%s-----输出字符；
	}
}
