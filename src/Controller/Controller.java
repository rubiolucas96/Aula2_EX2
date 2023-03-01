package Controller;

public class Controller {

	public Controller() {
		super();
	}
public String binario(int num) {
	if (num ==0) {
		return "";
		//condição de parada foi definida caso o num for igual a  0/

	}
	else {
		int resto = num % 2;
		num = num / 2;
		return binario(num) + resto;	
        //Caso o num for maior que zero, fazer o num % para descobrir o resto, num dividido por 2 /
	}
}
}
