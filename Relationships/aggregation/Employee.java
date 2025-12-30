public class Employee {
    private String name;
    private int code;
    private Address address;

    public Employee(String name, int code, Address address) {
        setName(name);
        setCode(code);
        setAddress(address);
    }

    public void introduce() {
        System.out.printf(
            "%s (Code: %s, Name: %s, District: %s, City: %s, Country: %s)\n",
            this.getClass().getSimpleName(),
            this.code,
            this.name,
            this.address.getDistrict(),
            this.address.getCity(),
            this.address.getCountry()
        );
    }

    public String getName() {
        return this.name;
    }

    public int getCode() {
        return this.code;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}