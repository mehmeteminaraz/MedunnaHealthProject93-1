package pojos;

public class Registrant {

    private String login;
    private String firstName;
    private String lastName;
    private String SSN;
    private String email;
    private String authorities;

    public Registrant() {
    }

    public Registrant(String login, String firstName, String lastName, String SSN, String email, String authorities) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.email = email;
        this.authorities = authorities;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "Registrant{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN='" + SSN + '\'' +
                ", email='" + email + '\'' +
                ", authorities='" + authorities + '\'' +
                '}';
    }

    /*{
       "id": 43200,
       "login": "doctorkubra",
       "firstName": "Kübra",
       "lastName": "P",
       "ssn": "123-97-0123",
       "email": "kubra1231@gmail.com",
       "imageUrl": null,
       "activated": true,
       "langKey": "en",
       "createdBy": "anonymousUser",
       "createdDate": "2022-03-29T10:36:15.080262Z",
       "lastModifiedBy": "team93admin",
       "lastModifiedDate": "2022-03-29T10:53:48.171042Z",
       "authorities": [
           "ROLE_PHYSICIAN"
       ]
   }
   */



}