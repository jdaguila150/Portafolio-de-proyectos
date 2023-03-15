#Aguila Ortega Josue Daniel

from ast import Break
from distutils import archive_util
from pickle import FALSE


opcion=0
while True:
    


    def my_funcion():
        print("MENU DEL PROGRAMA AGENDA")

    Nombres = ["Josue Aguila", "Valeria Grajales", "Diego Cabrera", "Karen Martinez", "Luisa Lopez",
            "Maria Fernanda", "Christian Godoy", "Melanie Martinez", "Yareni Gonzalez",
            "Jose Aguilar", "Gonzalo Sandoval", "Carlos Gutierrez", "Francisco Jimenez",
            "Gustavo Quiros", "Regina Moreno", "Carlos Enrique", "Sara Lagunas", "Carla Morrison",
            "Duermenegildo Gutierrez", "Alan Lopez", "Gisselle Torres", "Dana Mendoza", "Andre Juarez",
            "Nadia Chavez", "Chuqui Lozanos"]

    Telefonos = [5518122753, 5586972416, 5520163548, 5517863452, 5524967325, 5554201387, 5517624335,
                5577784220, 5542201236, 5548478995, 5502114787, 5533662241, 5534159665, 5541200241,
                5534166521, 5517488562, 5511478965, 5589987475, 5523010336, 5548799874, 5564585789,
                5569875584, 5502212363, 5548776215, 5548779845]

    Direcciones = ["Calle Morelos 220","Mar Mediterraneo 206" ,"Esconvento No. 1010" ,"Calle Capilla No. 1487" ,
                "Mar Mediterraneo 201","Ixtapaluca Mz.6 Lt 7" , "Mar Mediterraneo 214",
                "Mar Mediterraneo 222", "Palmas 2 No. 634", "Palmas 2 No. 550" ,
                "Ixtapaluca Mz.5 Lt 25", "Calle Morelos 310", "Calle Capilla No. 1477",
                "Calle Morelos 231", "Calle Capilla No. 1498", "Palmas 2 No. 590",
                "Esconvento No. 1011","Ixtapaluca Mz.10 Lt 33" , "Esconvento No. 1250",
                "Esconvento No. 111","Calle Morelos 210","Palmas 2 No. 604","Calle Morelos 201",
                "Ixtapaluca Mz.4 Lt 12","Calle Capilla No. 1456" ]

    def creararchivo():
        archivo = open("archivo.txt" , "w")            
        archivo.write [Nombres]
        archivo.write [Telefonos]
        archivo.write [Direcciones]
        archivo.close
        creararchivo()
        print ("El archivo se ha creado")





    print("""
A partir de las listas presentadas puede ...
    1- Ordenar la lista
    2- ¿Cual es la longitud de la lista?
    3- Añadir un elemento
    4- Insertar un elemento en determinada posición
    5- Eliminar elemento por indice
    
    """)


    print(" ")

    opcion = int(input("Teclea la opcion deseada: "))
    print(" ")
    
    if opcion == 1:
        print("Se muestran los elemntos de las listas de Nombres, Telefonos y Direcciones ordenados")
        print(" ")
        print(" LISTA DE NOMBRES")
        print(" ")
        Nombres.sort()
        print(Nombres)
        print(" ")
        print(" LISTA DE TELEFONOS")
        print(" ")
        Telefonos.sort()
        print(Telefonos)
        print(" ")
        print(" LISTA DE DIRECCIONES")
        print(" ")
        Direcciones.sort()
        print(Direcciones)

    elif opcion == 2:
        longitud = str(len(Telefonos))
        print("La longitud de las listas es " + longitud)
        
    elif opcion == 3:
        print("El nuevo elemento se agregara al final de los ya existentes")

        nuevo_nombre= input("Escribe el nombre:  ")
        Nombres.append(nuevo_nombre)

        nuevo_telefono= input("Escribe el telefono:  ")
        Telefonos.append(nuevo_telefono)

        nuevo_direccion= input("Escribe la direccion:  ")
        Direcciones.append(nuevo_direccion)
        print(" ")

        longitud = len(Telefonos)
        i=0
        while i < longitud:
            Elemento_tel=str(Telefonos[i])
            print("Nombre: " + Nombres[i] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[i])
            print(" ")
            i= i+1
        
    elif opcion == 4:
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
        i=0
        print("Las listas se modifican de la siguente manera: ")
        print(" ")
        while i < longitud:
            Elemento_tel=str(Telefonos[i])
            print("Nombre: " + Nombres[i] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[i])
            print(" ")
            i= i+1

    elif opcion == 5:
        posicion=int (input("Escribe la posicion del elmento que deseas eiminar:  "))

        Nombres.pop(posicion)

        Telefonos.pop(posicion)

        Direcciones.pop(posicion)
        print("")

        longitud = len(Telefonos)
        i=0
        print("Las listas se modifican de la siguente manera: ")
        print(" ")
        while i < longitud:
            Elemento_tel=str(Telefonos[i])
            print("Nombre: " + Nombres[i] + " " + "Telefono: " + Elemento_tel + " " + "Direccion: " + Direcciones[i])
            print(" ")
            i= i+1
            print("")


    if opcion <1 or opcion >5:
        print("Opcion incorrecta, Hasta luego!!!")
        Break
