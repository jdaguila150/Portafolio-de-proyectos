# -*- coding: utf-8 -*-
import random
from flask import Flask, jsonify, request
app = Flask(__name__)
#CUANDO RECIBAMOS LAS PETICIONES EN ESTA RUTA
@app.route("/webhook/", methods=["POST", "GET"])
def webhook_whatsapp():
    #SI HAY DATOS RECIBIDOS VIA GET
    if request.method == "GET":
        #SI EL TOKEN ES IGUAL AL QUE RECIBIMOS
        if request.args.get('hub.verify_token') == "n0m3l0":
            #ESCRIBIMOS EN EL NAVEGADOR EL VALOR DEL RETO RECIBIDO DESDE FACEBOOK
            return request.args.get('hub.challenge')
        else:
            #SI NO SON IGUALES RETORNAMOS UN MENSAJE DE ERROR
          return "Error de autentificacion."
    #RECIBIMOS TODOS LOS DATOS ENVIADO VIA JSON
    data=request.get_json()
    #EXTRAEMOS EL NUMERO DE TELEFONO Y EL MANSAJE
    telefonoCliente=data['entry'][0]['changes'][0]['value']['messages'][0]['from']
    #EXTRAEMOS EL TELEFONO DEL CLIENTE
    mensaje=data['entry'][0]['changes'][0]['value']['messages'][0]['text']['body']
    #EXTRAEMOS EL ID DE WHATSAPP DEL ARRAY
    idWA=data['entry'][0]['changes'][0]['value']['messages'][0]['id']
    #EXTRAEMOS EL TIEMPO DE WHATSAPP DEL ARRAY
    timestamp=data['entry'][0]['changes'][0]['value']['messages'][0]['timestamp']
    #ESCRIBIMOS EL NUMERO DE TELEFONO Y EL MENSAJE EN EL ARCHIVO TEXTO







    #SI HAY UN MENSAJE
    if mensaje is not None:
      from rivescript import RiveScript

      if (mensaje != "Hola Ogo"):
        #INICIALIZAMOS RIVESCRIPT Y CARGAMOS LA CONVERSACION
        bot = RiveScript()
        bot.load_file('facto.rive')
        bot.sort_replies()


        # Nombre del archivo en el que deseas escribir (puedes cambiarlo)
        nombre_archivo = "texto.txt"

        # Texto que deseas escribir en el archivo (puedes cambiarlo)
        texto_a_escribir = mensaje

        # Abre el archivo en modo escritura (si no existe, se creará; si existe, se sobrescribirá)
        with open(nombre_archivo, "w") as archivo:
            archivo.write(texto_a_escribir)
            archivo.close

        #OBTENEMOS LA RESPUESTA
        respuesta= bot.reply("localuser",mensaje)
        #ELIMINAMOS ESPACIOS EN BLANCO DE LA CADENA DEL MENSAJE

        respuesta = respuesta.replace(" ", "+")
        respuesta=respuesta.replace("\\n","\\\n")
        respuesta=respuesta.replace("\\","")

      elif mensaje == "Hola Ogo" or mensaje == "Hola ogo" or mensaje == "hola ogo" or mensaje == "hola ogo":
        nombre_archivo = "texto.txt"
        with open(nombre_archivo, "r") as archivo:
            contenido = archivo.read()
                

        def procesar_url1(contenido):
            URL = contenido
            lista = [letra for letra in URL]
            dobleU = "w"
            slash = "/"
            indice_encontrado = None

            for i in range(len(lista)):
                if lista[i] == dobleU:
                    print("Elemento encontrado:", lista[i + 3], "en el índice", i + 3)
                    indice_encontrado = i + 3
                    break

            if indice_encontrado is not None:
                lista = lista[indice_encontrado + 1:]
                resultadodobleu = ''.join(lista)  # Convierte la lista resultante en una cadena
            else:
                for i in range(len(lista)):
                    if lista[i] == slash:
                        print("Elemento encontrado:", lista[i + 1], "en el índice", i + 1)
                        indice_encontrado = i + 1
                        break
                if indice_encontrado is not None:
                    lista = lista[indice_encontrado + 1:]
                    resultadodobleu = ''.join(lista)  # Convierte la lista resultante en una cadena

            print("Cadena modificada:", resultadodobleu)
            return(resultadodobleu)

        def procesar_url2(resultado):
            URL = resultado
            lista = [letra for letra in URL]
            punto = "."
            indice_encontrado = None

            for i in range(len(lista)):
                if lista[i] == punto:
                    print("Elemento encontrado:", lista[i], "en el índice", i)
                    indice_encontrado = i
                    break

            if indice_encontrado is not None:
                lista = lista[:indice_encontrado]  # Elimina todo lo que está después del punto
                resultado = ''.join(lista)  # Convierte la lista resultante en una cadena
            else:
                resultado = URL  # Si no se encuentra un punto, no se realiza ninguna modificacion

            print("Cadena modificada:", resultado)
            return(resultado)

        # Llama a la funcion para procesar el URL
        resultado = procesar_url1(contenido)
        resultado2 = procesar_url2(resultado)

        def seleccionar_opcion_ponderada(opciones):
            # Genera un número aleatorio entre 0 y 1
            numero_aleatorio = random.random()

            # Inicializa la variable seleccionada
            seleccionada = None

            # Realiza la seleccion basada en los pesos
            acumulador = 0
            for opcion, peso in opciones:
                acumulador += peso
                if numero_aleatorio < acumulador:
                    seleccionada = opcion
                    break

            return seleccionada


        if resultado2 == "cnnespanol":
          opciones = [
              ('''Hola yo soy Ogo ✅tienes 67% de Confiabilidad''', 0.8),  # Peso del 30%
              ('''Hola yo soy Ogo ⚠️tienes 50% de Confiabilidad''', 0.17),  # Peso del 50%
              ('''Hola yo soy Ogo ✅tienes 95.41% de Confiabilidad''', 0.03)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "eluniversal":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 67% de Confiabilidad''', 0.8),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ✅ 58.94% de Confiabilidad''', 0.1),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 76.39% de Confiabilidad''', 0.1)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "milenio":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 65.5% de Confiabilidad''', 0.9),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ⚠️ 38.09% de Confiabilidad''', 0.05),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 82.6% de Confiabilidad''', 0.05)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "canal22":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 67.19% de Confiabilidad''', 0.7),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ⚠️ 42.1% de Confiabilidad''', 0.25),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 92% de Confiabilidad''', 0.05)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "reforma":
          opciones = [
              ('''Hola yo soy Ogo itenes ✅ 63% de Confiabilidad''', 0.79),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ✅ 74.6% de Confiabilidad''', 0.11),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 54.74% de Confiabilidad''', 0.1)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "radioformula":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 60.6% de Confiabilidad''', 0.95),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ✅ 54.6% de Confiabilidad''', 0.03),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 74.7% de Confiabilidad''', 0.02)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "aristeguinoticias":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 64.8% de Confiabilidad''', 0.8),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ⚠️ 35.16% de Confiabilidad''', 0.15),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 84.84% de Confiabilidad''', 0.05)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:", opcion_seleccionada)	

        elif resultado2 == "animalpolitico":
          opciones = [
              ('''Hola yo soy Ogo tienes ✅ 65.5% de Confiabilidad''', 0.9),  # Peso del 30%
              ('''Hola yo soy Ogo tienes ⚠️ 38.06% de Confiabilidad''', 0.06),  # Peso del 50%
              ('''Hola yo soy Ogo tienes ✅ 90% de Confiabilidad''', 0.04)   # Peso del 20%
          ]

          opcion_seleccionada = seleccionar_opcion_ponderada(opciones)
          print("Opcion seleccionada:",opcion_seleccionada)	
        
        else:
           opcion_seleccionada = "Lo siento mucho 😥 por el momento no puedo verificar tu respuesta"

        respuesta = opcion_seleccionada



      #CONECTAMOS A LA BASE DE DATOS
     
      import mysql.connector
      mydb = mysql.connector.connect(
          host = "mysql-jdaguila150.alwaysdata.net",
          user = "333624",
          password = "Jos0109.",
          database='jdaguila150_chat'
      )
      mycursor = mydb.cursor()
      query="SELECT count(id) AS cantidad FROM registro WHERE id_wa='" + idWA + "';"
      mycursor.execute(query)
      cantidad, = mycursor.fetchone()
      cantidad=str(cantidad)
      cantidad=int(cantidad)
      if cantidad==0 :
        sql = ("INSERT INTO registro"+ 
        "(mensaje_recibido,mensaje_enviado,id_wa      ,timestamp_wa   ,telefono_wa) VALUES "+
        "('"+mensaje+"'   ,'"+respuesta+"','"+idWA+"' ,'"+timestamp+"','"+telefonoCliente+"');")
        mycursor.execute(sql)
        mydb.commit()
        enviar(telefonoCliente,respuesta)
        #RETORNAMOS EL STATUS EN UN JSON
        return jsonify({"status": "success"}, 200)
def enviar(telefonoRecibe,respuesta):
  from heyoo import WhatsApp
  #TOKEN DE ACCESO DE FACEBOOK
  token='EAAC8h6g7GlsBO4LmpJN0BQ1XVvVNmNecPcAasZBZB7QOjNjyorS2AZAc9rOfJo6fygOrTcPelr4bL2ruUkVm9SeZBVV8eYVsKfW9WaCCdVZAg1st0CDXQlSqOZBZCkWKxIgwqia9DUIpiWJHvVLtgY6dmf2kAWMm2fZCXqGDnVSB6ErF87CMSY9i1QOvu6WRZCatf'
  #IDENTIFICADOR DE NÚMERO DE TELÉFONO
  #token='EAAC8h6g7GlsBO5QZCmviUSj95Y5CwtaShRnIBei6nMNJj5ifKeWXPX37qUKG0bFjLYBBUBmrG55q6i4Jriv5Gitm7GDZBe8mHYIY5rs9TqMz8DxZBBEvc5BXKXUUKbTZA30GlBQLQH37eID3ohutOVSpMKdJZCZCMWlvb6pcDV0i9fVpVlCZAgiJfJLoE0waNDbkYYK1P9DhYVp3488JJUZD'
  idNumeroTeléfono='159097347284260'
  #INICIALIZAMOS ENVIO DE MENSAJES
  mensajeWa=WhatsApp(token,idNumeroTeléfono)
  telefonoRecibe=telefonoRecibe.replace("521","52")
  #ENVIAMOS UN MENSAJE DE TEXTO


  mensajeWa.send_message(respuesta,telefonoRecibe)

#INICIAMSO FLASK
if __name__ == "__main__":
  app.run(debug=True)