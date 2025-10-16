public class Contact {
    private String name;
    private String phoneNumber;
    private NumberType type;

    public Contact(String name, String phoneNumber, NumberType type) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setType(type);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public NumberType getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(NumberType type) {
        this.type = type;
    }
}