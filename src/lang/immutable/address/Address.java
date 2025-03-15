package lang.immutable.address;

public class Address {

    private String value;

    public Address(String value) {
        this.value = value;
    }

    public Address() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
