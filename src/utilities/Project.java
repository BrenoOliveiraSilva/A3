package utilities;

import people.Client;

public class Project {
    private Client Client;
    private String projectName;
    private String mandatoryPalette;
    private String forbiddenPalette;
    private String Observations;
    private String startDate;
    private String deadline;
    private int pairsCount;

    public Project(String projectName, String mandatoryPalette, String forbiddenPalette, String Observations, String startDate, String deadline, Client client) {
        this.Client = client;
        this.projectName = projectName;
        this.mandatoryPalette = mandatoryPalette;
        this.forbiddenPalette = forbiddenPalette;
        this.Observations = Observations;
        this.startDate = startDate;
        this.deadline = deadline;
        this.pairsCount = 0;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMandatoryPalette() {
        return mandatoryPalette;
    }

    public void setMandatoryPalette(String mandatoryPalette) {
        this.mandatoryPalette = mandatoryPalette;
    }

    public String getForbiddenPalette() {
        return forbiddenPalette;
    }

    public void setForbiddenPalette(String forbiddenPalette) {
        this.forbiddenPalette = forbiddenPalette;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String Observations) {
        this.Observations = Observations;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getPairsCount() {
        return pairsCount;
    }

    public void increasePairsCount() {
        this.pairsCount++;
    }

    public String getName() {
        return Client.getName();
    }

    @Override
    public String toString() {
        return "Nome do projeto: " + projectName + " | Data de início: " + startDate + " | Prazo: " + deadline + " | Cliente: " + Client.getName() + "\n";
    }
}
