package cn.cqupt.work1;

import java.util.*;

public class Test2_4test {
	public static void main(String arg[]){
		Scanner reader = new Scanner(System.in);
		double j = reader.nextDouble();
		int i = 0;
		while(reader.hasNextDouble()){
			double x = reader.nextDouble();
			i++;
			j = j / x;
		}
		System.out.printf("%d个个数的数相除的商是：%f" , i , j);
	}
}
