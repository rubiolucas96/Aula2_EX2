/*Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
recebendo um n�mero inteiro, converta para bin�rio. Entrada
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
