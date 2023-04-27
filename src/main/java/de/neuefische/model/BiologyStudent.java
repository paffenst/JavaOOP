package de.neuefische.model;

import de.neuefische.Citizen;
public class BiologyStudent extends Student implements Citizen {
    private boolean laborSkills;

    public BiologyStudent(String id, String name, String adress, int cardNr, PartyInviteStatus partyInviteStatus, boolean laborSkills) {
        super(id, name, adress, cardNr, partyInviteStatus);
        this.laborSkills = laborSkills;
    }

    public BiologyStudent() {
    }

    public boolean isLaborSkills() {
        return laborSkills;
    }

    public void setLaborSkills(boolean laborSkills) {
        this.laborSkills = laborSkills;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "laborSkills=" + laborSkills +
                "} " + super.toString();
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }
}
