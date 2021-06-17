public class ATM {

    public int countBanknotes(int sum) {

        int[] nominals = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        int find = nominals.length - 1;
        int banktoteCounter = 0;

        while (find >= 0) {
            if (nominals[find] > sum) {
                find--;
            } else {
                sum -= nominals[find];
                banktoteCounter++;
            }
        }
        return banktoteCounter;

    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(578));
    }
}
