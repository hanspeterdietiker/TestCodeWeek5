package Revisao;
import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[5][5];
        int somaMat[] = new int[5];
        int j, i;
        int soma = 0;

        System.out.println("*******************Matriz*******************");
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.println("Linha : [" + (i + 1) + "] Adciona a coluna: [" + (j + 1) + "]");
                mat[i][j] = sc.nextInt();
                soma += somaMat[j] + mat[i][j];
            }
        }
        System.out.println("Matriz resultante: " + soma);
    }
}
