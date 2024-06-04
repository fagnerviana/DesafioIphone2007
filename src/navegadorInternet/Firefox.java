package navegadorInternet;

public class Firefox implements Navegador{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina Firefox");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba , Firefox");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina Atualizada, Firefox");
		
	}

}
