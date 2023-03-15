## Programa para saber si un número es par o es impar

num = 0
continuar = "si"
while continuar == "si":
    num = input ("Ingrese su número y se le dira si es par o impar ")
    num = int(num)

    if num % 2 == 0:
        print("Su numero es par")
    else:
        print ("Su numero es impar")
    
    decision = input ("Desea continuar (si)/(no)")
    if decision == "no":
        break
    