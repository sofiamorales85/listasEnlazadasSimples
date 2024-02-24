package listasEnlazadasSimples;

import javax.swing.*;
/**@author Jenny**/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetodosListaEnlazada lista = new MetodosListaEnlazada();
		ListaCirculares listaCirculares = new ListaCirculares();
		ListaDoble listaDoble = new ListaDoble();
		int op = 0;

		do {
			String option = JOptionPane.showInputDialog(null,
					"---LISTAS ENLAZADAS---\n 1- SIMPLE\n 2- CIRCULARES\n 3- DOBLEMENTE ENLAZADAS\n 6- SALIR");
			op = Integer.parseInt(option);

			switch (op) {
			case 1: {
				int inCase = 0;
				do {
					String optionSimple = JOptionPane.showInputDialog(null,
							"Menú listas simples\n 1- Insertar\n 2- Mostrar\n 3- Eliminar Nodo\n 4- Salir");
					inCase = Integer.parseInt(optionSimple);

					switch (inCase) {
					case 1: {
						int valorNodo;
						String numeroIngresado;
						numeroIngresado = JOptionPane.showInputDialog("Ingrese el número a guardar");
						System.out.println("\n Contenido del JOptionPane : " + numeroIngresado);
						if (numeroIngresado.equals("")) {
							JOptionPane.showMessageDialog(null, "Debe ingresar un valor a la lista");
							break;
						} else {
							valorNodo = Integer.parseInt(numeroIngresado);
							lista.insertarAlFinal(valorNodo);
						}

						break;
					}
					case 2: {
						if (lista.esVacia()) {
							JOptionPane.showConfirmDialog(null, "La lista esta vacía");
						} else {
							lista.mostrar();
						}
						break;
					}
					case 3: {
						if (lista.esVacia()) {
							JOptionPane.showConfirmDialog(null, "La lista esta vacía");
						} else {
							int valorBorrar;
							String numeroBorrar;
							numeroBorrar = JOptionPane.showInputDialog("Ingrese el número a borrar");
							if (numeroBorrar.equals("")) {
								JOptionPane.showMessageDialog(null, "Debe ingresar un valor a borrar");
							} else {
								valorBorrar = Integer.parseInt(numeroBorrar);
								lista.eliminarNodo(valorBorrar);
							}
						}
						break;
					}
					}

				} while (inCase != 4);
			}

			case 2: {
				int inCase2 = 0;
				do {
					String optionCircular = JOptionPane.showInputDialog(null,
							"Menú Listas Circulares\n 1- Insertar\n 2- Mostrar\n 3- Eliminar \n 5- Salir");
					inCase2 = Integer.parseInt(optionCircular);
					switch (inCase2) {
					case 1: {
						int valorNodo2;
						String numeroIngresado2;
						numeroIngresado2 = JOptionPane.showInputDialog("Ingrese el número a guardar");
						if (numeroIngresado2.equals("")) {
							JOptionPane.showMessageDialog(null, "Debe ingresar un valor a la lista");
						} else {
							valorNodo2 = Integer.parseInt(numeroIngresado2);
							listaCirculares.insertar(valorNodo2);
						}

						break;
					}
					case 2: {
						if (listaCirculares.esVacia()) {
							JOptionPane.showMessageDialog(null, "La lista está vacía.");
						} else {
							listaCirculares.mostrar();
						}
						break;
					}
					case 3: {
						if (listaCirculares.esVacia()) {
							JOptionPane.showMessageDialog(null, "La lista está vacía.");
						} else {
							int valorBorrar2;
							String numeroBorrar2;
							numeroBorrar2 = JOptionPane.showInputDialog("Ingrese el número a borrar");
							if (numeroBorrar2.equals("")) {
								JOptionPane.showMessageDialog(null, "Debe ingresar un valor a borrar");
							} else {
								valorBorrar2 = Integer.parseInt(numeroBorrar2);
								listaCirculares.eliminarElemento(valorBorrar2);
							}
						}
						break;
					}

					}
				} while (inCase2 != 5);

			}
			case 3: {
				int inCase3 = 0;
				do {
					String optionCircular = JOptionPane
							.showInputDialog("Menú Listas dobles\n 1- Insertar\n 2- Mostrar\n 3- Eliminar \n 7- Salir");
					inCase3 = Integer.parseInt(optionCircular);
					switch (inCase3) {
					case 1: {
						int valorNodo3;
						String numeroIngresado3;
						numeroIngresado3 = JOptionPane.showInputDialog("Ingrese el número a guardar");
						if (numeroIngresado3.equals("")) {
							JOptionPane.showMessageDialog(null, "Debe agregar un numero a la lista");
						} else {
							valorNodo3 = Integer.parseInt(numeroIngresado3);
							listaDoble.insertarAlFinal(valorNodo3);
						}
						break;
					}
					case 2: {
						if (listaDoble.esVacia()) {
							JOptionPane.showMessageDialog(null, "La lista está vacía.");
						} else {
							listaDoble.mostrar();
						}
						break;
					}
					case 3: {
						if (listaDoble.esVacia()) {
							JOptionPane.showMessageDialog(null, "La lista está vacía.");
						} else {
							int valorBorrar3;
							String numeroBorrar3;
							numeroBorrar3 = JOptionPane.showInputDialog("Ingrese el número a borrar");
							if (numeroBorrar3.equals("")) {
								JOptionPane.showMessageDialog(null, "Debe ingresar un valor a borrar");
							} else {
								valorBorrar3 = Integer.parseInt(numeroBorrar3);
								listaDoble.eliminarNodo(valorBorrar3);
							}
						}
						break;
					}

					}
				} while (inCase3 != 7);

			}
			}
		} while (op != 6);
	}
}
