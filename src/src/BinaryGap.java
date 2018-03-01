package src;

public class BinaryGap {
	
	public static void main(String[] args) {

		System.out.println(binario(15));
		System.out.println(binario(9));
	
	}
	
	
	public static int binario(int N) {
	
		StringBuffer binario = new StringBuffer();
		while (N > 0) {
			int b = N % 2;			
			binario.append(b);
			N = N >> 1;
		}		

		String[] parts1 = binario.reverse().toString().split("1");
		
		if(parts1.length == 0)
			return 0;
		
		
		int maior = parts1[0].length();
		
		for(int i=1 ; i < parts1.length; i++)
		{
			if(maior < parts1[i].length())
			{
				maior = parts1[i].length();
			}
			
		}	
		
		
		return maior;
		
	}
	
}
