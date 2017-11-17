package implementacao;

public class ProxyInjecaoUsuario implements Executor{

	private Executor executor;
	private Usuario usuario;
	
	public ProxyInjecaoUsuario(Executor executor, Usuario usuario) {
		this.executor = executor;
		this.usuario = usuario;
	}

	@Override
	public void executar(Processo processo) {
		
		if(processo instanceof DependeUsuario) {
			((DependeUsuario) processo).recebeUsuario(usuario);
		}
		
		executor.executar(processo);
	}


}
