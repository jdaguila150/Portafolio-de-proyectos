from cmath import pi
import math
math.pi
baseT = 0
alturaT = 0
baseR = 0
alturaR = 0
radioC = 0
decision = 0
resultado = 0
perimetroC = 0
dialogo = "el siguiente "


#En este sitio mse coloca el primer menu del programa
print("""¿Que desea hacer?
1.Area de rectangulo
2.Area de un triangulo
3.Area de un circulo junto con su perimetro
4.Terminar""")
decision = input ()
decision = int(decision)
#Al momento en el que se presione cualquier numero diferente de 4, se ejecutaran las siguientes lineas
while decision >= 4 &  decision <= 1:
    #En este fragmento se calculara el area de un rectangulo
    if decision == 1:
        print ("Teclee la base")
        baseR = input()
        baseR = int(baseR)

        print ("Teclee la altura")
        alturaR = input ()
        alturaR = int (alturaR)

        resultado = baseR*alturaR
        print ("Su resultado es "+ dialogo,resultado)
        print (type (resultado))
    else:
        #En este punto se calcula el area de un triangulo
        if decision == 2:
            print ("Teclee la base")
            baseT = input()
            baseT = int(baseT)

            print ("Teclee la altura")
            alturaT = input ()
            alturaT = int (alturaT)

            resultado = (baseT*alturaT)/2
            print ("Su resultado es "+ dialogo ,resultado)
            print (type (resultado))
        else:
            #Por ultimo se calcula el area y el perimetro de un circulo
            if decision == 3:
                print ("Teclee el radio de su circulo")
                radioC = input()
                radioC = int(radioC)
                
                resultado = pi*radioC*radioC
                perimetroC = pi*2*radioC

                print ("El area de su circulo es la siguiente " ,resultado)
                print (type (resultado))  
                print ("El perimetro de su circulo es " + dialogo,perimetroC)
                print (type (perimetroC))
    #Cuando sale el resultado se imprime lo siguiente y el usuario decide si continuar o no el programa (Gracias al while)
    print("""¿Que desea hacer?
    1.Area de rectangulo
    2.Area de un triangulo
    3.Area de un circulo junto con su perimetro
    4.Terminar""")
    decision = input ()
    decision = int(decision)

print("Gracias por utilizar el programa")







