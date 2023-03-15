ano = 1
bisiesto = True

while ano >= 1:
    ano = input("Escriba su ano y le dire si es bisiesto o no ")
    ano = int(ano)

    if ano %4==0:
        bisiesto = True
        if ano %100 == 0:
            bisiesto = False
            if ano %400 == 0:
                bisiesto = True
    else:
        bisiesto = False

    if bisiesto == True:
        print("Su ano es bisiesto")
    else:
        print("Su ano no es bisiesto")
    
    repetir = input("Desea continuar si/no ")
    if repetir == "si":
        ano = 1
    else:
        print("bye")
        break
