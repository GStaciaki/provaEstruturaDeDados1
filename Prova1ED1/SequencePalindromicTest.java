// Aluno: Guilherme Staciaki da Luz RA: 1982664
public class SequencePalindromicTest {

	public static void main(String[] args) {
		SequencePalindromic sp = new SequencePalindromic();
		//teste valido
		System.out.println("----------Teste Valido----------");
		sp.populateSequences("AACCGG", 'S');

		System.out.println(sp.getStack());

		sp.populateSequences("GGCCAA", 'Q');

		System.out.println(sp.getQueue());

		System.out.println("E uma sequencia palindromica: " + sp.isSequencePalindromic());
	
		//teste invalido
		System.out.println("\n----------Teste Invalido----------");
		sp.resetStack();
		sp.populateSequences("AAAAAA", 'S');
		System.out.println(sp.getStack());
		System.out.println(sp.getQueue());
		
		System.out.println("E uma sequencia palindromica: " + sp.isSequencePalindromic());
	
		//teste se a cadeia de characteres e 6
		System.out.println("\n----------Teste Cadeia De Characteres----------");
		sp.resetStack();
		sp.populateSequences("ACG", 'S');
		
		System.out.println(sp.getStack());
		
		//teste se characteres sao validos
		System.out.println("\n----------Teste De Characteres Invalidos----------");
		sp.resetQueue();
		sp.populateSequences("ACVCDE", 'Q');
		
		System.out.println(sp.getQueue());
	
		//teste de characters minusculos
		System.out.println("\n----------Teste De Characteres Minusculos----------");
		sp.resetQueue();
		sp.populateSequences("aaaaaa", 'Q');
		System.out.println(sp.getQueue());
	}
}
