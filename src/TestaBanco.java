
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.nome = "João Neiva";
		joao.cpf = "123.456.789-10";
		joao.profissao = "programador";
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(100);
		
		//associa o cliente joao a contaDoJoao
		contaDoJoao.titular = joao;
		
		System.out.println(contaDoJoao.titular.nome);
		System.out.println(contaDoJoao.titular);
		System.out.println(joao);
		
		
		
	}

}
