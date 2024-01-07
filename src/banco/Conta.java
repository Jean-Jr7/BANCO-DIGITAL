package banco;

import banco.models.Cliente;

public abstract class Conta implements iConta {
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    private double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    @Override
    public void imprimirExtrato() {
        System.out.format("Titular: %s", this.cliente.getNome());
        System.out.format("\nCPF: %s", this.cliente.getCpf());
        System.out.format("\nAgencia: %d" , this.agencia);
        System.out.format("\nNumero da conta %d", this.numero);
        System.out.format("\nSaldo da conta: %.2f",this.saldo);
        System.out.println("");

    }
    public void sacar(double valor) {
        if (VerificarSaldo(valor)) {
            this.saldo -= valor;
            System.out.format("Você sacou: R$%.2f\n", valor);
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
        System.out.format("Seu saldo atual: R$%.2f\n", this.saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.format("Voce depositou: %.2f",valor);
        saldo+= valor;
        System.out.format("\nSeu saldo: %.2f:", this.saldo);
        System.out.println("");
    }
    //Pega quem chama a transferencia e saca o saldo(valor) e transfere(deposita) para a conta desitino
    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        if (VerificarSaldo(valor)) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência concluída com sucesso");
        } else {
            throw new IllegalArgumentException ("O valor de transferencia deve ser maior que o saldo");
        }
    }
    protected boolean VerificarSaldo(double valor){
        return this.saldo >= valor;
    }
}
