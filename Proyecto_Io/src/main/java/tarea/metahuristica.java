package tarea;
import clase.comunas;
import java.util.ArrayList;
import java.util.List;

public class metahuristica {

    public static void main(String[] args) {
        
       List<comunas> com = new ArrayList<comunas>();
       
       comunas comunas_1 = new comunas();
       //comunas_1.cargarcomunasunidas().equals(setComunas_2(3));
      
       comunas_1.setId(3);
       comunas_1.setComunas(2);
       comunas_1.setComunas(4);
       comunas_1.setComunas(1);
       comunas_1.setCantidad(3);
       comunas_1.setValor(1200);
       com.add(comunas_1);


       comunas comunas_2 = new comunas();
       comunas_2.setId(5);
       comunas_2.setComunas(6);
       comunas_2.setComunas(7);
       comunas_2.setComunas(8);
       comunas_2.setCantidad(3);
       comunas_2.setValor(1500);
       com.add(comunas_2);
       //ejemploLista.get(1).add(comunas_2);
       
      // for (int i = 0; i <= ejemploLista.size() - 1; i++) {
        //    System.out.println(""+ejemploLista.get(0)+"");
        //}
       
    
       
       int valor = 0;
       int comp = 0; 
       int[] comprobar = {1,1,0,1,0,0,0,0};
       //System.out.println("tamaño "+com.size()+"\n"); 
       comp = 0;
       for(int i = 0;i<com.size();i++){
       //System.out.println("puesto: "+i+"\n");
       comp = 0;
       int[] array_comunas = com.get(i).obtener_comunas();     
       int z = 0; 
       do{     
           comp = comp+1; 
           comprobar_ID(com,comp,z,comprobar,array_comunas,valor,i);
           z++;
       }while(z < comprobar.length);
       }
       
        
    }

    private static void comprobar_ID(List<comunas> comunas, int comp,int z,int[]comprobar, int[] array_comunas,int valor,int i) {
        
        //System.out.println("posicion vector: "+z+" de la comuna: "+ comunas.get(i).getId() +"\n");
        //System.out.println("comp "+comp+" \n");
        if(comunas.get(i).getId() == comp && comprobar[z] == 0){
            comprobar[z] = 1;
            System.out.println("la posicion "+comp+" y es la comuna: "+comunas.get(i).getId()+"\n");
            System.out.println("la posicion "+z+"\n");
            //System.out.println("la posicion "+i+" es igual a "+comprobar[i]+"\n");
            System.out.println("empieza comprobar comunas\n");
            comprobar_comunas(comprobar,comunas,comp,i); 
        }else{
            if(comprobar[z] == 1 && comunas.get(i).getId() == comp){
              System.out.println("la comuna ya se encuentra tomada\n");
            }
            
        }
       
    }

    private static void comprobar_comunas(int[] comprobar, List<comunas> comunas, int comp,int i) {
       int id = comunas.get(i).getId();
       int valor = comunas.get(i).getValor();
       int [] comuna_2 = comunas.get(i).obtener_comunas(); 
       int total = comunas.get(i).getValor();
           
       System.out.println("tamaño comuna: "+comuna_2.length +" del id: "+id+"\n");
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
                     System.out.println("la posicion "+z+" es igual a "+comprobar[z]+"\n");
                     comp = 0;
                     break;
                    }else{
                        if(comuna == comp && comprobar[z] == 1){
                            cont = cont+1;
                            //System.out.println("contador de repetidos; "+cont+"\n"); 
                            comp = 0;
                            System.out.println("la comuna: "+comuna+" ya se encuentra tomada\n");
                            if(cont == id){
                            Borrar_1(id,comprobar);
                            }else{
                                if(z == comprobar.length){
                                    valor = valor + total;
                                    System.out.println("la comuna: "+id+" puede seleccionarse\n");
                                    System.out.println("el valor total de instalacion es: "+valor+"\n");
                                }
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
