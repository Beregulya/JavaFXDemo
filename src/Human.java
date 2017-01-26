import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Human {

    private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

}