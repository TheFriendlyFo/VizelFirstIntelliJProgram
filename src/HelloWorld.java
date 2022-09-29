public class HelloWorld {
    public static void main(String[] args) {
        String disp = "";
        for (int i=0; i<10000; i++) {
            if (i % 100 == 0) {
                disp = disp.concat("\n");
            }
            disp = disp.concat(i % 9 + " ");
        }

        System.out.println(disp);
    }
}
