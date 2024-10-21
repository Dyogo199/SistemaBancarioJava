public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("======= EXTRATO CONTA CORRENTE =======");
        imprimirInfoComum();
    }
}