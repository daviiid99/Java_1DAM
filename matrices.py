import random

## Recorrer una matriz

def crearMatriz(matriz, f, c) :
	for columna in range (f):
		matriz.append([])
		for fila in range (c):
			matriz[columna].append("null")

	return matriz

def rellenarMatriz (matriz, lista,f,c) :
	for columna in range (f) :
		for fila in range (c) :
			matriz[columna][fila] = randomFruta(list(lista))


def randomFruta(lista) :
	frutaAleatoria = random.randint(0, len(lista) - 1)
	return lista[frutaAleatoria]


def imprimirMatriz (matriz, f, c):
	print("\n---------------------")
	for columna in range (f) :
		print(end = "|")
		for fila in range (c) :
			print(matriz[columna][fila], end="|")

		print("\n---------------------")


def main () :
	frutas = []
	#listaFrutas = ["manzana", "pera", "platano", "coco", "fresa"]
	diccionarioFrutas = {"manzana": 3, "pera":2, "platano":1, "coco":0, "fresa":-1}

	f = 5
	c = 5

	jugador1 = 0

	# Rellenamos la matriz
	matriz = crearMatriz(frutas, f,c)
	rellenarMatriz(matriz, diccionarioFrutas, f ,c)
	imprimirMatriz(matriz, f ,c)

	while jugador1 < 10 :

		fila = int(input("Elige fila :"))
		columna = int(input("Elige columna :"))
		elegido = matriz[fila][columna]

		print(elegido)

		jugador1 += diccionarioFrutas[elegido] 

		print(jugador1)

		if jugador1 >=10:
			print("Has ganado")


main ()