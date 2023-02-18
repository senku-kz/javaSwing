package entity;

public class User {
    private String iin;
    private String password;
    private String surname;
    private String firstname;
    private String patronymic;


    public User(String iin, String password, String surname, String firstname, String patronymic) {
        this.iin = iin;
        this.password = password;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }
}
