package aula;


import java.util.Scanner;

public class hoje02 {	

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);

		System.out.println(" digite um numero");
				 n1=leia.nextInt();
		 
			System.out.println(" digite segundo numero");
			 n2=leia.nextInt();
		 
				System.out.println(" digite terceiro numero");
				 n3=leia.nextInt();
				
				 if(n1>=n2 && n1>=n3) {
			            if(n2>=n3) {
			                System.out.printf("%d -> %d -> %d",n3,n2,n1);
			            }else {
			                System.out.printf("%d -> %d -> %d",n2,n3,n1);
			            }
			        }else if(n2>=n1 && n2>=n3) {
			            if(n1>=n3) {
			                System.out.printf("%d -> %d -> %d",n3,n1,n2);
			            }else {
			                System.out.printf("%d -> %d -> %d",n1,n3,n2);
			            }
			        }else if(n3>=n1 && n3>=n2){
			            if(n1>=n2) {
			                System.out.printf("%d -> %d -> %d",n2,n1,n3);
			            }else {
			                System.out.printf("%d -> %d -> %d",n1,n2,n3);
			            }
			        }
		}

	}


