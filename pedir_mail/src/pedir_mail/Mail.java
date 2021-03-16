package pedir_mail;

import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println ("Por favor introduzca el mail: ");

		 String mail = input.nextLine();
		 
		 int index= mail.indexOf("@");
		 
		 System.out.println("Su nuevo correo es: ");
		 		 
		 System.out.println(mail.substring(0,index)+"@hotmail.com");

	}

}

