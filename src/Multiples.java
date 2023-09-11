public class Multiples {
    public static int main(int n, int a, int b) {
        int count3 = (n - 1) / a;
        int count5 = (n - 1) / b;
        int count35 = (n - 1) / (a * b);

        // demorgans
        return count3 + count5 - count35;
    }

    public static void main(String[] args) {

    }
    public static int main() {
        return main(1000, 3, 5);
    }
}
