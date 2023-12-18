package banco;

import banco.models.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n====EXTRATO DA CONTA CORRENTE======\n");
        super.imprimirExtrato();
    }
    @Override
    public void sacar(double valor) {
        System.out.println("\n====SAQUE CONTA CORRENTE======\n");
        super.sacar(valor);
    }
    public void depositar(double valor) {
        System.out.println("\n====DEPOSITO CONTA CORRENTE======\n");
        super.depositar(valor);
    }
    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        System.out.println("\n---------------TRASFENRINDO PARA CONTA POUPANCA---------------\n");
        super.trasnferir(valor, contaDestino);
    }
}
