package implementacao2;

public class ProcessoA extends Processo implements DependeUsuario {

	private Usuario usuario;

	@Override
	public void processar() {
		System.out.println("processando o processo A que depende do usuario " + usuario.getLogin());
	}

	@Override
	public void recebeUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
