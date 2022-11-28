package clase;

import java.util.ArrayList;
import java.util.List;

/*//en esta clase se guardan datos de las comunas, como la principal (id), el listado donde se guardara en un array para ser consultado las comunas que se toman (ArrayList<Integer> comunas 
comunas_unidas comunas_array[]), lo mismo con la suma de valores, donde se toma el valor y se guarda en la lista y array (solo de las comunas principales)(ArrayList<Double> suma = new ArrayList<Double>(); y array_suma = null;)*/
public class comunas {
    
    private int id;
    private comunas_unidas comunas_array[] = null;
    private static ArrayList<Integer> comunas = new ArrayList<Integer>();
    private static ArrayList<Double> suma = new ArrayList<Double>();
    private static ArrayList<Double> suma_swap = new ArrayList<Double>();
    //private int cantidad;
    private double valor;
    private int[] array = null;
    private double[] array_suma = null;
    private double[] array_suma_swap = null;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //aqui se inicia el constructor de la clase
   public comunas(Integer id, int cantidad, ArrayList<Integer> comunas) {
        this.id = id;
        //this.cantidad = cantidad;
    }
     
    public comunas() {
        this.id = id;
        //this.cantidad = cantidad;
    }
    
   // public comunas_unidas[] cargarcomunasunidas(){
   // return comunas_array;
   // }
    
   //en este apartado se obtienen y guardan el id, listas (suma y comunas) y valor.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //aqui se guarda una lista de comunas a un array.
    public int[] obtener_comunas() {
        
        this.array = null;
        int tamaño = comunas.size();
        this.array = new int[tamaño];
        for(int i=0; i<tamaño;i++){
        this.array[i] = comunas.get(i);
        }
        return this.array;
    }
    
    
    //aca se eliminan las listas de las comunas y valores guardadas 
    public void eliminar_comunas(){
    //this.array = null;
    this.comunas = new ArrayList<Integer>();
    this.suma = new ArrayList<Double>();
    //return this.array;
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
    
    public void eliminar_suma_swap(){
    this.array_suma_swap = null;
    this.suma_swap = new ArrayList<Double>();
    }
    
    public static void setSuma(double numero) {
       suma.add(numero);
    }
    
    public double[] obtener_suma_swap() {
        
        this.array_suma_swap = null;
        int tamaño = suma_swap.size();
        this.array_suma_swap = new double[(int)tamaño];
        for(int i=0; i<tamaño;i++){
        this.array_suma_swap[i] = suma_swap.get(i);
        }
        return this.array_suma_swap;
    }
    
    
    
    public static void setSuma_swap(double numero) {
       suma_swap.add(numero);
    }
   
   /* public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }*/
        
}
