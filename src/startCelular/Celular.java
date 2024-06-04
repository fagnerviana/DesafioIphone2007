package startCelular;

import aparelhoTelefonico.AparelhoTelefonico;

public class Celular {

	public static void main(String[] args) {
		
		AparelhoTelefonico iphone = new AparelhoTelefonico();
		iphone.exibirPagina();
		iphone.selecionarMusica(null);
		iphone.ligar("71988811124");
		iphone.atender();
		
	}

}
