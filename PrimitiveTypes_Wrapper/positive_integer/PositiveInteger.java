public class PositiveInteger {
    private int value;

    public PositiveInteger(int value) throws IllegalArgumentException {
        setValue(value);
    }

    public PositiveInteger(String value) throws IllegalArgumentException {
        setValue(Integer.parseInt(value));
    }

    public boolean isPrime() {
        if (getValue() == 1) {
            return false;
        }

        for (int i = 2; i * i <= getValue(); i++) {
            if (getValue() % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int getValue()  {
        return this.value;
    }

    public void setValue(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Value is not a positive integer");
        }

        this.value = value;
    }
}