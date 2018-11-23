import java.util.Scanner;

public class PruebaOrdenamiento {

	static void llenarArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) (Math.random() * 100) + 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vectorA[]=new int[1000];
		int vectorB[]=new int[10000];
		int vectorC[]=new int[100000];
		int vectorD[]=new int[1000000];
		llenarArray(vectorA);
		llenarArray(vectorB);
		llenarArray(vectorC);
		llenarArray(vectorD);
		String opcion="";
		Scanner sc= new Scanner(System.in);
		Ordenamiento obj=new Ordenamiento();
		do {
System.out.println("----Seleccione Algoritmo-----\n A)Burbuja_1\nB)Burbuja_2\nC)Burbuja_3\nD)Insercion\nZ)Salir");
 opcion =sc.nextLine().toUpperCase();
if(opcion.equals("A")) {
	System.out.println("eliga cantidad de numeros para la prueba de estres...\nA)1000\nB)10,000\nC)100,000\nD)Un Millon");
	String var=sc.nextLine().toUpperCase();
	if(var.equals("A")) {
		int arrayAux[]=vectorA.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja1(arrayAux);
	}
	if(var.equals("B")) {
		int arrayAux[]=vectorB.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja1(arrayAux);
	}
	if(var.equals("C")) {
		int arrayAux[]=vectorC.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja1(arrayAux);
	}
	if(var.equals("D")) {
		int arrayAux[]=vectorD.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja1(arrayAux);
	}
}
else if(opcion.equals("B")) {
	System.out.println("eliga cantidad de numeros para la prueba de estres...\nA)1000\nB)10,000\nC)100,000\nD)Un Millon");
	String var=sc.nextLine().toUpperCase();
	if(var.equals("A")) {
		int arrayAux[]=vectorA.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja2(arrayAux);
	}
	if(var.equals("B")) {
		int arrayAux[]=vectorB.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja2(arrayAux);
	}
	if(var.equals("C")) {
		int arrayAux[]=vectorC.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja2(arrayAux);
	}
	if(var.equals("D")) {
		int arrayAux[]=vectorD.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja2(arrayAux);
	}
	
}
else if(opcion.equals("C")) {
	System.out.println("eliga cantidad de numeros para la prueba de estres...\nA)1000\nB)10,000\nC)100,000\nD)Un Millon");
	String var=sc.nextLine().toUpperCase();
	if(var.equals("A")) {
		int arrayAux[]=vectorA.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja3(arrayAux);
	}
	if(var.equals("B")) {
		int arrayAux[]=vectorB.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja3(arrayAux);
	}
	if(var.equals("C")) {
		int arrayAux[]=vectorC.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja3(arrayAux);
	}
	if(var.equals("D")) {
		int arrayAux[]=vectorD.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.burbuja3(arrayAux);
	}
}
else if(opcion.equals("D")) {
	System.out.println("eliga cantidad de numeros para la prueba de estres...\nA)1000\nB)10,000\nC)100,000\nD)Un Millon");
	String var=sc.nextLine().toUpperCase();
	if(var.equals("A")) {
		int arrayAux[]=vectorA.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.insercion(arrayAux);
	}
	if(var.equals("B")) {
		int arrayAux[]=vectorB.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.insercion(arrayAux);
	}
	if(var.equals("C")) {
		int arrayAux[]=vectorC.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.insercion(arrayAux);
	}
	if(var.equals("D")) {
		int arrayAux[]=vectorD.clone();
		System.out.println("Array desordenado:");
		obj.mostrarArray(arrayAux);
		System.out.println("Array ordenado:");
		obj.insercion(arrayAux);
	}
}
		}while(!opcion.equals("Z"));


sc.close();

	}

}
