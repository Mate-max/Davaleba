package homework1.java;

public class Mosaxleoba {
    private String name, surname, address;

    public String getName() {
        return name;
    }

    public Mosaxleoba(String saxeli , String gvari, String misamarti) {
        this.name = saxeli;
        this.surname = gvari;
        this.address = misamarti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{ ");
        sb.append("სახელი = '").append(name).append('\'');
        sb.append(", გვარი = '").append(surname).append('\'');
        sb.append(", მისამართი = '").append(address).append('\'');
        sb.append(" }");
        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String gvari) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String misamarti) {
        this.address = address;
    }
}

