package clase;

import java.util.ArrayList;
//en este apartado es donde se guardan las comunas conectadas con las comunas principales (ejemplo comuna 2 contiene (4,5,6))
public class comunas_unidas {
    //aqui se guardan las comunas para comrpobar mas adelante en el programa
    private int[] comuna_2 = {4,5,28};
    private int[] comuna_3 = {5,28,27};
    private int[] comuna_4 = {2,5,28,26,25};
    private int[] comuna_5 = {2,3,4,28,29};
    private int[] comuna_6 = {7,9,15,24,27,28};
    private int[] comuna_7 = {6,8,4,10,15};
    private int[] comuna_8 = {7,10};
    private int[] comuna_9 = {7,6};
    private int[] comuna_10 = {7,8,15,10,33};
    private int[] comuna_11 = {12,13,16,17,25,24};
    private int[] comuna_12 = {11,13,15,17};
    private int[] comuna_13 = {11,13,15,17};
    private int[] comuna_14 = {16,17,30,31,37,38};
    private int[] comuna_15 = {6,7,10,11,12,13,24,33};
    private int[] comuna_16 = {11,14,17,30};
    private int[] comuna_17 = {11,12,19,14,16};
    private int[] comuna_18 = {34,20};
    private int[] comuna_19 = {21,22,34};
    private int[] comuna_20 = {21,18,34};
    private int[] comuna_21 = {19,20,21,34};
    private int[] comuna_22 = {19,23};
    private int[] comuna_23 = {22};
    private int[] comuna_24 = {6,11,15,25,26,27,28};
    private int[] comuna_25 = {4,11,24,26};
    private int[] comuna_26 = {4,25,24,28};
    private int[] comuna_27 = {3,6,24,28,29};
    private int[] comuna_28 = {2,4,5,6,24,26,27,29};
    private int[] comuna_29 = {3,5,27,28};
    private int[] comuna_30 = {14,16,31,34,36,37,38};
    private int[] comuna_31 = {14,17,3,35,38};
    //private int[] comuna_32 = {1};
    private int[] comuna_33 = {10,13,15,17,35};
    private int[] comuna_34 = {18,19,20,21,30,36};
    private int[] comuna_35 = {17,31,33};
    private int[] comuna_36 = {30,34,38};
    private int[] comuna_37 = {14,30,37};
    private int[] comuna_38 = {31,14,30,36};
        
    //aqui se genera el constructor de la clase comunas_unidas 
    public comunas_unidas() {
    this.comuna_2 = comuna_2;
    this.comuna_3 = comuna_3;
    this.comuna_4 = comuna_4;
    this.comuna_5 = comuna_5;
    this.comuna_6 = comuna_6;
    this.comuna_7 = comuna_7;
    this.comuna_8 = comuna_8;
    this.comuna_9 = comuna_9;
    this.comuna_10 = comuna_10;
    this.comuna_11 = comuna_11;
    this.comuna_12 = comuna_12;
    this.comuna_13 = comuna_13;
    this.comuna_14 = comuna_14;
    this.comuna_15 = comuna_15;
    this.comuna_16 = comuna_16;
    this.comuna_17 = comuna_17;
    this.comuna_18 = comuna_18;
    this.comuna_19 = comuna_19;
    this.comuna_20 = comuna_20;
    this.comuna_21 = comuna_21;
    this.comuna_22 = comuna_22;
    this.comuna_23 = comuna_23;
    this.comuna_24 = comuna_24;
    this.comuna_25 = comuna_25;
    this.comuna_26 = comuna_26;
    this.comuna_27 = comuna_27;
    this.comuna_28 = comuna_28;
    this.comuna_29 = comuna_29;
    this.comuna_30 = comuna_30;
    this.comuna_31 = comuna_31;
    //this.comuna_32 = comuna_32;
    this.comuna_33 = comuna_33;
    this.comuna_34 = comuna_34;
    this.comuna_35 = comuna_35;
    this.comuna_36 = comuna_36;
    this.comuna_37 = comuna_37;
    this.comuna_38 = comuna_38;
    }

   //en este apartado se obtienen las comunas (get), el insert no se utiliza.
    public int[] getComuna_2() {
        return comuna_2;
    }

    public void setComuna_2(int[] comuna_2) {
        this.comuna_2 = comuna_2;
    }

    public int[] getComuna_3() {
        return comuna_3;
    }

    public void setComuna_3(int[] comuna_3) {
        this.comuna_3 = comuna_3;
    }

    public int[] getComuna_4() {
        return comuna_4;
    }

    public void setComuna_4(int[] comuna_4) {
        this.comuna_4 = comuna_4;
    }

    public int[] getComuna_5() {
        return comuna_5;
    }

    public void setComuna_5(int[] comuna_5) {
        this.comuna_5 = comuna_5;
    }

    public int[] getComuna_6() {
        return comuna_6;
    }

    public void setComuna_6(int[] comuna_6) {
        this.comuna_6 = comuna_6;
    }

    public int[] getComuna_7() {
        return comuna_7;
    }

    public void setComuna_7(int[] comuna_7) {
        this.comuna_7 = comuna_7;
    }

    public int[] getComuna_8() {
        return comuna_8;
    }

    public void setComuna_8(int[] comuna_8) {
        this.comuna_8 = comuna_8;
    }

    public int[] getComuna_9() {
        return comuna_9;
    }

    public void setComuna_9(int[] comuna_9) {
        this.comuna_9 = comuna_9;
    }

    public int[] getComuna_10() {
        return comuna_10;
    }

    public void setComuna_10(int[] comuna_10) {
        this.comuna_10 = comuna_10;
    }

    public int[] getComuna_11() {
        return comuna_11;
    }

    public void setComuna_11(int[] comuna_11) {
        this.comuna_11 = comuna_11;
    }

    public int[] getComuna_12() {
        return comuna_12;
    }

    public void setComuna_12(int[] comuna_12) {
        this.comuna_12 = comuna_12;
    }

    public int[] getComuna_13() {
        return comuna_13;
    }

    public void setComuna_13(int[] comuna_13) {
        this.comuna_13 = comuna_13;
    }

    public int[] getComuna_14() {
        return comuna_14;
    }

    public void setComuna_14(int[] comuna_14) {
        this.comuna_14 = comuna_14;
    }

    public int[] getComuna_15() {
        return comuna_15;
    }

    public void setComuna_15(int[] comuna_15) {
        this.comuna_15 = comuna_15;
    }

    public int[] getComuna_16() {
        return comuna_16;
    }

    public void setComuna_16(int[] comuna_16) {
        this.comuna_16 = comuna_16;
    }

    public int[] getComuna_17() {
        return comuna_17;
    }

    public void setComuna_17(int[] comuna_17) {
        this.comuna_17 = comuna_17;
    }

    public int[] getComuna_18() {
        return comuna_18;
    }

    public void setComuna_18(int[] comuna_18) {
        this.comuna_18 = comuna_18;
    }

    public int[] getComuna_19() {
        return comuna_19;
    }

    public void setComuna_19(int[] comuna_19) {
        this.comuna_19 = comuna_19;
    }

    public int[] getComuna_20() {
        return comuna_20;
    }

    public void setComuna_20(int[] comuna_20) {
        this.comuna_20 = comuna_20;
    }

    public int[] getComuna_21() {
        return comuna_21;
    }

    public void setComuna_21(int[] comuna_21) {
        this.comuna_21 = comuna_21;
    }

    public int[] getComuna_22() {
        return comuna_22;
    }

    public void setComuna_22(int[] comuna_22) {
        this.comuna_22 = comuna_22;
    }

    public int[] getComuna_23() {
        return comuna_23;
    }

    public void setComuna_23(int[] comuna_23) {
        this.comuna_23 = comuna_23;
    }

    public int[] getComuna_24() {
        return comuna_24;
    }

    public void setComuna_24(int[] comuna_24) {
        this.comuna_24 = comuna_24;
    }

    public int[] getComuna_25() {
        return comuna_25;
    }

    public void setComuna_25(int[] comuna_25) {
        this.comuna_25 = comuna_25;
    }

    public int[] getComuna_26() {
        return comuna_26;
    }

    public void setComuna_26(int[] comuna_26) {
        this.comuna_26 = comuna_26;
    }

    public int[] getComuna_27() {
        return comuna_27;
    }

    public void setComuna_27(int[] comuna_27) {
        this.comuna_27 = comuna_27;
    }

    public int[] getComuna_28() {
        return comuna_28;
    }

    public void setComuna_28(int[] comuna_28) {
        this.comuna_28 = comuna_28;
    }

    public int[] getComuna_29() {
        return comuna_29;
    }

    public void setComuna_29(int[] comuna_29) {
        this.comuna_29 = comuna_29;
    }

    public int[] getComuna_30() {
        return comuna_30;
    }

    public void setComuna_30(int[] comuna_30) {
        this.comuna_30 = comuna_30;
    }

    public int[] getComuna_31() {
        return comuna_31;
    }

    public void setComuna_31(int[] comuna_31) {
        this.comuna_31 = comuna_31;
    }

   // public int[] getComuna_32() {
      //  return comuna_32;
   // }

    //public void setComuna_32(int[] comuna_32) {
     //   this.comuna_32 = comuna_32;
   // }

    public int[] getComuna_33() {
        return comuna_33;
    }

    public void setComuna_33(int[] comuna_33) {
        this.comuna_33 = comuna_33;
    }

    public int[] getComuna_34() {
        return comuna_34;
    }

    public void setComuna_34(int[] comuna_34) {
        this.comuna_34 = comuna_34;
    }

    public int[] getComuna_35() {
        return comuna_35;
    }

    public void setComuna_35(int[] comuna_35) {
        this.comuna_35 = comuna_35;
    }

    public int[] getComuna_36() {
        return comuna_36;
    }

    public void setComuna_36(int[] comuna_36) {
        this.comuna_36 = comuna_36;
    }

    public int[] getComuna_37() {
        return comuna_37;
    }

    public void setComuna_37(int[] comuna_37) {
        this.comuna_37 = comuna_37;
    }

    public int[] getComuna_38() {
        return comuna_38;
    }

    public void setComuna_38(int[] comuna_38) {
        this.comuna_38 = comuna_38;
    }
    
       
    
    
  

  
    
    
    
   
}
