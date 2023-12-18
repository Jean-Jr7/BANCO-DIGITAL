import banco.models.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente jeanj = new Cliente();
        Cliente junior = new Cliente();
        jeanj.setNome("jean ");
        jeanj.setCpf(2313);
        junior.setNome("junior de souza");
        junior.setCpf(23213);
        Conta cp = new ContaPoupanca(jeanj);
        Conta cc = new ContaCorrente(junior);

        cp.imprimirExtrato();
        cp.depositar(200);
        cp.sacar(100);
        cp.trasnferir(300,cc);
        cp.imprimirExtrato();

        System.out.println("----------------------------------------------------------------------");

        cc.imprimirExtrato();
        cc.depositar(20);
        cc.sacar(5);
        cc.trasnferir(55,cp);
        cc.imprimirExtrato();
    }
}