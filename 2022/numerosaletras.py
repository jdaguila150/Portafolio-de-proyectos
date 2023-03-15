numero=0
unidades = ["cero","uno", "dos", "tres", "cuatro","cinco","seis","siete","ocho","nueve"]
dieces= ["diez","once","doce","trece","catorce","quince","dieciseis","dieciocho","diecinueve"]
veintenas = ["veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve"]
decenas = [" "," "," ","treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"]
cientenas = [" "," ", "doscientos", "trescientos", "cuatrocientos", "quinietos", "seiscientos", "setecientos", "ochocientos", "novecientos"]
ciento = ["ciento"]
miles = [" ","mil", "dos mil", "tres mil", "cuatro mil", "cinco mil", "seis mil", "siete mil", "ocho mil", "nueve mil"]

print("Dame un numero")
dato = input()

numero = int(dato)

###########################################################

if numero >= 0 and numero < 10:
    print(unidades[numero])

############################################################

if numero >= 10 and numero < 100:
    if numero >= 10 and numero < 20:
        print(dieces[numero - 10])
    else:
        if numero >= 20 and numero < 30:
            print(veintenas[numero-20])
        else:
            numero = str(numero)
            a = 1
            cifras = []
            for i in range(0, len(numero), a):
                cifras.append(int(numero[i: i+a]))
            numero = int(numero)
            nprimera = int(cifras[0])
            nsegunda = int(cifras[1])
            if numero >=30 and numero < 100:
                print(decenas[nprimera] + " y " + unidades[nsegunda])

##########################################################

if numero >= 10 and numero < 1000:
    #cientos
    if numero >= 100 and numero <110:
        numero = str(numero)
        a = 1
        cifras = []
        for i in range(0, len(numero), a):
            cifras.append(int(numero[i: i+a]))
        numero = int(numero)
        ntercera = int(cifras[2])
        print(ciento[0] +" "+ unidades[ntercera])
    #retos de los cienes
    else:
        if numero >= 110 and numero <= 999:
            numero = str(numero)
            a = 1
            cifras = []
            for i in range(0, len(numero), a):
                cifras.append(int(numero[i: i+a]))
            numero = int(numero)
            nprimera = int(cifras[0])
            nsegunda = int(cifras[1])
            ntercera = int(cifras[2])
            #ciento dieces
            if nprimera == 1:
                if nsegunda == 1:
                    print(ciento[0] +" "+ dieces[ntercera])
                elif nsegunda == 2:
                    print(ciento[0] + " " + veintenas[ntercera])     
                else:
                    print(ciento[0] +" "+ decenas[nsegunda] + " y " + unidades[ntercera])
            #doscientos y trescientos        
            elif nprimera != 1 :
                if nsegunda == 0:
                    print(cientenas [nprimera] + " " + unidades[ntercera] )
                elif nsegunda == 1:
                    print(cientenas [nprimera] + " " + dieces[ntercera] )
                elif nsegunda == 2:
                    print(cientenas [nprimera] + " " + veintenas[ntercera])
                else:
                    print(cientenas[nprimera] +" "+ decenas[nsegunda] + " y " + unidades[ntercera])
###########################################################################################################

if numero >= 1000:
        numero = str(numero)
        a = 1
        cifras = []
        for i in range(0, len(numero), a):
            cifras.append(int(numero[i: i+a]))
        numero = int(numero)
        nprimera = int(cifras[0])
        nsegunda = int(cifras[1])
        ntercera = int(cifras[2])    
        ncuarta = int(cifras[3])


        ##para xcientos
        if nsegunda == 1:
            ##unidades solamente
            if ntercera == 0:
                print (miles[nprimera] +" "+ ciento[0] +" "+ unidades[ncuarta])
            ###dieces
            elif ntercera == 1:
                print(miles[nprimera] + " " + ciento[0] + " " + dieces[ncuarta])
            ## veintes
            elif ntercera == 2:
                print(miles[nprimera] + " " + ciento[0] + " " + veintenas[ncuarta])
            else:
                print(miles[nprimera] + " " + ciento[0] + " " + decenas[ntercera] + " y " + unidades[ncuarta])
        

        if nsegunda != 1:
            ##unidades solamente
            if ntercera == 0:
                print (miles[nprimera] +" "+ cientenas[nsegunda] +" "+ unidades[ncuarta])
            ###dieces
            elif ntercera == 1:
                print(miles[nprimera] + " " + cientenas[nsegunda] + " " + dieces[ncuarta])
            ## veintes
            elif ntercera == 2:
                print(miles[nprimera] + " " + cientenas[nsegunda] + " " + veintenas[ncuarta])
            else:
                print(miles[nprimera] + " " + cientenas[nsegunda] + " " + decenas[ntercera] + " y " + unidades[ncuarta])         