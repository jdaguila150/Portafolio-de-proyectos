from ast import Break
from xml.dom.minicompat import StringTypes


lista1 = ["manzana","pera","platano","guayaba","perejil",
           "zanahoria","kiwi"]
lista2 = [456,789,123,486,153,248,753]
lista3 = [543.26,7621.248,7315.24,4320.12,4820.10,7452.48,3216.8]

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
    print ('''Que elemento desea que vaya primero?
    1. Enteros, Flotantes, String
    2. Enteros, String, Flotantes
    3. Flotantes, Enteros, String
    4. Flotantes, String, Enteros
    5. String, Flotantes, Enteros
    6. String, Enteros, Flotantes
    ''')
    decision2 = input()
    decision2 = int(decision2)
    lista1.sort()
    lista2.sort()
    lista3.sort()
    if decision2 == 1:
        print(lista2, lista3, lista1)
    elif decision2 == 2:
        print(lista2, lista1, lista3)
    elif decision2 == 3:
        print(lista3, lista2, lista1)        
    elif decision2 == 4:
        print(lista3, lista1, lista2)
    elif decision2 == 5:
        print(lista1, lista3, lista2)
    elif decision2 == 6:
        print (lista1, lista2, lista3)


elif decision == 2:
    leng_total = len(lista1)+len(lista2)+len(lista3)
    print(leng_total)


elif decision == 3:
    print("Que elemento desea agregar")
    elemento = input()
    try:
        elemento = int(elemento)
        lista2.append(elemento)
        print("La lista queda de la siguiente manera", lista2)
    except ValueError:
        try:
            elemento = float(elemento)
            lista3.append(elemento)
            print("La lista queda de la siguiente manera", lista3)
        except ValueError:
            lista1.append(elemento)
            print("La lista queda de la siguiente manera", lista1)




elif decision == 4:
    print("Que elemento desea agregar")
    elemento = input()
    try:
        elemento = int(elemento)
        print("En que posicion desea agregarlo")
        posicion = input()
        posicion = int(posicion)
        posicion = posicion-1
        lista2.insert(posicion, elemento)
        print("La lista queda de la siguiente manera", lista2)
    except ValueError:
        try:
            elemento = float(elemento)
            print("En que posicion desea agregarlo")
            posicion = input()
            posicion = int(posicion)
            posicion = posicion-1
            lista3.insert(posicion, elemento)
            print("La lista queda de la siguiente manera", lista3)
        except ValueError:
            print("En que posicion desea agregarlo")
            posicion = input()
            posicion = int(posicion)
            posicion = posicion-1
            lista1.insert(posicion, elemento)
            print("La lista queda de la siguiente manera", lista1)

elif decision == 5:
    print('''En que lista se encuentra su elemento a borrar
    1.Datos String
    2.Datos Int
    3.Datos float''')
    tipo_lista = input()
    print("En que lugar esta su elemento a eliminar")
    posicion = 0
    posicion = input()
    posicion = int(posicion)
    posicion = posicion-1

    if tipo_lista == 1:
        print("Su elemento eliminado es " + lista1[posicion])
        lista1.pop(posicion)
        print("La lista quedaria asi" + lista1)
    elif tipo_lista == 2:
        print("Su elemento eliminado es " + lista2[posicion])
        lista1.pop(posicion)
        print("La lista quedaria asi" + lista2)
    elif tipo_lista == 3:
        print("Su elemento eliminado es " + lista3[posicion])
        lista1.pop(posicion)
        print("La lista quedaria asi" + lista3) 

elif decision == 6:
    print ('''Se eliminara el ultimo elemento de que lista?
    1.Datos str
    2.Datos Int
    3.Datos float''')
    lista_pop = input()

    if lista_pop == 1:
        lista1.pop()
        print("Su lista es "+lista1)
    elif lista_pop == 2:
        lista2.pop()
        print("Su lista es "+lista2)
    elif lista_pop == 3:
        lista3.pop()
        print("Su lista es "+lista3)
elif decision == 7:
    print("Adios")
    print("Sus 10 primeros elementos de su lista fueron",lista1 [0], lista1[1],lista1 [2], lista1 [3], lista1[4], lista1[5] ,lista1 [6] , lista1[7] ,lista1 [8] , lista1[9])
    Break

    
    
