public class Guest {
    private String name;
    private String phone;
    private String email;

    public Guest(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getDetails() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }

    public String getEmail() {
        return email;
    }
}