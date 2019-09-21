package EAA;

public class User {

    private String userName;
    private String passWord;
    private String Name;
    private String phoneNum;
    private String carrier;

    public User(String userName, String passWord, String Name, String phoneNum, String carrier) {
        this.userName = userName;
        this.passWord = passWord;
        this.Name = Name;
        this.phoneNum = phoneNum;
        this.carrier = carrier;
    }

    public User(String userName, String Name, String phoneNum, String carrier) {
        this.userName = userName;
        this.Name = Name;
        this.phoneNum = phoneNum;
        this.carrier = carrier;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
