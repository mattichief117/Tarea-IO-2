package tarea;
import clase.comunas;
import clase.comunas_unidas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class metahuristica {

    public static void main(String[] args) {
        int n1 =0;
        int i = 1;
        do{
            System.out.println(" Desea comenzar la iteracion n°: "+i+"?\n");
            System.out.println(" Presiona 1 para comensar y 0 para salir\n");
            Scanner leer = new Scanner(System.in);
            n1 = leer.nextInt();
            System.out.print("\n");
            switch(n1){
            case(1):
            prueba_de_seleccion();     
            break;
            case(0):
            System.out.println("Hasta luego, gracias por usar nuestro programa\n");    
            break;  
            default:
            System.out.println("Error de selección\n");
            break;
            }
            
            i++;
        }while(n1!=0);   
    }

 
    private static void prueba_de_seleccion() {
        double valor = 0; 
        int n1;
        int[] comprobar = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
        vista_matriz(comprobar);
        do{
        int [] pruebas = null;    
        List<comunas> com = new ArrayList<comunas>();
        comunas comunas = new comunas();
        comunas_unidas prueba = new comunas_unidas();   
        System.out.println("\n"); 
        System.out.println(" Probando seleccion de casos de prueba para tarea 2\n");  
        System.out.println(" Seleccione una comuna del 2 al 38, para salir presione 0\n");
        Scanner leer = new Scanner(System.in);
        n1 = leer.nextInt();
        comunas.setId(n1);
        System.out.println("\n");
        switch(n1){
             case (0):
                System.out.println("Muchas gracias\n");
             break;
             
             case (1):
                System.out.println("Un huevo de pascua, no existe comuna 1\n"); 
             break;
             
             case (2):
                System.out.println("Tomando comuna: 2\n");
                comunas.setValor(1);
                valor = comunas.getValor();
                pruebas = prueba.getComuna_2();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
                
             break;
             
             case (3):    
                System.out.println("Tomando comuna: 3\n");  
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_3();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                  proceso_hetauristica(com,pruebas,comprobar,n1,valor);
           
             break;
             case (4):
                System.out.println("Tomando comuna: 4\n");
                comunas.setValor(1.2);
                pruebas = prueba.getComuna_4();
                valor = comunas.getValor();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (5):
                 System.out.println("Tomando comuna: 5\n");    
                 comunas.setValor(2);
                 pruebas = prueba.getComuna_5();
                 //System.out.println("tamaño: "+pruebas.length+"\n");  
                 com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);  
             break;
             
             case (6):
                System.out.println("Tomando comuna: 6\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_6();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                 proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (7):
                System.out.println("Tomando comuna: 7\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_7();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (8):
                System.out.println("Tomando comuna: 8\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_8();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (9):
                System.out.println("Tomando comuna: 9\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_9();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (10):
                System.out.println("Tomando comuna: 10\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_10();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (11):
                System.out.println("Tomando comuna: 11\n");
                comunas.setValor(4);
                pruebas = prueba.getComuna_11();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (12):
                System.out.println("Tomando comuna: 12\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_12();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (13):
                System.out.println("Tomando comuna: 13\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_13();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor); 
             break;
             
             case (14):
                System.out.println("Tomando comuna: 14\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_14();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (15):
                System.out.println("Tomando comuna: 15\n");
                 comunas.setValor(2.5);
                pruebas = prueba.getComuna_15();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (16):
                System.out.println("Tomando comuna: 16\n");
                 comunas.setValor(1.5);
                pruebas = prueba.getComuna_16();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (17):
                System.out.println("Tomando comuna: 17\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_17();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (18):
                System.out.println("Tomando comuna: 18\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_18();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (19):
                System.out.println("Tomando comuna: 19\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_19();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (20):
                System.out.println("Tomando comuna: 20\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_20();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (21):
                System.out.println("Tomando comuna: 21\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_21();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (22):
                System.out.println("Tomando comuna: 22\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_22();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (23):
                 System.out.println("Tomando comuna: 23\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_23();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (24):
                System.out.println("Tomando comuna: 24\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_24();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (25):
                System.out.println("Tomando comuna: 25\n");
                 comunas.setValor(3);
                pruebas = prueba.getComuna_25();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (26):
                System.out.println("Tomando comuna: 26\n");
                comunas.setValor(1);
                pruebas = prueba.getComuna_26();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (27):
                System.out.println("Tomando comuna: 27\n");
                comunas.setValor(2.5);
                pruebas = prueba.getComuna_27();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (28):
                System.out.println("Tomando comuna: 28\n");
                 comunas.setValor(2);
                pruebas = prueba.getComuna_28();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (29):
                System.out.println("Tomando comuna: 29\n");
                comunas.setValor(3.5);
                pruebas = prueba.getComuna_29();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (30):
                System.out.println("Tomando comuna: 30\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_30();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
               proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (31):
                 System.out.println("Tomando comuna: 31\n");
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_31();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (32):
                System.out.println("Un huevo de pascua, no existe comuna 32\n"); 
               /* System.out.println("Tomando comuna: 32\n");
                comunas.setValor(0);
                pruebas = prueba.getComuna_32();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
                */
              break;
             
             case (33):
                System.out.println("Tomando comuna: 33\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_33();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (34):
                System.out.println("Tomando comuna: 34\n");
                comunas.setValor(3);
                pruebas = prueba.getComuna_34();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (35):
                System.out.println("Tomando comuna: 35\n");
                comunas.setValor(3.5);
                pruebas = prueba.getComuna_35();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (36):
                System.out.println("Tomando comuna: 36\n");
                comunas.setValor(2);
                pruebas = prueba.getComuna_36();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (37):
                System.out.println("Tomando comuna: 37\n");
                comunas.setValor(2.5);
                pruebas = prueba.getComuna_37();
                //ystem.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             case (38):
                System.out.println("Tomando comuna: 38\n");
                comunas.setValor(1.5);
                pruebas = prueba.getComuna_38();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com.add(comunas);
                proceso_hetauristica(com,pruebas,comprobar,n1,valor);
             break;
             
             default:
             System.out.println("Error en seleccion\n");  
        }
        vista_matriz(comprobar);
        matrices_tomadas(comunas);
        vista_suma(comunas);
        }while(n1 !=0);
       
    }

    
    private static void proceso_hetauristica(List<comunas> com, int[] pruebas,int[] comprobar,int j,double valor) {
       int comp = 0; 
       for(int i = 0 ;i<com.size();i++){
       //System.out.println("puesto: "+i+"\n");
       comp = 0;
       int[] array_comunas = pruebas;     
       int z = 0; 
       do{     
           comp = comp+1; 
           comprobar_ID(com,comp,z,comprobar,array_comunas,valor,i);
           z++;
       }while(z < comprobar.length);
       }
      
    }

    
      private static void comprobar_ID(List<comunas> comunas, int comp,int z,int[]comprobar, int[] array_comunas,double valor,int i) {
        //System.out.println("posicion vector: "+z+" de la comuna: "+ comunas.get(i).getId() +"\n");
        //System.out.println("comp "+comp+" \n");
        
        if(comunas.get(i).getId() == comp && comprobar[z] == 0){
            //System.out.println("la posicion "+comp+" y es la comuna: "+comunas.get(i).getId()+"\n");
            //System.out.println("la posicion "+z+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            comprobar[z] = 1;
            System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,comunas,comp,i,array_comunas); 
            if(comprobar[comp-1] == 1){
               comunas.get(i).setComunas(comp);
               comunas.get(i).setSuma(valor);
               System.out.println("la comuna: "+comp+" puede seleccionarse\n");
               System.out.println("el valor total de instalacion es: "+valor+"\n");
            }
        }else{
            if(comprobar[z] == 1 && comunas.get(i).getId() == comp){
              System.out.println("la comuna ya se encuentra tomada\n");
            }  
        }
    }

    private static void comprobar_comunas(int[] comprobar, List<comunas> comunas, int comp,int i,int[] array_comunas) {
       int id = comunas.get(i).getId();
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
                     System.out.println("la comuna "+comuna+" se selecciona\n");
                     comp = 0;
                     break;
                    }else{
                        if(comuna == comp && comprobar[z] == 1){
                            cont = cont+1;
                            //System.out.println("contador de repetidos; "+cont+"\n"); 
                            comp = 0;
                            System.out.println("la comuna: "+comuna+" ya se encuentra tomada\n");
                            if(cont == comuna_2.length){
                            Borrar_1(id,comprobar);
                            }
                              
                            break;
                        }
                    }
                        
                z++;
     
                }while(z < comprobar.length );
               
                
               
            //} 
       }
      
    }
    
     private static void Borrar_1(int id, int[] comprobar) {
        //for(int j = 0; j<comprobar.length;j++){
            if(comprobar[id-1] == 1){
                comprobar[id-1] = 0;
                System.out.println("La comuna: "+id+" No puede tomarse porque sus comunas cercanas ya fueron tomadas\n"); 
                System.out.println("por lo que el valor del array de la comuna: "+id+" es: "+comprobar[id-1]+"\n");     
            }
        //}
    }
    
     private static void vista_matriz(int[] comprobar) {
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

    private static void matrices_tomadas(comunas comunas) {
        System.out.print("\n");
        int [] comunas_tomadas = comunas.obtener_comunas();
         System.out.print("se seleccionaron las comunas: ");
        for(int i = 0; i<comunas_tomadas.length;i++){
        System.out.print(comunas_tomadas[i]+" ");
      }
        System.out.println("\n");
    }

    private static void vista_suma(comunas comunas) {
        double total = 0;
        System.out.print("\n");
        int [] tamaño = comunas.obtener_comunas();
        double [] valor = comunas.obtener_suma();
        System.out.print("el total (en miles de dólares) es: ");
            for(int i = 0; i<tamaño.length;i++){
                total = total + valor[i];    
            }
        System.out.print(total+" ");    
        System.out.println("\n");
    }
        
}
