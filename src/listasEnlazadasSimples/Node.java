package listasEnlazadasSimples;

public class Node {
	//Valor del nodo a ingresar
	private int valorNodo; 
	//Puntero para el siguiente
	private Node siguiente;
	
	public Node(int valorNodo, Node siguiente) {
		this.valorNodo = valorNodo;
		this.siguiente = siguiente;
	}
	
	public int getValorNodo() {
		return valorNodo;
	}

	public void setValorNodo(int valorNodo) {
		this.valorNodo = valorNodo;
	}

	public Node getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Node siguiente) {
		this.siguiente = siguiente;
	}



	
}
