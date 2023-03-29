package ConversorMoedas;

import javax.swing.*;

import controller.ConversorController;

public class MenuPrincipal {
    public static void main(String[] args) {
        int count = -1;
        do {
            String[] opcoes = {"Conversor de Moeda"};
            String entrada = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            System.out.println("Escolha: " + entrada);

            if (entrada == null) {
                return;
            }

            if (entrada == opcoes[0]) {
                String valor = JOptionPane.showInputDialog(null, "Insira um valor");
                Double valorConvertido = ConversorController.convert(Double.parseDouble(valor));
                JOptionPane.showMessageDialog(null, "Você tem $ " + String.format("%.2f", valorConvertido));
                count = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                finish(count);
            } else {
                String valor = JOptionPane.showInputDialog(null, "Insira um valor");
            }

        } while (count == 0);
    }

    public static void finish(int resposta) {
        if (JOptionPane.OK_OPTION == resposta) {
            System.out.println("Escolha opção afirmativa");
        } else {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        }
    }

}


