import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ���");
		String str = sc.next();
		System.out.println("������ ����� �����");
		String str1 = sc.next();
		if(str1=="���"){
			System.out.println("� �����������"+ str);
		}
		else if(str1=="���"){
			System.out.println("³���� ���"+ str);
		}
	

	}

}
