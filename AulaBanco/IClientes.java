public class Poupanca extends Conta implements IContas, ICliente {
 
    // trouxe os metodos de IContas
    @Override
    public double saldo() {
        return this.getSaldo();
        // stub é algo temporário
    }
 
    @Override
    public double depositar(double valor) {
        return valor;
    }
 
    @Override
    public double sacar(double valor) {
        return valor;
    }
 
    @Override
    public void abrirConta() {
        Corrente corr = new Corrente();
        corr.setNumbank(getNumbank());
        corr.setNumero(getNumero());
        corr.getSaldo();
 
        this.setNumbank(1);
        this.setNumero(10.114);
 
        // Dados cliente
        System.out.println("Sua banco é: " + this.getNumbank() +
                "\n Sua conta corrente é: " + corr.getNumero() +
                "\n Nome so cliente: " + corr.getNomecli() +
                "\n CPF do cliente: " + corr.getCpfcli());
    }
}
 