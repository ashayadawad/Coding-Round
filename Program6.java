public class Program6 {
    public static void main(String[] args) {
        boolean run = true;
        long count = 1;
        while (run) {
            boolean passed = true;
            for (int i = 2; i < 7; i++) {
                String mul = (count * i) + "";

                if (mul.length() == ("" + count).length()) {
                    passed = check(count + "", mul);
                    if (!passed) {
                        break;
                    }
                } else {
                    break;
                }
                if (i == 6 && passed) {
                    System.out.println(count);
                    System.exit(1);
                }

            }
            count++;
        }
    }

    public static boolean check(String ori, String mul) {
        char dig[] = ori.toCharArray();

        for (int i = 0; i < dig.length; i++) {
            if (!mul.contains(dig[i] + "")) {
                return false;
            }
        }
        return true;
    }
}