package de.neuefische.model;

import de.neuefische.Citizen;

public class ComputerScienceStudent extends Student implements Citizen {
    private String skills;

    public ComputerScienceStudent() {

    }

    public ComputerScienceStudent(String name, String adress, int cardNr, String city, int studentNr, int id, String skills) {
        super(name, adress, cardNr, city, studentNr, id);
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "skills='" + skills + '\'' +
                "} " + super.toString();
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    @Override
    public int getIdentityCardNumber() {
        return super.getCardNr();
    }
}