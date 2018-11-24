
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
	
	public void mostrarArray(int array[]) {
		int i=0;
		for(i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
		System.out.println();
	}
}
