# Librería DLS de Componentes

Esta librería permite la construcción de los compontentes del sistema de diseño basados en Kotlin 

***Recomendaciones:

-Asociar repositorio de código fuente antes de la descarga de la app desde la opción VCS: -> Enable Version Control Integration

-En caso de no contar con un dispositivo físico puede configurar un dispositivo virtual que soporte al menos un API 30 o superior.

-Considerar tener la última actualización de Android Studio

****Instalación

1.- Descargar el proyecto de repositorio 
2.- Realizar la sincronización a través de Gradle (puede tardar varios minutos) 
3.- Agregar la dependecia de la librería en el archivo Gradle (app): (nombre de la librería que se generará)
        implementation project(path: ':mylibrary')
4.- Una vez realizada esta acción es necesario volver a realizar la sincronización del proyecto 
5.- Es importante que al finalizar cada cambio de la librería es necesario actualizar el archivo (.lib) nuevamente en el proyecto base donde se consumirá.
6.- Es posible realizar pruebas unitarias de las módulos de la librería.

Enjoy coding!



