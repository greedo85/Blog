public class Author {
    private String name;
    private String surname;

    public void setName( String name ) {
        this.name = name;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Autor:\n" +
                "imię: " + name + "\n" +
                "nazwisko: " + surname + "\n";
    }
}
