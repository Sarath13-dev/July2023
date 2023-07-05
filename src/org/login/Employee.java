package org.login;
//Class - Static Memory
public class Employee {
	public static void main(String[] args) {
		
		int [] a = {1, 2, 0, 3, 0};
		int s = 0;
		int e = a.length-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==0 && i<e) {
				int temp = a[e];
				a[e]= a[i];
				a[i]=temp;
				i--;
				e--;
			//	System.out.println(e);
			}			
		}
		//i=0; i=1; i=2 a[2]=0, temp = 0; a[4] = 0; a[2]=0; {1, 2, 0, 3, 0}
		//i=1; 
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

	
}
