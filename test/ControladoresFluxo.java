
public class ControladoresFluxo {
	
	
	public static void main(String[] args) {
		
		// < if (condicao) > [{}]
		
		// == igualidade
		// >= 
		// >
		// <
		// <=
		// !=
		
		// && and
		// || or
		
		boolean connected = false;
		
		if (connected) {
		}
		
		if (connected) {
			System.out.println("Foi no if sem chavetas");
		}
		System.out.println("Foi no if sem chavetas");

	
		if (!connected) System.out.println("Sai daqui ... ");
		
		int idade = 29;
		int idadeBisso = 23;
		
		
		if (idade > idadeBisso) {
		} else if (false) {
		} else {
		}

		String nome = "Honor";
		//switch
		switch (nome) {
//				System.out.println("Acho Bisso");
//				break;
			case "Bisso":
			case "Jesuca": 
				System.out.println("Acho Jesus");
				break;
			case "Honor":
				System.out.println("Acho Honor");
				break;
			case "Betao":
				System.out.println("Acho Betao");
				break;
			case "Fela":
				System.out.println("Acho Fela");
				break;
			default:
				break;
		}
		
		
		
	}
	

}
