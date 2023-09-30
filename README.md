# HelloWorld
Mi Primer Proyecto de Android Studio en Github 

##### Autor: Alejandro López

### Contenido del Ejercicio
- Acostumbrarse al entorno de desarrollo Android Studio.
- Realizar una aplicación simple con dos TextView con algunas personalizaciones como cambio de letra, color, etc.
- Cambiar el icono y el nombre de la aplicación.
- Generar la documentación de la aplicación con javadoc.
- Añadir librerías.
- Subir el proyecto a un repositorio de GitHub.
- Y en todo momento intentar resolver los problemas comunes que pueden suceder al realizarlo un proyecto en Android Studio.

# Explicación del ejercicio paso a paso

## 1) Creación y diseño de una aplicación.

**1.** Se crea un nuevo proyecto para móvil y tablet utilizando como plantilla *"Empty Views Activity”*, que contiene "un contenedor" con lo mínimo para comenzar realizar nuestra interfaz de usuario, es como nuestro lienzo en blanco.

![](https://i.postimg.cc/Pr9k5ZLj/Imagen2.jpg)

**2.** El lenguaje que utilizaremos será Java y escogeremos el Android 8.0 como versión del sistema operativo.

![](https://i.postimg.cc/4NfPY7dN/Imagen1-1.jpg)

**3.** Navegamos al directorio *res* (recursos) -> layout -> *activity_main.xml* que es donde definimos la interfaz principal del usuario. Para personalizarlo podemos hacerlo desde el propio entorno o desde código.

![](https://i.postimg.cc/pdtbDHYc/Imagen3.jpg)

**4.** En este caso lo haremos desde código:
- El contenedor será Lineal (LinearLayout) de orientación vertical.
- Introduciremos un nuevo TextView y cambiaremos las proporciones para que ambos ocupen la mitad de la pantalla.
- Añadimos una ID a ambos componentes.
- Y se modificará los textos tanto posición, tamaño, y lo que pone.

![](https://i.postimg.cc/3wCM1ct8/Imagen4.jpg)

**5.** Deseamos agregar nuevas líneas de texto y colores en la interfaz así que tendremos que ir a res->values->*strings.xml* y *colors.xml* para añadirlo.
Además vamos a cambiar el nombre de la aplicación "HelloWorld" a "Hola Mundo".

![](https://i.postimg.cc/dQ7ZXXx6/Imagen5.jpg)
![](https://i.postimg.cc/gkV7VMmc/Imagen6.jpg)

**6.** Volviendo a *activity_main.xml*  añadimos los nuevos colores y el texto.

![](https://i.postimg.cc/Vvxdzfdw/Imagen7.jpg)

**7.** También deseamos manipular los componentes que hemos personalizados en la interfaz dentro de MainActivity, por tanto navegamos hacia ella

![](https://i.postimg.cc/500cpDfW/Imagen8.jpg)

**8.** En ella escribimos:
- Modificamos el color del texto de *tvMessageStart.*
- Cambiamos la cadena de texto de *tvMessageEnd.*

![](https://i.postimg.cc/hvYNhWtr/Imagen9jpg.jpg)



## 2) Cambiar Icono de la Aplicación
**1.** Clickeamos el botón derecho del ratón en res -> New -> Image Asset

![](https://i.postimg.cc/MZD1240j/Imagen10-1.jpg)


**2.** Con una imagen ya previamente descargada, buscamos o escribimos su ruta en el Path.

![](https://i.postimg.cc/rFwx8JgZ/Imagen10-2.jpg)

**3.** Este sería el resultado.

![](https://i.postimg.cc/SsDBFz0H/Imagen10.jpg)


## 3)  Generar documentación con Javadoc
**1.** Dentro de la barra de herramientas clickeamos en Tools -> *Generate JavaDoc*. Y en Output Directory seleccionamos el directorio doc, ya creado en el proyecto, para almacenar la documentación.

![](https://i.postimg.cc/Y00JpqM0/Imagen11-0jpg.jpg)
![](https://i.postimg.cc/tC1LwTBm/Imagen11jpg.jpg)

**2.** Debería mostrar un error provocado por no tener la librería android.jar dentro del sdk.

![](https://i.postimg.cc/PrBBjjcf/Imagen12.jpg)

**3.** Buscamos el android.jar y copiamos y pegamos la ruta absoluta donde se encuentra para incluirlo en las dependencias JAR/AAR.

![](https://i.postimg.cc/3rfstpFv/Imagen13.jpg)
![](https://i.postimg.cc/sg7bfLdY/Imagen14.jpg)
![](https://i.postimg.cc/KYbw15xd/Imagen15.jpg)

**4.** Si generamos la documentación debería funcionar esta vez.

![](https://i.postimg.cc/431MVh3n/Imagen16.jpg)

**5.** El problema es que tenemos otro error al intentar arrancar la aplicación en el que detecta una duplicidad de fichero AndroidManifest.xml. Esto es culpa de la librería última que hemos añadido por tanto hay que quitarla.

![](https://i.postimg.cc/DZyNgyW6/Imagen17.jpg)

**6.** Para ello seleccionamos el modo de vista Project, navegamos a app --> *build.gradle.kts* y comentamos la librería del android.jar, con esto se solucionaría el error.

![](https://i.postimg.cc/8C7rXj3z/Imagen17-1.jpg)
![](https://i.postimg.cc/K8qM5n0W/Imagen17-2.jpg)


## 4) Subir el proyecto a GitHub

**1.** Creamos el repositorio en el directorio
```
git init
```
**2.** Lo asociamos con el repositorio de GitHub llamado *HelloWorld*, este último ya fue creado en la página web de GitHub.
```
git remote add origin <URL de repositorio>
```
![](https://i.postimg.cc/HnrPqZ97/Imagen19.jpg)

**3.** Añadimos al repositorio todos los cambios del proyecto, al ser la primera vez sería todos los ficheros.
```
git add .
```
![](https://i.postimg.cc/jqc104h5/Imagen20.jpg)

**3.** Confirmamos los cambios con un commit y añadimos un tag y mensaje corto.
```
git commit  -t <nombre tag> -m <mensaje>
```
![](https://i.postimg.cc/T2ssVxTj/Imagen21.jpg)

**4.** Por último confirmamos de que suba el repositorio de nuestro proyecto a un servidor remoto.
```
git push origin master
```
![](https://i.postimg.cc/htW3Y0zf/Imagen22.jpg)


## 5) Subir nueva versión a GitHub cambiado el gitignore
**1.** En esta nueva versión cambiaremos el contenido original de .gitignore .

![](https://i.postimg.cc/6QBbW5hK/Imagen23.jpg)

**2.** Y repetimos los pasos anteriores para actualizar el repositorio.

![](https://i.postimg.cc/Mp7rJjVt/Imagen24.jpg)

**3.**  Podemos ver que el gitignore se ha actualizado.

![](https://i.postimg.cc/0NZWbRtw/Imagen25.jpg)

**4.** También realizamos la posibilidad de si queremos borrar los archivos del "Staging Area" sin modificar los archivos locales. En este caso usamos este comando para hacerlo:
```
git rm -r --cached
```
![](https://i.postimg.cc/CK91JcY5/Imagen26.jpg)

**5.** Volviendo a hacer un cambio al fichero gitignore, volvemos a subirlo y vemos que se ha confirmado los cambios.
![](https://i.postimg.cc/1t6zdD5H/Imagen27.jpg)
![](https://i.postimg.cc/vTsmwD4d/Imagen28.jpg)
![](https://i.postimg.cc/ZKD2g2BT/Imagen29.jpg)

## 6) Captura de pantalla con la aplicación y añadir la imagen en README usando el repositorio

**1.** Hay que realizar la captura y arrastrarlo a tu proyecto.

**2.** Es posible que tengas que hacer un pull de tu repositorio remoto para actualizar tu repositorio local, ya que en mi caso no había añadido el README.
```
pull origin master
```
**3.** Ya haciendole add, commit y push la imagen debería estar en GitHub. Siguiendo esta estructura debe verse en el README.
```
![Nombre_repositorio](nombre_de_la_imagen)
```

![HelloWorld](Screenshot_2023-09-30-20-10-37-454_com.example.helloworld.jpg)
### End
