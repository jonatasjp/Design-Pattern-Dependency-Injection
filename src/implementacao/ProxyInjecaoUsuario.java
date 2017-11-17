package implementacao;

/**
 * proxy da interface executor para realizar a inje��o das depend�ncias
 * nos processos que necessitem dessa inje��o, logo ap�s delega a execu��o do 
 * processo para o executor encapsulado
 */
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