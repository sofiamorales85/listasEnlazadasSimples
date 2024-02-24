package listasEnlazadasSimples;

public class ListaCirculares {
    private Node inicio;
    // Puntero que indica el final el ultimo nodo.
    private Node ultimo;
    // Variable para registrar el tamaño de la lista.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void ListaCirculares(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }
	 /**
     * Consulta si la lista esta vacia.
     * @return true si el  nodo inicio, no apunta a otro nodo.
     */
	public boolean esVacia() {
		if(inicio == null) {
			return true;
		}else {
			return false;
		}
	}
    
    public int getTamanio(){
        return tamanio;
    }
    /**
     * Agrega un nuevo nodo al final de la lista circular.
     * @param valor a agregar.
     */
    public void insertar(int valor){
        //Creando instancia del nodo
        Node actual;
        
        if (esVacia()) {//Si la lista es vacía ingresa el primer nodo
        	actual = new Node(valor, null);
            inicio = actual;
            // De igual forma el ultimo nodo sera el actual.
            ultimo = actual;
            // Y el puntero del ultimo debe apuntar al primero.
            ultimo.setSiguiente(inicio);
        } else{
        	actual = new Node(valor, null);
        	//El nodo se agrega al final de la lista.
            ultimo.setSiguiente(actual);
            // Apuntamos con el nuevo nodo al inicio de la lista.
            actual.setSiguiente(inicio);
            // Como ahora el nuevo nodo es el ultimo se actualiza la variable ultimo.
            ultimo = actual;
        }
        tamanio++;
    }
    
    public void mostrar() {

    	System.out.println("\n Número de elementos:" + getTamanio()+"\n");
    	if(!esVacia()) {
    		//Crea una copia de la lista
    		Node actual = inicio;
    		int cont = 0;
    		System.out.print("\n-------------Listas circulares-----------\n");
    		System.out.println("\n -> ");
    		do {
    			// Imprime en pantalla el valor del nodo.
                System.out.print(cont + ".[ " + actual.getValorNodo()+ " ]" + " ->  ");
                // Avanza al siguiente nodo.
                actual = actual.getSiguiente();
                // Incrementa el contador de la posión.
                cont++;
    		}while (actual != inicio);
    	}
    }
    
    public boolean buscarNodo(int valorBuscar){
         Node aux = inicio;
        // Bandera para indicar si el valor existe.
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta 
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (valorBuscar == aux.getValorNodo()){
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
            	aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
        return encontrado;
    }
    
    /**
     * Elimina un nodo que se encuentre en la lista ubicado
     * por un valor de referencia.
     * @param referencia valor del nodo que se desea eliminar.
     */
    public void eliminarElemento(int valorEliminar){
        // Consulta si el valor de referencia existe en la lista.
        if (buscarNodo(valorEliminar)) {
            // Consulta si el nodo a eliminar es el pirmero
            if (inicio.getValorNodo() == valorEliminar) {
                inicio = inicio.getSiguiente();
                ultimo.setSiguiente(inicio); 
                tamanio--;
            } else{
                // Crea ua copia de la lista.
                Node aux= inicio;
                // Recorre la lista hasta llegar al nodo anterior al valor a eliminar. 
                while(aux.getSiguiente().getValorNodo() != valorEliminar){
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Node siguiente = aux.getSiguiente();
                    // Enlaza el nodo anterior al de eliminar con el sguiente despues de el. 
                    aux.setSiguiente(siguiente.getSiguiente());  
                    // Actualizamos el puntero del ultimo nodo
                    tamanio--;
                }
            }
            tamanio--;
        }
    }

}
