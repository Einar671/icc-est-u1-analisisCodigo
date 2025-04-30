import random
import time
from metodos_ordenamiento import MetodosOrdenamiento
class Benchmarking:
    def __init__(self):
        print("Bench iniciado")
        self.mOrdenamiento = MetodosOrdenamiento()
        arreglo = self.buildArreglo(50000)

        tarea = lambda: self.mOrdenamiento.sortByBubble(arreglo)
        tiempoMillis = self.contar_con_current_time_milles(tarea)
        tiempoNano= self.contar_con_nano_time(tarea)

        print(f"Tiempo en milis: {tiempoMillis}")
        print(f"Tiempo en nanos: {tiempoNano}")


    def buildArreglo(self,size):
        array = []
        for i in range(size):
            numero = random.randint(0,99999)
            array.append(numero)
        return array
    
    

    def contar_con_current_time_milles(self,tarea):
        inicio= time.time()
        tarea()
        fin = time.time()
        duracion=(fin-inicio)
        return duracion
    
    def contar_con_nano_time(self, tarea):
        inicio = time.time_ns()
        tarea()
        fin = time.time_ns()
        duracion = (fin-inicio)/1_000_000_000.0
        return duracion
