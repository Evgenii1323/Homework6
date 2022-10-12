public class Tax {

    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int taxEarnings(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static String taxChooser (int earnings, int spendings) {
        int tax1 = taxEarningsMinusSpendings(earnings, spendings);
        int tax2 = taxEarnings(earnings);
        if (tax1 > tax2) {
            return "Мы советуем Вам УНС доходы";
        } else {
            return "Мы советуем Вам УНС доходы минус расходы";
        }
    }
}