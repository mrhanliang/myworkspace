package cn.cqupt.work2_3;

import java.util.*;

public class Test3work1 {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("输入x值为：");
		int x = reader.nextInt();
		int y;
		if(x < 0){
			y = -1 + 2*x;
		}else if(x == 0){
			y = -1;
		}else{
			y = -1 + 3*x;
		}
		System.out.printf("%d的对应y的值为：%d\n",x,y);
	}
}
