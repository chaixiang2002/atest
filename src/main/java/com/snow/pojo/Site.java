package com.snow.pojo;

import java.util.Objects;

public class Site {
    private Integer ID                 ;
    private String ApplicantSite      ;//////////
    private String Borrower            ;////////////
    private String time                ;//////////
    private String ApplicationPurposes; //////////

    public Site() {
    }

    public boolean equalsNoID(Object o) {///////////////////////////// is older
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        System.out.println(ApplicantSite.equals(site.ApplicantSite));
        System.out.println(ApplicantSite);
        System.out.println(ApplicantSite.length());
        System.out.println(site.ApplicantSite);
        System.out.println(site.ApplicantSite.length());
        System.out.println("asd"+ApplicantSite.compareTo(site.ApplicantSite));



        System.out.println(Borrower.equals(site.Borrower));
//        System.out.println(time.equals(site.time));
//        System.out.println(ApplicationPurposes.equals(site.ApplicationPurposes));
        System.out.println();
        return ApplicantSite.equals(site.ApplicantSite) && Borrower.equals(site.Borrower) && time.equals(site.time) && ApplicationPurposes.equals(site.ApplicationPurposes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ApplicantSite, Borrower, time, ApplicationPurposes);
    }

    @Override
    public String toString() {
        return "\n\nSite{" +
                ", ID=" + ID +'\n' +
                ", ApplicantSite='" + ApplicantSite + '\n' +
                ", Borrower='" + Borrower + '\n' +
                ", time='" + time + '\n' +
                ", ApplicationPurposes='" + ApplicationPurposes + '\n' +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getApplicantSite() {
        return ApplicantSite;
    }

    public void setApplicantSite(String applicantSite) {
        ApplicantSite = applicantSite;
    }

    public String getBorrower() {
        return Borrower;
    }

    public void setBorrower(String borrower) {
        Borrower = borrower;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getApplicationPurposes() {
        return ApplicationPurposes;
    }

    public void setApplicationPurposes(String applicationPurposes) {
        ApplicationPurposes = applicationPurposes;
    }
}
