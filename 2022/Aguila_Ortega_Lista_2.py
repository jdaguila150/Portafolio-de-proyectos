#Aguila Ortega Josue Daniel

longitud=int(input("¿Cuantos elementos desea agregar a la lista?  "))

Nombres = []

Telefonos = []

Direcciones = []

i = 0
while i < longitud:
    print("El elemento se agregara al final de los ya existentes")

    nuevo_nombre= input("Escribe el nombre:  ")
    Nombres.append(nuevo_nombre)

    nuevo_telefono= input("Escribe el telefono:  ")
    Telefonos.append(nuevo_telefono)

    nuevo_direccion= input("Escribe la direccion:  ")
    Direcciones.append(nuevo_direccion)
    print(" ")

    i = i + 1
    
print("La lista es: ")
for e in Nombres:











    longitud = len(Nombres)
    j=0
    while j < longitud:
        Elemento_tel=str(Telefonos[j])
        print("Nombre: " + Nombres[j] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[j])
        print(" ")
        j= j+1

opcion = 0
while True:
    Tamaño_List= str(len(Nombres))
    print("La longitud de las listas es: " + Tamaño_List)
    print("")
    print("Se mostraran los elementos de las listas Nombres, Telefonos y Direcciones ordenados")
    print(" ")
    
    print(" LISTA NOMBRES")
    print(" ")
    Nombres.sort()
    print(Nombres)
    print(" ")
        
    print(" LISTA TELEFONOS")
    print(" ")
    Telefonos.sort()
    print(Telefonos)
    print(" ")
        
    print(" LISTA DIRECCIONES")
    print(" ")
    Direcciones.sort()
    print(Direcciones)






    def my_funcion():
        print("MENU DE LA AGENDA DINAMICA")

    print("""
Elija la accion que quiere realizar:

    1- Añadir un elemento
    2- Insertar un elemento en determinada posición
    3- Eliminar elemento por indice

    """)

    opcion = int(input("Escriba la opcion deseada:  "))
    print("")

    if opcion == 1:
        print("El nuevo elemento se agregara al final de los ya existentes")

        nuevo_nombre= input("Escribe el nombre:  ")
        Nombres.append(nuevo_direccion)

        nuevo_telefono= input("Escribe el telefono:  ")
        Telefonos.append(nuevo_telefono)

        nuevo_direccion= input("Escribe la direccion:  ")
        Direcciones.append(nuevo_direccion)
        print(" ")











        longitud = len(Telefonos)
        a=0

        while a < longitud:
            Elemento_tel=str(Telefonos[a])
            print("Nombre: " + Nombres[a] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[a])
            print(" ")
            a = a + 1
        
    elif opcion == 2:
        posicion=int (input("Escribe la posicion del elmento que deseas agregar:  "))
        print(" ")

        nuevo_nombre= input("Escribe el nombre:  ")
        Nombres.insert(posicion, nuevo_nombre)

        nuevo_telefono= input("Escribe el telefono:  ")
        Telefonos.insert(posicion, nuevo_telefono)

        nuevo_direccion= input("Escribe la direccion:  ")
        Direcciones.insert(posicion, nuevo_direccion)
        print("")
        











        longitud = len(Telefonos)
        a = 0
        print("Las listas se modifican de la siguente manera: ")
        print(" ")

        while a < longitud:
            Elemento_tel=str(Telefonos[a])
            print("Nombre: " + Nombres[a] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[a])
            print(" ")
            a = a + 1

    elif opcion == 3:
        posicion=int (input("Escribe la posicion del elmento que deseas eiminar:  "))

        Nombres.pop(posicion)

        Telefonos.pop(posicion)

        Direcciones.pop(posicion)
        print("")
        









        longitud = len(Telefonos)
        a = 0
        print("Las listas se modifican de la siguente manera: ")
        print(" ")

        while a < longitud:
            Elemento_tel=str(Telefonos[a])
            print("Nombre: " + Nombres[a] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[a])
            print(" ")
            a = a + 1
            print("")
    










    if opcion <1 or opcion >3:
        print("Opcion incorrecta :(, Hasta luego!!!")
        break
