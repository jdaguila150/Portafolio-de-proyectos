#indicar si la suma de numeros es positiva, negativa o 0


num_1 = 0
num_2 = 0
resultado = 0

print ("Escribe 2 numeros y se determinara si es positiva la suma, si es negativa o es 0")
print ("Numero 1")
num_1 = input()
num_1 = int(num_1)
print ("Numero 2")
num_2 = input()
num_2 = int(num_2)

resultado = num_1+num_2

if resultado >0:
    print ("Su resultado es positivo y es ", resultado)
elif resultado <0:
    print ("Su resultado es negativo y es ", resultado)
elif resultado == 0:
    print ("Su resultado es igual a 0")