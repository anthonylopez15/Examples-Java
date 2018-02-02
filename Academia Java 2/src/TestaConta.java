
public class TestaConta {
	public static void main(String[] args){
	
		Conta conta = new Conta();
		conta.inicializaConta(500, "2", "Anthony", 182, 123);
		conta.imprimeDados();
		conta.deposito(300);
		System.out.println("SALDO: "+conta.getSaldo());
		conta.saque(600);
		System.out.println("SALDO: "+conta.getSaldo());
		conta.saque(300);
		System.out.println("SALDO: "+conta.getSaldo());
	}
}
