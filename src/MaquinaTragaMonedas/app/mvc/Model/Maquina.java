/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaquinaTragaMonedas.app.mvc.Model;

/**
 *
 * @authors capis y heber
 */
public class Maquina{
    // Atributos
    private final int numeroCarretes;
    private boolean handle;
    private int valorApuesta;
    private int gananciasApuesta;
    // private final String[] simbolos = {"🍎", "🍊", "🍇", "💲", "🍉", "🍋", "🍒", "💎", "🔔"};
    private final String[] simbolos = {"🍎", "🍊", "🍉", "💎"};

    // Métodos
    // Constructor
    public Maquina() {
        this.numeroCarretes = 3;
        this.valorApuesta = 0;
        this.gananciasApuesta = 0;
        this.handle = false;
    }
    
    // Métodos Getters and  Setters
    public void setValorApuesta(int valor) {
        this.valorApuesta = valor;
    }

    public int getValorApuesta() {
        return valorApuesta;
    }

    public int getGananciasApuesta() {
        return gananciasApuesta;
    }

    public void setGananciasApuesta(int ganancias) {
        this.gananciasApuesta = ganancias;
    }

    public String[] getSimbolos() {
        return simbolos;
    }
    
    public void setHandel(boolean handle){
        this.handle = handle;
    }
    
    public boolean getHandel(){
        return handle;
    }
}
