public class ContaPoupanca extends Conta {

    public ContaPoupanca() {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("======= EXTRATO CONTA POUPANÇA =======");
        imprimirInfoComum();
    }
}
