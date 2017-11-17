package teste;

import implementacao.MockExecutor;
import implementacao.ProcessoA;
import implementacao.ProcessoB;
import implementacao.ProxyInjecaoUsuario;
import implementacao.Usuario;

public class Teste {

	public static void main(String[] args) {

		ProxyInjecaoUsuario injecao = 
				new ProxyInjecaoUsuario(new MockExecutor(), new Usuario("Jonatas"));
		
		injecao.executar(new ProcessoA());
		injecao.executar(new ProcessoB());

	}

}
