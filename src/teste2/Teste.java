package teste2;

import implementacao2.InjecaoUsuario;
import implementacao2.Processo;
import implementacao2.ProcessoA;
import implementacao2.ProcessoB;
import implementacao2.Usuario;

public class Teste {

	public static void main(String[] args) {

		InjecaoUsuario injecao = 
				new InjecaoUsuario(new Usuario("Jonatas"));
		
		Processo a = new ProcessoA();
		Processo b = new ProcessoB();
		
		injecao.injetar(a);
		injecao.injetar(b);
		
		a.processar();
		b.processar();

	}

}
