### Lexilogos

Bienvenidos a este emocionante proyecto para el uso del departamento de Informática, junto con el departamento de Lenguas Clásicas Latín del centro SAFA-Ntra. Sra. de los Reyes de Sevilla. Se plantea la creación de una aplicación, con el objetivo de la mejora en el proceso de enseñanza y aprendizaje en Latín. Gracias a esto logramos agilizar el proceso de corrección y retroalimentación, permitirá un seguimiento más preciso del progreso de los alumnos, fomenta la participación activa y el compromiso de aprendizaje, y mejorará la colaboración entre profesores y estudiantes.

El software desempeña un papel fundamental en nuestra vida cotidiana y en el crecimiento de las organizaciones. Este proyecto tiene como finalidad diseñar y construir una solución de software innovadora que aborde una necesidad específica y genere un impacto positivo en nuestro entorno.

Tras estudiar las necesidades y demandas del profesor de Latín proponemos la creación de una aplicación partiendo de la hoja de cálculo (Google Sheets), que dicho profesor ya usaba con sus alumnos para la realización del análisis morfosintáctico y la traducción, teniendo que introducir palabra por palabra, algo tedioso y largo.

Es bien sabido que la utilización de tecnologías digitales ayudan al proceso de aprendizaje
de los alumnos. Este profesor de latín ha comprobado que desde la pandemia, el uso de su rudimentaria hoja de cálculo para todo el proceso de análisis y traducción de textos latinos ha mejorado la comprensión y sistematización de todos los procesos de análisis y de traducción del latín.

Esta aplicación, que la llamaremos LEXÍLOGOS (palabra griega que significa “que guarda
palabras”), cumple con un objetivo principalmente educativo. Será una app que podrán usar los futuros alumnos de Latín del centro, así como otros alumnos de la Fundación SAFA.

Para ello, hemos decidido utilizar JavaFX con la herramiento de Maven para la rápida importación de librerías, utilizando el IDE de IntelliJ IDEA. Es una gran ayuda a la hora de crear este tipo de aplicaciones. Para la base de datos hemos utilizado MariaDB y como gestor de base de datos HeidiSQL.

Durante este proyecto, exploramos diversas etapas del ciclo de vida del desarrollo de software, desde el análisis de requisitos hasta la implementación y el mantenimiento del producto final. 

¡Comencemos este viaje de desarrollo de software y hagamos realidad nuestra visión!

## Especificación de requisitos

Requisitos Funcionales

Se necesitaba que los alumnos pudiesen analizar los textos que iban a entrar ese año en selectividad morfosintácticamente, a su vez, estos textos debía de proveerlos la misma aplicación para que el alumno o profesor no tuviese que introducirlos palabra a palabra, el problema es que el profesor era el que tenía que meter el texto de alguna forma para poder cambiarlo cada año a unos actualizados y borrar los que no necesitase.

Al analizar los textos, había veces que en los niveles sintácticos había no una palabra, sino que dos o más las cuales iban juntas como es el caso del sujeto y el predicado, como en ese momento trabajaban en excel, era tan simple como combinar dos celdas, pero al llevarlo a una aplicación se complica un poco más.
A la hora de elegir qué tipo de palabra era cada una, cada selector tenía una serie de opciones que el usuario podía elegir y para facilitar el trabajo a los alumnos, se tenía que configurar los siguientes selectores para que dependiendo de lo que eligieras antes (ej. Sustantivo) pues te diese a elegir entre una serie de opciones u otra.

Para facilitar un poco el trabajo a los alumnos se tenía que disponer de un diccionario el cual tenía que tener todas las posibles palabras que pudiesen haber en los textos y para una mejor búsqueda, un filtro para poder buscar la palabra deseada más rápidamente.

Todo esto tendría que ser revisado por el profesor para que pudiese calificar a cada alumno y que no se perdiese el progreso cuando se cerrase y abriese la aplicación de nuevo. Para ello, se tendría que tener un botón de guardado y otro para poder exportarlo.

Se necesitaba, por supuesto, tener en cuenta la optimización de la aplicación para que no tarde mucho en realizar cada una de sus funciones.


Requisitos de Interfaz

Todas estas funcionalidades, necesitaban realizarse en la menor cantidad de interfaces posibles, por ello se necesitaba una interfaz de login para distinguir entre el profesor o los alumnos, otra para que solamente el profesor pueda realizar la inserción de textos o el borrado de ellos y aparte donde salgan los registros insertados para poder seleccionar qué texto se va a proceder a analizar, esta parte le saldría al profesor y a los alumnos.

También otra interfaz donde se realice el análisis y desde donde se pueda acceder al diccionario de forma fácil ya que ahí se encuentra el lugar para que el alumno pueda introducir el texto traducido.

El diccionario mencionado formaría parte de otra interfaz con su funcionalidad aparte el cuál serviría de apoyo a los alumnos.


# Restricciones de Diseño

Al realizar el diseño de las mismas, se necesitaba utilizar unas paleta de colores atractiva para el usuario y una forma intuitiva de colocar cada elemento, se tenían que añadir símbolos o textos para explicar algunas de sus funciones y que cada ventana se ajustase automáticamente a la hora de ampliarla, minimizarla o incluso que se pudiese del mismo tamaño independientemente del pc en el que se utilice ya que algunos tienen una mayor o menor resolución.

A su vez, se le tenían que añadir algunas mini-animaciones a los elementos como por ejemplo los botones para que el interactuar con la interfaz, se vuelva más dinámico.
	

	

# Análisis y diseño

Login
Primera pestaña de la aplicación la cual identifica el usuario, pestaña de autenticación para detectar los privilegios de usuario o administrador. 




Menú
Si entramos con modo administrador, en nuestro caso con rol de profesor la primera pestaña disponible es la de inserción de textos en la base de datos.

Y la siguiente pestaña del menú es la de una tabla la cual se refleja la base de datos completa, pestaña disponible tanto administrador (profesor) como un usuario (alumnos).


Análisis
Esta ventana de la aplicación es la más importante del programa, puesto que es el lugar donde los alumnos podrán analizar de forma rápida y cómoda las oraciones de los textos subidos por el profesor. 

Contaremos con un filtro de frase.
Mediante una lista desplegable podremos seleccionar qué frase queremos analizar


Luego de seleccionar la frase, se cargaran las distintas palabras de la frase en los campos marcados en la siguiente imagen

Una vez tengamos todo preparado para analizar, el alumno podrá utilizar las listas desplegables para analizar de forma sintáctica cada una de las palabras

Segun el tipo de palabra seleccionado, se mostrarán solos los campos correspondientes a ese mismo tipo


Seguido de estos campos, tenemos un apartado para escribir el significado de la palabra


Justo debajo encontraremos el apartado de análisis morfológico. En este apartado encontramos una serie de listas desplegables para facilitar el análisis morfológico de la frase en cuestión.
Cuando pasamos el ratón por encima de un campo, aparecerá un botón por si queremos unificar dos campos o más (por ejemplo, para un sujeto compuesto por más de una palabra)

Tendremos también un apartado para traducir la frase del latín al español y un campo en el que el alumno escribirá su nombre para saber quién analizó ese texto


Por último, tendremos 2 botones en la interfaz. Uno de ellos para abrir una ventana que contendrá un diccionario y otro para exportar todo el trabajo a excel y asi poder mandarselo al profesor a través de la plataforma asignada (Classroom, Moodle…)


Diccionario

En esta interfaz estaría localizado el diccionario, se accede a ella mediante el botón “Diccionario” de la pantalla de análisis, sirve como apoyo a dicha interfaz y surge como ventana emergente, osea, que el usuario puede alternar entre esta y la de análisis.

Como se puede observar, se visualizan todos los registros disponibles del diccionario ordenados alfabéticamente con su significado y traducción, contiene un scroll para poder ver el registro que se necesite.



También hay implementado un filtro mediante el cual se puede colar la palabra que quieras buscar, en este ejemplo se puede observar como todas las palabras que empiezan por “hol” se muestran.

Implementación e integración

Login
Una vez nos identifiquemos si pulsamos el botón “Acceder” nos llevará a la pestaña del Menú. 



Menú
Si entramos en modo administrador la primera es la inserción de datos en la base de   datos. Evento del botón “Añadir”.


Métodos de la base de datos:


Pestaña de “Análisis morfosintáctico”
Código para añadir datos a la tabla desde la base de datos. Con una clase modelo llamada “Texto”


Una vez clicamos encima de un registro de la base de datos tenemos incorporado un evento la cual nos lleva a la pestaña para que el alumnos analice las frases..




Análisis
Hemos requerido de sendos métodos para hacer que esta interfaz tenga un correcto funcionamiento
El primero de todos es el que controla el selector de frases. Coge de la base de datos el texto seleccionado en la tabla, y los separa por puntos. 
	



La siguiente parte de la interfaz está desarrollada con sendas listas las cuales contendrán las opciones que mostrarán las listas desplegables de toda la interfaz.

Ciertas listas se inicializan directamente con un contenido en concreto ya que éste no varía durante el funcionamiento de la aplicación 
Ejemplo de una de las listas:


Luego, las listas desplegables que contienen los tipos de palabras harán que el resto de listas se activen en función de la opción seleccionada.

Toda esa funcionalidad viene recogida en sendos métodos para cada conjunto de listas desplegables de cada una de las palabras de la frase.
Ejemplo de uno de los métodos




Como podremos haber comprobado, al principio del ejemplo encontramos un método llamado ocultarcombo(x). Este método servirá para resetear la interfaz de las listas desplegables y así que solo se muestren las necesarias una vez se seleccione el tipo de palabra.
Ejemplo de uno de los métodos


Otro método que utilizan los métodos principales de las listas es el que inserta los datos de modo/voz. Optamos por este método ya que a la hora de ejecutarlo y tras hacer pruebas, todos los campos de modo/voz se quedaban vacíos así que diseñamos este método con el que solo con pasarle el id de la lista desplegable, se insertan lo datos directamente



Para las listas del análisis morfológico, estas se precargan en el inicio del programa 



A la hora de implementar la parte de juntar o separar las listas desplegables de los niveles sintácticos se ha recurrido a un evento de java llamado On Mouse Entered y On Mouse Exited los cuales hacen que cuando pasas el ratón por encima se ejecute una acción, dicha acción es que se muestren o se deshabiliten un par de RadioButtons:





Uno de ellos llamado juntar y otro de ellos llamado separar, hacen que las listas desplegables puedan modificarse a voluntad con el siguiente código:




Diccionario

A la hora de implementar el diccionario ha hecho falta meter un excel dentro del proyecto con todas las palabras necesarias.





Para que se realice su funcionalidad, primero se localiza el excel:



A continuación, se lee cada fila del archivo y se agrega a la tabla:



Por último, configuramos la tabla para que pueda mostrar los datos:


Para el filtro, mediante un listener, se coge la palabra del textfield y muestra las palabras que coinciden en su inicio, no distingue entre mayúsculas y minúsculas para que no haya errores a la hora de buscar o no se muestre alguna palabra.





## Conclusión

Este proyecto nos ha resultado interesante y un poco tedioso debido al desconocimiento de las lenguas para las cuales se ha creado esta aplicación. Hemos tenido una sensación de compromiso extraordinario al tratarse de una aplicación que puede resultar una herramienta para ayudar en el desarrollo académico del alumnado que haga uso de la misma. 
Hemos invertido todo nuestro conocimiento en realizar una aplicación amigable y fácil de usar para que los alumnos, en unos pocos clicks, puedan continuar aprendiendo de una forma más cómoda

## Presupuesto
En nuestro presupuesto hemos incluido investigación, diseño, desarrollo de funcionalidad y el tiempo invertido en la documentación del proyecto, teniendo en cuenta que hemos puesto como precio por mano de obra 30€ por hora trabajada.

Nos saldría un total de 4.470,50€ inicial.

Cabe destacar que el servidor de base de datos está dedicado únicamente para esta aplicación. Se pueden optar por otros tipos de servidores:
Servidores Cloud
Servidores virtuales (Se ejecutan en una máquina virtual dentro de un servidor con varias de ellas funcionando en un mismo equipo)
Privado (En caso de implementación en el centro siempre que esta opción sea viable)
En caso de continuar con el que viene incluido en el presupuesto, tendría que abonarse 60,50€ mensualmente para el mantenimiento del servidor de base de datos que hemos seleccionado.

Se puede consultar otras tarifas del mismo proveedor (en nuestro caso IONOS) haciendo click en el siguiente enlace.

## Mejoras

Introducir una gama de tonos pasteles a la pantalla de análisis en la parte de las listas desplegables para que dependiendo del tipo de palabra que elija (sujeto, predicado…), se ponga un color u otro.

Teniendo en cuenta que el proyecto siguiese adelante y tuviésemos una base de datos decente, en otra pestaña de la pantalla principal, hacer que el profesor pueda ver lo realizado por los alumnos, osea, que lo de los alumnos se guarde y se suba a una base de datos y el profesor pueda verlo desde su aplicación, sin necesidad de exportar a excel y utilizar classroom.

Refactorizar el código y hacerlo más escalable.
