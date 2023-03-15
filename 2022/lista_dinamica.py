longitud=int(input("¿Cuantos elementos desea agregar a la lista?  "))
List = []

i = 0
while i < longitud:
    elemento = input("Ingrese un elemento para la lista -->  ")
    List.append(elemento)

    i = i + 1

print("La lista es: ")
for e in List:

    print(e)

opcion = 0
while True:
    Tamaño_List= str(len(List))
    print("La longitud de la lista es: " + Tamaño_List)
    print("")
    print("Si ordenamos la lista queda de la siguiente manera: ")
    print("")
    List.sort()
    print(List)

    def my_funcion():
        print("MENU DEL PROGRAMA 1 DE Listas")

    print("""
Elija la accion que quiere realizar:

    1- Añadir un elemento
    2- Insertar un elemento en determinada posición
    3- Eliminar elemento por indice
    4- Eliminar elemento por nombre

    """)

    opcion = int(input("Escriba la opcion deseada:  "))

    if opcion == 1:
        print("El nuevo elemento se agregara al final de los ya existentes")
        print("")
        new_elemento= input("Escribe el nuevo elmento:  ")
        List.append(new_elemento)
        print(" ")
        print(List)
        print("")
        
    elif opcion == 2:
        posicion=int (input("Escribe la posicion del nuevo elmento:  "))
        print(" ")
        new_elemento=input("Escribe el nuevo elmento:  ")

        List.insert(posicion, new_elemento)
        print("")
        print(List)
        print("")

    elif opcion == 3:
        posicion=int (input("Escribe la posicion del elmento que deseas eiminar:  "))
        List.pop(posicion)
        print("")
        print(List)
        print("")
        
    elif opcion == 4:
        elemento=input("Escribe el elmento que deseas eliminar:  ")
        List.remove(elemento)
        print("")
        print(List)
        print("")
    
#ESTA ES LA CONDICION DE FIN

    if opcion <1 or opcion >4:
        print("Opcion incorrecta :(, Hasta luego!!!")
        break
