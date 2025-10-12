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
        System.out.printf("Code: %s\n", getCode());
        System.out.printf("Name: %s\n", getName());
        System.out.printf("District: %s\n", getAddress().getDistrict());
        System.out.printf("City: %s\n", getAddress().getCity());
        System.out.printf("Country: %s\n", getAddress().getCountry());
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