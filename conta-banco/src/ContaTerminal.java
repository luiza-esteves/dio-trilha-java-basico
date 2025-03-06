public class ContaTerminal {

    int numero;
    String agencia;
    String nome_cliente;
    float saldo;
    
    public ContaTerminal(int numero, String agencia, String nome_cliente, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome_cliente = nome_cliente;
        this.saldo = saldo;
    }

    public void imprimeMensagem(){
        System.out.println("Olá "+this.nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "+this.saldo+" já está disponível para saque");
    }

}
