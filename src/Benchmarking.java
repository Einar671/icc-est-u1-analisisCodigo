import java.util.Random;

public class Benchmarking {
    
    private MetodosOrdenamiento metodosOrdenamiento; 
    
    public Benchmarking() {
        long inicioMillis = System.currentTimeMillis();
        long inicioNano = System.nanoTime();

        //System.out.println(inicioMillis);
        //System.out.println(inicioNano);
        System.out.println("inicio");
        metodosOrdenamiento = new MetodosOrdenamiento();
        int[] arreglo = generarArregloAleatorio(10000);
        Runnable tarea = () -> metodosOrdenamiento.burbujaTradicional(arreglo);
        System.out.println("Tiempo en nanos: "+medirConNanoTime(tarea));
        System.out.println("Tiempo en mili: "+medirConCurrentTime(tarea));
    }

    private int[] generarArregloAleatorio(int i){
        int arreglo[] = new int[i];
        Random random = new Random();
        
        for (int j = 0; j<i; j++ ){
            arreglo[j]= random.nextInt(100_000);
        }
        return arreglo;
    }


    public double medirConNanoTime(Runnable tarea){
            long inicio = System.nanoTime();
            tarea.run();
            long fin = System.nanoTime();
            return(fin - inicio)/1_000_000_000.0;
    }
    public double medirConCurrentTime(Runnable tarea){
        long inicio = System.currentTimeMillis();
        tarea.run();
        long fin = System.currentTimeMillis();
        return(fin - inicio)/1000.0;
    }
    
    

}
