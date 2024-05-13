package your_registration_number.java;

public class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    // Constructor
    public Member(int MemberID, String LastName, String FirstName, int Handicap, char Gender, String Team, String MemberType, int Coach, long Phone, Date JoinDate) {
        this.MemberID = MemberID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.Handicap = Handicap;
        this.Gender = Gender;
        this.Team = Team;
        this.MemberType = MemberType;
        this.Coach = Coach;
        this.Phone = Phone;
        this.JoinDate = JoinDate;
    }

    // Getter methods
    public int getMemberID() {
        return MemberID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getHandicap() {
        return Handicap;
    }

    public char getGender() {
        return Gender;
    }

    public String getTeam() {
        return Team;
    }

    public String getMemberType() {
        return MemberType;
    }

    public int getCoach() {
        return Coach;
    }

    public long getPhone() {
        return Phone;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    // Display method
    public void display() {
        System.out.println("Member ID: " + MemberID);
        System.out.println("Last Name: " + LastName);
        System.out.println("First Name: " + FirstName);
        System.out.println("Handicap: " + Handicap);
        System.out.println("Gender: " + Gender);
        System.out.println("Team: " + Team);
        System.out.println("Member Type: " + MemberType);
        System.out.println("Coach: " + Coach);
        System.out.println("Phone: " + Phone);
        System.out.println("Join Date: " + JoinDate.toString());
        System.out.println();
    }
}
