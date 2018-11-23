
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
	
	public void mostrarArray(int array[]) {
		int i=0;
		for(i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
		System.out.println();
	}
}
