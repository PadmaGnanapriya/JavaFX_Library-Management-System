package lk.ijse.libraryManagementSystem.dto;

public class MemberDTO {
    private String memberID;
    private String name;
    private String number;
    private String email;

    public MemberDTO() {
    }

    public MemberDTO(String memberID, String name, String number, String email) {
        this.setMemberID(memberID);
        this.setName(name);
        this.setNumber(number);
        this.setEmail(email);
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
