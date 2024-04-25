public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    duplicate[j] = -1;
                }
            }
            if (duplicate[i] != -1) {
                duplicate[i] = count;
            }
        }

        System.out.println("Frequency of each element:");
        for (int i = 0; i < list.length; i++) {
            if (duplicate[i] != -1) {
                System.out.println(list[i] + " occurred " + duplicate[i] + " times.");
            }
        }

    }
}