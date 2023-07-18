Introduction

TODO: El proyecto consta de dos Scripts 

El primero frente al traductor de Google para verificar la correcta traducci�n de  Una palabra o frase y la carga de una pagina a otra desde un icono de ventana emergente.

El Segundo frente a la p�gina de la librer�a Nacional en la cual solicitamos al Usuario sus datos de logeo y buscamos un tema espec�fico validando el Logeo y el tema buscado.

La motivaci�n del proyecto es presentar una prueba t�cnica en el proceso de Selecci�n de Smart, adem�s de reutilizar el proyecto de la Librer�a Nacional con el objeto  de complementar las capacitaciones que se dictan a los nuevos automatizadores o analistas de mi compa�ia actual.


Getting Started
Se entrega un paquete en formato ZIP, en el cual se incluye el proyecto: "SteptoStepV2LibreriaNacional"
El paquete se debe Extraer y cargar en la ruta: C:\WorkSpaceSP\ quedando de la siguiente Forma C:\WorkSpaceSP\SteptoStepV2LibreriaNacional

El proceso siguiente es abrir el IDE de ECLIPSE Eclipse IDE for Eclipse Committers
Version: 2018-09 (4.9.0)
Build id: 20180917-1800

-Installation process

Seleccionar la Opci�n Import del Menu File, seleccionar el proyecto en la carpeta correspondiente (C:\WorkSpaceSP\SteptoStepV2LibreriaNacional).
Ejecutar la opci�n, esto puede tardar varios Minutos.
Recordar seleccionar la opcion de proyecto GRADLE
(Mayor referencia de Gradle: http://nombre-temp.blogspot.com/2015/03/gradle-introduccion.html)

El proceso al finalizar por general genera un mensaje de finalizaci�n, debemos verificar se genere el Proyecto SteptoStepV2LibreriaNacional con todas los paquetes correspondientes:

Exepciones
Interactions
Models
Questions
Tasks
Userinterfaces
Utils

Runners
Stepdefinitions

Feature

Los anteriores paquetes integran la base del patr�n utilizado para la automatizaci�n Screen Play.
Al cargar el proyecto o importarlos, el icono de GRADLE carga en Rojo o error si no se tienen las dependencias actualizadas.

Debe verificar se carguen dos grupos de Dependencias.
JRE System Library y project and External Dependencies.

JRE System Library: Son REcursos JAVA.
project and External Dependencies: Son las dependencias Asociadas a GRADLE las cuales se verifican en el Archivo : build.gradle. 

En caso de no tener las mismas, se debe abrir el archivo y seleccionar la opci�n Refresh.
Por general este proceso toma un tiempo seg�n la cantidad de dependencias.

En caso de generar Errores es posible que deba cambiar las dependencias seg�n la Pagina de Gradle
En caso de Fallo de Sincronizacion se debe verificar la configuraci�n en el orden: JAVA,SERENITY,MAVEN,CUCUMBER,SELENIUM,GRADLE En la opcion BuildPath/Configure BuildPath


-Software dependencies
Las dependencias b�sicas del proyecto son:
"net.serenity-bdd:serenity-gradle-plugin:1.1.1"     
gradle.startParameter.continueOnFailure = true 

Aplicacion de las Dependencias.
apply plugin: 'java'
apply plugin: 'eclipse'
apply plugin: 'idea'
apply plugin: 'net.serenity-bdd.aggregator'                             

Dependencias de Serenity.

    testCompile 'net.serenity-bdd:serenity-core:1.1.1'                  
    testCompile 'net.serenity-bdd:serenity-junit:1.1.1'                
    testCompile('junit:junit:4.12')
    testCompile('org.assertj:assertj-core:1.7.0')
    testCompile('org.slf4j:slf4j-simple:1.7.7')
    
    compile 'net.serenity-bdd:serenity-core:1.9.9'
    compile 'net.serenity-bdd:serenity-junit:1.9.9'
    compile 'net.serenity-bdd:serenity-cucumber:1.9.5'
    compile 'net.serenity-bdd:serenity-screenplay:1.9.9'
    compile 'net.serenity-bdd:serenity-screenplay-webdriver:1.9.9'
    
    compile group: 'org.apache.poi', name: 'poi', version: '3.17'
    compile group: 'org.apache.poi', name: 'poi-ooxml', version: '3.17'
    compile group: 'org.apache.poi', name: 'poi-ooxml-schemas', version: '3.16'
    compile group: 'org.apache.commons', name: 'commons-collections4', version: '4.1'  

Las anteriores se encuentran como la base para la ejecuci�n en el Build Gradle.

-Latest releases

-API references

-Build and Test
Al ser realizado mediante TDD:
En primer lugar, se escribe una prueba y se verifica que las pruebas fallan. 
A continuaci�n, se implementa el c�digo que hace que la prueba pase satisfactoriamente  y seguidamente se re factoriza el c�digo escrito


Describe and show how to build your code and run the tests.

El script se construy� con base en SP como patr�n, GRADLE y CUCUMBER como dependencias.
Ambos scripts se debe ejecutar desde el Paquete Runner cada script con su runner espec�fico.
Los scripts incluyen utiler�as gen�ricas de proyectos previos realizados en el Cliente por lo cual estas pueden que requieran de
Dependencias de java y Gradle espec�ficas incluidas en el BUILD GRADLE.
En caso de no ejecuci�n o no sincronizaci�n con las dependencias actuales se debe agregar desde:
https://mvnrepository.com/artifact/net.serenity-bdd/ en la pesta�a GRADLE de cada dependencia a agregar, en ese caso se debe seleccionar de nuevo la opci�n Refresh del Build.gradle

Cada script tiene dise�ado su correspondiente GHERKIN donde se desarrolla el Caso, Escenario y Paso.

Script Librer�a Nacional:
Se aplica el uso de los BACKGROUND reutilizando la utiler�a de Login ya que es un proceso continuo, estas tareas asociadas al login se adaptan para recibir dos string por pedido y cumplir con la solicitud de captura de datos.

Sin embargo esto no se utiliza ya que con SP y SOLID estos datos deben estar en Scenarios OUTLINE.

Al iniciar la ejecuci�n debido a que la pagina es Pesada y puede cambiar sus Webelement se tiene un riesgo de no ejecuci�n se mitiga este con una pr�ctica no recomendada que es utilizar los Sleep, en caso de no ejecuci�n por parte de los Webelement esto generara un Elementfacade Error, los cual indica que un webelement debe ser actualizado en el paquete USERINTERFACES en las clases respectivas donde est� el elemento. (Capturar el Nuevo XSPHAT) y a continuaci�n Salvar y re ejecutar el Script.

En el momento de la solicitud del password y el usuario se debe Ingresar la siguiente informacion para generar un Logeo
Exitoso: Mail o User: vlabega@gmail.com y password: 1234zzzz

El Scritp solicita uno a uno los dos datos y los adiciona al Formulario, en el Assert respectivo se utiliza la funci�n para
Realizar un check con base en el usuario o mail ingresado en la p�gina de cuenta del Usuario.

A continuaci�n se aplica una busqueda outline de un tema espec�fico definido en el GHERKIN el script busca los libros relacionados con este tema y carga la lista de los libros, se valida que se genere la b�squeda en el Assert correspondiente y se cierra la cuenta.

Se pueden presentar fallas si no se logea de forma correcta ya que se est� realizando la reutilizaci�n de una utiler�a de logeo, el Asser fue dise�ado para solo controlar un mensaje de error. Por lo que en caso de ingresar un usuario y passwors incorrectos el caso se identificara como fallido.

En caso de logear exitoso se valida que la cuenta es la esperada con base en el nombre del usuario y se procede con el proceso de selecci�n de tema de libros, al seleccionar el tema el script buscara el tema listara los libros, validar�a se liste libros por el tema y cerrara la cuenta del Usuario. Finalizando el script.


Script Traductor:
Para el Caso del  Traductor se genera la apertura desde el Google APPs para cumplir con la apertura de una p�gina desde un LINK diferente abriendo la opci�n del traductor. Se intenta reutilizar los webelement din�micos sin embargo en el transcurso se identifica actualizaciones de Google que afectan el desarrollo del script, por lo cual los userinterface tiene documentados los anteriores XPHAT, Se actualiza para buscar lo elementos espec�ficos.

Esto puede ocasionar fallos de no ejecuci�n en caso de ser cambiados los elementos y sus identificadores de Nuevo. 


Contribute
TODO: Mejoras posibles, incluir toda una utiler�a que permita validar la construcci�n del usuario para el mail
Mejorar en el box de password sea enmascarado.

Mejorar los steps para no incluir c�digo ineficiente y por patr�n de desarrollo y arquitectura.
Mejorar el n�mero de Escenarios y pasos contemplados.

En el caso de elementos Fijos se puede volver a construir los XPAHTS din�micos para no ser afectados por cambios en las versiones de Google.


Todo aquello que aporte nuevo conocimiento y mejoras en los procedimientos es bienvenido.




Section to Result by Serenity:

Se configura el Serenity para generar los reportes en HTML con la indicacion de los resultados y soportes de la ejecucion.
Por general estos soportes estan en la carpeta TARGET del proeycto,  C:\WorkSpaceSP\SteptoStepV2LibreriaNacional\target\site\serenity

(file:///C:/WorkSpaceSP/SteptoStepV2LibreriaNacional/target/site/serenity/25a5cdcded68be916de253f1654aecf2b6225cff355aba0f7bae5507ac43ac70.html)

[main] INFO net.serenitybdd.core.Serenity - _[36m

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____ 
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   / 
   |   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /  
    \   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/   
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |     
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|    
                                                                                     
 News and tutorials at http://www.serenity-bdd.info                                  
 Documentation at https://wakaleo.gitbooks.io/the-serenity-book/content/             
 Join the Serenity Community on Rocket Chat at https://serenity-bdd.rocket.chat      
 Serenity BDD Support and Training at http://serenity-bdd.info/#/trainingandsupport  
 Learn Serenity BDD online at http://serenity-dojo.com                               
-------------------------------------------------------------------------------------
_[0m
[main] INFO net.serenitybdd.core.Serenity - Test Suite Started: Login
[main] INFO net.serenitybdd.core.Serenity - 
 _____ _____ ____ _____   ____ _____  _    ____ _____ _____ ____  
|_   _| ____/ ___|_   _| / ___|_   _|/ \  |  _ \_   _| ____|  _ \ 
  | | |  _| \___ \ | |   \___ \ | | / _ \ | |_) || | |  _| | | | |
  | | | |___ ___) || |    ___) || |/ ___ \|  _ < | | | |___| |_| |
  |_| |_____|____/ |_|   |____/ |_/_/   \_\_| \_\|_| |_____|____/ 
                                                                  

TEST STARTED: Search and Buy online for LibreriaNacional
-------------------------------------------------------------------(login;search-and-buy-online-for-librerianacional)
mar 13, 2019 1:31:59 PM org.openqa.selenium.remote.DesiredCapabilities chrome
INFORMACI�N: Using `new ChromeOptions()` is preferred to `DesiredCapabilities.chrome()`
Starting ChromeDriver 2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb) on port 36009
Only local connections are allowed.
mar 13, 2019 1:32:02 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFORMACI�N: Detected dialect: OSS
Carga del Browser
Carga de la Pagina
Selecciona opcion Mi Cuenta
Selecciona opcion Iniciar Cuenta
Selecciona opcion Ingresar con mail y contrase�a
Captura nuevos datos
enviala lista para autenticar
Imprimir Lista
[vlabega@gmail.com, 1234zzzz]
copia los datos para autenticar
Seleccionar Iniciar Sesion
La Cuenta del Usuario es la logeada
Sige el Browser Abierto
El usuario seleciona la opcion Libros
Numero de elementos del ArrayList: 2
Imprimir La lista
--------------------------------------------------
[name, Proyecto]
Ingresa al proceso de busqueda del Libro
Ingresa a recorrer los Libros
Este es el producto a buscar: Proyecto
Click en el box para buscar
Escribe el producto en el box buscar
El usuario Sale de la cuenta
[main] INFO net.serenitybdd.core.Serenity - 
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \ 
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/ 
        /_/                                                                

TEST PASSED: Search and Buy online for LibreriaNacional
----------------------------------------------------------------------------
[main] INFO net.serenitybdd.core.Serenity - 
        __    _____ _____ ____ _____   ____   _    ____  ____  _____ ____  
  _     \ \  |_   _| ____/ ___|_   _| |  _ \ / \  / ___|/ ___|| ____|  _ \ 
 (_)_____| |   | | |  _| \___ \ | |   | |_) / _ \ \___ \\___ \|  _| | | | |
  _|_____| |   | | | |___ ___) || |   |  __/ ___ \ ___) |___) | |___| |_| |
 (_)     | |   |_| |_____|____/ |_|   |_| /_/   \_\____/|____/|_____|____/ 
        /_/                                                                

TEST PASSED: Search and Buy online for LibreriaNacional
----------------------------------------------------------------------------

1 Scenarios (_[32m1 passed_[0m)
6 Steps (_[32m6 passed_[0m)
1m5,348s
