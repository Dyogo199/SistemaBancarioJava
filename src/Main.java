//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Conta cc = new ContaCorrente();

       Conta pp = new ContaPoupanca();
       pp.depositar(150);
        cc.depositar(1000);
        pp.imprimirExtrato();
        cc.imprimirExtrato();

        }
    }
