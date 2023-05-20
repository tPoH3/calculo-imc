import java.util.Scanner;

//instrução1
//instrução2
//instrução3
//instrução4
//instrução5
//...

class pesoIdeal{
	  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			
	
	
	double peso, altura, imc;
	
	System.out.printf("Digite a sua altura: \n");
	
	altura = teclado.nextDouble();
	
	System.out.printf("Digite o seu peso em kg: \n");
	
	peso   = teclado.nextDouble();
	
	imc     = peso / (altura * altura) * 10000;
	
	System.out.printf("O seu IMC e: \n"+imc+"\n");
	
	if(imc < 18.5)
	{
		System.out.printf("Voce esta abaixo do seu peso");
	}
	else if(imc >= 18.5 || imc <= 24.9)
	{
		System.out.printf("Voce esta no seu peso normal");
	}
	else if(imc >= 25 || imc <= 29.9)
	{
		System.out.printf("Voce esta no pre-obesidade");
	}
	else if(imc >= 30 || imc <= 34.9)
	{
		System.out.printf("Voce esta no Obesidade GRAU 1");
	}
	else if(imc >= 35 || imc <= 39.9)
	{
		System.out.printf("Voce esta no Obesidade GRAU 2");
	}
	else if(imc > 40)
	{
		System.out.printf("Voce esta no Obesidade GRAU 3");
	}	
	 System.exit(0);
	}
	
}