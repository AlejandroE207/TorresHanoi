/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class TorresHanoi {

    public static void main(String[] args) {
        int bloq = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de bloques: "));
        
        JOptionPane.showMessageDialog(null, "Solucion de torres hanoi: "+torresHanoi(bloq, 'A','C','B'));
        
        
        
    }
    
    static int mov=0;
    public static String torresHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde el poste " + origen + " al poste " + destino);
            mov++;
        }
        else{
        torresHanoi(n - 1, origen, auxiliar, destino);
        
        System.out.println("Mover disco " + n + " desde el poste " + origen + " al poste " + destino);
        
        torresHanoi(n - 1, auxiliar, destino, origen);
        mov++;
        }
        return "Total movimientos: "+mov;
    }
    
}
