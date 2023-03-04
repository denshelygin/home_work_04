// В калькулятор добавьте возможность отменить последнюю операцию.

package DZ4.DZ_4;

import java.util.Scanner;
import java.util.Stack;

public class HW3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "";
        Scanner scan = new Scanner(System.in);
        int res;
        System.out.println("Калькулятор с возможностью отмены действия командой <cancel>\n");

        while (stack.size() < 4) {
            if (stack.size() < 1) {
                System.out.println("Введите первое число: ");
            } else {
                if (stack.size() < 2) {
                    System.out.println("Введите второе число или команду cancel: ");
                } else {
                    if (stack.size() < 3) {
                        System.out.println("Введите знак или команду cancel: ");
                    } else {
                        if (stack.size() == 3) {
                            System.out.println("Введите calc для вычисения!!! Для отмены введите cancel: ");
                        }
                    }
                }
            }
            str = scan.nextLine();

            if (str.equals("cancel")) {
                stack.remove(stack.size() - 1);
            } else {
                stack.push(str);
            }
        }
        if (str.equals("calc")) {
            stack.pop();

        }
        if (isDigit(stack.lastElement())) {
            System.out.println("Ошибка ввода данных");
        } else {
            switch (stack.pop()) {
                case "+":
                    res = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "-":
                    res = -Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "*":
                    res = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
                    System.out.println(res);
                    break;
                case "/":
                    Integer temp = Integer.parseInt(stack.pop());
                    res = Integer.parseInt(stack.pop()) / temp;
                    System.out.println(res);
                    break;
                default:
                    System.out.println("нет такой операции");
                    break;
            }
        }

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

