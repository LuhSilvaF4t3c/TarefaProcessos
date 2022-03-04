package view;

import javax.swing.JOptionPane;

import controller.RedesControllerJava;

public class principal {
    public static void main(String[] args) {
       RedesControllerJava controllerJava = new RedesControllerJava();
        int selecao = 0;
        do {
            selecao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Adaptadores\n"+ "2 - Média\n"));
            switch(selecao) {
                case 1:
                    controllerJava.ip();break;
                case 2:
                    controllerJava.ping();break;
               
            }
        } while(selecao != 2);
    }
}
