
public class TestaContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaJack = new Conta();
		System.out.println(contaDaJack.getSaldo());
		
		contaDaJack.titular = new Cliente();
		System.out.println(contaDaJack.titular);
		
		contaDaJack.titular.nome = "Jaqueline";
		System.out.println(contaDaJack.titular.nome);
		
		
	}

}
