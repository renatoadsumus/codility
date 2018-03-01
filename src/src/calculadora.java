package src;





public class calculadora {

	private static String textodamensagem="o valor e: "; 
	
	
	public static void main(String[] args) {
	
		
		
		somar(5,3);
	    diminuir(6,4);
	    dividir(8,4);              
	    multiplicação(4,6);
	   quadrado(25);
	    coparação(5,10,20);
	    coparação(6,5,1);
	    coparação(3,5,2);
	   
	    
	}
	
	@SuppressWarnings("unused")
	public static void somar(int valorA,int valorB)
	{
		int resultado=valorA + valorB;
		
		System.out.println(textodamensagem + "soma "+ resultado);
	}   
	
	public static void diminuir(int valorA,int valorB) 
	{
	int resultado=valorA - valorB;
	System.out.println(textodamensagem +"diminuição " + resultado);
	}
	
	
		
		
		public static void dividir(int valorA,int valorB)
		{
     int resultado=valorA/valorB;
	System.out.println(textodamensagem + "divisão "+ resultado);
	
	}
public static void multiplicação(int valorA,int valorB)
{
	int resultado=valorA*valorB;
	System.out.println(textodamensagem + "multiplicação " + resultado);
}


public static void quadrado (int valorA)
{ 
	int resultado=valorA*valorA;
	System.out.println(textodamensagem + "quadrado " + resultado);
}




	
public static void coparação (int valorA,int valorB,int valorC)
{
	int maiorvalor=valorA;

	if(maiorvalor<valorB)
	{
		maiorvalor=valorB;
		
	}
	
	
if(maiorvalor<valorC)
	
{
maiorvalor=valorC;
	

}


System.out.println("o maior valor enre os 3 numeors e " + maiorvalor);


}
}
		
		
	
		














