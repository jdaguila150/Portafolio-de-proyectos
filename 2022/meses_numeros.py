
from pydoc import describe


decision = 2

while decision <=12 and decision >=0:
    decision = input("De que numero de mes desea saber su numero de dias ")
    decision = int(decision)

    if decision == 1 or decision == 3 or decision == 5 or decision == 7 or decision == 8 or decision == 10 or decision == 12:
        print ("Su mes elegido con el numero ",decision," tiene 31 dias")
    elif decision == 4 or decision == 6 or decision == 9 or decision == 11:
        print ("Su mes elegido con el numero ",decision," tiene 30 dias")
    elif decision == 2:
        print("Su mes puede tener 28 o 29 dias")
    
    print("Desea continuar? si/no")
    repetir = input()

    if repetir == "si":
        decision == 1
    else:
        print("bye")
        break 

