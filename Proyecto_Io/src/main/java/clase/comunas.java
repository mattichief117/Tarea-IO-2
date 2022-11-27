package clase;

import java.util.ArrayList;
import java.util.List;

public class comunas {
    
    private int id;
    private comunas_unidas comunas_array[] = null;
    private static ArrayList<Integer> comunas = new ArrayList<Integer>();
    private static ArrayList<Double> suma = new ArrayList<Double>();
    private int cantidad;
    private double valor;
    private int[] array = null;
    private double[] array_suma = null;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public comunas(Integer id, int cantidad, ArrayList<Integer> comunas) {
        this.id = id;
        this.cantidad = cantidad;
    }
     
    public comunas() {
        this.id = id;
        this.cantidad = cantidad;
        //this.comunas_array = comunas_array;
        //comunas Milista = new comunas();
       //this.comunas = new ArrayList<Integer>();
       //this.suma = new ArrayList<Double>();
       //this.array = null;
    }
    
   // public comunas_unidas[] cargarcomunasunidas(){
   // return comunas_array;
   // }
    
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public int[] obtener_comunas() {
        
        this.array = null;
        int tamaño = comunas.size();
        this.array = new int[tamaño];
        for(int i=0; i<tamaño;i++){
        this.array[i] = comunas.get(i);
        }
        return this.array;
    }
    
    public static void setComunas(int numero) {
       comunas.add(numero);
    }
    
    public double[] obtener_suma() {
        
        this.array_suma = null;
        int tamaño = suma.size();
        this.array_suma = new double[(int)tamaño];
        for(int i=0; i<tamaño;i++){
        this.array_suma[i] = suma.get(i);
        }
        return this.array_suma;
    }
    
    public static void setSuma(double numero) {
       suma.add(numero);
    }

   
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
        
}
