package banco;

import banco.models.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    @Test
    public void validarTransferencia() {
        // Crie as instâncias de Cliente e Conta
        Cliente um = new Cliente("jean", 322);
        Cliente dois = new Cliente("junior", 321);
        Conta cp = new ContaPoupanca(um);
        Conta cc = new ContaCorrente(dois);

        // Suponhamos que o saldo inicial da conta cp seja 200.
        // Tentar transferir 300 da conta cp para cc resultará em uma exceção.
        cp.depositar(200);  // Supondo que você tenha um método depositar para adicionar saldo à conta.

        // Agora, tente transferir 300 da conta cp para cc.
        // Espera-se que uma IllegalArgumentException seja lançada.
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cp.trasnferir(300, cc);  // Corrigindo o erro de digitação no método
        });
    }


}