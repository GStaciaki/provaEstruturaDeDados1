// Aluno: Guilherme Staciaki da Luz RA: 1982664
public class Queue {

	private Link head;

	public Queue() {
		head = null;
	}

	public void enqueue(char elem) {
		// insere um objeto pelo inicio(tail) da fila
		Link link = new Link(elem);

		if (isEmpty()) {
			head = link;
		} else {
			Link aux = head;
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = link;
		}
	}

	public char dequeue() {
		// remove um objeto da fila pelo final(head) da fila
		Link actual = head;
		head = head.next;
		return actual.data;
	}

	public boolean isEmpty() {
		// verifica se a fila esta vazia
		if (head == null) {
			return true;
		}

		return false;
	}
}
