// Aluno: Guilherme Staciaki da Luz RA: 1982664
public class Stack {

	private Link head;

	public Stack() {
		this.head = null;
	}

	public boolean isEmpty() {
		// verifica se a pilha esta vazia
		if (head == null) {
			return true;
		}

		return false;
	}

	public char pop() {
		// retira um elemento pelo topo da pilha
		Link aux = head;

		if (isEmpty()) {
			return ' ';
		}

		head = head.next;
		return aux.data;
	}

	public void push(char value) {
		// insere um elemento pelo topo da pilha
		Link link = new Link(value);

		if (isEmpty()) {
			head = link;
		} else {
			Link aux = link;
			aux.next = head;
			head = aux;
		}
	}
}
