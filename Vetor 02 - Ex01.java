import java.util.Scanner;
public class NomeSobrenome {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String t = "Tayná Porfiro";
		char[] r =new char[t.length()];
		for(int c=t.length()-1;c>=0;c--) {
			r[c] =t.charAt(c);
		}
		for(char p:r) {
			System.out.println(p);
		}
	}
}
