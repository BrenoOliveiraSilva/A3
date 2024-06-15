package people;

public class Employee {
    private String name;
    private String phone;
    private String email;
    private String cpf;
    private String age;
    private String address;
    private String username;
    private String password;
    private String registration;
    private int pairsCount;

    public Employee(String name, String phone, String email, String cpf, String age, String address, String username, String password, String registration) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.cpf = cpf;
        this.age = age;
        this.address = address;
        this.username = username;
        this.password = password;
        this.registration = registration;
        this.pairsCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getPairsCount() {
        return this.pairsCount;
    }

    public void increasePairsCount() {
        this.pairsCount++;
    }
}
