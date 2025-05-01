class MetodosOrdenamiento:

    def sortByBubble(self, array):
        arreglo=array.copy()
        n=len(arreglo)
        for i in range(n):
            for j in range(i+1,n):
                if arreglo[i] > arreglo[j]:
                    arreglo[i], arreglo[j] = arreglo[j], arreglo[i]
        return arreglo
    
    def sortBySelection(self, array):
        arreglo=array.copy()
        n= len(arreglo)
        for i in range(0,n,1):
            maxIdx = i
            for j in range(i+1,n,1):
                if arreglo[maxIdx]> arreglo[j]:
                    maxIdx = j
            if maxIdx!=i:
                arreglo[maxIdx], arreglo[i] = arreglo[i], arreglo[maxIdx]
        return arreglo