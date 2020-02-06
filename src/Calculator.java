import java.util.Scanner;

public class Calculator {

    private int result = 0;

    private void setResult(int result) {
        this.result = result;
    }

    private int getResult() {
        return result;
    }

    public void run() {
        String operand = ("");

        do {
            showMenu();
            operand = readOperand("Please enter operand: ");
            int number = readNumber("Please enter number: ");

            switch (operand) {
                case "+":
                    addMethod(number);
                    break;
                case "-":
                    deductMethod(number);
                    break;
                case "*":
                    multiplyMethod(number);
                    break;
                case "/":
                    devideMethod(number);
                    break;
            }
        } while (!operand.equals("Q"));
    }

    private void showMenu() {
        System.out.println("+ Add");
        System.out.println("- Deduct");
        System.out.println("* Multiply");
        System.out.println("/ Devide");
        System.out.println("Q Quit");
        System.out.println("Your current value is: " + result);
    }

    private String readOperand(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private int readNumber(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        return readOperand(message);
        return sc.nextInt();
    }

    private void addMethod(int number) {
        result += number;
    }

    private void deductMethod(int number) {
        result -= number;
    }

    private void devideMethod(int number) {
        result /= number;
    }

    private void multiplyMethod(int number) {
        result *= number;
    }

}
