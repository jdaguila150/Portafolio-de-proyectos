import cv2
import imutils
import os
import numpy as np
from rembg import remove
import matplotlib.pyplot as plt
from PIL import Image
import openpyxl


def aumentadordebrillo(archivo_brillo, ruta_brillo , ruta_guardado_brillo):


	def calcular_porcentaje_pixeles_blancos(ruta_imagen):
		imagen = cv2.imread(ruta_imagen)
		#cv2.imshow("Imagen", imagen)
		#cv2.waitKey(0)
		# Ajustar el brillo de la imagen con un factor determinado (por ejemplo, 1.5)
		imagen_ajustada = ajustar_brillo(imagen, 1.5)
		# Convertir la imagen a tipo de datos de 8 bits con tres canales de color
		imagen_ajustada = np.uint8(imagen_ajustada)
		# Verificar que la imagen tenga la forma esperada
		if imagen_ajustada.ndim != 3 or imagen_ajustada.shape[2] != 3:
			raise ValueError("La imagen ajustada no tiene la forma esperada (alto x ancho x 3)")
		# Crear una máscara para los píxeles blancos
		mascara_blancos = np.all(imagen_ajustada == [255, 255, 255], axis=2)
		# Contar los píxeles blancos en la máscara
		contador_blancos = np.count_nonzero(mascara_blancos)
		# Obtener el número total de píxeles en la imagen
		total_pixeles = imagen.shape[0] * imagen.shape[1]
		# Calcular el porcentaje de píxeles blancos
		porcentaje_blancos = (contador_blancos / total_pixeles) * 100
		return porcentaje_blancos

	archivo = archivo_brillo
	archivodetectaporcentajes = ruta_brillo
	imagen = cv2.imread(archivo)
	imagenRGB = cv2.cvtColor(imagen, cv2.COLOR_BGR2RGB)

	contador_brillo = 0
	l=124
	iteracion = 0
	while (l<= 300):
		ruta_guardado = ruta_guardado_brillo
		brillo = l
		nueva = imagenRGB.copy()
		renglones = imagenRGB.shape[0]
		columnas = imagenRGB.shape[1]
		for ren in range (renglones):
			for col in range(columnas):
				for icolor in range (3):
					pixel = imagenRGB[ren][col][icolor] + brillo
					if pixel > 255 :
						nueva [ren,col,icolor]= 255
					elif pixel < 0:
						nueva[ren,col,icolor] = 0
					else:
						nueva[ren,col,icolor] = pixel
		figura = plt.figure(figsize=(10,7))
		figura.add_subplot(1,2,2)
		cv2.imwrite(ruta_guardado+'/ojo_brillo.png',nueva) 
   



		def ajustar_brillo(imagen, l):
			imagen_ajustada = imagen.astype(np.float32) * l
			imagen_ajustada = np.clip(imagen_ajustada, 0, 255).astype(np.uint8)
			return imagen_ajustada


		if l == 10:
			ruta_imagen = archivo
			print("hola mi brillo es menor de 10")     
		else:
			ruta_imagen = archivodetectaporcentajes

		porcentaje = calcular_porcentaje_pixeles_blancos(ruta_imagen)


		if (porcentaje >= 47):
	
			break
			
		l = l+2
		iteracion = iteracion + 1
	if(brillo >= 125): #sin embargo se podría aproximar al promedio real de 124.7879
		print("El brillo de la imagen necesario para cubrir su superficie fue de ",brillo, "por lo que tranquilo, no es catarata" )
		print(brillo)
		contador_brillo = 20
		print(contador_brillo)
	else:
		print(brillo)
		print("ten cuidado, puede que si sea")
		contador_brillo = 10
		print(contador_brillo)
	return(contador_brillo)

def distancia(R,G,B):
	#distancia1 = catarata  77 51 29
	#distancia2 = NL 76 43 27
	resultado = 0

	distancia1 = ((R-77)**2 + (G-51)**2 + (B-29)**2)**0.5 
	print(distancia1 , "esta es la distancia1")
	distancia2 = ((R-76)**2 + (G-43)**2 + (B-27)**2)**0.5 
	print(distancia2 , "esta es la distancia2")
	if(R<=34):
		print("Probablemente sea catarata, vete a checar")
		resultado = 1
	elif(R>= 108):
		print("probablemente no sea catarata =)")
	elif(G<= 22):
		print("probablemente no sea catarata =)")
	elif(G>=65):
		print("Probablemente sea catarata, vete a checar")
		resultado = 1
	elif(B<= 7):
		print("probablemente no sea catarata =)")
	elif(B>=51):
		print("probablemente no sea catarata =)")
	elif (distancia1<distancia2):
		print("probablemente sea catarata, vete a checar")
		resultado = 1
	else:
		print("probablemente no sea catarata =)")

	
	return(resultado)

def RGB (imagenRGB):


	# Image path
	img_path = imagenRGB


	# Read sample image
	img = cv2.imread(img_path)

	# Get color at a specific location in the image
	x = 100  # Example x coordinate
	y = 100  # Example y coordinate
	B = img[y, x, 0]
	G = img[y, x, 1]
	R = img[y, x, 2]

	print("estos son los colores RGB: " ,R,G,B)

	return (R,G,B)

def pintar_promedio_color(imagen, ruta_promedio):

	if not os.path.exists(ruta_promedio):
		os.makedirs(ruta_promedio)
		print("Directorio creado: ", ruta_promedio)

	imagen = cv2.imread(imagen)

    # Calcular el promedio de todos los píxeles en la imagen
	promedio_color = np.mean(imagen, axis=(0, 1)).astype(np.uint8)

    # Crear una imagen del mismo tamaño que la original con el color promedio
	imagen_pintada = np.full_like(imagen, promedio_color)
	cv2.imwrite(ruta_promedio+'/ojopromedio.png',imagen_pintada)

	print("la imagen fue promediada correctamente")

def remove_bg (carpeta_resize, output_images_path):
	from rembg import remove
	files = os.listdir(carpeta_resize)

	files_names = sorted(files, key=lambda x: int(''.join(filter(str.isdigit, x))) if any(char.isdigit() for char in x) else 0)

	print(files_names)


	if not os.path.exists(output_images_path):
	    os.makedirs(output_images_path)
	    print("Directorio creado: ", output_images_path)


	count = 0
	for file_name in files_names:
	    image_path = carpeta_resize + "/" + file_name
	    print(image_path)
	    image = cv2.imread(image_path)
	    output = remove(image)

	    cv2.imwrite(output_images_path + "/ojo_remove.png" , output)
	    count = count + 1
	    print("a la imagen se le removio el fondo correctamente")
	    break

def resize_de_img(ruta_resize, rutaojo):

	if not os.path.exists(rutaojo):
		os.makedirs(rutaojo)
		print("Directorio creado: ", rutaojo)

	im = cv2.imread(ruta_resize)
	objeto = imutils.resize(im, width= 500)
	cv2.imwrite(rutaojo+'/ojoresizeado.png',objeto)
	print("la imagen se redimensiono correctamente")


color_explore = np.zeros((150,150,3), np.uint8)  
color_selected = np.zeros((150,150,3), np.uint8)
contadorgeneral = 0
contadorbrillo = 0
rutaojo = 'ojo'
output_images_path = 'ojo/ojosinfondo'
ruta_promedio = 'ojo/ojosinfondo/ojopromedio'
rutaRGB = 'ojo/ojosinfondo/ojopromedio'
ruta_brillo = 'ojo/ojosinfondo/ojobrillo'
print("Dame la ruta de la img")
ruta_resize = input()
resize_de_img(ruta_resize,rutaojo)
remove_bg(rutaojo, output_images_path)
imagenpromedio = 'ojo/ojosinfondo/ojo_remove.png'
imagenRGB = 'ojo/ojosinfondo/ojopromedio/ojopromedio.png'
ruta_brillo = 'ojo/ojosinfondo/ojobrillo/ojo_brillo.png'
ruta_guardado_brillo = 'ojo/ojosinfondo/ojobrillo'
pintar_promedio_color(imagenpromedio, ruta_promedio)
R,G,B = RGB(imagenRGB)
resultado = distancia(R,G,B)
contadorbrillo = aumentadordebrillo(imagenpromedio, ruta_brillo, ruta_guardado_brillo )


if (resultado == 1):
	print ("holiiiiiiisssss")
else:
	print("HELLOOOOOOOOOOOWWWWWW")

contadorgeneral = contadorbrillo + resultado
print(contadorgeneral)

print("FIN DEL PROCESO")



