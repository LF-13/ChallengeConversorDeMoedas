package controller;

import javax.swing.JOptionPane;

public class ConversorController {
    public static double convert(double valor) {
        Double valorConvertido = 0.00;

        String[] cotacoes = {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes",
                "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Yenes a Reais", "De Won Coreano a Reais"};
        String cotacao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Opções",
                JOptionPane.QUESTION_MESSAGE, null, cotacoes, cotacoes[0]);

        switch (cotacao) {
            case "De Reais a Dólares":
                valorConvertido = valor / 5.17;
                break;
            case "De Reais a Euros":
                valorConvertido = valor / 5.19;
                break;
            case "De Reais a Libras":
                valorConvertido = valor / 6.00;
                break;
            case "De Reais a Yenes":
                valorConvertido = valor * 25.00;
                break;
            case "De Reais a Won Coreano":
                valorConvertido = valor * 0.004;
                break;
            case "De Dólares a Reais":
                valorConvertido = valor * 5.17;
                break;
            case "De Euros a Reais":
                valorConvertido = valor * 5.19;
                break;
            case "De Libras a Reais":
                valorConvertido = valor * 6.00;
                break;
            case "De Yenes a Reais":
                valorConvertido = valor / 25.00;
                break;
            case "De Won Coreano a Reais":
                valorConvertido = valor / 0.004;
                break;
        }
        return valorConvertido;
    }

}


