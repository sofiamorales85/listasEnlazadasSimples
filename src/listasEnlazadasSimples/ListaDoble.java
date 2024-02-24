package listasEnlazadasSimples;

public class ListaDoble {
	private DoubleNode inicio;
	private DoubleNode fin;
	private int tamanio;

	//Constructor
	public ListaDoble() {
		inicio = null;
		fin = null;
		tamanio = 0;
	}

	/**
	 * Obtiene el numero de elementos
	 * @return tamaño de la lista
	 */
	public int getTamanio() {
		return tamanio;
	}

	/**
	 * Consulta si la lista esta vacia.
	 * 
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
	 * Agregar Nodo al final de la lista doble
	 */
	public void insertarAlFinal(int valorNodo) {
		//Creando instancia del nodo
		DoubleNode nuevo; 
		if (esVacia()) {
			nuevo = new DoubleNode(valorNodo, null, null);
			inicio = nuevo;
			fin = nuevo;
		} else {
			
			nuevo = new DoubleNode(valorNodo, null, null);
			//Creo un nodo temporal que el último
			DoubleNode temporal = fin;
			fin = nuevo;
			//Agrego el dato o valor
			fin.setAnterior(temporal);
			// Se actualiza la referencia  los punteros
			fin.setSiguiente(null);
			temporal.setSiguiente(fin);

		}
		tamanio++;
	}
	
	public boolean buscarNodo(int elementoBuscar) {
		DoubleNode aux = inicio;
		//Bandera encontrado = true si encuentra el dato.
		boolean encontrado = false;
		do {
			if(elementoBuscar == aux.getValorNodo()) {
				encontrado = true;
			}else {
				encontrado = false;
				aux = aux.getSiguiente();
			}
		}while(aux != inicio && encontrado != true);
		return encontrado;
	}
	
	public void eliminarNodo(int elemntoBorrar) {
		if (buscarNodo(elemntoBorrar)) {
			if(inicio.getValorNodo() == elemntoBorrar) {
			inicio = inicio.getSiguiente();
			}else {
				DoubleNode aux = inicio;
				while(aux.getSiguiente().getValorNodo() != elemntoBorrar) {
					aux = aux.getSiguiente();
				}
				DoubleNode siguiente = aux.getSiguiente().getSiguiente();
				aux.setSiguiente(siguiente);
			}
			tamanio--;
		}else {
			System.out.println("El elemento no existe en la lista");
		}
	}

	
	public void mostrar() {
		System.out.println("\n Número de elementos: " + getTamanio()+ "\n");
		//Crea una copia de la lista
		DoubleNode temporal = inicio;
		int cont = 0;
		
		System.out.print("-------------Lista doblemente enlazada----------- \n");
		System.out.println("\n -> ");
		 do{
			//Imprime en pantalla el valor del nodo.
			System.out.println(cont + ".[ " + temporal.getValorNodo()+ " ]" + " -> ");
			// Avanza al siguiente nodo.
			temporal = temporal.getSiguiente();
			cont++;
		}while (temporal != null);
	}

}
