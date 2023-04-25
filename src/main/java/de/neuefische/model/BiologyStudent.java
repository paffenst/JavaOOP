package de.neuefische.model;

import de.neuefische.Citizen;

public class BiologyStudent extends Student implements Citizen {
    private boolean loborSkills;

    public BiologyStudent(String name, String adress, int cardNr, String city, int studentNr, int id, boolean loborSkills) {
        super(name, adress, cardNr, city, studentNr, id);
        this.loborSkills = loborSkills;
    }

    public BiologyStudent() {
    }

    public boolean isLoborSkills() {
        return loborSkills;
    }

    public void setLoborSkills(boolean loborSkills) {
        this.loborSkills = loborSkills;
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
