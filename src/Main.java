package src;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
     //  var resourceBundle = ResourceBundle.getBundle("messages", Locale.ENGLISH);
       LocalizationManager localizationManager = LocalizationManager.getInstance(Locale.ENGLISH);
        System.out.println(localizationManager.getString("messages"));
    }
}
