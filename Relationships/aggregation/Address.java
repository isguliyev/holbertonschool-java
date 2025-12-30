public class Address {
    private String street;
    private String number;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String country;

    public Address(
        String street,
        String number,
        String complement,
        String district,
        String city,
        String state,
        String country
    ) {
        setStreet(street);
        setNumber(number);
        setComplement(complement);
        setDistrict(district);
        setCity(city);
        setState(state);
        setCountry(country);
    }

    public String getStreet() {
        return this.street;
    }

    public String getNumber() {
        return this.number;
    }

    public String getComplement() {
        return this.complement;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}