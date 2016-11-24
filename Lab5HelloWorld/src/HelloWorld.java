import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ваше імя");
		String str = sc.next();
		System.out.println("Введіть назву групи");
		String str1 = sc.next();
		if(str1=="свої"){
			System.out.println("З поверненням"+ str);
		}
		else if(str1=="чужі"){
			System.out.println("Вітаємо вас"+ str);
		}
	

	}

}
