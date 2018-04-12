package pirma;

import java.util.Scanner;

public class Pirminiai {

	public static void main(String[] args) {
		
		Scanner ivestis = new Scanner(System.in);
		int sk = ivestis.nextInt();
		
		
		
		for(int i = 2; i<sk; i++){
			
			if(sk % sk == 0){
				System.out.println("pirminis");
			}else{
				System.out.println("nepirminis");
			}
			
		}

			
			
	}
}
