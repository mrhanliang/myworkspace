package cn.cqupt.work2_3;

import java.util.*;

public class Test2_5 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("平移前的数为：");
		int x = reader.nextInt();
		System.out.println("平移数为：");
		int i = reader.nextInt();
		System.out.println("向左平移后的结果：" + (x<<i));
		System.out.println("向右平移后的结果：" + (x>>i));
	}
}
