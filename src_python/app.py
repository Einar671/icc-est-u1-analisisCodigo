# import benchmarking as Ben # This line is commented out and can be removed
from benchmarking import Benchmarking
from metodos_ordenamiento import MetodosOrdenamiento
import matplotlib.pyplot as plt

if __name__ == "__main__":
    print("Funciona")

    # Instancias
    metodos = MetodosOrdenamiento()
    bench = Benchmarking()

    tamaños = [500, 1000, 2000]
    resultados = []

    metodosDick = {
        "burbuja": metodos.sortByBubble,
        "seleccion": metodos.sortBySelection
    }

    for tam in tamaños:
        arreglo_base = bench.buildArreglo(tam)

        for nombre, metodo in metodosDick.items():
            arreglo_para_ordenar = arreglo_base[:]
            tiempo = bench.medir_tiempo(metodo, arreglo_para_ordenar)
            tuplaresultado = (tam, nombre, tiempo)
            resultados.append(tuplaresultado)

    for tamaño, nombre, tiempo in resultados:
        print(f"Tamaño: {tamaño}, Metodo: {nombre}, Tiempo: {tiempo:.6f} segundos ")

    tiempos_by_metodo = {}
    for nombre in metodosDick.keys():
        tiempos_by_metodo[nombre] = []

    for tam, nombre, tiempo in resultados:
        tiempos_by_metodo[nombre].append(tiempo)

    plt.figure(figsize=(10, 6))

    

    for nombre, tiempos in tiempos_by_metodo.items():
        if nombre in tiempos_by_metodo:
             plt.plot(tamaños, tiempos_by_metodo[nombre], label=nombre, marker='o')


    plt.xlabel("Tamaño del Arreglo")
    plt.ylabel("Tiempo de Ejecución (segundos)")
    plt.title("Tiempo de Ejecución de Métodos de Ordenamiento vs. Tamaño del Arreglo")
    plt.legend() 

    plt.grid(True) 
    plt.show()