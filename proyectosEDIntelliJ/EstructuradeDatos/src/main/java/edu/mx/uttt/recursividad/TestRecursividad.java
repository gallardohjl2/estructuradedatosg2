package edu.mx.uttt.recursividad;

import javax.swing.*;

public class TestRecursividad {
    public static void main(String[] args) {
        ejecutar();
    }

    public static String menu(){
         String menu= "Menu Principal\n" +
                 "1)Método Iterativo\n" +
                 "2)Método Recursivo\n" +
                 "3)Factorial Iterativo\n" +
                 "4)Factorial Recursivo\n" +
                 "5)Salir\n" +
                 "Elige la Opción";
         return JOptionPane.showInputDialog(menu);
    }
    public static void ejecutar() {
        boolean sentinel = true;
        String opcion = "";
        Operaciones op = new Operaciones();
        Factorial f = null;
        long r = 0;
        int n = 0;

        do {
            opcion = menu();

            switch (opcion) {
                case "1":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.setN(n);
                    op.imprimir();
                    break;
                case "2":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de veces a imprimir"));
                    op.setN(n);
                    op.imprimir(op.getN());
                    break;
                case "3":
                    //Factorial
                    opcion = JOptionPane.
                            showInputDialog(Menus.menuFactorial());
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog
                            ("Introduce el valor del factorial a calcular"));
                    f.setN(n);
                    r = f.factorialI(opcion);
                    JOptionPane.showMessageDialog
                            (null,"f( " + f.getN() + ")=  " + r);
                    break;
                case "4":
                    f = new Factorial();
                    n = Integer.parseInt(JOptionPane.showInputDialog
                            ("Introduce el valor del factorial a calcular"));
                    f.setN(n);
                    r = f.factR(f.getN());
                    JOptionPane.showMessageDialog
                            (null,"f( " + f.getN() + ")=  " + r);
                    break;
                case "5": //Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "I'll be back");
                    break;
                default:
                    JOptionPane.showMessageDialog(
                            null, "Valor no Valido");
            } // Cierra el switch
        }while (sentinel); //Cierra el do-while

        } //Cierra el método
}
