package de.neuefische.model;

import de.neuefische.Citizen;

public class ComputerScienceStudent extends Student implements Citizen {
    private String skills;

    public ComputerScienceStudent(String id, String name,String adress, int cardNr, PartyInviteStatus partyInviteStatus, String skills) {
        super(id, name, adress, cardNr, partyInviteStatus);
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "skills='" + skills + '\'' +
                "} " + super.toString();
    }

    public ComputerScienceStudent() {
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}