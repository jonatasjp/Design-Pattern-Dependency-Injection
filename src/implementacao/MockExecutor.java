package implementacao;

/**
 * Mock que apenas delega a execu��o para o m�todo processar da abstra��o Processo
 * */
public class MockExecutor implements Executor {

	@Override
	public void executar(Processo processo) {
		processo.processar();
	}

}
