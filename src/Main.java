public class Main {
    public static void main(String[] args) {
        int[] weight = new int[]{1, 2, 3};
        for (int i = weight.length - 1; i >=0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(",");
            }

        }
        System.out.println();
        double[] soul = {1.57, 7.654, 9.986};
        for (int i = soul.length -1; i >=0; i--) {
            System.out.print(soul[i]);
            if (i != 0) {
                System.out.print(",");
            }

        }
        System.out.println();
        int[] dog = {3, 5, 7, 8, 546};
        for (int i = dog.length - 1; i >= 0; i--) {
            System.out.print(dog[i]);
            if (i != 0) {
                System.out.print(",");
            }

        }


    }
}