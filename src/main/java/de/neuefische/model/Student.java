package de.neuefische.model;
import java.lang.*;
import java.util.Objects;

public class Student {
    private String name;
    private String adress;
    private int cardNr;
    private String id;
    private PartyInviteStatus partyInviteStatus;

    public Student(String id,String name, String adress, int cardNr, PartyInviteStatus partyInviteStatus) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.cardNr = cardNr;
        this.partyInviteStatus = partyInviteStatus;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCardNr() {
        return cardNr;
    }

    public void setCardNr(int cardNr) {
        this.cardNr = cardNr;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PartyInviteStatus getPartyInviteStatus() {
        return partyInviteStatus;
    }

    public void setPartyInviteStatus(PartyInviteStatus partyInviteStatus) {
        this.partyInviteStatus = partyInviteStatus;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", cardNr=" + cardNr +
                ", id='" + id + '\'' +
                ", partyInviteStatus=" + partyInviteStatus +
                '}';
    }
}