package cn.cqupt.work2_3;

public class Test3_2 {
	public static void main(String args[]){
		char a[] = {'金','木','水','火','土'};
		char s = 'a';
		int c;
		for(int i = 0 ; i < a.length ; i++){
			a[i] = (char)(a[i]^s);
		}
		System.out.println("加密");
		for(int i = 0 ; i < a.length ; i++){
			System.out.printf("%3c",a[i]);
		}
		for(int i = 0 ; i < a.length ; i++){
			a[i] = (char)(a[i]^s);
		}
		System.out.printf("%n源码%n");
		for(int i = 0 ; i < a.length ; i++){
			System.out.printf("%3c",a[i]);
		}
		System.out.printf("\n%3d" , c = 12>8?100:200);
	}
}
