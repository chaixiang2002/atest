package com.snow.pojo;

public class Members {
    private Integer  ID           ;
    private String  UserName    ;
    private String  Password    ;
    private String  Name        ;
    private String  Sex          ;
    private String  Profession  ;
    private String  Introduction ="" ;//
    private Integer  PostID       ;
    private Integer  MessageBoxID;

    public Members() {
    }

    @Override
    public String toString() {
        return "Members{" +
                "ID=" + ID +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Profession='" + Profession + '\'' +
                ", Introduction='" + Introduction + '\'' +
                ", PostID=" + PostID +
                ", MessageBoxID=" + MessageBoxID +
                '}'+'\n';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    public Integer getPostID() {
        return PostID;
    }

    public void setPostID(Integer postID) {
        PostID = postID;
    }

    public Integer getMessageBoxID() {
        return MessageBoxID;
    }

    public void setMessageBoxID(Integer messageBoxID) {
        MessageBoxID = messageBoxID;
    }
}
