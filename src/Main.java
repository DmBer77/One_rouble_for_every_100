public class Main {
    public static void main(String[] args) {
        int account = 1_800;
        int addSumm = 1_350;
        int bonus;

        if (addSumm >= 1_000) {
            bonus = addSumm / 100;
            account = account + addSumm + bonus;
        } else {
            account = account + addSumm;
        }

        System.out.println("Сумма на счет составляет: " + account);
    }
}
