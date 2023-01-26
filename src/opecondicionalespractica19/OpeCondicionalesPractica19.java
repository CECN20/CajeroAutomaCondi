/*
    Hacer un programa que simule un cajero automatico, con un saldo inicial
    de 1000 dolares con  el siguiente menu de operaciones:
    1.Ingresar dinero a la cuenta
    2.Retirar dinero de la cuenta 
    3. salir

 */
package opecondicionalespractica19;

import javax.swing.JOptionPane;

public class OpeCondicionalesPractica19 {


    public static void main(String[] args) {
        int opcion;
        final int saldoInicial= 1000;
        float ingreso, saldoActual, retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion:  \n"
                + "1.Ingresar Dinero\n"
                + "2.Retirar dinero de la cuenta\n"
                + "3. Salir\n"));
        
        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto a depositar"));
                    saldoActual = saldoInicial + ingreso;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es:"+ saldoActual);
                    break;
            case 2: retiro= Float.parseFloat(JOptionPane.showInputDialog("Ingrese monto a retira: "));
                    if (retiro > saldoInicial){
                    JOptionPane.showMessageDialog(null, "Usted no cuenta con el monto");
                    }
                    else{
                       saldoActual = saldoInicial-retiro;
                       JOptionPane.showMessageDialog(null, "Su saldo disponible es de"+saldoActual);
                    }
                    break;
            case 3: break;
            default: JOptionPane.showConfirmDialog(null,"su saldo es de:"+saldoInicial );
                    
                    
            
        }               
    }
    
}
