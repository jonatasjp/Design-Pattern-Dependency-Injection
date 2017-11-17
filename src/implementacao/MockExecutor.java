package implementacao;

/**
 * Mock que apenas delega a execução para o método processar da abstração Processo
 * */
public class MockExecutor implements Executor {

	@Override
	public void executar(Processo processo) {
		processo.processar();
	}

}
