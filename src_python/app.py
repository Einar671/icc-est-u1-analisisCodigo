# import benchmarking as Ben
from benchmarking import Benchmarking
from metodos_ordenamiento import MetodosOrdenamiento

if __name__=="__main__":
    print("Funciona")
    
    #Instancias
    metodos = MetodosOrdenamiento()
    bench = Benchmarking()
    
    
    tamaño = 10000
    arreglo_base = bench.buildArreglo(tamaño)
   
    
    metodosDick = {
        "burbuja":metodos.sortByBubble,
        "seleccion":metodos.sortBySelection
        }

    resultados= []

    for nombre,metodo in metodosDick.items():
        tiempo = bench.medir_tiempo(metodo, arreglo_base)
        tuplaresultado= (tamaño, nombre,tiempo)   
        resultados.append(tuplaresultado)
    
    for resultados in resultados:
        tamaño,nombre,tiempo=resultados
        print(f"Tamaño: {tamaño}, Metodo: {nombre}, Tiempo: {tiempo:.6f} segundos ")