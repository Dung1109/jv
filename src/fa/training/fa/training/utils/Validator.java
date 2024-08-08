package fa.training.fa.training.utils;

public class Validator {

    public static boolean isValidOrderNumber(String orderNumber) {
        return orderNumber != null && orderNumber.length() == Constants.ORDER_NUMBER_LENGTH;
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }
}
