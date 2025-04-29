import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado:El metodo retorna un arreglo de enteros vacios linea 21
    // Solucion: Cambiar el return por el arreglo ordenado, para que regrese la variable
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de burbuja tradicional con errores
    // Error encontrado:Falla logica en la linea 34 al comparar los elementos de manera descendente
    //solucion: Cambiar el operador de mayor que por menor que para que ordene de menor a mayor

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Se identifico que el metodo era burbuja mejorado y en la linea 57 faltaba que el segundo for no recora el arreglo completo
    // Solucion: Cambiar el segundo for para que recorra el arreglo completo y no solo hasta n-1-i
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Falta retornar el arreglo ordenado y falta la condicion para el intercambio indiceMinimo != i
    // Solucion: Cambiar el return por el arreglo ordenado, para que regrese la variable y agregar la condicion para el intercambio
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if(indiceMinimo != i) {
                int smallerNumber = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: error en la condicion del primer y segundo for, en el primero falta restar 1 al arreglo.lenght, en el segundo el j debe sumarse j++
    // finalmente falta la condicion para el intercambio.
    //Solucion: Arreglar esos fallos en el for y añadir la condicion del intercambio.
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length-1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if(indiceMinimo != i){
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Falta el condicional para realiar el cambio y ademas el cambio estaba mal estructurado las igualdades
    //Solucion: Agregar la condicion y estructurar bien el cambio de valores
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            if(indiceMinimo!=i){
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
            }
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Error en los operadores logicos en el primer while y mal estructurada la igualdad del primer for en el cual j=0
    // Solucion: implementar correctamente los operadores logicos y estructurar la igualdad en el primer for. 
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 0; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: El for de la linea 171 esta con las variables equivocadas deberia ser i no j
    // Solucion: Cambiar las variables 
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 0; j < arreglo.length; j++) {
            int actual = arreglo[j];

            int i = j - 1;
            for (; i >= 0 && arreglo[i] > actual; i--) {
                arreglo[i + 1] = arreglo[i];
            }
            arreglo[i + 1] = actual;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado: Mal estructurada la declaracion al momento de declarar i = j, deberia ser i=j-1, error en las condicionales del while 
    // Solucion: declarar bien la variable i y corregir los errores logicos
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j-1;

            while (i >= 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

}
