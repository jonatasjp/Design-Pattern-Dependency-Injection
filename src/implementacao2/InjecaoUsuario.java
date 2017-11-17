package implementacao2;

/**
 * Classe responsável por injetar a dependencia nas classes que implementam a interface DependeUsuario
 */
public class InjecaoUsuario{

	private Usuario usuario;
	
	public InjecaoUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void injetar(Processo processo) {
		if(processo instanceof DependeUsuario) {
			((DependeUsuario) processo).recebeUsuario(usuario);
		}
	}

}