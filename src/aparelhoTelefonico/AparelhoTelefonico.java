package aparelhoTelefonico;

import funcoesAparelho.Telefone;
import navegadorInternet.Navegador;
import reprodutorMusical.tocarPlayer;

public class AparelhoTelefonico implements Navegador,tocarPlayer,Telefone{
	
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina Web com Sucesso.");
			}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Aberto nova aba do navegador de internet");
			}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina web com sucesso.");
			}

	@Override
	public void tocar() {
		System.out.println("Tocando Player");
		}

	@Override
	public void pausar() {
		System.out.println("Pausado player");
		}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando lista de musica");
		}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: "+numero);
		}

	@Override
	public void atender() {
		System.out.println("Atendendo a ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Inicializando correio de voz");
	}
	

}
