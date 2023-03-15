decision = ""
num1 = 0
num2 = 0
resultado = 0
dialogo = "el siguiente "

print("""¿Que desea hacer?
Suma (sum)
Resta (res)
Division (div)
Multiplicacion (mul)
Elevar a una potencia (pot) 
Terminar (end)""")

decision = input()


while decision != "end":
    #Si el usuario escoje cualquier otra opcion que no sea "end" se le pediran los numeros para realizar las operaciones basicas
    print ("Teclee su primer numero")
    num1 = input()
    num1 = int (num1)

    print ("Teclee su segundo numero")
    num2= input ()
    num2 = int (num2)

    #suma
    if decision=="sum":
        resultado = num1+num2
    else:
        #resta
        if decision == "res":
            resultado = num1-num2
        else:
            #division
            if decision == "div":
                resultado = num1/num2
            else:
                #multiplicacion
                if decision == "mul":
                    resultado = num1*num2
                else:
                    #elevar a una potencia (el numero uno sera tomado como base y el segundo como el exponente de esa base)
                    if decision == "pot":
                        resultado = num1**num2
    print ("Su resultado es " + dialogo, resultado)
    print (type (resultado))
    
    #Aqui el usuario decide  si continua o no con el programa
    print("""¿Que desea hacer?
    Suma (sum)
    Resta (res)
    Division (div)
    Multiplicacion (mul)
    Elevar a una potencia (pot) 
    Terminar (end)""")
    decision = input()
    

print ('Hasta luego')
