package listasEnlazadasSimples;

public class DoubleNode {
	//Valor del nodo a ingresar
	private int valorNodo;
	//Punteros
	private DoubleNode anterior;
	private DoubleNode siguiente;
	
	public DoubleNode(int valorNodo, DoubleNode anterior, DoubleNode siguiente ) {
		this.valorNodo = valorNodo;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}

	public int getValorNodo() {
		return valorNodo;
	}

	public void setValorNodo(int valorNodo) {
		this.valorNodo = valorNodo;
	}

	public DoubleNode getAnterior() {
		return anterior;
	}

	public void setAnterior(DoubleNode anterior) {
		this.anterior = anterior;
	}

	public DoubleNode getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(DoubleNode siguiente) {
		this.siguiente = siguiente;
	}

	
}
