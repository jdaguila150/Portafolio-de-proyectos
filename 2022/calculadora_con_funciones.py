

def menu():

    print("SUMA")
    print("RESTA")
    print("DIVISION")
    print("MULTIPLICACION")


    

while True:
    menu()



    print("Seleccione la opcion que desee")
    decision = ""
    decision = input()
    
    if decision == "SUMA":
        num1 = input("INGRESE SU PRIMER NUMERO ")
        num2 = input("INGRESE SU PRIMER NUMERO ")
        num1 = int(num1)
        num2 = int(num2)
        resultado = num1+num2
        print("Su resultado es ",resultado)
    elif decision == "RESTA":
        num1 = input("INGRESE SU PRIMER NUMERO ")
        num2 = input("INGRESE SU PRIMER NUMERO ")
        num1 = int(num1)
        num2 = int(num2)
        resultado = num1-num2
        print("Su resultado es ",resultado)        
    elif decision == "DIVISION":
        num1 = input("INGRESE SU PRIMER NUMERO ")
        num2 = input("INGRESE SU PRIMER NUMERO ")
        num1 = int(num1)
        num2 = int(num2)
        resultado = num1/num2
        print("Su resultado es ",resultado)        
    elif decision == "MULTIPLICACION":
        num1 = input("INGRESE SU PRIMER NUMERO ")
        num2 = input("INGRESE SU PRIMER NUMERO ")
        num1 = int(num1)
        num2 = int(num2)
        resultado = num1*num2
        print("Su resultado es ",resultado)                     


    
