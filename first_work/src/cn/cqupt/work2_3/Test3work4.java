package cn.cqupt.work2_3;

public class Test3work4 {
	public static void main(String args[]){
		double i = 1;
		double j = 1;
		double sum = 0;
		while(i <= 10000){
			sum = sum + i;
			j = -1*j;
			i++;
			i = 1/(j*(2*i-1));
		}
		System.out.printf("1-1/3+1/5-1/7+....ǰ10000的和为：%10.10f" , sum);
	}
}
