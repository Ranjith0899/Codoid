package task.one;

public class Print {
	 public static void main(String[] args) {
			for (int i = 1; i <=5; i++) {
			if (i==3) {
				continue;
			}	
			else {
				for (int j = 0; j<i; j++) {
					System.out.print('*');
				}
				System.out.println();
			}
			}
}}
