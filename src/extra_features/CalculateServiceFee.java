package extra_features;

public class CalculateServiceFee {

    @SuppressWarnings("CallToPrintStackTrace")
    public static String calculateServiceFee(String amountText) {
        try {
            double amount = Double.parseDouble(amountText);
            double serviceFee = amount * 0.02;
            return String.format("%.2f", serviceFee);
        } catch (NumberFormatException error) {
            error.printStackTrace();
            return "0.00";
        }
    }
}