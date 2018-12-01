import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ordenamiento {
	public void burbuja1(int array[]) {
		long tiempoInicial;
		long tiempoFinal;
		int pasadas=0;
		int comparaciones=0;
		int intercambios=0;
		int i=0;
		int j=1;
		int temp=0;
		tiempoInicial=System.currentTimeMillis();
		for(i=0;i<array.length;i++) {
			for(j=i+1;j<array.length;j++) {
				comparaciones++;
				if(array[i]>array[j]) {
					intercambios++;
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				pasadas++;
			}
			
		}
		tiempoFinal=System.currentTimeMillis()-tiempoInicial;
		
		mostrarArray(array);
		System.out.println("Cantidad Pasadas:"+pasadas);
		System.out.println("Cantidad Intercambios:"+intercambios);
		System.out.println("Cantidad comparaciones:"+comparaciones);
		System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
		
	}
	
	public void burbuja2(int array[]) {
		long tiempoInicial;
		long tiempoFinal;
		int pasadas=0;int comparaciones=0;
		int intercambios=0;
		int i=0;
		int j=1;
		int temp=0;
		tiempoInicial=System.currentTimeMillis();
		for(i=1;i<array.length;i++) {
			comparaciones++;
			for(j=0;j<array.length-1;j++) {
				if(array[j]>array[j+1]) {
					intercambios++;
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				pasadas++;
			}
		}
		tiempoFinal=System.currentTimeMillis()-tiempoInicial;
		
		mostrarArray(array);
		System.out.println("Cantidad Pasadas:"+pasadas);
		System.out.println("Cantidad Intercambios:"+intercambios);
		System.out.println("Cantidad comparaciones:"+comparaciones);
		System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
	}
	
	
	public void burbuja3(int array[]) 
    { 
		long tiempoInicial;
		long tiempoFinal;
		int pasadas=0;int comparaciones=0;
		int intercambios=0;
		int n=array.length;
        int i, j, temp; 
        boolean cambio;
        tiempoInicial=System.currentTimeMillis();
        for (i = 0; i < n - 1; i++)  
        { 
            cambio = false; 
            for (j = 0; j < n - i - 1; j++)  
            { comparaciones++;
                if (array[j] > array[j + 1])  
                { 
                  intercambios++;  
                    temp = array[j]; 
                    array[j] = array[j + 1]; 
                    array[j + 1] = temp; 
                    cambio = true; 
                }
                pasadas++;
            } 
  
            
            if (cambio == false) 
                break; 
        }
        tiempoFinal=System.currentTimeMillis()-tiempoInicial;
        mostrarArray(array);
        System.out.println("Cantidad Pasadas:"+pasadas);
		System.out.println("Cantidad Intercambios:"+intercambios);
		System.out.println("Cantidad comparaciones:"+comparaciones);
		System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
    } 
	public void insercion(int array[]) {
		double  alv=System.currentTimeMillis();
		int aux=0;
		int j,comps=0,cambs=0;;
		
		for(int i=1;i<array.length;i++) {

			aux=array[i];
			j=i-1;
			
			while((j>=0)&&(aux<array[j])) {
				array[j+1]=array[j];
                comps++;
				j--;
			}
			array[j+1]=aux;
			cambs++;
		}
		double  alv2=System.currentTimeMillis();
		mostrarArray(array);
		System.out.println("Cantidad de Comparaciones :"+comps);
		System.out.println("Cantidad de intercambios "+cambs);
		System.out.println("tiempo: "+(alv2-alv)+" ms ");
	}
	
	public void seleccion(int[] numeros) {
		int recorrido=0, intercambios=0, compas=0,aux=0;
		long init = System.nanoTime();
		for(int i=0;i<numeros.length;i++) {
			int minimo=i;
			for(int j=i+1;j<numeros.length;j++) {
				if(numeros[j]<numeros[minimo]) {
					minimo = j;
					intercambios++;
				}
				 aux = numeros[i];
				numeros[i]= numeros[minimo];
				numeros[minimo]=aux;
				compas++;
			}
			recorrido++;
		}
		long fin = System.nanoTime();
		mostrarArray(numeros);
		System.out.println("Cantidad de Comparaciones :"+compas);
		System.out.println("Cantidad de intercambios "+intercambios);
		System.out.println("Cantidad de Recorridos "+recorrido);
		System.out.println("tiempo: "+(fin-init)+" ms ");
		
	
	}
	
	public void shell(int vector[]) {
		long tiempoInicial;
		long tiempoFinal;
		int intercambios = 0,pasadas = 0,comparaciones = 0;
		int salto,aux,i;
		boolean cambios;
		tiempoInicial=System.currentTimeMillis();
		for(salto=vector.length/2;salto!=0;salto/=2) {
			cambios = true;
			while(cambios) {
				cambios=false;
				for(i=salto;i<vector.length;i++) {
					comparaciones++;
					if(vector[i-salto]>vector[i]) {
						intercambios++;
						aux=vector[i];
						vector[i]=vector[i-salto];
						vector[i-salto]=aux;
						cambios=true;
					}
					pasadas++;
				}
			}
			
		}
		tiempoFinal=System.currentTimeMillis()-tiempoInicial;
		
		mostrarArray(vector);
		System.out.println("Cantidad Pasadas:"+pasadas);
		System.out.println("Cantidad Intercambios:"+intercambios);
		System.out.println("Cantidad comparaciones:"+comparaciones);
		System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
		
		
		
	}
	
	public void quicksort(int numeros[],int primero,int ultimo) {
		 int recorrido = 0,intercambios=0,compas=0;
		 long tiempoInicial;
			long tiempoFinal;
	     
	     
			int i,j,pivote,aux;
			i = primero;
			j = ultimo;
			pivote = numeros[primero];
			tiempoInicial=System.currentTimeMillis();
			while (i < j) {
	         while (numeros[i] <= pivote && i < j) {
	             i++;
	         }
	         while (numeros[j] > pivote) {
	             j--;
	         }
	         if (i < j) {
	         	compas++;
	             aux = numeros[i];
	             numeros[i] = numeros[j];
	             numeros[j] = aux;
	             intercambios++;
	         }
	     }
			recorrido++;
			numeros[primero] = numeros[j];
	     numeros[j] = pivote;
	     intercambios++;
	     if (primero < j - 1) {
	         quicksort(numeros, primero, j - 1);
	     }
	     if (j + 1 < ultimo) {
	         quicksort(numeros, j + 1, ultimo);
	     }
	     
	     tiempoFinal=System.currentTimeMillis()-tiempoInicial;
			
			mostrarArray(numeros);
			System.out.println("Cantidad Pasadas:"+recorrido);
			System.out.println("Cantidad Intercambios:"+intercambios);
			System.out.println("Cantidad comparaciones:"+compas);
			System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
			
	
	     
	    
			
	 }
	

    public void radix(int[] arr){
    	int pasadas=0;
    	int intercambios=0;
    	int comparaciones=0;
    	long tiempoInicial;
		long tiempoFinal;
		tiempoInicial=System.currentTimeMillis();
        if(arr.length == 0)
            return;
        int[][] np = new int[arr.length][2];
        int[] q = new int[0x100];
        int i,j,k,l,f = 0;
        for(k=0;k<4;k++){
        	pasadas++;
            for(i=0;i<(np.length-1);i++)
                np[i][1] = i+1;
            np[i][1] = -1;
            for(i=0;i<q.length;i++)
                q[i] = -1;
            for(f=i=0;i<arr.length;i++){
                j = ((0xFF<<(k<<3))&arr[i])>>(k<<3);
                comparaciones++;
                if(q[j] == -1)
                    l = q[j] = f;
                else{
                    l = q[j];
                    while(np[l][1] != -1)
                    	
                        l = np[l][1];
                    np[l][1] = f;
                    l = np[l][1];
                  intercambios++;
                }
                f = np[f][1];
                np[l][0] = arr[i];
                np[l][1] = -1;
            }
            for(l=q[i=j=0];i<0x100;i++)
                for(l=q[i];l!=-1;l=np[l][1])
                        arr[j++] = np[l][0];
        }
        tiempoFinal=System.currentTimeMillis()-tiempoInicial;
		
		mostrarArray(arr);
		System.out.println("Cantidad Pasadas:"+pasadas);
		System.out.println("Cantidad Intercambios:"+intercambios);
		System.out.println("Cantidad comparaciones:"+comparaciones);
		System.out.println("Tiempo Ejecucion:"+tiempoFinal+" ms ");
    }
    
 public void intercalacionArchivos() {
	 File archivo1=new File("./src/Archivo1.txt");//Archivos a leer
		File archivo2=new File("./src/Archivo2.txt");//Archivos a leer
				
		FileReader frA1 = null;
		BufferedReader brA1;
		FileReader frA2 = null;
		BufferedReader brA2;
		
		FileWriter archivo3=null;
		PrintWriter pr=null;
		
		try{//Apertura del archivo de salida para escritura
			archivo3=new FileWriter("./src/ArchivoSalida.txt", false);
			pr=new PrintWriter(archivo3);
			
			try {//Apertura del archivo1 para lectura
				frA1=new FileReader(archivo1);
				brA1=new BufferedReader(frA1);
				String lineaArchivo1;
				
				try {//Apertura del archivo2 para lectura
					frA2=new FileReader(archivo2);
					brA2=new BufferedReader(frA2);
					String lineaArchivo2;
					boolean repetir=true;
					
					lineaArchivo1=brA1.readLine();
					lineaArchivo2=brA2.readLine();
										
					do{//Se realizan comparaciones mientras la bandera no cambie
						if(Integer.parseInt(lineaArchivo1)<Integer.parseInt(lineaArchivo2)){
							pr.println(lineaArchivo1);
							if((lineaArchivo1=brA1.readLine())==null){
								pr.println(lineaArchivo2);
								while((lineaArchivo2=brA2.readLine())!=null){
									pr.println(lineaArchivo2);
								}
								repetir=false;
							}
						}
						else if(Integer.parseInt(lineaArchivo1)>Integer.parseInt(lineaArchivo2)){
							pr.println(lineaArchivo2);
							if((lineaArchivo2=brA2.readLine())==null){
								pr.println(lineaArchivo1);
								while((lineaArchivo1=brA1.readLine())!=null){
									pr.println(lineaArchivo1);
								}
								repetir=false;
							}
						}
						else{
							pr.println(lineaArchivo1);
							pr.println(lineaArchivo2);
							if((lineaArchivo1=brA1.readLine())==null){
								pr.println(lineaArchivo2);
								while((lineaArchivo2=brA2.readLine())!=null){
									pr.println(lineaArchivo2);
								}
								repetir=false;
							}
							if((lineaArchivo2=brA2.readLine())==null){
								pr.println(lineaArchivo1);
								while((lineaArchivo1=brA1.readLine())!=null){
									pr.println(lineaArchivo1);
								}
								repetir=false;
							}
						}
					}while(repetir);
				} catch (FileNotFoundException e) {
					System.out.println("Error al abrir el archivo");
					//e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						frA2.close();
					} catch (IOException e) {
						System.out.println("Error al cerrar el archivo");
					}	
				}//Final del archivo2
			} catch (FileNotFoundException e) {
				System.out.println("Error al abrir el archivo");
				//e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					frA1.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el archivo");
				}
			}//Final del archivo1
			System.out.println("Archivos combinados y ordenados correctamente");
		}catch (IOException e){
			System.out.println("Error al abrir o crear el archivo");
		}finally{
			try{
				archivo3.close();
			}catch(IOException e){
				System.out.println("Error al cerrar el archivo");
			}
		}//Final del archivo3	
 }
 
 public void mezclaDirecta(int[] array, int lo, int n) {
		int low = lo;
		int high = n;
		if(low >= high) {
			return;
		}
		
		int middle = (low + high)/2;
		mezclaDirecta(array, low, middle);
		mezclaDirecta(array, middle+1, high);
		int end_low = middle;
		int start_high = middle + 1;
		while((lo <= end_low) && (start_high <= high)) {
			if(array[low] < array[start_high]) {
				low++;
			}else {
				int Temp = array[start_high];
				for(int k = start_high - 1; k >= low; k--) {
					array[k + 1] = array[k];
				}
				array[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}
 
 private static  Comparable[]aux;
	public static void ordenamientoMezclaNatural(Comparable[] a) {//Originalmente es el
		aux = new Comparable[a.length];								//que se manda a llamar
		ordenamientoMezclaNatural(a, 0, a.length-1);
		mostrar(a);
	}
	public static boolean estaOrdenado(Comparable[] a) {//Para ver si el arreglo ya esta ordenado
		for(int i=1; i<a.length; i+= 1) {
			if (a[i-1].compareTo(a[i]) > 0) {
				return false;
			}
		}
		return true;
	}
	//Se sobrecarga el metodo con diferentes parametros
	private static void ordenamientoMezclaNatural(Comparable[] a, int primero, int ultimo) {
		int i = primero;
		int j = 0;
		int medio = 0;
		int az = 0;
		while(true) {
			i=0;
			while (i < a.length) {
				if(i == a.length-1) {
					break;
				}else if(a[i].compareTo(a[i+1]) > 0) {
					break;
				}
				i++;
			}
			j = i+1;
			while(j < a.length) {
				if(j == a.length-1) {
					break;
				}else if (a[j].compareTo(a[j+1]) > 0) {
					break;
				}
				j++;
			}
			// medio = primero + (j - primero)/2;
			Mezcla(a, primero, i, j);
			primero = 0;
			
			if(estaOrdenado(a)) {
				break;
			}
		}
	}
	public static void Mezcla(Comparable[]a, int primero, int medio, int ultimo) {
		int i = primero;
		int j = medio +1;
		for(int k=primero; k <= ultimo; k++) {
			aux[k] = a[k];
		} 
		for(int k = primero; k <= ultimo; k++) {
			if(i > medio) {
				a[k] = aux[j++];
			}else if (j > ultimo) {
				a[k] = aux[i++];
			}else if(aux[i].compareTo(aux[j]) > 0) {
				a[k] = aux[j++];
			}else {
				a[k] = aux[i++];
			}
		}
	}
	public static void mostrar(Comparable[] a) {
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
	public static Integer[]lectura(){
		File archivo1 = new File("./src/Archivo1.txt");
		FileReader frA1 = null;
		BufferedReader brA1;
		Integer[] arr1 = new Integer[0];
		
		try {// se lee el achivo
			frA1 = new FileReader(archivo1);
			brA1 = new BufferedReader(frA1);
			String lineaArchivo1;
			try {
				lineaArchivo1 = brA1.readLine();
				String[]numeros = lineaArchivo1.split(",");
				arr1 = new Integer[numeros.length];
				for(int i=0; i<=numeros.length-1;i++) {
					Integer intObj = new Integer(numeros[i]);
					arr1[i] = intObj;
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			System.out.println("Error al abrir el archivo");
			e.printStackTrace();
		}try {
			frA1.close();
		}catch (IOException e) {
			System.out.println("Error al cerrar el archivo");
		}
		return arr1;
	}
    
	
	public void mostrarArray(int array[]) {
		int i=0;
		for(i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
		System.out.println();
	}
}
