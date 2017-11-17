package implementacao;

/**
 * proxy da interface executor para realizar a injeção das dependências
 * nos processos que necessitem dessa injeção, logo após delega a execução do 
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