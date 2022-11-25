package tarea;
import clase.comunas;

public class metahuristica {

    public static void main(String[] args) {
        
       comunas comunas = new comunas();
       comunas.setId(3);
       comunas.setComunas(2);
       comunas.setComunas(4);
       comunas.setComunas(1);
       comunas.setCantidad(3);
       comunas.setValor(1200);
       
       int[] array_comunas = comunas.obtener_comunas();
       int valor = 0;
       int comp = 0; 
       int[] comprobar = {0,0,0,0};
       
       for(int i = 0;i<comprobar.length;i++){
       comp = i+1;
       comprobar_ID(comunas,comp,i,comprobar,array_comunas,valor); 
       }
       
        
    }

    private static void comprobar_ID(comunas comunas, int comp,int i,int[]comprobar, int[] array_comunas,int valor) {
        if(comunas.getId()== comp && comprobar[i] == 0){
            comprobar[i] = 1;
             System.out.println("la posicion "+i+" y es la comuna: "+comunas.getId()+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,comunas,comp,array_comunas); 
            int total = comunas.getValor();
             valor = valor + total;
             System.out.println("la comuna: "+comunas.getId()+" puede seleccionarse\n");
             System.out.println("el valor total de instalacion es: "+valor+"\n");
        }else{
            if(comprobar[i] == 1 && comunas.getId() == comp){
              System.out.println("la comuna ya se encuentra tomada\n");
            }
        }
    
    }

    private static void comprobar_comunas(int[] comprobar, comunas comunas, int comp,int[] array_comunas) {
       int id = comunas.getId();
       int posicion_comuna = 0;
       int cont = 0;
       
        for(int j = 0; j < comprobar.length;j++){ 
               comp = j+1;
               int z = 0;
             //for(int z = 0; z<= array_comunas.length;j++){ 
                do{
                int comuna = array_comunas[z];
                if(comuna == comp && comprobar[j] == 0){
                 comprobar[j] = 1;
                 comp = comp+1;
                 //posicion_comuna = posicion_comuna+1;
                 System.out.println("la posicion "+j+" es igual a "+comprobar[j]+"\n");
                    }else{
                        if(comprobar[id-1] == 1){
                            }else{
                                if(comuna == comp && comprobar[j] == 1){
                                System.out.println("la comuna: "+comuna+" ya se encuentra tomada\n");
                                cont = cont+1;
                                //System.out.println("comunas tomadas es igual a:"+cont+"\n"); 
                                comp = comp+1;
                                posicion_comuna = posicion_comuna+1;
                                    if(cont == comunas.getCantidad()){
                                        Borrar_1(id,comprobar);
                                    }
                                }
                            }
                    }
                z++;
                }while(z < array_comunas.length );
                
               
            //} 
       }
      
    }

    private static void Borrar_1(int id, int[] comprobar) {
        for(int j = 0; j<comprobar.length;j++){
            if(comprobar[id-1] == 1){
                comprobar[id-1] = 0;
                System.out.println("La comuna: "+id+" No puede tomarse porque sus comunas cercanas ya fueron tomadas\n"); 
                System.out.println("por lo que el valor del array de la comuna: "+id+" es:"+comprobar[id-1]+"\n");     
            }
        }
    }

 
        
}




    /*int[] comunas_1 = {1,2,3};
        int[] comunas_2 = {4,5,6};
        int[] comprobar = {0,1,0,0,0,0};
        int cont = 1;
        int i = 0;
        int j = 0;
        comprobar(comprobar,comunas_1,i,cont,comunas_2,j);
        */

   /* private static void comprobar(int[] comprobar,int[] comunas_1, int i,int cont,int[] comunas_2,int j) {
       
      
        int ID = comunas_1[0];
        int i_2 = 1;
        for(i = 0 ;i<=2;i++){
            if(comunas_1[i]== i_2){
                if(comprobar[i] == 0){
                comprobar[i] = 1;
                cont = cont*comprobar[i];
                System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
                 i_2++; 
                }else{
                  comprobar[i] = 0;
                  cont = cont*comprobar[i];
                  System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
                  i_2++; 
                }
            }
        }
        comprobar2(comunas_2,cont,j,i,comprobar);
        System.out.println("El resultado obtenido de las comunas es de: "+cont+" \n");
    }     

    private static void comprobar2(int[] comunas_2, int cont, int j,int i,int[] comprobar) {
        int i_3 = i;
        i_3++;
        for(j = 0 ;j<=2;j++){
            if(comunas_2[j] == i_3){
                if(comprobar[i] == 0){
                     comprobar[i] = 1;
                     cont = cont*comprobar[j];
                     System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n"); 
                     i_3++;
                     i++;
                }
            } 
        }
    }
    
}*/
