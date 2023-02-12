package Estudo;

import java.util.Date;


public class Computador {
    Date date = new Date();
 
        
    //Atributos
    
    String processador = "";
    String placagrafica = "";
    String placamae="";
    int armazenamento = 0;
    int memoria = 0;
    boolean estado = false;
    String navegador="";
    
    //Contrutor 
        public void Computador (String pro,  String grafica, String mae, int arma, int memo){
      
            processador=pro;
            placagrafica=grafica;
            placamae=mae;
            armazenamento=arma;
            memoria=memo;
    }
    
    //configuração
        public void configuração (){
            System.out.println("\n\n---STATUS---\n");
            System.out.println("Processador: " + processador);
            System.out.println("Placa de video: "+ placagrafica);
            System.out.println("Placa mãe:"+ placamae);
            System.out.println("Armazenamento:"+ armazenamento+" GB");
            System.out.println("Memoria:"+ memoria+ " RAM\n");
        }
    
    
    
    //METODO
        
        //ligado
            public void ligar(){
                if(estado==true){
                    System.out.println("O computador já está ligado");
                }else{
                    estado=true;
                    System.out.println("Ligando pc...");
                }
            }
    
    
            
        //desliago
            public void desligar(){
                if(estado==false){
                    System.out.println("O computador já está desligado");
                }else{
                    estado=false;
                    System.out.println("desligando pc...");
                }
            }
    
            
        //Abrir navegador 
            public void navegador(String browser){
                
        navegador=browser;
                System.out.println("Iniciando "+navegador);
            }
            
        
        //Data e hora    
            public void hora (){
                System.out.println("\n\n"+date+"\n\n");
            }      
}
