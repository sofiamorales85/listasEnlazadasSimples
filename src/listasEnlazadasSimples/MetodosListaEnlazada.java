package listasEnlazadasSimples;

public class MetodosListaEnlazada {
	// Puntero que indica el inicio de la lista
	private Node inicio;
	private Node fin;
	private int numElementos;

	// Constructor
	public MetodosListaEnlazada() {
		inicio = null;
		fin = null;
		numElementos = 0;
	}

	/**
	 * Consulta si la lista esta vacia.
	 * @return true si el nodo inicio, no apunta a otro nodo.
	 */
	public boolean esVacia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Consulta cuantos elementos (nodos) tiene la lista.
	 */
	public int getTamanio() {
		return numElementos;
	}

	/**
	 * Agregar Nodo al final de la lista
	 */
	public void insertarAlFinal(int valorNodo) {
		//Creando instancia del nodo
		Node actual;
		if (esVacia()) {//Si es verdadero va entrar, es decir la lista esta vacía
			actual = new Node(valorNodo, null);
			inicio = actual;
			fin = actual;
		} else {
			/**
			 * Si no es el primer elemento se agrega al final de la lista, se crea una lista
			 * auxiliar llamada "actual"
			 */
			actual = new Node(valorNodo, null);
			//Agregar el nodo nuevo al final de la lista
			fin.setSiguiente(actual);
			//Se actualiza la referencia del nodo
			fin = actual;
		}
		// Incrementar en 1 el numero de elementos
		numElementos++;
	}

	public boolean buscarNodo(int valorBuscar) {
		Node aux = inicio;
		// Bandera para indicar si el valor existe.
		boolean encontrado = false;
		do {
			// Consulta si el valor del nodo es igual al de referencia.
			if (valorBuscar == aux.getValorNodo()) {
				encontrado = true;
			} else {
				encontrado = false;
				// Avansa al siguiente. nodo.
				aux = aux.getSiguiente();
			}
		} while (aux != inicio && encontrado != true);
		return encontrado;
	}

	public void mostrar() {

		// Verifica si la lista contiene elementoa.
		System.out.print("\n Número de elementos: " + getTamanio() + "\n");
		if (!esVacia()) {
			// Crea una copia de la lista.
			Node aux = inicio;

			int cont = 0;
			System.out.print("\n-------------Listas enlazadas simples----------- \n");
			System.out.print("\n -> ");
			// Recorre la lista hasta llegar nuevamente al incio de la lista.
			while (aux != null) {
				// Imprime en pantalla el valor del nodo.
				System.out.print(cont + ".[ " + aux.getValorNodo() + " ]" + " ->  ");
				// Avanza al siguiente nodo.
				aux = aux.getSiguiente();
				cont++;
			}
		}
	}

	public void eliminarNodo(int elementoBorrar) {
		if (buscarNodo(elementoBorrar)) {
			if (inicio.getValorNodo() == elementoBorrar) {
				// El primer nodo apunta al siguiente.
				inicio = inicio.getSiguiente();
			} else {
				// Lista temporal
				Node aux = inicio;
				// Recorre la lista hasta llegar al nodo anterior al de referencia.
				while (aux.getSiguiente().getValorNodo() != elementoBorrar) {
					aux = aux.getSiguiente();
				}
				// Guarda el nodo siguiente del nodo a eliminar.
				Node siguiente = aux.getSiguiente().getSiguiente();
				// Enlaza el nodo anterior al de eliminar con el sguiente despues de el.
				aux.setSiguiente(siguiente);
			}
			numElementos--;
		}else {
			System.out.println("El elemento no existe en la lista");
		}
	}
}
