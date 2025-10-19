public class Client {
    private int code;
    private String name;
    private boolean premium;

    public Client(int code, String name, boolean premium) {
        setCode(code);
        setName(name);
        setPremium(premium);
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public boolean isPremium() {
        return this.premium;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}