import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Впишите 1 число: ");
        int num1 = scanner.nextInt();
        System.out.print("Впишите 2 число: ");
        int num2 = scanner.nextInt();
        System.out.print("Впишите операцию, которую хотите произвести: ");
        char operation = scanner.next().charAt(0);
        int result = calc(num1,num2,operation);
        System.out.print("Ответ: " + result);
    }
    public static int calc(int num1, int num2, char operation){
        int res;
        switch (operation){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
            default:
                System.out.println("Ошибка ввода значений, попробуйте поменять операцию.");
                res = 0;
                break;
        }
        return res;
    }

}