import java.util.Scanner;

public class CountA {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra: ");
        String input = sc.nextLine();

        int count = letraA(input);

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
        
        sc.close();
    }

    public static int letraA(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
            
        }

        return count;
    }
}
