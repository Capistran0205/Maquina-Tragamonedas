**Programa con Interfaz Gráfica que simula una Máquina tragamonedas.**
Este programa consta de tres paquetes para implementar el patron de diseño modelo, vista y controlador (MVC) para una mejor estructuración del código.
Los cuales se pueden observar en el proyecto de la siguiente manera: MaquinaTragaMonedas.app.mvc.Controller, MaquinaTragaMonedas.app.mvc.Model y MaquinaTragaMonedas.app.mvc.View
Referente al primer paquete, contiene la clase controlador que se encargara de ser el intermediario entre las acciones de la vista y el modelo de datos.
El segundo paquete que contiene el modelo, el modelo de datos son todos los atributos que se consideraron del análisis de los elementos que conforman a una maquina tragamonedas. Los cuales son los siguientes: 
    numeroCarretes
    handle (palanca)
    valorApuesta
    gananciasApuesta
    simbolos:🍎, 🍊, 🍉, 💎
Por último, el paquete donde se encuentra alojada la vista, contiene un JFrame con Jlabels, botones y cuadros de texto que permiten interactuar con el juego. 
Para poder iniciar un juego, primero se debe ingresar monedas para poder activar la máquina, después se debe ingresar una cantidad de apuesta y dar click en el botón "Go!" con eso se activa el juego donde se 
visualiza como el programa ejecuta los carretes de la máquina y al final si hay una triada correcta se muestra un mensaje y se suma la ganancia obtenida a las monedas que previamente ingreso al inicio del juego. 
Más detalles se encuentran en el propio proyecto.
