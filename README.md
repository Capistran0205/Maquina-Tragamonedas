# Simulador de Máquina Tragamonedas con Interfaz Gráfica

Este programa es una simulación de una **máquina tragamonedas** que utiliza una **Interfaz Gráfica de Usuario (GUI)**. El diseño sigue el patrón de diseño **Modelo-Vista-Controlador (MVC)** para garantizar una mejor estructuración del código.

## Estructura del Proyecto

El proyecto está dividido en tres paquetes principales que implementan el patrón MVC. Estos paquetes son:

1. **Controller**: `MaquinaTragaMonedas.app.mvc.Controller`
2. **Model**: `MaquinaTragaMonedas.app.mvc.Model`
3. **View**: `MaquinaTragaMonedas.app.mvc.View`

### Paquete Controller
El paquete `Controller` contiene la clase que actúa como intermediario entre las acciones del usuario en la vista y los datos en el modelo. Se encarga de gestionar la lógica de interacción y actualizar la vista con los resultados.

### Paquete Model
El paquete `Model` contiene la representación de los datos de la máquina tragamonedas. Los principales atributos del modelo son:

- **numeroCarretes**: El número de carretes de la máquina tragamonedas.
- **handle (palanca)**: El mecanismo que el jugador acciona para hacer girar los carretes.
- **valorApuesta**: La cantidad de monedas que el jugador apuesta en cada giro.
- **gananciasApuesta**: El monto ganado por el jugador en cada giro, dependiendo de los resultados de los carretes.
- **simbolos**: Los símbolos que aparecen en los carretes, representados por los siguientes caracteres:  
  🍎 (manzana), 🍊 (naranja), 🍉 (sandía), 💎 (diamante).

### Paquete View
El paquete `View` contiene la interfaz gráfica, que está basada en un **JFrame** con varios **JLabels**, **botones** y **cuadros de texto** para interactuar con el jugador. La vista permite lo siguiente:

1. **Ingresar monedas**: El jugador debe introducir monedas para activar la máquina tragamonedas.
2. **Establecer la apuesta**: El jugador debe seleccionar la cantidad de monedas que desea apostar.
3. **Iniciar el juego**: Al hacer clic en el botón **"Go!"**, los carretes se activan y giran, mostrando los símbolos aleatorios.
4. **Resultados**: Si los carretes muestran una triada de símbolos iguales, se muestra un mensaje indicando la victoria y se suman las ganancias obtenidas a las monedas ingresadas al inicio del juego.

## Cómo Jugar

1. Inicia el programa.
2. Introduce monedas para activar la máquina.
3. Ingresa el valor de la apuesta.
4. Haz clic en el botón **"Go!"** para empezar el giro de los carretes.
5. Si hay una combinación ganadora, recibirás un mensaje con el monto ganado.

Más detalles sobre la implementación se pueden encontrar directamente en el proyecto.

---

¡Espero que disfrutes jugando y explorando el código!
