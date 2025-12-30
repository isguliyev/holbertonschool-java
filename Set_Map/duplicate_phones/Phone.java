import java.util.Objects;

public class Phone {
    private String areaCode;
    private String number;

    public Phone(String areaCode, String number) {
        setAreaCode(areaCode);
        setNumber(number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.number);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Phone other = (Phone)object;

        return other.getAreaCode().equals(this.areaCode) && other.getNumber().equals(this.number);
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", this.areaCode, this.number);
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    public String getNumber() {
        return this.number;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}