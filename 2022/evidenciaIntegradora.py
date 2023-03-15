import csv



sueldo_extra = 0
sueldo_base:0
total=0
horas_faltantes = 0
sueldo_resta = 0
antiguedad_int = 0
sueldo_antiguedad = 0


  





    


with open('trabajadores.csv', 'w') as csvfile:
    fieldnames = ['Numero', 'Nombre', 'Direccion', 'telefono', 'antiguedad', 'sueldo base', 'Horas Base', ' extra', 'tipo', 'total']
    writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
    writer.writeheader()

#Empleados tipo 1

    writer.writerow({'Numero': '111', 'Nombre': 'Alex', 'Direccion': 'CALLE. TEOTIHUACAN 18, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '(55)1738-8916', 'antiguedad': '1', 'sueldo base': '10000','Horas Base':'40 ',' extra': '1 ', 'tipo': '1'})
    writer.writerow({'Numero': '112', 'Nombre': 'Hugo', 'Direccion': 'CARR FEDERAL MEXICO PACHUCA KM 30 LOC 3, LOS PAJARITOS , MEXICO , MEX , C.P.55069', 'telefono': '(55)2623-0518', 'antiguedad': '2', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '2 ', 'tipo': '1'})
    writer.writerow({'Numero': '113', 'Nombre': 'Martin', 'Direccion': 'CLL DOCTOR LICEAGA 113, FICT LOCALITY , FICTICIO , MEX , C.P.06700', 'telefono': '(722)276-2830', 'antiguedad': '3', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '3 ', 'tipo': '1'})
    writer.writerow({'Numero': '114', 'Nombre': 'Lucas', 'Direccion': 'CLLE MIXTECAS MZ 107 LT 7, AJUSCO , MEXICO , DF , C.P.04300', 'telefono': '(55)5740-1339', 'antiguedad': '4', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '4 ', 'tipo': '1'})
    writer.writerow({'Numero': '115', 'Nombre': 'Mateo', 'Direccion': 'CLLE MIGUEL HIDALGO MZA 144 LT1940, SANTA MARIA TOMATLAN , MEXICO , DF , C.P.09870', 'telefono': '(55)5255-4577', 'antiguedad': '5','Horas Base':'40 ', 'sueldo base': '10000', ' extra': '5 ', 'tipo': '1'})
    writer.writerow({'Numero': '116', 'Nombre': 'Leo', 'Direccion': 'CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '(55)5709-3743', 'antiguedad': '6', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '6 ', 'tipo': '1'})
    writer.writerow({'Numero': '117', 'Nombre': 'Daniel', 'Direccion': 'CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '( 55)5685 5755', 'antiguedad': '7', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '7 ', 'tipo': '1'})
    writer.writerow({'Numero': '118', 'Nombre': 'Alejandro', 'Direccion': 'AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 312) 312 9520', 'antiguedad': '8', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '8 ', 'tipo': '1'})
    writer.writerow({'Numero': '119', 'Nombre': 'Pablo', 'Direccion': 'AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 462) 622 5535', 'antiguedad': '9', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '9 ', 'tipo': '1'})
    writer.writerow({'Numero': '1110', 'Nombre': 'Manuel', 'Direccion': 'JESUS REYES HEROLES 123, LOMAS QUEBRADAS , MEXICO , DF , C.P.10000', 'telefono': '( 867) 715 0518', 'antiguedad': '10', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '10 ', 'tipo': '1'})
    writer.writerow({'Numero': '1111', 'Nombre': 'Adrian', 'Direccion': 'AVE JOSE MA IZAZAGA 161 LOC G, FICT LOCALITY , FICTICIO , MEX , C.P.06000', 'telefono': '( 595) 955 6514', 'antiguedad': '11', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '1 ', 'tipo': '1'})
    writer.writerow({'Numero': '1112', 'Nombre': 'David', 'Direccion': 'PRL ZARCO 6, SAN SIMON TOLNAHUAC , MEXICO , DF , C.P.06920', 'telefono': '( 55)5244 0263', 'antiguedad': '12', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '2 ', 'tipo': '1'})
    writer.writerow({'Numero': '1113', 'Nombre': 'Mario', 'Direccion': 'CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 55)5244 0262', 'antiguedad': '13', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '3 ', 'tipo': '1'})
    writer.writerow({'Numero': '1114', 'Nombre': 'Enzo', 'Direccion': 'CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 686) 566 8365', 'antiguedad': '14', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '4 ', 'tipo': '1'})
    writer.writerow({'Numero': '1115', 'Nombre': 'Diego', 'Direccion': 'CRT TEZOYUCA 101, FICT LOCALITY , FICTICIO , MEX , C.P.62760', 'telefono': '( 686) 567 7478', 'antiguedad': '15', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '5 ', 'tipo': '1'})
    writer.writerow({'Numero': '1116', 'Nombre': 'Marcos', 'Direccion': 'CLL MANANITAS 268, FICT LOCALITY , FICTICIO , MEX , C.P.04000', 'telefono': '( 686) 566 3304', 'antiguedad': '16', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '6 ', 'tipo': '1'})
    writer.writerow({'Numero': '1117', 'Nombre': 'Izan', 'Direccion': 'CLL JOAQUIN M GTEZ 9, JUAN ESCUTIA , MEXICO , DF , C.P.09100', 'telefono': '( 686) 564 6066', 'antiguedad': '17', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '7 ', 'tipo': '1'})
    writer.writerow({'Numero': '1118', 'Nombre': 'Javier', 'Direccion': 'CRT A NAVOLATO 9, FICT LOCALITY , FICTICIO , MEX , C.P.80129', 'telefono': '( 686) 566 0500', 'antiguedad': '18', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '8 ', 'tipo': '1'})
    writer.writerow({'Numero': '1119', 'Nombre': 'Marco', 'Direccion': 'CLL 300 315, FICT LOCALITY , FICTICIO , MEX , C.P.85180', 'telefono': '( 686) 564 6066', 'antiguedad': '19', 'sueldo base': '10000','Horas Base':'40 ', ' extra': '9 ', 'tipo': '1'})
    writer.writerow({'Numero': '1120', 'Nombre': 'Bruno', 'Direccion': 'CRT FEDERAL TLAXCALA SN MARTIN 30, FICT LOCALITY , FICTICIO , MEX , C.P.90140', 'telefono': '( 664) 681 8442', 'antiguedad': '20', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '10 ', 'tipo': '1'})     ##aqui termina
    writer.writerow({'Numero': '1121', 'Nombre': 'Oliver', 'Direccion': 'CLL 20 DE NOV 340, FICT LOCALITY , FICTICIO , MEX , C.P.63300', 'telefono': '( 686) 567 7479', 'antiguedad': '3', 'sueldo base': '10000', 'Horas Base':'40 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1122', 'Nombre': 'Miguel', 'Direccion': 'AVE ACUEDUCTO 1017 LOC A, SAN RAFAEL TICOMAN , MEXICO , DF , C.P.07359', 'telefono': '( 55)2166 3576', 'antiguedad': '21', 'sueldo base': '10000','Horas Base':'20 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1123', 'Nombre': 'Thiago', 'Direccion': 'CLL LUIS G VIEYRA 76, SAN MIGUEL CHAPULTEPEC I SECCION , MEXICO , DF , C.P.11850', 'telefono': '( 55)5709 2598', 'antiguedad': '22', 'sueldo base': '10000','Horas Base':'10 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1124', 'Nombre': 'Antonio', 'Direccion': 'CLLE AGUSTIN YANEZ 1352, ESCUADRON 201 , MEXICO , DF , C.P.09060', 'telefono': '( 55)5557 4080', 'antiguedad': '23', 'sueldo base': '10000', 'Horas Base':'15 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1125', 'Nombre': 'Marc', 'Direccion': 'CLL GABRIEL MANCERA 1721, FICT LOCALITY , FICTICIO , MEX , C.P.03100', 'telefono': '( 55)5202 6366', 'antiguedad': '24', 'sueldo base': '10000','Horas Base':'17 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1126', 'Nombre': 'Carlos', 'Direccion': 'PRL DIV DEL NTE 5031, FICT LOCALITY , FICTICIO , MEX , C.P.16010', 'telefono': '( 55)5082 8759', 'antiguedad': '25', 'sueldo base': '10000','Horas Base':'32 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1127', 'Nombre': 'Juan', 'Direccion': 'AV. BAJA VELOCIDAD 54, CASA BLANCA , METEPEC , MEX , C.P.52175', 'telefono': '( 312) 314 1091', 'antiguedad': '26', 'sueldo base': '10000','Horas Base':'12 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1128', 'Nombre': 'Gonzalo', 'Direccion': 'LEONA VICARIO 201, BARRIO COAXUSTENCO , METEPEC , MEX , C.P.52140', 'telefono': '( 55)5574 0725', 'antiguedad': '27', 'sueldo base': '10000','Horas Base':'11 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1129', 'Nombre': 'Gael', 'Direccion': 'LAGUNA DE TIXTLA 114, VICENTE GUERRERO , TOLUCA , MEX , C.P.50110', 'telefono': '( 55)5290 0250', 'antiguedad': '28', 'sueldo base': '10000','Horas Base':'12 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1130', 'Nombre': 'Sergio', 'Direccion': 'CALLE. TEOTIHUACAN 18, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': ' ', 'antiguedad': '29', 'sueldo base': '10000', 'Horas Base':'30 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1131', 'Nombre': 'Dylan', 'Direccion': 'PROL. PLUTARCO ELIAS CALLES 2510, DR. ALFONSO ORTIZ TIRADO , IZTAPALAPA , DF , C.P.09020', 'telefono': '( 55)5290 0250', 'antiguedad': '30', 'sueldo base': '10000', 'Horas Base':'36 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1132', 'Nombre': 'Gabriel', 'Direccion': 'CALLE 16 NO. 3, REFORMA SOCIAL (LOMAS DE SAN ISIDRO) , NAUCALPAN DE JUAREZ , MEX , C.P.53960', 'telefono': '( 55)5661 6293', 'antiguedad': '31', 'sueldo base': '10000','Horas Base':'20 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1133', 'Nombre': 'Jorge', 'Direccion': '3 OTE ARMADA DE MEXICO 1446 L6MZ8, EMILIANO ZAPATA FRACCIONAMIENTO POPULAR , COYOACAN , DF , C.P.04919', 'telefono': '( 55)5357 1619', 'antiguedad': '3', 'sueldo base': '10000', 'Horas Base':'19 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1134', 'Nombre': 'Adam', 'Direccion': 'AV. BAJA CALIFORNIA 274 PISO 2 B, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '( 55)5722 1500', 'antiguedad': '32', 'sueldo base': '10000', 'Horas Base':'5 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1135', 'Nombre': 'Liam', 'Direccion': '22 DE FEBRERO 82, CENTRO DE AZCAPOTZALCO , AZCAPOTZALCO , DF , C.P.02000', 'telefono': '( 55)2625 8006', 'antiguedad': '33', 'sueldo base': '10000','Horas Base':'8 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1136', 'Nombre': 'Eric', 'Direccion': 'JOSE TORIBIO MEDINA 50, ALGARIN , CUAUHTEMOC , DF , C.P.06880', 'telefono': '( 55)5358 1964', 'antiguedad': '34', 'sueldo base': '10000','Horas Base':'27 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1137', 'Nombre': 'Samuel ', 'Direccion': 'DURAZNOS 18 B, JARDINES DE SAN MIGUEL , CUAUTITLAN IZCALLI , MEX , C.P.54715', 'telefono': '( 55)5358 1964', 'antiguedad': '35', 'sueldo base': '10000', 'Horas Base':'31 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1138', 'Nombre': 'Luca', 'Direccion': 'MANUEL VILLALONGIN 160, CUAUHTEMOC , CUAUHTEMOC , DF , C.P.06500', 'telefono': '( 55)5358 1964', 'antiguedad': '36', 'sueldo base': '10000','Horas Base':'25 ', ' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1139', 'Nombre': 'Iker', 'Direccion': 'CALZADA DE GUADALUPE 711, EL CERRITO , CUAUTITLAN , MEX , C.P.54879', 'telefono': '( 55)5358 7553', 'antiguedad': '37', 'sueldo base': '10000', 'Horas Base':'23 ',' extra': '0 ', 'tipo': '1'})
    writer.writerow({'Numero': '1140', 'Nombre': 'Amir', 'Direccion': 'AV. BAJA CALIFORNIA 274 PISO 2 B, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '( 55)9155 1124', 'antiguedad': '38', 'sueldo base': '10000', 'Horas Base':'18 ',' extra': '0 ', 'tipo': '1'})     

#Empleados tipo 2

    writer.writerow({'Numero': '221', 'Nombre': '2Alex', 'Direccion': '2CALLE. TEOTIHUACAN 18, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '(55)1738-8916', 'antiguedad': '1', 'sueldo base': '5000','Horas Base':'40 ',' extra': '1 ', 'tipo': '2'})
    writer.writerow({'Numero': '222', 'Nombre': '2Hugo', 'Direccion': '2CARR FEDERAL MEXICO PACHUCA KM 30 LOC 3, LOS PAJARITOS , MEXICO , MEX , C.P.55069', 'telefono': '(55)2623-0518', 'antiguedad': '2', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '2 ', 'tipo': '2'})
    writer.writerow({'Numero': '223', 'Nombre': '2Martin', 'Direccion': '2CLL DOCTOR LICEAGA 113, FICT LOCALITY , FICTICIO , MEX , C.P.06700', 'telefono': '(722)276-2830', 'antiguedad': '3', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '3 ', 'tipo': '2'})
    writer.writerow({'Numero': '224', 'Nombre': '2Lucas', 'Direccion': '2CLLE MIXTECAS MZ 107 LT 7, AJUSCO , MEXICO , DF , C.P.04300', 'telefono': '(55)5740-1339', 'antiguedad': '4', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '4 ', 'tipo': '2'})
    writer.writerow({'Numero': '225', 'Nombre': '2Mateo', 'Direccion': '2CLLE MIGUEL HIDALGO MZA 144 LT1940, SANTA MARIA TOMATLAN , MEXICO , DF , C.P.09870', 'telefono': '(55)5255-4577', 'antiguedad': '5', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '5 ', 'tipo': '2'})
    writer.writerow({'Numero': '226', 'Nombre': '2Leo', 'Direccion': '2CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '(55)5709-3743', 'antiguedad': '6', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '6 ', 'tipo': '2'})
    writer.writerow({'Numero': '227', 'Nombre': '2Daniel', 'Direccion': '2CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '( 55)5685 5755', 'antiguedad': '7', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '7 ', 'tipo': '2'})
    writer.writerow({'Numero': '228', 'Nombre': '2Alejandro', 'Direccion': '2AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 312) 312 9520', 'antiguedad': '8', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '8 ', 'tipo': '2'})
    writer.writerow({'Numero': '229', 'Nombre': '2Pablo', 'Direccion': '2AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 462) 622 5535', 'antiguedad': '9', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '9 ', 'tipo': '2'})
    writer.writerow({'Numero': '2210', 'Nombre': '2Manuel', 'Direccion': '2JESUS REYES HEROLES 123, LOMAS QUEBRADAS , MEXICO , DF , C.P.10000', 'telefono': '( 867) 715 0518', 'antiguedad': '10', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '10 ', 'tipo': '2'})
    writer.writerow({'Numero': '2211', 'Nombre': '2Adrian', 'Direccion': '2AVE JOSE MA IZAZAGA 161 LOC G, FICT LOCALITY , FICTICIO , MEX , C.P.06000', 'telefono': '( 595) 955 6514', 'antiguedad': '11', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '1 ', 'tipo': '2'})
    writer.writerow({'Numero': '2212', 'Nombre': '2David', 'Direccion': '2PRL ZARCO 6, SAN SIMON TOLNAHUAC , MEXICO , DF , C.P.06920', 'telefono': '( 55)5244 0263', 'antiguedad': '12', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '2 ', 'tipo': '2'})
    writer.writerow({'Numero': '2213', 'Nombre': '2Mario', 'Direccion': '2CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 55)5244 0262', 'antiguedad': '13', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '3 ', 'tipo': '2'})
    writer.writerow({'Numero': '2214', 'Nombre': '2Enzo', 'Direccion': '2CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 686) 566 8365', 'antiguedad': '14', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '4 ', 'tipo': '2'})
    writer.writerow({'Numero': '2215', 'Nombre': '2Diego', 'Direccion': '2CRT TEZOYUCA 101, FICT LOCALITY , FICTICIO , MEX , C.P.62760', 'telefono': '( 686) 567 7478', 'antiguedad': '15', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '5 ', 'tipo': '2'})
    writer.writerow({'Numero': '2216', 'Nombre': '2Marcos', 'Direccion': '2CLL MANANITAS 268, FICT LOCALITY , FICTICIO , MEX , C.P.04000', 'telefono': '( 686) 566 3304', 'antiguedad': '16', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '6 ', 'tipo': '2'})
    writer.writerow({'Numero': '2217', 'Nombre': '2Izan', 'Direccion': '2CLL JOAQUIN M GTEZ 9, JUAN ESCUTIA , MEXICO , DF , C.P.09100', 'telefono': '( 686) 564 6066', 'antiguedad': '17', 'sueldo base': '5000','Horas Base':'40 ',' extra': '7 ', 'tipo': '2'})
    writer.writerow({'Numero': '2218', 'Nombre': '2Javier', 'Direccion': '2CRT A NAVOLATO 9, FICT LOCALITY , FICTICIO , MEX , C.P.80129', 'telefono': '( 686) 566 0500', 'antiguedad': '18', 'sueldo base': '5000','Horas Base':'40 ', ' extra': '8 ', 'tipo': '2'})
    writer.writerow({'Numero': '2219', 'Nombre': '2Marco', 'Direccion': '2CLL 300 315, FICT LOCALITY , FICTICIO , MEX , C.P.85180', 'telefono': '( 686) 564 6066', 'antiguedad': '19', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '9 ', 'tipo': '2'})
    writer.writerow({'Numero': '2220', 'Nombre': '2Bruno', 'Direccion': '2CRT FEDERAL TLAXCALA SN MARTIN 30, FICT LOCALITY , FICTICIO , MEX , C.P.90140', 'telefono': '( 664) 681 8442', 'antiguedad': '20', 'sueldo base': '5000', 'Horas Base':'40 ',' extra': '10 ', 'tipo': '2'}) ##Aqui termina
    writer.writerow({'Numero': '2221', 'Nombre': '2Oliver', 'Direccion': '2CLL 20 DE NOV 340, FICT LOCALITY , FICTICIO , MEX , C.P.63300', 'telefono': '( 686) 567 7479', 'antiguedad': '21', 'sueldo base': '5000', 'Horas Base':'10 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2222', 'Nombre': '2Miguel', 'Direccion': '2AVE ACUEDUCTO 1017 LOC A, SAN RAFAEL TICOMAN , MEXICO , DF , C.P.07359', 'telefono': '( 55)2166 3576', 'antiguedad': '22', 'sueldo base': '5000','Horas Base':'21 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2223', 'Nombre': '2Thiago', 'Direccion': '2CLL LUIS G VIEYRA 76, SAN MIGUEL CHAPULTEPEC I SECCION , MEXICO , DF , C.P.11850', 'telefono': '( 55)5709 2598', 'antiguedad': '23', 'sueldo base': '5000', 'Horas Base':'31 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2224', 'Nombre': '2Antonio', 'Direccion': '2CLLE AGUSTIN YANEZ 1352, ESCUADRON 201 , MEXICO , DF , C.P.09060', 'telefono': '( 55)5557 4080', 'antiguedad': '24', 'sueldo base': '5000','Horas Base':'32 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2225', 'Nombre': '2Marc', 'Direccion': '2CLL GABRIEL MANCERA 1721, FICT LOCALITY , FICTICIO , MEX , C.P.03100', 'telefono': '( 55)5202 6366', 'antiguedad': '25', 'sueldo base': '5000','Horas Base':'33 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2226', 'Nombre': '2Carlos', 'Direccion': '2PRL DIV DEL NTE 5031, FICT LOCALITY , FICTICIO , MEX , C.P.16010', 'telefono': '( 55)5082 8759', 'antiguedad': '26', 'sueldo base': '5000', 'Horas Base':'34 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2227', 'Nombre': '2Juan', 'Direccion': '2AV. BAJA VELOCIDAD 54, CASA BLANCA , METEPEC , MEX , C.P.52175', 'telefono': '( 312) 314 1091', 'antiguedad': '27', 'sueldo base': '5000','Horas Base':'35 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2228', 'Nombre': '2Gonzalo', 'Direccion': '2LEONA VICARIO 201, BARRIO COAXUSTENCO , METEPEC , MEX , C.P.52140', 'telefono': '( 55)5574 0725', 'antiguedad': '28', 'sueldo base': '5000', 'Horas Base':'10 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2229', 'Nombre': '2Gael', 'Direccion': '2LAGUNA DE TIXTLA 114, VICENTE GUERRERO , TOLUCA , MEX , C.P.50110', 'telefono': '( 55)5290 0250', 'antiguedad': '29', 'sueldo base': '5000', 'Horas Base':'11 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2230', 'Nombre': '2Sergio', 'Direccion': '2CALLE. TEOTIHUACAN 18, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': ' ', 'antiguedad': '30', 'sueldo base': '5000','Horas Base':'12 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2231', 'Nombre': '2Dylan', 'Direccion': '2PROL. PLUTARCO ELIAS CALLES 2510, DR. ALFONSO ORTIZ TIRADO , IZTAPALAPA , DF , C.P.09020', 'telefono': '( 55)5290 0250', 'antiguedad': '31', 'sueldo base': '5000','Horas Base':'12 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2232', 'Nombre': '2Gabriel', 'Direccion': '2CALLE 16 NO. 3, REFORMA SOCIAL (LOMAS DE SAN ISIDRO) , NAUCALPAN DE JUAREZ , MEX , C.P.53960', 'telefono': '( 55)5661 6293', 'antiguedad': '32', 'sueldo base': '5000', 'Horas Base':'13 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2233', 'Nombre': '2Jorge', 'Direccion': '23 OTE ARMADA DE MEXICO 1446 L6MZ8, EMILIANO ZAPATA FRACCIONAMIENTO POPULAR , COYOACAN , DF , C.P.04919', 'telefono': '( 55)5357 1619', 'antiguedad': '33', 'sueldo base': '5000','Horas Base':'14 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2234', 'Nombre': '2Adam', 'Direccion': '2AV. BAJA CALIFORNIA 274 PISO 2 B, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '( 55)5722 1500', 'antiguedad': '34', 'sueldo base': '5000', 'Horas Base':'15 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2235', 'Nombre': '2Liam', 'Direccion': '222 DE FEBRERO 82, CENTRO DE AZCAPOTZALCO , AZCAPOTZALCO , DF , C.P.02000', 'telefono': '( 55)2625 8006', 'antiguedad': '35', 'sueldo base': '5000', 'Horas Base':'16 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2236', 'Nombre': '2Eric', 'Direccion': '2JOSE TORIBIO MEDINA 50, ALGARIN , CUAUHTEMOC , DF , C.P.06880', 'telefono': '( 55)5358 1964', 'antiguedad': '36', 'sueldo base': '5000', 'Horas Base':'17 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2237', 'Nombre': '2Samuel ', 'Direccion': '2DURAZNOS 18 B, JARDINES DE SAN MIGUEL , CUAUTITLAN IZCALLI , MEX , C.P.54715', 'telefono': '( 55)5358 1964', 'antiguedad': '37', 'sueldo base': '5000','Horas Base':'18 ', ' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2238', 'Nombre': '2Luca', 'Direccion': '2MANUEL VILLALONGIN 160, CUAUHTEMOC , CUAUHTEMOC , DF , C.P.06500', 'telefono': '( 55)5358 1964', 'antiguedad': '38', 'sueldo base': '5000', 'Horas Base':'19 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2239', 'Nombre': '2Iker', 'Direccion': '2CALZADA DE GUADALUPE 711, EL CERRITO , CUAUTITLAN , MEX , C.P.54879', 'telefono': '( 55)5358 7553', 'antiguedad': '39', 'sueldo base': '5000', 'Horas Base':'20 ',' extra': '0 ', 'tipo': '2'})
    writer.writerow({'Numero': '2240', 'Nombre': '2Amir', 'Direccion': '2AV. BAJA CALIFORNIA 274 PISO 2 B, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '( 55)9155 1124', 'antiguedad': '40', 'sueldo base': '5000','Horas Base':'21 ', ' extra': '0 ', 'tipo': '2'}) 

#Empleados tipo 3

    writer.writerow({'Numero': '331', 'Nombre': '3Alex', 'Direccion': '3CALLE. TEOTIHUACAN 18, HIPODROMO , CUAUHTEMOC , DF , C.P.06100', 'telefono': '(55)1738-8916', 'antiguedad': '1', 'sueldo base': '15000', 'Horas Base':'40 ',' extra': '1 ', 'tipo': '3'})
    writer.writerow({'Numero': '332', 'Nombre': '3Hugo', 'Direccion': '3CARR FEDERAL MEXICO PACHUCA KM 30 LOC 3, LOS PAJARITOS , MEXICO , MEX , C.P.55069', 'telefono': '(55)2623-0518', 'antiguedad': '2', 'sueldo base': '15000','Horas Base':'40 ', ' extra': '2 ', 'tipo': '3'})
    writer.writerow({'Numero': '333', 'Nombre': '3Martin', 'Direccion': '3CLL DOCTOR LICEAGA 113, FICT LOCALITY , FICTICIO , MEX , C.P.06700', 'telefono': '(722)276-2830', 'antiguedad': '3', 'sueldo base': '15000','Horas Base':'40 ', ' extra': '3 ', 'tipo': '3'})
    writer.writerow({'Numero': '334', 'Nombre': '3Lucas', 'Direccion': '3CLLE MIXTECAS MZ 107 LT 7, AJUSCO , MEXICO , DF , C.P.04300', 'telefono': '(55)5740-1339', 'antiguedad': '4', 'sueldo base': '15000','Horas Base':'40 ', ' extra': '4 ', 'tipo': '3'})
    writer.writerow({'Numero': '335', 'Nombre': '3Mateo', 'Direccion': '3CLLE MIGUEL HIDALGO MZA 144 LT1940, SANTA MARIA TOMATLAN , MEXICO , DF , C.P.09870', 'telefono': '(55)5255-4577', 'antiguedad': '5', 'sueldo base': '15000', 'Horas Base':'40 ',' extra': '5 ', 'tipo': '3'})
    writer.writerow({'Numero': '336', 'Nombre': '3Leo', 'Direccion': '3CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '(55)5709-3743', 'antiguedad': '6', 'sueldo base': '15000', 'Horas Base':'40 ',' extra': '6 ', 'tipo': '3'})
    writer.writerow({'Numero': '337', 'Nombre': '3Daniel', 'Direccion': '3CLL DOCTOR NEVA 47, DOCTORES , MEXICO , DF , C.P.06720', 'telefono': '( 55)5685 5755', 'antiguedad': '7', 'sueldo base': '15000', 'Horas Base':'40 ',' extra': '7 ', 'tipo': '3'})
    writer.writerow({'Numero': '338', 'Nombre': '3Alejandro', 'Direccion': '3AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 312) 312 9520', 'antiguedad': '8', 'sueldo base': '15000', 'Horas Base':'40 ',' extra': '8 ', 'tipo': '3'})
    writer.writerow({'Numero': '339', 'Nombre': '3Pablo', 'Direccion': '3AVE TRANSPENINSULAR 32 INT D, FICT LOCALITY , FICTICIO , MEX , C.P.22800', 'telefono': '( 462) 622 5535', 'antiguedad': '9', 'sueldo base': '15000','Horas Base':'40 ', ' extra': '9 ', 'tipo': '3'})
    writer.writerow({'Numero': '3310', 'Nombre': '3Manuel', 'Direccion': '3JESUS REYES HEROLES 123, LOMAS QUEBRADAS , MEXICO , DF , C.P.10000', 'telefono': '( 867) 715 0518', 'antiguedad': '10', 'sueldo base': '15000','Horas Base':'40 ', ' extra': '10 ', 'tipo': '3'})
    writer.writerow({'Numero': '3311', 'Nombre': '3Adrian', 'Direccion': '3AVE JOSE MA IZAZAGA 161 LOC G, FICT LOCALITY , FICTICIO , MEX , C.P.06000', 'telefono': '( 595) 955 6514', 'antiguedad': '11', 'sueldo base': '15000','Horas Base':'10 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3312', 'Nombre': '3David', 'Direccion': '3PRL ZARCO 6, SAN SIMON TOLNAHUAC , MEXICO , DF , C.P.06920', 'telefono': '( 55)5244 0263', 'antiguedad': '12', 'sueldo base': '15000','Horas Base':'11 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3313', 'Nombre': '3Mario', 'Direccion': '3CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 55)5244 0262', 'antiguedad': '13', 'sueldo base': '15000','Horas Base':'25 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3314', 'Nombre': '3Enzo', 'Direccion': '3CRT MONTERREY SALTILLO 7, FICT LOCALITY , FICTICIO , MEX , C.P.66350', 'telefono': '( 686) 566 8365', 'antiguedad': '14', 'sueldo base': '15000','Horas Base':'26 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3315', 'Nombre': '3Diego', 'Direccion': '3CRT TEZOYUCA 101, FICT LOCALITY , FICTICIO , MEX , C.P.62760', 'telefono': '( 686) 567 7478', 'antiguedad': '15', 'sueldo base': '15000','Horas Base':'27 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3316', 'Nombre': '3Marcos', 'Direccion': '3CLL MANANITAS 268, FICT LOCALITY , FICTICIO , MEX , C.P.04000', 'telefono': '( 686) 566 3304', 'antiguedad': '16', 'sueldo base': '15000','Horas Base':'28 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3317', 'Nombre': '3Izan', 'Direccion': '3CLL JOAQUIN M GTEZ 9, JUAN ESCUTIA , MEXICO , DF , C.P.09100', 'telefono': '( 686) 564 6066', 'antiguedad': '17', 'sueldo base': '15000','Horas Base':'29 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3318', 'Nombre': '3Javier', 'Direccion': '3CRT A NAVOLATO 9, FICT LOCALITY , FICTICIO , MEX , C.P.80129', 'telefono': '( 686) 566 0500', 'antiguedad': '18', 'sueldo base': '15000','Horas Base':'30 ', ' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3319', 'Nombre': '3Marco', 'Direccion': '3CLL 300 315, FICT LOCALITY , FICTICIO , MEX , C.P.85180', 'telefono': '( 686) 564 6066', 'antiguedad': '19', 'sueldo base': '15000', 'Horas Base':'31 ',' extra': '0 ', 'tipo': '3'})
    writer.writerow({'Numero': '3320', 'Nombre': '3Bruno', 'Direccion': '3CRT FEDERAL TLAXCALA SN MARTIN 30, FICT LOCALITY , FICTICIO , MEX , C.P.90140', 'telefono': '( 664) 681 8442', 'antiguedad': '20','Horas Base':'32 ', 'sueldo base': '15000', ' extra': '0 ', 'tipo': '3'})
print("Archivo Creado")


if  fieldnames [8] == '1':
    sueldo_base =10000 
    if fieldnames ['Horas Base'] == '40':
        sueldo_base = 10000
        if fieldnames ['horas extra'] >= 1:
            sueldo_extra = fieldnames ['horas extra']*300
        
    if fieldnames ['Horas Base'] <= 39:
        horas_faltantes = 40 - fieldnames ['Horas Base']
        sueldo_resta = horas_faltantes * 300
    
    if fieldnames['antiguedad'] >=1 : 
        antiguedad_int = fieldnames['antiguedad'] / 5 
        antiguedad_int = int(antiguedad_int)
        sueldo_antiguedad = antiguedad_int * 200  

    total = sueldo_base + sueldo_extra - horas_faltantes + sueldo_antiguedad

    
else:
    
    if  fieldnames [8] == '2':
        sueldo_base =5000 
        if fieldnames ['Horas Base'] == '40':
            sueldo_base = 5000
            if fieldnames ['horas extra'] >= 1:
                sueldo_extra = fieldnames ['horas extra']*200
            
        if fieldnames ['Horas Base'] <= 39:
            horas_faltantes = 40 - fieldnames ['Horas Base']
            sueldo_resta = horas_faltantes * 200
        
        if fieldnames['antiguedad'] >=1 : 
            antiguedad_int = fieldnames['antiguedad'] / 5 
            antiguedad_int = int(antiguedad_int)
            sueldo_antiguedad = antiguedad_int * 200  

        total = sueldo_base + sueldo_extra - horas_faltantes + sueldo_antiguedad
    else: 
        if  fieldnames [8] == '3':
            sueldo_base =15000 
            if fieldnames ['Horas Base'] == '40':
                sueldo_base = 15000
                if fieldnames ['horas extra'] >= 1:
                    sueldo_extra = fieldnames ['horas extra']*100
                
            if fieldnames ['Horas Base'] <= 39:
                horas_faltantes = 40 - fieldnames ['Horas Base']
                sueldo_resta = horas_faltantes * 100
            
            if fieldnames['antiguedad'] >=1 : 
                antiguedad_int = fieldnames['antiguedad'] / 5 
                antiguedad_int = int(antiguedad_int)
                sueldo_antiguedad = antiguedad_int * 200  

            total = sueldo_base + sueldo_extra - horas_faltantes + sueldo_antiguedad
