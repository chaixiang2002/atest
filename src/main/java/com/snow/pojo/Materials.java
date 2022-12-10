package com.snow.pojo;

public class Materials {
    private Integer ID;
    private String MaterialsList ;
    private Integer Borrower ;
    private String time   ;         ////////////////数据库有修改
    private String BorrowingPurposes ;

    public Materials() {
    }

    @Override
    public String toString() {
        return "\n\n +Materials{" +'\n' +
                ", ID=" + ID +'\n' +
                ", MaterialsList='" + MaterialsList + '\n' +
                ", Borrower=" + Borrower +'\n' +
                ", time='" + time  +'\n' +
                ", BorrowingPurposes='" + BorrowingPurposes + '\n' +
                '}' ;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getMaterialsList() {
        return MaterialsList;
    }

    public void setMaterialsList(String materialsList) {
        MaterialsList = materialsList;
    }

    public Integer getBorrower() {
        return Borrower;
    }

    public void setBorrower(Integer borrower) {
        Borrower = borrower;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBorrowingPurposes() {
        return BorrowingPurposes;
    }

    public void setBorrowingPurposes(String borrowingPurposes) {
        BorrowingPurposes = borrowingPurposes;
    }
}
