package tarea;
import clase.comunas;
import clase.comunas_unidas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//aqui se comienza el proceso para generar, de manera random, la lista de comunas que se pueden tomar para generar el swap  
//todo lo que esta comentado durante los procesos son comprobaciones para corregir errores.
public class metahuristica {
 
    public static void main(String[] args) {
        prueba_de_seleccion();  
    }

    /*
    se comienza la prueba generando el valor, para posteriormente hacer la suma total de comunas tomadas, n1 que seria la comuna principal(id), la matriz que corresponde cada posicion a una comuna,
    y se eligen comunas de manera aleatoria con el metodo n1 = (int) (Math.random() * 38 + 2);, con los cases se seleccionan las comunas, se genera la clase comunas llamado prueba para acceder al id
    y su valor, que se guarda aparte para realizar la suma del total y se guarda en una lista com para posteriormente acceder a la funcion proceso_hetauristica(com,pruebas,comprobar,n1,valor);, el proceso 
    termina cuando el vector comprobar este lleno de 1 mediante un flag que comienza con 0.
    */
    private static void prueba_de_seleccion() {
        double valor = 0; 
        int n1;
        int flag =0;
        int a_n = 1;
        int [] anterior;
        int primera = 1;
        double temperatura = 12;
        double alfa = 0.8;
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
        /*una vez que flag sea igual a 1, se mostrara la matriz resultante (0,1), las comunas seleccionadas y la suma total, para posteriormente pasar al metodo swap*/
        flag = comprobar_0_1(comprobar);
        anterior = comunas.obtener_comunas();
        //System.out.println("flag es:"+flag+"\n");  
        vista_matriz(comprobar, flag);
        matrices_tomadas(comunas, flag);
        vista_suma(comunas, flag);
        metodo_swap(comunas,flag,primera,temperatura,alfa,a_n,anterior);
        }while(flag != 1);
    }
 
    //aqui se hace el primer paso para la comprobacion que todas las comunas
    //fueron seleccionadas en el vector, se multiplica por cada casilla y si resulta 1 retorna 1 la funcion para comenzar con los siguientes procedimientos
    //si es 0 la seleccion de comunas continua.
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
    //aqui se comienza el proceso de seleccion de comunas, se usa comp para como un metodo para seleccionar la comuna y el z es para comprobar la posicion de la comuna 
    //en la matriz, las comunas que estan juntas con las principal se guardan en un nuevo array (array_comunas) para evitar posibles duplicados durante la comprobación 
    //el procedimiento termina cuando se recorre todo el vector de comunas (0 y 1).
    //dentro del do while se comienza la segunda parte de comprobar las comunas.
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

    /*
    en este apartado se asegura que la comuna principal (id) no se encuentre seleccionada en el vector de comprobar (comunas 0 y 1)
    si es 0 se selecciona y cambia a 1 la matriz y se guadan el valor suma y el id de la comuna principal en la lista comunas (com originalmente), para posteriormente mostrarlos al final del proceso.
    se pasa al proceso comprobar_comunas(comprobar,comunas,comp,i,array_comunas,id); 
    si es 1 la comuna simplemente no se toma y se termina el proceso.
    */
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
      
      
    /*
    en este proceso se comprueba las comunas apegadas a las principal
    se guardan las comunas en un nuevo array (para evitar errores)
    comp se vuelve 0, para poder recorrer el array con un for j de las comunas unidas a la principal que es int [] comuna_2
    se guarda la comuna en un  int comuna = comuna_2[j]; (siendo j la posicion y seleccion de la comuna)
    y dentro de un while con z siendo el reorrido con un z++ hasta que sea menor al vector (comunas 0 y 1) y comp busca que sea igual a la comuna seleccionada
    de esta manera se tiene la posicion exacta en donde se encuentra la comuna en el vector 
    si es igual a 0 en la posicion del vector, este cambia a 1 lo que significa que se toma, si es 1 entonces la comuna no se toma 
    haci hasta que se recorra todo el vector (0 y 1) y el vector de las comunas unidas a la principal.
    una vez terminado se vuelve al primer paso (el de los case) hasta que todo el vector de comunas (0 y 1) este completamente con 1.  
    */
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
    //aqui se muestra, una vez que este flag = 1, la matriz de 0 y 1
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
    
    //aqui se muestra la lista guardadas de comunas principales que se seleccionaron durante la comprobaciones anteriores (cunado flag = 1)
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
    
    
    
    //aqui se muestra la suma total de todas las comunas principales seleccionadas, se guarda la lista de los valores en  double [] valor para posteriormente sumar todo 
    //mediante un for y guardandolos en un double total, para posteriormente mostrarlo por pantalla (cunado flag = 1)
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
    
    //Aqui se aplica el metodo swap si n_a (que es un valor que determina que matriz se queda en la solucion)
    private static void metodo_swap(comunas comunas, int flag, int primera,double temperatura,double alfa,int a_n,int [] anterior) {
        int [] comunas_tomadas = comunas.obtener_comunas();
        //int [] suma_anterior = comunas.obtener_comunas();
        //System.out.println("a_n es igual a: "+a_n);
        if(a_n==0){
         metodo_swap2(comunas, flag, primera,temperatura,alfa,comunas_tomadas,anterior,a_n);
        }else{
        if(a_n==1){    
        metodo_swap2(comunas, flag, primera,temperatura,alfa,anterior,comunas_tomadas,a_n);
        }
        }
        
    }
      /*
       aqui a traves del metodo_swap2 se genera el cambio de una comuna de manera aleatoria con la 
       restriccion que no puede ser la misma que esta en la lista, y no puede ser un numero = a 1 o 32 
       una vez terminado el cambio, se procede al siguiente paso de comprobación 
        comprobar_swap(comunas_tomadas,flag,primera,comunas,anterior,temperatura,alfa,a_n);
      */
      private static void metodo_swap2(comunas comunas, int flag, int primera, double temperatura, double alfa, int[] comunas_tomadas,int[] anterior, int a_n) {
        int band = 0;
        int cont = 0;
        if(flag == 1){
        System.out.print("metodo swap: \n");
        do{
        int swap = (int) (Math.random() * 38 + 2); 
            for(int i =0;i<comunas_tomadas.length;i++){
                //System.out.print("swap: "+swap+" comunas "+comunas_tomadas[i]+"\n");
                if(swap == comunas_tomadas[i]){
                    for(int j=0;j<comunas_tomadas.length;j++){
                        int swap_2 = (int) (Math.random() * 38 + 2);
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
        
        comprobar_swap(comunas_tomadas,flag,primera,comunas,anterior,temperatura,alfa,a_n);
        }
    }

   
     /*
      lo mismo que el metodo comprobar solo que aqui se comprueba los valores cambiados a travez del metodo swap 
      y con el criterio de aceptacion metropolis
      y tambien se obtiene los valores actuales con los antiguos para realizar la operacion de metropolis
      primera se usa para el caso de que sea la primera vez la iteracion 
      tambien se toma la comuna anterior para cambiarla en caso de que sea factible
      if(primera ==1){
          anterior_1 = comunas.obtener_suma();
          for(int z = 0;z<anterior_1.length;z++){
           anterior_paso2 = anterior_paso2 + anterior_1[z];
          }
         primera = 0;
        }else{
         anterior_1 = comunas_2.obtener_suma_swap();
         anterior =  comunas_2.obtener_comunas();
         for(int z = 0;z<anterior_1.length;z++){
         anterior_paso2 = anterior_paso2 + anterior_1[z];
         }
        }
      */
    private static void comprobar_swap(int[] comunas_tomadas,int band,int primera,comunas comunas,int [] anterior,double temperatura,double alfa,int a_n) {        
        double valor = 0; 
        int i = 0;
        int flag =0;
        int[] comprobar = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
        vista_matriz(comprobar,flag);
        int [] pruebas = null;
        comunas comunas_2 = new comunas();
        double anterior_paso2 = 0;
        double [] anterior_1;
        if(primera ==1){
          anterior_1 = comunas.obtener_suma();
          for(int z = 0;z<anterior_1.length;z++){
           anterior_paso2 = anterior_paso2 + anterior_1[z];
          }
         primera = 0;
        }else{
         anterior_1 = comunas_2.obtener_suma_swap();
         anterior =  comunas_2.obtener_comunas();
         for(int z = 0;z<anterior_1.length;z++){
         anterior_paso2 = anterior_paso2 + anterior_1[z];
         }
        }
        
         System.out.print("anterior: "+anterior_paso2+"\n");
        comunas_2.eliminar_suma_swap();        
        //comunas_2.eliminar_comunas();
        List<comunas> com_2 = new ArrayList<comunas>();
        com_2.clear();
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
                comunas_2.setValor(1);
                valor = comunas_2.getValor();;
                pruebas = prueba_2.getComuna_2();
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                proceso_hetauristica_swap(com_2,pruebas,comprobar,2,valor);
                
             break;
             
             case (3):    
                //System.out.println("Tomando comuna: 3\n");  
                pruebas = prueba_2.getComuna_3();
                comunas_2.setValor(1.5);
                valor = comunas_2.getValor(); 
                //System.out.println("tamaño: "+pruebas.length+"\n");  
                com_2.add(comunas_2);
                  proceso_hetauristica_swap(com_2,pruebas,comprobar,3,valor);
           
             break;
             case (4):
                //System.out.println("Tomando comuna: 4\n");
                pruebas = prueba_2.getComuna_4();
                 comunas_2.setValor(1.2);
                valor = comunas_2.getValor(); 
                com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,4,valor);
             break;
             
             case (5):
                // System.out.println("Tomando comuna: 5\n");    
                 pruebas = prueba_2.getComuna_5();
                 comunas_2.setValor(2);
                 valor = comunas_2.getValor();  
                 com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,5,valor);  
             break;
             
             case (6):
                //System.out.println("Tomando comuna: 6\n");
                pruebas = prueba_2.getComuna_6();
                comunas_2.setValor(3);
                valor = comunas_2.getValor();  
                com_2.add(comunas_2);
                 proceso_hetauristica_swap(com_2,pruebas,comprobar,6,valor);
             break;
             
             case (7):
                //System.out.println("Tomando comuna: 7\n");
                pruebas = prueba_2.getComuna_7();
                comunas_2.setValor(2);
                valor = comunas_2.getValor(); 
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
        //se comprueba el swap
        comprobar_swap(comprobar,comunas_2,flag,i,comunas_tomadas,band,primera,anterior_paso2,anterior,temperatura,alfa,a_n);   
        }while(i != comunas_tomadas.length && flag != 1);
    }
    
     //lo mismo que el proceso_hetauristica
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
      
      // lo mismo que el comprobar_ID solo que aqui no se guarda las comunas a la lista comunas ya que se utiliza la misma en todo momento y 
     //cambia en el metodo swap
    private static void comprobar_ID_swap(List<comunas> com, int comp,int z,int[]comprobar, int[] array_comunas,double valor,int i,int id) {
        //System.out.println("posicion vector: "+z+" de la comuna: "+ comunas.get(i).getId() +"\n");
        //System.out.println("comp "+comp+" id: "+id+"\n");
        
        if(id == comp && comprobar[z] == 0){
            //System.out.println("la posicion "+comp+" y es la comuna: "+comunas.get(i).getId()+"\n");
            //System.out.println("la posicion "+z+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            comprobar[z] = 1;
            //System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,com,comp,i,array_comunas,id); 
            //if(comprobar[comp-1] == 1){
               //comunas.get(i).setComunas(comp);
               com.get(i).setSuma_swap(valor);
              // System.out.print("la comuna: "+comp+" del proceso swap\n");
              //System.out.print("el id es "+comp+" el valor total de instalacion es: "+valor+"\n");
              //System.out.print("el id es "+comp+" el valor total de instalacion es: "+com.get(i).getValor()+"\n");
            //}
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
    
    //se repiten los procesos de  vista_matriz(comprobar, flag); matrices_tomadas(comunas, flag);vista_suma(comunas, flag);, solo que aqui se aplica el criterio de 
    //aceptacion para saber si la comuna es mejor que la anterior.
    //tambien se consulta si desea realizar un nuevo swap.
    //si es si (1) se realiza el proceso metodo_swap(comunas_2,flag); y si es no (0) se termina el proceso
    //revisar comentarios mas abajo para el proceso de penalizacion y criterio de aceptacion
    private static void comprobar_swap(int[] comprobar, comunas comunas_2, int flag,int j, int [] comunas_tomadas,int band,int primera,double anterior_paso2,int [] anterior, double temperatura, double alfa,int a_n) {
        int n1;

        /*if(j==comunas_tomadas.length){
         System.out.print("\n");   
         //System.out.print("las comunas principales son: ");
          for(int i = 0; i<comunas_tomadas.length;i++){   
         // System.out.print(comunas_tomadas[i]+" ");
        }*/
        double total = 0;
        //System.out.print("\n");
        //int [] tamaño = comunas_2.obtener_comunas();
        //suma
        double [] valor = comunas_2.obtener_suma_swap();
        System.out.print("el total (en miles de dólares) swap es: ");
        for(int i = 0; i<valor.length;i++){
        //System.out.print(""+valor[i]+"\n");  
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
        total = total*10;
        System.out.println("la penalizacion es de: "+total+"\n");
        
        }else{
        System.out.println("La funcion si es factible\n"); 
        }
        /*
        aqui se aplica el criterio de aceptación  e^(total-anterior/t) < rand() se toma el anterior 
        caso e^(total-anterior/t) > rand() se queda el nuevo y si son iguales se queda el nuevo
        la temperatura cambia su valor usando = t*a; temperatura y alfa fueron inicializados al inicio del codigo
        para la penalizacion el valor (del actual swap) se multiplica * 10; luego de esto se realiza el
        criterio de aceptacion (buscamos el que tenga minimo valor)
        */
        System.out.println("temperatura:"+temperatura+"\n");
        double random = (double) (Math.random() * 1 + 0);
        double resultado_resta = total - anterior_paso2;
        double division_resta = resultado_resta/temperatura;
        double negativo = -1*division_resta;
        double matematica =  Math.pow(2.7, negativo);
        temperatura = temperatura*alfa;
        //System.out.println("random: "+random+"\n");
        //System.out.println("metropolis: "+matematica+"\n");
        if(matematica>random){
            System.out.println("se queda nuevo\n"); 
             a_n = 0;
            }else{
                if(matematica<random){
                a_n = 1;
                System.out.println("se queda anterior\n"); 
                }else{
                    if(matematica==random){
                        a_n = 0;    
                        System.out.println("se queda nuevo\n"); 
                    }
                }
            }   
            System.out.println("nueva temperatura:"+temperatura+"\n");
            /*
            en esta seccion se termina la operacion si la temperatura es menor a 0.45 
            y si ocurre un error (que no se termine la operacion por la temperatura)
            se oprime el boton 0 para terminar 
            */
            do{
                System.out.println("desea aplicar swap? presione 1 para aceptar o 0 para salir de la aplicación\n");
                System.out.println("Dato: puede terminar cuando la temperatura < 0.45, en caso de error presione 0 \n");
                Scanner leer = new Scanner(System.in);
                n1 = leer.nextInt();
                if(n1==1){
                 flag = 1;    
                 metodo_swap(comunas_2,flag,primera,temperatura,alfa,a_n,anterior);
               }else{
                   if(n1>0){
                        System.out.println("error selección\n");
                   }else{
                        if(temperatura < 0.45){
                            break;
                        }
                   }
                }
            }while(temperatura > 0.45 && n1!=0); //&& n1!=0
        }
    }

  
    


 
