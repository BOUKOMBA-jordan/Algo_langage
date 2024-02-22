import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	//Déclaration d-une variable
	double nombre, reste;
	//Enregistrement des variables
	Scanner clavier = new Scanner(System.in);
	System.out.print("Veillez saisir un nombre: ");
	nombre = clavier.nextDouble();
	reste = nombre%2;
	if (reste==0) {
		System.out.print("Ce nombre est pair");
	}else {
		System.out.print("Ce nombre est impair");
	}
	clavier.close();

	}

}
