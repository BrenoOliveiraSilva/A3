package people;

import utilities.Project;

public class Client {
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private String age;
    private String address;

    private Project project;

    private int pairsCount;

    public Client(String name, String cpf, String email, String phone, String age, String address) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.address = address;
        this.pairsCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Project getProject() {
        return project;
    }

    public int getPairsCount() {
        return pairsCount;
    }

    public void increasePairsCount() {
        this.pairsCount++;
    }
}
