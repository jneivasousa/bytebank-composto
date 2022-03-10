
public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		Conta investimento = new Conta();
		investimento.deposita(100);
		System.out.println(investimento.saca(200));
		System.out.println(investimento.getSaldo());
		
		investimento.saca(200);
		//forma errada de implementar alterando o saldo direto no atributo
		//investimento.saldo = investimento.saldo -101;
		System.out.println(investimento.getSaldo());
		
		
	}

}
