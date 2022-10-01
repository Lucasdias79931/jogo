/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package jogo;
import javax.swing.JOptionPane;
/**
 *
 * @author aluno
 */
public class jogar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        boolean confirme=false;
       
        jogo start =new jogo();
        
        
        do{
            start.setVisible(true);
            if(start.jogo==0){
                confirme=true;
            }else{
                System.exit(0);
            }
           
            
        }while(confirme==true);
    }
}
