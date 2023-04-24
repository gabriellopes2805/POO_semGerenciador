import java.util.Scanner;

public class TeoriaDePitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cateto1, cateto2, hipotenusa;

        System.out.print("Digite o valor do primeiro cateto: ");
        cateto1 = input.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        cateto2 = input.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("A hipotenusa é: " + hipotenusa);
    }
}

