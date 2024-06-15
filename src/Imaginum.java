import people.Employee;
import people.Client;
import utilities.Constants;
import utilities.Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Imaginum {
    private List<Client> clients; // LISTA DE CLIENTES CADASTRADOS
    private List<Employee> employees; // LISTA DE FUNCIONÁRIOS CADASTRADOS
    private List<Project> projects; // LISTA DE PROJETOS CADASTRADOS

    public Imaginum() {
        clients = new ArrayList<>();
        employees = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public void systemInterface() {
        // USUÁRIO PADRÃO
        Employee employee = new Employee("Admin", "000000000", "Admin@gmail.com", "000.000.000-00", "00", "Rua Admin", "admin", "admin", "0000");
        employees.add(employee);

        // INTERFACE DO SISTEMA
        JFrame frame = new JFrame(Constants.APP_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        //  TÍTULO
        JLabel title = new JLabel(Constants.APP_NAME, JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 60));
        frame.add(title, BorderLayout.NORTH);

        // LOGIN DE FUNCIONÁRIOS
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // PAINEL DE LOGIN
                JPanel loginPanel = new JPanel();
                loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
                JTextField usernameField = new JTextField(10);
                JTextField passwordField = new JTextField(10);

                loginPanel.add(new JLabel("Usuário:"));
                loginPanel.add(usernameField);
                loginPanel.add(new JLabel("Senha:"));
                loginPanel.add(passwordField);

                int result = JOptionPane.showConfirmDialog(null, loginPanel, "Login", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    String username = usernameField.getText();
                    String password = passwordField.getText();

                    for (Employee employee : employees) {
                        if (employee.getUsername().equals(username) && employee.getPassword().equals(password)) {
                            JOptionPane.showMessageDialog(null, "Bem-vindo, " + employee.getName() + "!");
                            mainInterface();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                }
            }
        });

        // REGISTRAR FUNCIONÁRIOS
        JButton registerEmployee = new JButton("Cadastrar Funcionário");
        registerEmployee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // PAINEL DE EXIBIÇÂO DE FUNCIONÁRIOS
                JPanel employeesPanel = new JPanel();
                employeesPanel.setLayout(new BoxLayout(employeesPanel, BoxLayout.Y_AXIS));
                JTextField nameField = new JTextField(10);
                JTextField phoneField = new JTextField(10);
                JTextField emailField = new JTextField(10);
                JTextField cpfField = new JTextField(10);
                JTextField ageField = new JTextField(10);
                JTextField addressField = new JTextField(10);
                JTextField usernameField = new JTextField(10);
                JTextField passwordField = new JTextField(10);
                JTextField registrationField = new JTextField(10);

                employeesPanel.add(new JLabel("Nome:"));
                employeesPanel.add(nameField);
                employeesPanel.add(new JLabel("Telefone:"));
                employeesPanel.add(phoneField);
                employeesPanel.add(new JLabel("Email:"));
                employeesPanel.add(emailField);
                employeesPanel.add(new JLabel("CPF:"));
                employeesPanel.add(cpfField);
                employeesPanel.add(new JLabel("Idade:"));
                employeesPanel.add(ageField);
                employeesPanel.add(new JLabel("Endereço:"));
                employeesPanel.add(addressField);
                employeesPanel.add(new JLabel("Usuário:"));
                employeesPanel.add(usernameField);
                employeesPanel.add(new JLabel("Senha:"));
                employeesPanel.add(passwordField);
                employeesPanel.add(new JLabel("Matrícula:"));
                employeesPanel.add(registrationField);

                int result = JOptionPane.showConfirmDialog(null, employeesPanel, "Cadastrar Funcionário", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    String name = nameField.getText();
                    String phone = phoneField.getText();
                    String email = emailField.getText();
                    String cpf = cpfField.getText();
                    String age = ageField.getText();
                    String address = addressField.getText();
                    String username = usernameField.getText();
                    String password = passwordField.getText();
                    String registration = registrationField.getText();

                    Employee employee = new Employee(name, phone, email, cpf, age, address, username, password, registration);
                    employees.add(employee);
                }
            }
        });

        // PAINEL DE EXIBIÇÂO DE FUNCIONÁRIOS
        JPanel employeesPanel = new JPanel();
        employeesPanel.setLayout(new BorderLayout());

        // ADICIONANDO COMPONENTES
        JPanel registerPanel = new JPanel();
        registerPanel.setLayout(new FlowLayout());
        registerPanel.add(loginButton);
        registerPanel.add(registerEmployee);
        frame.add(registerPanel, BorderLayout.CENTER);

        // EXIBIR JANELA
        frame.setVisible(true);
    }

    public void mainInterface() {
        // PROJETO PADRÃO
        Client client = new Client("Admin", "000.000.000-00", "admin@gmail.com", "000000000", "00", "Rua Admin");
        clients.add(client);
        Project project = new Project("Admin", "Admin", "Admin", "Admin", "00/00/0000", "00/00/0000", client);
        projects.add(project);

        // INTERFACE PRINCIPAL
        JFrame frame = new JFrame(Constants.APP_NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        // TÍTULO
        JLabel title = new JLabel(Constants.APP_NAME, JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 60));
        frame.add(title, BorderLayout.NORTH);

        // REGISTRAR CLIENTES E PROJETOS
        JButton registerClientAndProject = new JButton("Cadastrar Projeto");
        registerClientAndProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // PAINEL DE EXIBIÇÂO DE CLIENTES
                JPanel clientsPanel = new JPanel();
                clientsPanel.setLayout(new BoxLayout(clientsPanel, BoxLayout.Y_AXIS));
                JTextField nameField = new JTextField(10);
                JTextField cpfField = new JTextField(10);
                JTextField emailField = new JTextField(10);
                JTextField phoneField = new JTextField(10);
                JTextField ageField = new JTextField(10);
                JTextField addressField = new JTextField(10);

                clientsPanel.add(new JLabel("Nome:"));
                clientsPanel.add(nameField);
                clientsPanel.add(new JLabel("CPF:"));
                clientsPanel.add(cpfField);
                clientsPanel.add(new JLabel("Email:"));
                clientsPanel.add(emailField);
                clientsPanel.add(new JLabel("Telefone:"));
                clientsPanel.add(phoneField);
                clientsPanel.add(new JLabel("Idade:"));
                clientsPanel.add(ageField);
                clientsPanel.add(new JLabel("Endereço:"));
                clientsPanel.add(addressField);

                int result = JOptionPane.showConfirmDialog(null, clientsPanel, "Cadastrar Cliente", JOptionPane.OK_CANCEL_OPTION);

                if (result == JOptionPane.OK_OPTION) {
                    String name = nameField.getText();
                    String cpf = cpfField.getText();
                    String email = emailField.getText();
                    String phone = phoneField.getText();
                    String age = ageField.getText();
                    String address = addressField.getText();

                    Client client = new Client(name, cpf, email, phone, age, address);
                    clients.add(client);

                    registerProject(client);
                }
            }
        });

        // BOTÂO DE EXIBIÇÂO DE CLIENTES E PROJETOS
        JButton showClientsAndProjects = new JButton("Cronograma Geral");
        showClientsAndProjects.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // PAINEL DE EXIBIÇÂO DE CLIENTES E PROJETOS
                JPanel clientsAndProjectsPanel = new JPanel();
                clientsAndProjectsPanel.setLayout(new BoxLayout(clientsAndProjectsPanel, BoxLayout.Y_AXIS));

                // EXIBIR PROJETOS
                clientsAndProjectsPanel.add(new JLabel("Projetos:"));
                for (Project project : projects) {
                    clientsAndProjectsPanel.add(new JLabel("Cliente: " + project.getName()));
                    clientsAndProjectsPanel.add(new JLabel("Projeto: " + project.getProjectName()));
                    clientsAndProjectsPanel.add(new JLabel("Data de Entrega: " + project.getDeadline()));
                }

                JOptionPane.showMessageDialog(null, clientsAndProjectsPanel);
            }
        });

        // ADICIONANDO COMPONENTES
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.add(registerClientAndProject);
        mainPanel.add(showClientsAndProjects);
        frame.add(mainPanel, BorderLayout.CENTER);

        // EXIBIR JANELA
        frame.setVisible(true);
    }

    // REGISTRAR PROJETOS
    public void registerProject(Client client){
        // PAINEL DE EXIBIÇÂO DE PROJETOS
        JPanel projectsPanel = new JPanel();
        projectsPanel.setLayout(new BoxLayout(projectsPanel, BoxLayout.Y_AXIS));
        JTextField nameField = new JTextField(10);
        JTextField descriptionField = new JTextField(10);
        JTextField employeeField = new JTextField(10);
        JTextField startDateField = new JTextField(10);
        JTextField deadlineField = new JTextField(10);

        projectsPanel.add(new JLabel("Nome:"));
        projectsPanel.add(nameField);
        projectsPanel.add(new JLabel("Descrição:"));
        projectsPanel.add(descriptionField);
        projectsPanel.add(new JLabel("Funcionário:"));
        projectsPanel.add(employeeField);
        projectsPanel.add(new JLabel("Data Inicial:"));
        projectsPanel.add(startDateField);
        projectsPanel.add(new JLabel("Prazo:"));
        projectsPanel.add(deadlineField);

        int result = JOptionPane.showConfirmDialog(null, projectsPanel, "Registrar Projeto", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String name = nameField.getText();
            String description = descriptionField.getText();
            String employee = employeeField.getText();
            String startDate = startDateField.getText();
            String deadline = deadlineField.getText();

            Project project = new Project(name, description, client.getName(), employee, startDate, deadline, client);
            projects.add(project);
        }
    }
}