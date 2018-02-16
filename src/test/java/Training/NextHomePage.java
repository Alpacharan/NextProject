package Training;

public class NextHomePage extends Base {
    public boolean isOnHomePage() {
        return driver.getCurrentUrl().endsWith(".co.uk/");
}}
