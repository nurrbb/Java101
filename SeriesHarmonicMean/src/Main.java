public class Main {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        double sum =0.0;
        for (int j : num) {
            sum += 1.0 / j;
        }
        System.out.println("Harmonic Aveg: "+sum/num.length);
    }
}