/*Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro, converta para binário. Entrada
limitada a 2000.*/

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
Controller rec = new Controller();

int num = 44;
String binario = rec.binario(num);
System.out.println(binario);

	}

}
