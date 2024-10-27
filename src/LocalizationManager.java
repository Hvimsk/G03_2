package src;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationManager {
    private static LocalizationManager instance;
    private ResourceBundle resourceBundle;
    private Locale currentLocale;

    public LocalizationManager(Locale locale) {
        this.currentLocale = locale;
        loadBundle();
    }

    public static LocalizationManager getInstance(Locale locale) {
        if (instance == null || !instance.currentLocale.equals(locale)) {
            instance = new LocalizationManager(locale);
        }
        return instance;
    }

    private void loadBundle() {
        resourceBundle = ResourceBundle.getBundle("src/resources/messages", currentLocale);
    }

    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
