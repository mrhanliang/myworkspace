package cn.cqupt.work2_3;

public class Test3work2 {
	public static void main(String args[]){
		int i = 1;
		int j = 0;
		while(i <= 1000){
			if(i%3 == 0 && i%7 == 0){
			j = j + i;
			}
			i++;
		}
		System.out.println("从1到1000间能同时被3和7整除的数之和为：" + j);
	}
}
