package principioResponsabilidade;

public class testeConta {

	public static void main(String[] args) {
		
		
	   contaBancaria bancaria = new contaBancaria();
	   
	   bancaria.setDescricao("conta bancaria do Alex");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
		
		
	}
	
	
}
