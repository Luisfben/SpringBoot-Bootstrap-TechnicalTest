# SpringBoot-Bootstrap-TechnicalTest
Prueba técnica para validar habilidades de programación con el propósito de aplicar a una vacante de trabajo para el cargo de Full Stack Developer 

## Base de datos

La base de datos utilizada para el proyecto fue Mysql. Asimismo, el nombre del esquema fue "test".

- Los scrips para crear la base de datos estan aquí:

`/database/`

- La configuración de conexión aquí:
 
`src/main/resources/application.properties`

## Configuración de ambiente de desarrollo

Con el proposito de disminuir la compleja tarea de configuración del ambiente de desarrollo se opto por utilizar la tecnología Spring-boot que permite ejecutar aplicaciones Stand-alone. Aunque, también es posible ejecutar las mismas aplicaciones en entornos web con ciertos ajustes de configuración. A continuación, se describirá la manera como debe ser puesta en funcionamiento.

### Maven

Si usted no ha tenido la oportunidad de haber utilizado una herramienta de software, para la gestión y construcción de proyectos, como Maven puede encontrar más información en distintas fuentes. Sin embargo, para el proposito del proyecto es necesario que tenga en cuenta que debe realizar los siguientes pasos para descargar librerias que el proyecto necesita y para validar que el proyecto no presente ninguna inconsistencia.

- Descargar librerias: en Eclipse, ubicarse encima de la raíz del proyecto y dar boton derecho, buscar la opción en el menú desplegable, "Maven" y luego seleccionar la opción "Update Project...". En ese instante empezara a descargar las librerias necesarias, tomara unos minutos hacerlo.

- Validar que el proyecto no presente inconsistencias: en Eclipse, ubicarse encima de la raíz del proyecto y dar boton derecho, buscar la opción en el menú desplegable, "Run As" y luego seleccionar la opción "Maven install". Al final, en la consola aparecera un mensaje en mayuscula similar a este: "BUILD SUCCESS" si todo esta correcto.

### Iniciar aplicación

Luego de, configurar la base de datos y descargar el proyecto en Eclipse, buscar el archivo:

`com.ciat.demoinstitutions.DemoInstitutionsApplication.java`

Dar boton derecho encima de este y buscar la opción en el menú desplegable "Run As", luego seleccionar la opción "Java Application". Despues, en la consola de Eclipse usted podra apreciar como un servidor embebido, propio de la tecnología Spring-boot, inicia.

IMPORTANTE: Si usted no realiza la configuración de base de datos correctamente saldra un mensaje de error dado que el servidor al iniciar, realiza unas validaciones de conexión a la base de datos.

Hay que tener en cuenta, que el servidor utiliza por default el puerto 8080, si actualmente lo esta utilizando opte por dejarlo libre o considere cambiar el puerto en el siguiente archivo de propiedades:

`/src/main/resources/application.properties`

Adicione una linea al final, como el ejemplo:

`server.port=8090`

Para iniciar la aplicación utilizar la siguiente url:

`http://localhost:8080/`

## Descripción del proyecto

El proyecto contiene los siguientes paquetes, de acuerdo a su proposito.

- com.ciat.demoinstitutions.controller
- com.ciat.demoinstitutions.dto
- com.ciat.demoinstitutions.model
- com.ciat.demoinstitutions.repository

Las librerias de Bootstrap estan aquí:

`/src/main/resources/static`

Las pantallas estan aquí:

`/src/main/resources/templates`

La aplicación es compatible con Java 1.8.
