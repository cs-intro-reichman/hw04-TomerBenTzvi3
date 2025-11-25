public class Primes {
    static int primecounter;
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        primecounter = 0;
        for (int i = 0; i < primenums(n).length; i++) {
            if (primenums(n)[i] == true) {
                System.out.println(i);
                primecounter++;
            }
        }
        System.out.println("There are " + primecounter + " primes between 2 and "
         + n + " (" + (int)((double)primecounter / n * 100) + "% are primes)");
    }

    public static boolean[] primenums (int n) {
        boolean[] primearray = new boolean[n + 1];
        int i = 0;
        while (i < primearray.length) {
            if (i == 0 || i == 1) {
                primearray[i] = false;
            }else if (i == 2 || i == 3 || i == 5) {
                primearray[i] = true;
            }else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                primearray[i] = false;
            }else {
                primearray[i] = true;
            }
            i++;
        }
        return primearray;
    }

    public static int[] primeresult (boolean[] asr, int n) {
        asr = primenums(n);
        int[] index = new int[n];
        for (int i = 0; i < primenums(n).length; i++) {
            primecounter = 0;
            if (primenums(n)[i] == true) {
                index[i] = i;
            }
        }
        return index;
    }
}