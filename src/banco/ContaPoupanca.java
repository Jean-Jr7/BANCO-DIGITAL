package banco;

import banco.models.Cliente;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("\n====EXTRATO DA CONTA POUPANCA======\n");
        super.imprimirExtrato();
    }
    public void sacar(double valor) {
        System.out.println("\n====SAQUE CONTA POUPANCA======\n");
        super.sacar(valor + 2);

    }
    @Override
    public void depositar(double valor) {
        System.out.println("\n====DEPOSITO CONTA POUPANCA======\n");
        super.depositar(valor);
    }
    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        System.out.println("\n---------------TRASFENRINDO PARA CONTA CORRENTE---------------\n");
        super.trasnferir(valor, contaDestino);
    }
}
