public class Name { // Сущность Имена

    private String lastName;    // фамилия
    private String firstName;   // имя
    private String middleName;  // отчество

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Name(String firstName) {
        this(null, firstName, null);
    }

    @Override       // общая сборка ФИО
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null) {
            sb.append(lastName).append(" ");
        }
        if (firstName != null) {
            sb.append(firstName).append(" ");
        }
        if (middleName != null) {
            sb.append(middleName);
        }
        return sb.toString().trim();
    }

}
