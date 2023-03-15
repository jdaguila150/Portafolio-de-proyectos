from ast import Break


lista1 = {"manzana","pera","platano","guayaba","perejil",
           "zanahoria","tomate","melon","papaya","coco",
           "naranja","mandarina","cereza","papa","calabaza",
           "cebolla","apio","puerro","lechuga","col"}

print("Esta es su lista")
print (lista1)

print('''que desea hacer?
1. Desplegar la lista de manera ordenada
2. Desplegar el numero de los elementos
3. Añadir un elemento
4. Añadir un elemento en una posicion especifica
5. Borrar un elemento
6. Eliminar el ultimo elemento escogido
7. Terminar
''')
decision = input()
decision = int(decision)

if decision == 1:
    lista1.sort()
    print(lista1 [0], lista1[1],lista1 [2], lista1 [3], lista1[4], lista1[5] ,lista1 [6] , lista1[7] ,lista1 [8] , lista1[9])
elif decision == 2:
    print(len(lista1))
elif decision == 3:
    print("Que elemento desea agregar")
    elemento =""
    elemento = input()
    lista1.append (elemento)
    print("Su nueva lista es: " + lista1)
elif decision == 4:
    print ("Que elemento desea agregar")
    elemento = ""
    elemento = input()
    print("En que posicion desea agregarlo")
    posicion = 0
    posicion = input()
    posicion = int(posicion)
    posicion = posicion+1
    lista1.insert(posicion, elemento)
    print("Su nueva lista es: " , lista1)
elif decision == 5:
    print("En que lugar esta su elemento a eliminar")
    posicion = 0
    posicion = input()
    posicion = int(posicion)
    posicion = posicion+1
    print("Su elemento eliminado es " + lista1[posicion])
    lista1.pop(posicion)
    print("La lista quedaria asi" + lista1)
elif decision == 6:
    lista1.pop()
    print("Su lista es "+lista1)
elif decision == 7:
    print("Adios")
    print("Sus 10 primeros elementos de su lista fueron",lista1 [0], lista1[1],lista1 [2], lista1 [3], lista1[4], lista1[5] ,lista1 [6] , lista1[7] ,lista1 [8] , lista1[9])
    Break

    
    
