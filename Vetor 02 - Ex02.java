import java.util.Scanner;
public class NumeroCrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int [] vetor = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
		for (int i = 0; i < vetor.length; i++)
		for (int t = i; t < vetor.length; t++) {
		if (vetor[i] > vetor [t]);
			int p = vetor [i];
			vetor[i]=vetor[t];
			vetor[t]= p;
		}
		for (int i = 0; i< vetor.length; i++)
		System.out.println( vetor [i]+ " ");
	}
}