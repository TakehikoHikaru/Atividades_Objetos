package Arrays;

import java.util.Arrays;

public class arrays {

	
	public static void ImprimirArray(int[] Array) {
	for(int i = 0;i<Array.length;i++) {
		System.out.printf("Possi��o %d � igual: %d\n",i,Array[i]);
}
}
	
	public static void main(String[] args) {
		int maior = 0;
		double media = 0;
		int[] num = {3,5,1,23,515,663,664,34,3,1,345,23};
				
		ImprimirArray(num);

		Arrays.sort(num);
		
		ImprimirArray(num);
		
		for(int i = 0;i<num.length;i++) {
			media += num[i];
		}
		media /= num.length;
		System.out.println("A media �: "+ media+"\n");
	
	
		for(int i = 0;i<num.length;i++) {
			if(maior<num[i]) {
				maior = num[i];
			}
		}
		System.out.println("O maior numero �: "+maior+"\n");
		
	
	
	}
		
		
		
		
		
		

	}


