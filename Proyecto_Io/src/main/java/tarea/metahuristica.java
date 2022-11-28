package tarea;
import clase.comunas;
import clase.comunas_unidas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class metahuristica {

    public static void main(String[] args) {
        prueba_de_seleccion();  
    }

 
    private static void prueba_de_seleccion() {
        double valor = 0; 
        int n1;
        int flag =0;
        int[] comprobar = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
        vista_matriz(comprobar,flag); 
        System.out.println(" Probando seleccion de casos de prueba para tarea 2\n");  
        do{
        int [] pruebas = null;  
        List<comunas> com = new ArrayList<comunas>();
        comunas comunas = new comunas();
        comunas_unidas prueba = new comunas_unidas();   
        //Scanner leer = new Scanner(System.in);
        //n1 = leer.nextInt();
        n1 = (int) (Math.random() * 38 + 2);
        comunas.setId(n1);
        switch(n1){
            case (0):
            break;    
            case (1):
            break;    
             case (2):
                //System.out.println("Tomando comuna: 2\n");
                comunas.setValor(1);
                valor = comunas.getValor();
                pruebas = prueba.getComuna_2();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (3):    
                //System.out.println("Tomando comuna: 3\n");  
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_3();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                  proceso_hetauristica(com,pruebas,comprobar,n1,valor);
           
             break;
             case (4):
                //System.out.println("Tomando comuna: 4\n");
                comunas.setValor(1.2);
                pruebas = prueba.getComuna_4();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (5):
                // System.out.println("Tomando comuna: 5\n");    
                 comunas.setValor(2);
                 pruebas = prueba.getComuna_5();
                 valor = comunas.getValor();
                 //System.out.println("tamaño: "+pruebas.length+"\n");  
                 com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);  
             break;
             
             case (6):
                //System.out.println("Tomando comuna: 6\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_6();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (7):
                //System.out.println("Tomando comuna: 7\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_7();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (8):
                //System.out.println("Tomando comuna: 8\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_8();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (9):
                //System.out.println("Tomando comuna: 9\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_9();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (10):
                //System.out.println("Tomando comuna: 10\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_10();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (11):
                //System.out.println("Tomando comuna: 11\n");
                comunas.setValor(4);
                pruebas = prueba.getComuna_11();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (12):
               // System.out.println("Tomando comuna: 12\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_12();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (13):
                //System.out.println("Tomando comuna: 13\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_13();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor); 
             break;
             
             case (14):
                //System.out.println("Tomando comuna: 14\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_14();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (15):
                //System.out.println("Tomando comuna: 15\n");
                 comunas.setValor(2.5);
                pruebas = prueba.getComuna_15();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (16):
                //System.out.println("Tomando comuna: 16\n");
                 comunas.setValor(1.5);
                pruebas = prueba.getComuna_16();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (17):
                //System.out.println("Tomando comuna: 17\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_17();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (18):
                //System.out.println("Tomando comuna: 18\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_18();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (19):
                //System.out.println("Tomando comuna: 19\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_19();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (20):
                //System.out.println("Tomando comuna: 20\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_20();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (21):
                //System.out.println("Tomando comuna: 21\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_21();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (22):
                //System.out.println("Tomando comuna: 22\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_22();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (23):
                // System.out.println("Tomando comuna: 23\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_23();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (24):
                //System.out.println("Tomando comuna: 24\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_24();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (25):
                //System.out.println("Tomando comuna: 25\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_25();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (26):
                //System.out.println("Tomando comuna: 26\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_26();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (27):
                //System.out.println("Tomando comuna: 27\n");
                comunas.setValor(2.5);
                pruebas = prueba.getComuna_27();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (28):
                //System.out.println("Tomando comuna: 28\n");
                 comunas.setValor(2);
                pruebas = prueba.getComuna_28();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (29):
                //System.out.println("Tomando comuna: 29\n");
                comunas.setValor(3.5);
                pruebas = prueba.getComuna_29();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (30):
                //System.out.println("Tomando comuna: 30\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_30();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (31):
                // System.out.println("Tomando comuna: 31\n");
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_31();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (32):
               // System.out.println("Un huevo de pascua, no existe comuna 32\n"); 
               /* System.out.println("Tomando comuna: 32\n");
                comunas.setValor(0);
                pruebas = prueba.getComuna_32();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
                */
              break;
             
             case (33):
                //System.out.println("Tomando comuna: 33\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_33();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (34):
                //System.out.println("Tomando comuna: 34\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_34();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (35):
                //System.out.println("Tomando comuna: 35\n");
                comunas.setValor(3.5);
                pruebas = prueba.getComuna_35();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (36):
                //System.out.println("Tomando comuna: 36\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_36();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (37):
                //System.out.println("Tomando comuna: 37\n");
                comunas.setValor(2.5);
                pruebas = prueba.getComuna_37();
                valor = comunas.getValor();
                //ystem.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (38):
                //System.out.println("Tomando comuna: 38\n");
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_38();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             default:
             //System.out.println("Error en seleccion\n");  
        }
        
        flag = comprobar_0_1(comprobar);
        //System.out.println("flag es:"+flag+"\n");  
        vista_matriz(comprobar, flag);
        matrices_tomadas(comunas, flag);
        vista_suma(comunas, flag);
        metodo_swap(comunas,flag);
        }while(flag != 1);
    }
 
    
    public static int comprobar_0_1(int[] comprobar){
        int multiplicar = 1;     
        for(int i = 0; i<comprobar.length;i++){     
           multiplicar = multiplicar*comprobar[i];
           //System.out.print(""+multiplicar+"");
        }
         if(multiplicar == 0){
         return 0;
         }else{
         return 1;
         }
    }
    
    private static void proceso_hetauristica(List<comunas> com, int[] pruebas,int[] comprobar,int id,double valor) {
       int comp = 0; 
       for(int i = 0 ;i<com.size();i++){
       //System.out.println("puesto: "+i+"\n");
       comp = 0;
       int[] array_comunas = pruebas;     
       int z = 0; 
       do{     
           comp = comp+1; 
           comprobar_ID(com,comp,z,comprobar,array_comunas,valor,i,id);
           z++;
       }while(z < comprobar.length);
       }
      
    }

    
      private static void comprobar_ID(List<comunas> comunas, int comp,int z,int[]comprobar, int[] array_comunas,double valor,int i,int id) {
        //System.out.println("posicion vector: "+z+" de la comuna: "+ comunas.get(i).getId() +"\n");
        //System.out.println("comp "+comp+" id: "+id+"\n");
        
        if(id == comp && comprobar[z] == 0){
            //System.out.println("la posicion "+comp+" y es la comuna: "+comunas.get(i).getId()+"\n");
            //System.out.println("la posicion "+z+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            comprobar[z] = 1;
            //System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,comunas,comp,i,array_comunas,id); 
            if(comprobar[comp-1] == 1){
               comunas.get(i).setComunas(comp);
               comunas.get(i).setSuma(valor);
               //System.out.print("la comuna: "+comp+" puede seleccionarse\n");
               //System.out.print("el valor total de instalacion es: "+valor+"\n");
            }
        }else{
            //if(comprobar[z] == 1 && comunas.get(i).getId() == comp){
              //System.out.println("la comuna ya se encuentra tomada\n");
            //}  
        }
    }
      
      
      
    private static void comprobar_comunas(int[] comprobar, List<comunas> comunas, int comp,int i,int[] array_comunas,int id) {
       //int id = comunas.get(i).getId();
       int [] comuna_2 = array_comunas; 
       //System.out.println("tamaño comuna: "+comuna_2.length +" del id: "+id+"\n");
       //int posicion_comuna = 0;
       comp = 0;
       int cont = 0;
        for(int j = 0; j < comuna_2.length;j++){ 
                int z = 0;
                int comuna = comuna_2[j]; 
                do{
                comp = comp+1;    
                if(comuna == comp && comprobar[z] == 0){
                 comprobar[z] = 1;
                 //posicion_comuna = posicion_comuna+1;
                     //System.out.println("la posicion "+z+" es igual a "+comprobar[z]+"\n");
                     //System.out.println("la comuna "+comuna+" se selecciona\n");
                     comp = 0;
                     break;
                    }else{
                        if(comuna == comp && comprobar[z] == 1){
                            cont = cont+1;
                            //System.out.println("contador de repetidos; "+cont+"\n"); 
                            comp = 0;
                            //System.out.println("la comuna: "+comuna+" ya se encuentra tomada\n");
                            //if(cont == comuna_2.length){
                            //Borrar_1(id,comprobar);
                            //}
                              
                            break;
                        }
                    }
                        
                z++;
     
                }while(z < comprobar.length );
               
                
               
            //} 
       }
      
    }
    
     /*private static void Borrar_1(int id, int[] comprobar) {
        //for(int j = 0; j<comprobar.length;j++){
            if(comprobar[id-1] == 1){
                //comprobar[id-1] = 0;
                System.out.println("La comuna: "+id+" sus comunas cercanas ya fueron tomadas, pero de todas maneras sera seleccionada\n"); 
                //System.out.println("por lo que el valor del array de la comuna: "+id+" es: "+comprobar[id-1]+"\n");     
            }
        //}
    }*/
    
     private static void vista_matriz(int[] comprobar, int flag) {
         if(flag==1){
         System.out.print("comunas tomadas: \n"); 
       /* for(int j = 1; j<comprobar.length;j++){ 
         System.out.print("|"+j+"|"); 
        }
        System.out.print("\n");*/
        for(int i = 0; i<comprobar.length;i++){      
        System.out.print("|"+comprobar[i]+"|");      
        }
        System.out.print("\n"); 
         }
    }
    
    //Aqui aplicar swap:
    private static void matrices_tomadas(comunas comunas,int flag) {
        if(flag==1){
        System.out.print("\n");
        int [] comunas_tomadas = comunas.obtener_comunas();
         System.out.print("se seleccionaron las comunas: ");
        for(int i = 0; i<comunas_tomadas.length;i++){
         System.out.print(comunas_tomadas[i]+" ");
        }
 
        System.out.println("\n");
        }
    }
    
    
    
    //suma no funciona:
    private static void vista_suma(comunas comunas,int flag) {
        if(flag == 1){
        double total = 0;
        System.out.print("\n");
        int [] tamaño = comunas.obtener_comunas();
        //suma
        double [] valor = comunas.obtener_suma();
        System.out.print("el total (en miles de dólares) es: ");
            for(int i = 0; i<tamaño.length;i++){
                total = total + valor[i];    
            }
        System.out.print(total+" ");    
        System.out.println("\n");
        }
    }
    
    //aplicar metodo swap
    private static void metodo_swap(comunas comunas, int flag) {
        int [] comunas_tomadas = comunas.obtener_comunas();
        int band = 0;
        int cont = 0;
        if(flag == 1){
        System.out.print("metodo swap: \n");
        do{
        int swap = (int) (Math.random() * 38 + 2); 
        int swap_2 = (int) (Math.random() * 38 + 2);
            for(int i =0;i<comunas_tomadas.length;i++){
                //System.out.print("swap: "+swap+" comunas "+comunas_tomadas[i]+"\n");
                if(swap == comunas_tomadas[i]){
                    for(int j=0;j<comunas_tomadas.length;j++){
                        if(swap_2 != comunas_tomadas[j] && swap_2 != 32 ){
                        System.out.print("comuna: "+comunas_tomadas[i]+" random_swap: "+swap_2+"\n");
                        comunas_tomadas[i] = swap_2;
                        band = 1;
                        break;
                        }
                    }
                }

        }
          cont++;
         //System.out.print("cont: "+cont+"\n");
        }while(cont != 38 && band !=1);
        
        System.out.print("comuna nueva: ");
        for(int i = 0; i<comunas_tomadas.length;i++){
         System.out.print(comunas_tomadas[i]+" ");
        }
        System.out.print("\n");
        
        comprobar_swap(comunas_tomadas,flag);
        }
    }

    private static void comprobar_swap(int[] comunas_tomadas,int band) {
        double valor = 0; 
        int i = 0;
        int flag =0;
        int[] comprobar = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
        vista_matriz(comprobar,flag);
        int [] pruebas = null;
        comunas comunas_2 = new comunas();
        //comunas_2.eliminar_comunas();
        List<comunas> com_2 = new ArrayList<comunas>();
        //com_2.clear();
        comunas_unidas prueba_2 = new comunas_unidas();   
        do{ 
         switch(comunas_tomadas[i]){
                 case (0):
                //System.out.println("Muchas gracias\n");
                break;
             
             case (1):
                //System.out.println("Un huevo de pascua, no existe comuna 1\n"); 
             break;
             
             case (2):
                //System.out.println("Tomando comuna: 2\n");
                valor = 1;
                pruebas = prueba_2.getComuna_2();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,2,valor);
                
             break;
             
             case (3):    
                //System.out.println("Tomando comuna: 3\n");  
                pruebas = prueba_2.getComuna_3();
                valor = 1.5;
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                  proceso_hetauristica_swap(com_2,pruebas,comprobar,3,valor);
           
             break;
             case (4):
                //System.out.println("Tomando comuna: 4\n");
                pruebas = prueba_2.getComuna_4();
                valor = 1.2;
             
                com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,4,valor);
             break;
             
             case (5):
                // System.out.println("Tomando comuna: 5\n");    
                 pruebas = prueba_2.getComuna_5();
                 valor = 2;  
                 com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,5,valor);  
             break;
             
             case (6):
                //System.out.println("Tomando comuna: 6\n");
                pruebas = prueba_2.getComuna_6();
                valor = 3;  
                com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,6,valor);
             break;
             
             case (7):
                //System.out.println("Tomando comuna: 7\n");
                pruebas = prueba_2.getComuna_7();
                valor = 2; 
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,7,valor);
             break;
             
             case (8):
                //System.out.println("Tomando comuna: 8\n");
                comunas_2.setValor(1);
                pruebas = prueba_2.getComuna_8();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,8,valor);
             break;
             
             case (9):
                //System.out.println("Tomando comuna: 9\n");
                comunas_2.setValor(1);
                pruebas = prueba_2.getComuna_9();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,9,valor);
             break;
             
             case (10):
               // System.out.println("Tomando comuna: 10\n");
                 comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_10();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,10,valor);
             break;
             
             case (11):
                //System.out.println("Tomando comuna: 11\n");
                comunas_2.setValor(4);
                pruebas = prueba_2.getComuna_11();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,11,valor);
             break;
             
             case (12):
                //System.out.println("Tomando comuna: 12\n");
                 comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_12();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,12,valor);
             break;
             
             case (13):
                //System.out.println("Tomando comuna: 13\n");
                comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_13();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,13,valor); 
             break;
             
             case (14):
               // System.out.println("Tomando comuna: 14\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_14();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,14,valor);
             break;
             
             case (15):
                //System.out.println("Tomando comuna: 15\n");
                 comunas_2.setValor(2.5);
                pruebas = prueba_2.getComuna_15();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,15,valor);
             break;
             
             case (16):
                //System.out.println("Tomando comuna: 16\n");
                 comunas_2.setValor(1.5);
                pruebas = prueba_2.getComuna_16();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,16,valor);
             break;
             
             case (17):
                //System.out.println("Tomando comuna: 17\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_17();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,17,valor);
             break;
             
             case (18):
                //System.out.println("Tomando comuna: 18\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_18();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
               proceso_hetauristica_swap(com_2,pruebas,comprobar,18,valor);
             break;
             
             case (19):
                //System.out.println("Tomando comuna: 19\n");
                comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_19();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,19,valor);
             break;
             
             case (20):
                //System.out.println("Tomando comuna: 20\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_20();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
               proceso_hetauristica_swap(com_2,pruebas,comprobar,20,valor);
             break;
             
             case (21):
                //System.out.println("Tomando comuna: 21\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_21();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,21,valor);
             break;
             
             case (22):
               // System.out.println("Tomando comuna: 22\n");
                comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_22();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,22,valor);
             break;
             
             case (23):
                // System.out.println("Tomando comuna: 23\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_23();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,23,valor);
             break;
             
             case (24):
                //System.out.println("Tomando comuna: 24\n");
                comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_24();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,24,valor);
             break;
             
             case (25):
                //System.out.println("Tomando comuna: 25\n");
                 comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_25();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,25,valor);
             break;
             
             case (26):
                //System.out.println("Tomando comuna: 26\n");
                comunas_2.setValor(1);
                pruebas = prueba_2.getComuna_26();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
               proceso_hetauristica_swap(com_2,pruebas,comprobar,26,valor);
             break;
             
             case (27):
                //System.out.println("Tomando comuna: 27\n");
                comunas_2.setValor(2.5);
                pruebas = prueba_2.getComuna_27();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,27,valor);
             break;
             
             case (28):
                //System.out.println("Tomando comuna: 28\n");
                 comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_28();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,28,valor);
             break;
             
             case (29):
                //System.out.println("Tomando comuna: 29\n");
                comunas_2.setValor(3.5);
                pruebas = prueba_2.getComuna_29();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,29,valor);
             break;
             
             case (30):
                //System.out.println("Tomando comuna: 30\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_30();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
               proceso_hetauristica_swap(com_2,pruebas,comprobar,30,valor);
             break;
             
             case (31):
                 //System.out.println("Tomando comuna: 31\n");
                comunas_2.setValor(1.5);
                pruebas = prueba_2.getComuna_31();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,31,valor);
             break;
             
             case (32):
                //System.out.println("Un huevo de pascua, no existe comuna 32\n"); 
               /* System.out.println("Tomando comuna: 32\n");
                comunas.setValor(0);
                pruebas = prueba.getComuna_32();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
                */
              break;
             
             case (33):
                //System.out.println("Tomando comuna: 33\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_33();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,33,valor);
             break;
             
             case (34):
                //System.out.println("Tomando comuna: 34\n");
                comunas_2.setValor(3);
                pruebas = prueba_2.getComuna_34();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,34,valor);
             break;
             
             case (35):
                //System.out.println("Tomando comuna: 35\n");
                comunas_2.setValor(3.5);
                pruebas = prueba_2.getComuna_35();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,35,valor);
             break;
             
             case (36):
                //System.out.println("Tomando comuna: 36\n");
                comunas_2.setValor(2);
                pruebas = prueba_2.getComuna_36();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,36,valor);
             break;
             
             case (37):
                //System.out.println("Tomando comuna: 37\n");
                comunas_2.setValor(2.5);
                pruebas = prueba_2.getComuna_37();
                valor = comunas_2.getValor();
                //ystem.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,37,valor);
             break;
             
             case (38):
                //System.out.println("Tomando comuna: 38\n");
                comunas_2.setValor(1.5);
                pruebas = prueba_2.getComuna_38();
                valor = comunas_2.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,38,valor);
             break;
             
             default:
             System.out.println("Error en seleccion\n");  
        }
        i++; 
        flag = comprobar_0_1(comprobar);
        comprobar_swap(comprobar,comunas_2,flag,i,comunas_tomadas,band);   
        }while(i != comunas_tomadas.length && flag != 1);
    }
    
    private static void proceso_hetauristica_swap(List<comunas> com, int[] pruebas,int[] comprobar,int id,double valor) {
       int comp = 0; 
       for(int i = 0 ;i<com.size();i++){
       //System.out.println("puesto: "+i+"\n");
       comp = 0;
       int[] array_comunas = pruebas;     
       int z = 0; 
       do{     
           comp = comp+1; 
           comprobar_ID_swap(com,comp,z,comprobar,array_comunas,valor,i,id);
           z++;
       }while(z < comprobar.length);
       }
    }
      
      
    private static void comprobar_ID_swap(List<comunas> comunas, int comp,int z,int[]comprobar, int[] array_comunas,double valor,int i,int id) {
        //System.out.println("posicion vector: "+z+" de la comuna: "+ comunas.get(i).getId() +"\n");
        //System.out.println("comp "+comp+" id: "+id+"\n");
        
        if(id == comp && comprobar[z] == 0){
            //System.out.println("la posicion "+comp+" y es la comuna: "+comunas.get(i).getId()+"\n");
            //System.out.println("la posicion "+z+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            comprobar[z] = 1;
            //System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,comunas,comp,i,array_comunas,id); 
            if(comprobar[comp-1] == 1){
               //comunas.get(i).setComunas(comp);
               comunas.get(i).setSuma(valor);
              // System.out.print("la comuna: "+comp+" del proceso swap\n");
              // System.out.print("el valor total de instalacion es: "+valor+"\n");
            }
        }else{
            /*if(id == comp && comprobar[comp-1] == 1){
               comprobar[z] = 1; 
               comunas.get(i).setComunas(comp);
               comunas.get(i).setSuma(valor);
               //System.out.print("la comuna: "+comp+" del proceso swap ya fue seleccionada con anterioridad por lo que no se selecciona\n");
               //System.out.print("el valor total de instalacion es: "+valor+"\n");
            } */
            //if(comprobar[z] == 1 && comunas.get(i).getId() == comp){
              //System.out.println("la comuna ya se encuentra tomada\n");
            //}  
        }
    }
      
    private static void comprobar_swap(int[] comprobar, comunas comunas_2, int flag,int j, int [] comunas_tomadas,int band) {
        int n1;
        if(j==comunas_tomadas.length){
         System.out.print("\n");   
         System.out.print("las comunas principales son: ");
          for(int i = 0; i<comunas_tomadas.length;i++){
          System.out.print(comunas_tomadas[i]+" ");
        }
        double total = 0;
        System.out.print("\n");
        int [] tamaño = comunas_2.obtener_comunas();
        //suma
        double [] valor = comunas_2.obtener_suma();
        System.out.print("el total (en miles de dólares) es: ");
        for(int i = 0; i<tamaño.length;i++){
        total = total + valor[i];    
        }
        System.out.print(total+" ");    
        System.out.println("\n");
        
        System.out.print("se seleccionaron las comunas: ");
        for(int i = 0; i<comprobar.length;i++){      
        System.out.print("|"+comprobar[i]+"|");      
        }
        System.out.print("\n"); 
        if(flag == 0){
        System.out.println("La funcion no es factible\n"); 
        }else{
        System.out.println("La funcion si es factible\n"); 
        }
      
            do{
                System.out.println("desea aplicar swap? presione 1 para aceptar o 0 para salir de la aplicación\n");
                Scanner leer = new Scanner(System.in);
                n1 = leer.nextInt();
                if(n1==1){
                 flag = 1;    
                 metodo_swap(comunas_2,flag);
                }else{
                    if(n1>0){
                        System.out.println("error selección\n");
                    }
                }
            }while(n1!=0);
        }
    }
    
}
 
