/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_gabrielamontes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriela Montes
 */
public class Granja {
    public String nombre;
    ArrayList<Vaca> vaca;
    ArrayList<Conejo> conejo;
    ArrayList<Vegetales> vegetales;
    public int dinero;

    public Granja(String nombre, int dinero, ArrayList<Vaca> vaquita, ArrayList<Conejo> conejito, ArrayList<Vegetales> vegetalitos) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.vaca = new ArrayList<Vaca>();
        this.conejo= new ArrayList<Conejo>();
        this.vegetales=new ArrayList<Vegetales>();
    }

    public Granja() {
    }

    
    public boolean planta(int dia){
    boolean plantar;
if(dia==0){
   plantar=true;
    System.out.println("PLANTANDO COSECHAS");
    System.out.println("Las cosechas tardan 5 dias en estar listas");
   return plantar;
}else{
    System.out.println("No se puede plantar si no esta lista la tanda anterior");
    plantar=false; 
    return plantar;
}
}
         public int plantar (int cant){
                  for (int i = 0; i < cant; i++) {
                     Vegetales el=new Vegetales(100);
                     this.vegetales.add(el);
                      
                  }
                  
                  int dia=0;
                  return dia;
             } 
                 
                 
    
         
public void cosechamen (int dia){

            if (dia==0){
                 System.out.println("No ha  plantado");
             }else{
                 int f=5-dia;
                 System.out.println("Faltan "+f+" dias para que esten listas las cosechas");
             }
    }

    public int cvegetales(){
    int vegsize=this.vegetales.size();
    return vegsize;
}

    public int cvacas(){
    int vacsize=this.vaca.size();
    return vacsize;
}

  
    public int cconejo(){
    int consize=this.conejo.size();
    return consize;
}
        public void venderconejos (int vender){
            int con=cconejo();
            System.out.println(con);
            if (con==0){
                System.out.println("No tiene conejos para vender");
            }else if (con>=vender) {
                for (int i = 0; i < vender; i++) {
                Conejo el=conejo.get(0);
                System.out.println("BYE BYE "+el.getNombre());
                conejo.remove(0);
                   
            }
                 System.out.println("Se han vendido "+vender+" conejos");
                int gan=(vender*170);
                this.dinero+=gan;
                System.out.println("La nueva cantidad de dinero es "+this.dinero);
            }else{
                System.out.println("NO TIENE SUFICIENTES PARA VENDER");
            }
            
    }
          public void vendervegetales (int vender){
            int vegi=cvegetales();
              System.out.println("vegi "+vegi);
            if (vegi==0){
                System.out.println("No tiene vegetales para vender");
            }else if (vegi>=vender) {
                for (int i = 0; i < vender; i++) {
                Vegetales el=vegetales.get(0);
                vegetales.remove(0);
            }
                System.out.println("Se vendieron "+vender+" vegetales");
                int gan=(vender*100);
                this.dinero+=gan;
                System.out.println("La nueva cantidad de dinero es "+this.dinero);
            }else{
                System.out.println("NO TIENE SUFICIENTES PARA VENDER");
            }
            
    }
        public void vendervacas (int vender){
            int vac=cvacas();
            if (vac==0){
                System.out.println("No tiene vacas para vender");
            }else if (vac>=vender) {
                for (int i = 0; i < vender; i++) {
                Vaca el=vaca.get(0);
                System.out.println("BYE BYE "+el.getNombre());
                vaca.remove(0);
                
            } 
                System.out.println("Se han vendido "+vender+" vacas");
                int gan=(vender*400);
                this.dinero+=gan;
                System.out.println("La nueva cantidad de dinero es "+this.dinero);
            }else{
                System.out.println("NO TIENE SUFICIENTES PARA VENDER");
            }
    }        
        
        public void comprarconejos (){
        Scanner entrada = new Scanner(System.in);
            System.out.println("Los conejos han sido comprados");
        System.out.println("Ingrese el nombre del nuevo conejo");
        String nom=entrada.nextLine();
        Conejo el=new Conejo(nom,170,150);
        this.conejo.add(el);
            System.out.println(nom+" ha sido enviadp a la granja!");
    }
        public void comprarvacas (){
        Scanner entrada = new Scanner(System.in);
            System.out.println("Las vacas han sido compradas");
        System.out.println("Ingrese el nombre de la nueva vaca ");
        String nom=entrada.nextLine();
        Vaca el=new Vaca(nom,400,350);
        this.vaca.add(el);
        System.out.println(nom+" ha sido enviadp a la granja!");
    }
        public void imconjeos (){
            int con=cconejo();
            System.out.println("la cantidad de conejos es: "+con);
            System.out.println("Y sus nombres son: ");
              Scanner entrada = new Scanner(System.in);
            for (int i = 0; i <this.conejo.size(); i++) {
                Conejo el=conejo.get(i);
                System.out.println(el.getNombre());
            }
    }   
        
            public void imvacas (){
            int vac=cvacas();
            System.out.println("la cantidad de vacas es: "+vac);
            System.out.println("Y sus nombres son: ");
              Scanner entrada = new Scanner(System.in);
            for (int i = 0; i <this.vaca.size(); i++) {
                Vaca el=vaca.get(i);
                System.out.println(el.getNombre());
            }
    }  
    
     public void printgranja () {
        int vegi=cvegetales();
        int vac=cvacas();
        int con=cconejo();
        int mon= this.dinero;
         System.out.println("-----Analisis de granja-----");
        System.out.println("Tiene " +vegi+ " vegetales");
        System.out.println("Tiene "+vac+ " vacas");
        System.out.println("Tiene "+con+ " conejos");
        System.out.println("Tienes "+mon+ " dinero");
         System.out.println("----------------------------");
     }
     
       public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }


    public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }



 
    
    
   
    
}
