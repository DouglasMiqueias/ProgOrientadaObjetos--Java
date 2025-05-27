package prjclassesabstratas.Classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirTexto() {
        System.out.println("### Extrato da Conta ###");

        // Corrigido o padrão da data e o import
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Data: " + d.format(date));
    }
}
