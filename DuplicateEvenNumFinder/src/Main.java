
public class Main {

    public static void main(String[] args) {
        int[] list = {4, 6, 8, 5, 6, 21, 54, 21, 43, 54,7,8,1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < list.length; j++) {
                    if (i != j && (list[i] == list[j])) {
                        duplicate[startIndex++] = list[i];
                        break;
                    }
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}