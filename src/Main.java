public class Main {
    public static void main(String[] args) {
        Cliente sofredor = new Cliente();
        sofredor.setNome("Sofredor");

        Conta cc = new ContaCorrente(sofredor);
        Conta cp = new ContaPoupanca(sofredor);
        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
