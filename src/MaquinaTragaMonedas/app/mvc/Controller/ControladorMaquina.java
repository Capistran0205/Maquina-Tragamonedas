/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaquinaTragaMonedas.app.mvc.Controller;
import MaquinaTragaMonedas.app.mvc.Model.Maquina;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @authors capis y heber
 */
// Clase que representa el controlador de una máquina tragamonedas.
public class ControladorMaquina {
    // Campo privado que contiene una referencia al objeto Maquina.
    private Maquina maquina; 
    // Campo privado para generar números aleatorios.
    private Random random; 

    // Constructor que inicializa el controlador con una máquina y un generador de números aleatorios.
    public ControladorMaquina(Maquina maquina) {
        this.maquina = maquina; // Se asigna la instancia de la máquina.
        this.random = new Random(); // Se inicializa el generador aleatorio.
    }

    // Método que simula el giro de los carretes de la máquina tragamonedas.
    public String[] girarCarretes() {
        // Se crea un arreglo para almacenar los símbolos seleccionados en los carretes.
        String[] resultado = new String[maquina.getSimbolos().length];
        // Itera a través de los carretes para seleccionar símbolos aleatorios.
        for (int i = 0; i < maquina.getSimbolos().length; i++) {
            // Obtiene un símbolo aleatorio del conjunto de símbolos de la máquina.
            resultado[i] = maquina.getSimbolos()[random.nextInt(maquina.getSimbolos().length)];
        }
        // Devuelve el arreglo con los resultados de los carretes.
        return resultado;
    }

    // Método que calcula las ganancias basándose en el resultado de los carretes.
    public int calcularGanancias(String[] resultado) {
        // Comprueba si los primeros tres símbolos del arreglo son iguales.
        if (resultado[0].equals(resultado[1]) && resultado[1].equals(resultado[2])) {
            // Si los tres símbolos son iguales, multiplica el valor de la apuesta por 2.
            maquina.setGananciasApuesta(maquina.getValorApuesta() * 2);
        } else {
            // Si los símbolos no coinciden, establece las ganancias en 0.
            maquina.setGananciasApuesta(0);
        }
        // Devuelve las ganancias calculadas.
        return maquina.getGananciasApuesta();
    }

    // Método que ejecuta el giro de los carretes de manera asincrónica.
    public Future<String[]> girarCarretesSimultaneamente() {
        // Crea un ExecutorService con un solo hilo.
        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Envía una tarea al executor que llama al método girarCarretes.
        Future<String[]> future = executor.submit(new Callable<String[]>() {
            @Override
            public String[] call() {
                // Ejecuta el método girarCarretes y devuelve el resultado.
                return girarCarretes();
            }
        });
        // Cierra el ExecutorService después de enviar la tarea.
        executor.shutdown();
        // Devuelve el objeto Future que contiene el resultado del giro.
        return future;
    }
}
