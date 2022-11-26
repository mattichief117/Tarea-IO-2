package clase;

import java.util.ArrayList;

public class comunas_unidas {
    private static ArrayList<Integer> comunas_2 = new ArrayList<Integer>();
    
    
    public comunas_unidas(){
    this.comunas_2 = new ArrayList<Integer>();
    }
    
    
    public static int[] obtener_comunas_2() {
        int[] array = null;
        int tamaño = comunas_2.size();
        array = new int[tamaño];
        for(int i=0; i<tamaño;i++){
        array[i] = comunas_2.get(i);
        }
        return array;
    }
    
     public static void setComunas_2(int numero) {
       comunas_2.add(numero);
    }
}
