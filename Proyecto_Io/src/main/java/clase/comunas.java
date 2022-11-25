package clase;

import java.util.ArrayList;

public class comunas {
    
    private int id;
    private static ArrayList<Integer> comunas = new ArrayList<Integer>();
    private int cantidad;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public comunas(Integer id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }
     
    public comunas() {
        this.id = id;
        this.cantidad = cantidad;
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public static int[] obtener_comunas() {
        int[] array = null;
        int tamaño = comunas.size();
        array = new int[tamaño];
        for(int i=0; i<tamaño;i++){
        array[i] = comunas.get(i);
        }
        return array;
    }
    
    public static void setComunas(int numero) {
       comunas.add(numero);
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        
}
