import java.util.Scanner;

public class AreaTri {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Area = 0;
		switch (Area) {
		case 1 :
			double base, altura, resultado;     
	        Scanner obj = new Scanner(System.in);
	         
	        System.out.print("Ingrese base:\t");
	        base = obj.nextDouble();
	         
	        System.out.print("Ingrese altura:\t");
	        altura = obj.nextDouble();
	         
	        resultado = ((base*altura)/2);
	         
	        System.out.print("El area del Triangulo es:\t"+resultado);
	        break;
	        
		case 2 :
			double lado1 = 0, lado2 = 0, resultado1;
			Scanner obj1 = new Scanner (System.in);
			System.out.print("Ingese el primer lado:\t");
			System.out.print("ingrese el segundo lado:\t");
			resultado1= (lado1*lado2);
			System.out.print("El area del cuadrado es:\t"+ resultado1);
			
			
		case 3 :
		}
		
		}
	}


