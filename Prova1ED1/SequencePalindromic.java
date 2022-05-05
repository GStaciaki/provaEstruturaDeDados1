// Aluno: Guilherme Staciaki da Luz RA: 1982664
public class SequencePalindromic {

	private Stack sequence1;
	private Queue sequence2;

	public SequencePalindromic() {
		sequence1 = new Stack();
		sequence2 = new Queue();
	}

	public void populateSequences(String sequence, char c) {
		// recebe uma string com a sequencia e transforma em uma array de char
		// para poder empilhar na variavel sequence1 ou enfileirar na variavel sequence2
		sequence = sequence.toUpperCase();
		char[] aux = sequence.toCharArray();
		if (aux.length != 6) {
			showError(1);
			resetStack();
			return;
		}
		for (int i = 0; i < aux.length; i++) {
			if (!isValidChar(aux[i])) {
				showError(2);
				if (c == 'S') {
					resetStack();
				}
				if ( c == 'Q') {
					resetQueue();
				}
				break;
			}
			if (c == 'S') {
				sequence1.push(aux[i]);
			}
			if (c == 'Q') {
				sequence2.enqueue(aux[i]);
			}
		}
	}

	public String getStack() {
		// gera uma String text com a soma dos char da pilha e instancia outra
		// para poder guardar os dados de sequence1 e concatenar a String text
		String text = "";
		Stack aux1 = new Stack();
		char aux2;

		while (!sequence1.isEmpty()) {
			aux2 = sequence1.pop();
			aux1.push(aux2);
		}

		while (!aux1.isEmpty()) {
			aux2 = aux1.pop();
			text += aux2;
			sequence1.push(aux2);
		}
		return text;
	}

	public String getQueue() {
		// gera uma String text com a soma dos char da fila e instancia outra
		// para poder guardar os dados de sequence2 e concatenar a String text
		String text = "";
		Queue aux1 = new Queue();
		char aux2;

		while (!sequence2.isEmpty()) {
			aux2 = sequence2.dequeue();
			text += aux2;
			aux1.enqueue(aux2);
		}
		while (!aux1.isEmpty()) {
			sequence2.enqueue(aux1.dequeue());
		}

		return text;
	}

	public boolean isSequencePalindromic() {
		// instancia um StringBuilder para inverter a string getQueue para
		// comparar se e uma sequencia palindromica
		String seque2 = new StringBuilder(getQueue()).reverse().toString();

		if (seque2.equals(getStack())) {
			return true;
		}
		return false;
	}

	public boolean isValidChar(char c) {
		// verifica se o character e valido
		if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
			return true;
		}

		return false;
	}

	public void resetStack() {
		// retira todos os valores da pilha
		sequence1 = new Stack();
	}

	public void resetQueue() {
		// retira todos os valores da fila
		sequence2 = new Queue();
	}

	public void showError(int a) {
		// metodo para organizar mensagens de erros
		switch (a) {
		case 1:
			System.out.println("Numero de characteres invalido");
			break;
		case 2:
			System.out.println("Character invalido");
			break;
		default:
			System.out.println("Erro");
		}
	}
}
