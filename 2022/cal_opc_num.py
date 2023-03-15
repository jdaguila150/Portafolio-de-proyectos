decision = 0
num1 = 0
num2 = 0
resultado = 0
dialogo = "el siguiente "


print ("¿Que desea hacer?")
print("1.Suma")
print ("2.Resta")
print ("3.Division")
print ("4.Multiplicacion")
print ("5.Elevar a una potencia")
print ("6. Terminar")

decision = input()
decision = int (decision)

while decision <= 5 &  decision >= 1:

    #Si la decision del usuario esta dentr del rango [1,6] se pediran dos numeros que serviran para realizar las siguientes operaciones
    print ("Teclee su primer numero")
    num1 = input()
    num1 = int (num1)

    print ("Teclee su segundo numero")
    num2= input ()
    num2 = int (num2)

    #Suma
    if decision==1:
        resultado = num1+num2
    else:
        #resta
        if decision == 2:
            resultado = num1-num2
        else:
            #Division
            if decision == 3:
                resultado = num1/num2
            else:
                #multiplicacion
                if decision == 4:
                    resultado = num1*num2
                else:
                    #Elevar a un exponente, el numero 1 sera tomado como base, y el segundo como su exponente 
                    if decision == 5:
                        resultado = num1**num2
    print ("Su resultado es "+ dialogo, resultado)
    print (type (resultado))
    
    #El usuario decide si continua o no con el programa
    print("""¿Que desea hacer?
    1.Suma
    2.Resta
    3.Division
    4.Multiplicacion
    5.Elevar a una potencia 
    6.Salir""")
    decision = input()
    decision = int(decision)

print ('Hasta luego')
