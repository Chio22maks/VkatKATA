import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String expression = scanner.nextLine();
        String result = calculate(expression);
        System.out.println("Result: " + result);
    }

    public static String calculate(String expression) {
        String a = "V";
        String b = "I";
        String c = "X";
        String[] split = expression.split(" ");
        if (split.length != 3) {
            throw new RuntimeException("Недопустимое выражение");
        } else {
            boolean flag = false;
            String first = split[0];
            if (Main.Roman.I.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.II.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.III.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.IV.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.V.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.VI.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.VII.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.VIII.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.IX.name().equals(first)) {
                flag = true;
            }

            if (Main.Roman.X.name().equals(first)) {
                flag = true;
            }

            boolean flag2 = false;
            String second = split[2];
            if (Main.Roman.I.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.II.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.III.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.IV.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.V.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.VI.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.VII.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.VIII.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.IX.name().equals(second)) {
                flag2 = true;
            }

            if (Main.Roman.X.name().equals(second)) {
                flag2 = true;
            }

            if (flag && flag2 || !flag && !flag2) {
                boolean flag3 = false;
                Integer integer;
                Integer integer2;
                if (!first.startsWith(a) && !first.startsWith(b) && !first.startsWith(c)) {
                    integer = Integer.valueOf(first);
                    integer2 = Integer.valueOf(second);
                } else {
                    flag3 = true;
                    Roman roman = Main.Roman.valueOf(first);
                    int firstArab = roman.getValue();
                    integer = firstArab;
                    Roman secondRoman = Main.Roman.valueOf(second);
                    integer2 = secondRoman.getValue();
                }

                if (integer <= 10 && integer > 0 && integer2 <= 10 && integer2 > 0) {
                    switch (split[1]) {
                        case "+":
                            if (flag3) {
                                return toRomanNumeral(integer + integer2);
                            }

                            return String.valueOf(integer + integer2);
                        case "-":
                            if (flag3) {
                                return toRomanNumeral(integer - integer2);
                            }

                            return String.valueOf(integer - integer2);
                        case "*":
                            if (flag3) {
                                return toRomanNumeral(integer * integer2);
                            }

                            return String.valueOf(integer * integer2);
                        case "/":
                            if (flag3) {
                                return toRomanNumeral(integer / integer2);
                            }

                            return String.valueOf(integer / integer2);
                        default:
                            return a;
                    }
                } else {
                    throw new RuntimeException("Неверное значение");
                }
            } else {
                throw new RuntimeException("Недопустимое выражение");
            }
        }
    }

    public static String toRomanNumeral(int number) {
        if (number <= 0) {
            throw new RuntimeException("Неверное значение");
        } else {
            String[] romanNumerals = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < romanNumerals.length; ++i) {
                while(number >= values[i]) {
                    number -= values[i];
                    sb.append(romanNumerals[i]);
                }
            }

            return sb.toString();
        }
    }

    public static enum Roman {
        I(1),
        II(2),
        III(3),
        IV(4),
        V(5),
        VI(6),
        VII(7),
        VIII(8),
        IX(9),
        X(10);

        private int value;

        private Roman(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
