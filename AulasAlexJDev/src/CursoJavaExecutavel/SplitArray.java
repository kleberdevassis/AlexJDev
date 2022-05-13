package CursoJavaExecutavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		String texto = "alex, curso java, 80, 70, 90,89";
		
		String[] valorArray = texto.split(",");
		
		System.out.println("Nome-> "+ valorArray[0]);
		System.out.println("curso->"+ valorArray[1]);
		System.out.println("nota 1-> "+ valorArray[2]);
		System.out.println("nota 2-> "+ valorArray[3]);
		System.out.println("nota 3-> "+ valorArray[4]);
		System.out.println("nota 4->  "+ valorArray[5]);
		
		
		List<String> list = Arrays.asList(valorArray);
		
		for(String valorString : list) {
			System.out.println(valorString);
		}
		
		String[] conversaoArray = list.toArray(new String[6]);
		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
		
	}

}
