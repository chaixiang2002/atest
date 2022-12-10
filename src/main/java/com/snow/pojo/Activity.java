package com.snow.pojo;

public class Activity {
    private Integer  ID               ;
    private String  Name            ;
    private String  OrganizationName ;
    private String  time        ;
    private Integer  MaterialsID      ;
    private Integer  SiteID           ;
    private Integer ExpenditureID    ;
    private Integer  GroupID          ;
    private String  Content     ;

    public Activity() {
    }

    @Override
    public String toString() {
        return "Activity{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", OrganizationName='" + OrganizationName + '\'' +
                ", time='" + time + '\'' +
                ", MaterialsID=" + MaterialsID +
                ", SiteID=" + SiteID +
                ", ExpenditureID=" + ExpenditureID +
                ", GroupID=" + GroupID +
                ", Content='" + Content + '\'' +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String organizationName) {
        OrganizationName = organizationName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMaterialsID() {
        return MaterialsID;
    }

    public void setMaterialsID(Integer materialsID) {
        MaterialsID = materialsID;
    }

    public Integer getSiteID() {
        return SiteID;
    }

    public void setSiteID(Integer siteID) {
        SiteID = siteID;
    }

    public Integer getExpenditureID() {
        return ExpenditureID;
    }

    public void setExpenditureID(Integer expenditureID) {
        ExpenditureID = expenditureID;
    }

    public Integer getGroupID() {
        return GroupID;
    }

    public void setGroupID(Integer groupID) {
        GroupID = groupID;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
