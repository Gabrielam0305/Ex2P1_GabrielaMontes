/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_gabrielamontes;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2P1_GabrielaMontes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiniStardewValley ();
        // TODO code application logic here
    }
    public static void MiniStardewValley (){
        Scanner entrada = new Scanner(System.in);
        
        boolean p=false;
        int dias=0;
        int coscant=0;
        System.out.println("Cual es su nombre: ");
        String nom=entrada.nextLine();
        System.out.println("Hola, bienvenido a su granja "+nom);
        ArrayList<Vaca> vaquita= new ArrayList<Vaca>();
        ArrayList<Conejo> conejito= new ArrayList<Conejo>();
        ArrayList<Vegetales> vegetalitos=new ArrayList<Vegetales>();
        Granja jugador=new Granja(nom,500,vaquita,conejito,vegetalitos);
        jugador.setNombre(nom);
        System.out.println("Que desea hacer? ");
        System.out.println("1. Plantar cosechas ");
        System.out.println("2. Cosechar las cosechas ");
        System.out.println("3. conseguir animales");
        System.out.println("4. Vender cosas");
        System.out.println("5. Dormir");
        System.out.println("6. Finalizar juego ");
        int op=entrada.nextInt();
        if ((op<1)||(op>6)){
            System.out.println("No valido");
        }else{
        while (op!=6){
           jugador.cosechamen(dias);
            switch(op){
                case 1:
                    System.out.println("Dia"+dias);
                    p= jugador.planta(dias);
                    System.out.println("Cuantos vegetales quiere cultivar");
                    coscant=entrada.nextInt();
                    if(p==true){
                      dias+=1;  
                    }
                    if (dias==5){
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }else if (dias==0){
                        System.out.println("No hay cosechas");
                    }else{
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    System.out.println("-----Fin del dia-----"); 
                    break;
                case 2:
                    System.out.println("se esta cosechando "+p);
                    System.out.println("Dia"+dias);
                    if (dias==5){
                         dias=jugador.plantar(coscant);
                         dias=0;
                         p=false;
                         
                    }else{
                        System.out.println("No se han cosechado ");
                    }
                    if(p==true){
                      dias+=1;  
                    }
                    if (dias==5){
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }else if (dias==0){
                        System.out.println("No hay cosechas");
                    }else{
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    System.out.println("-----Fin del dia-----"); 
                    break;
                case 3:
                    System.out.println("Dia"+dias);
                    System.out.println("se esta cosechando "+p);
                    compra(jugador);
                    if(p==true){
                      dias+=1;  
                    }
                    if (dias==5){
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }else if (dias==0){
                        System.out.println("No hay cosechas");
                    }else{
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    break;
                case 4:
                    System.out.println("Dia"+dias);
                    System.out.println("se esta cosechando "+p);
                    venta(jugador);
                    if(p==true){
                      dias+=1;  
                    }
                    if (dias==5){
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }else if (dias==0){
                        System.out.println("No hay cosechas");
                    }else{
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    break;
                case 5:
                    System.out.println("Dia"+dias);
                    System.out.println("se esta cosechando "+p);
                    System.out.println("A dormir");
                    
                    if (dias==5){
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }else if (dias==0){
                        System.out.println("No hay cosechas");
                    }else{
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    System.out.println("-----Fin del dia-----");
                    dias+=1;
                    break;
                    
            }
        
        //menu repeticion    
         System.out.println("Que desea hacer? ");
        System.out.println("1. Plantar cosechas ");
        System.out.println("2. Cosechar las cosechas ");
        System.out.println("3. conseguir animales");
        System.out.println("4. Vender cosas");
        System.out.println("5. Dormir");
        System.out.println("6. Finalizar juego ");
        op=entrada.nextInt();    
        }
        fin(nom);
        }
    }
    public static void fin(String nombreavatar){
        System.out.println(" En el principio Cthulu creo el mundo, y decidio vivir en los cielos");
        System.out.println("Sin embargo, uno de sus angeles, se rebelo en contra de Cthulu, y gano ");
        System.out.println("Por lo tanto, Cthulu fue desterrado y forzado a vivir en los oceanos viviendo de sacrificios humanos");
        System.out.println("Cuando "+nombreavatar+" decidio dejar la granja para vender pescados, fue secuestrado para servir como sacrificio");
        System.out.println("Al ser presentado a Cthulu, este decidio no comercelo por que era muy feo y olia mal");
        System.out.println("Entones sobrevivio, pero debido a los daños a su autoestima causados por no ser comido");
        System.out.println(nombreavatar+" desarollo una adiccion a League of Legends, y murio de depravacion social. :)");
    }
    public static void compra (Granja jugador){
        Scanner entrada = new Scanner(System.in);
        int din=jugador.getDinero();
        System.out.println("Cantidad de dinero "+din);
        System.out.println("Que animales desea?");
        System.out.println("1. conejos-> 150 monets");
        System.out.println("2. Vacas-> 350 monets");
        int eleccion=entrada.nextInt();
        if (eleccion>2){
            System.out.println("No valido");
        }else{
        switch(eleccion){
            case 1:
                System.out.println("Cuantos va a desear");
                int cant=entrada.nextInt();
                int nec=(cant*150);
                if (nec<=din){
                    for (int i = 0; i < cant; i++) {
                        jugador.comprarconejos();
                    }
                        din-=nec;
                        jugador.setDinero(din);
                        System.out.println("Tu nueva cantidad de dinero es "+din);

                }else{
                    System.out.println("Es muy pobre para comprar tantos");
                }
                break;
                
            case 2:
                System.out.println("Cuantas va a desear");
                int can=entrada.nextInt();
                
               int nece=(can*350);
                if (nece<=din){
                    for (int i = 0; i < can; i++) {
                        jugador.comprarvacas();
                    }
                        din-=nece;
                        System.out.println("Tu nueva cantidad de dinero es "+din);
                        jugador.setDinero(din);
                }else{
                    System.out.println("Es muy pobre para comprar tantos");
                }
                break;
        }
        }
        System.out.println("-----Fin del dia-----");
    }
    
    public static void venta(Granja jugador){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Que desea vender ");
        jugador.printgranja();
        System.out.println("Selecciona ");
        System.out.println("1. Vegetales");
        System.out.println("2. Conejos");
        System.out.println("3. Vacas");
        int ven=entrada.nextInt();
        int din=jugador.getDinero();
        if (ven>3){
            System.out.println("No Valido");
        }else{
        switch(ven){
            case 1:
                 System.out.println("Cuantas quiere vender");
                 int cantid=entrada.nextInt();
                 jugador.vendervegetales(cantid);
                break;
            case 2:
                int cantidad=jugador.cconejo();
                System.out.println("La cantidad de conejos es: "+cantidad);
                System.out.println("Y sus nombres son: ");
                jugador.imconjeos();
            System.out.println("Cuantas quiere vender");
            int can=entrada.nextInt();
            jugador.venderconejos(can);
                
                
                break;
            case 3:
                int canti=jugador.cvacas();
                System.out.println("La cantidad de conejos es: "+canti);
                System.out.println("Y sus nombres son: ");
                jugador.imvacas();
                System.out.println("Cuantas quiere vender");
                int cant=entrada.nextInt();
                jugador.vendervacas(cant);
                break;
                
        }
        }
        System.out.println("-----Fin del dia-----"); 

    }
    


}