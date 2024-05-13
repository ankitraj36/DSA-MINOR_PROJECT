package your_registration_number.java;

public class GolfClub {
    public static void main(String[] args) {
        // Creating an array of Member objects
        Member[] members = new Member[20]; // Total members in the provided data

        // Setting details for each member
        members[0] = new Member(118, "McKenzie", "Melissa", 30, 'F', "", "Junior", 153, 963270, new Date(28, "May", 2005));
        members[1] = new Member(138, "Stone", "Michael", 30, 'M', "", "Senior", 0, 983223, new Date(31, "May", 2009));
        members[2] = new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649, new Date(12, "Aug", 2006));
        members[3] = new Member(176, "Branch", "Helen", 0, 'F', "", "Social", 0, 589419, new Date(6, "Dec", 2011));
        members[4] = new Member(178, "Beck", "Sarah", 0, 'F', "", "Social", 0, 226596, new Date(24, "Jan", 2010));
        members[5] = new Member(228, "Burton", "Sandra", 26, 'F', "", "Junior", 153, 244493, new Date(9, "Jul", 2013));
        members[6] = new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "Mar", 2008));
        members[7] = new Member(239, "Spence", "Thomas", 10, 'M', "", "Senior", 0, 697720, new Date(22, "Jun", 2006));
        members[8] = new Member(258, "Olson", "Barbara", 16, 'F', "", "Senior", 0, 370186, new Date(29, "Jul", 2013));
        members[9] = new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13, "Aug", 2013));
        members[10] = new Member(290, "Sexton", "Thomas", 26, 'M', "", "Senior", 235, 268936, new Date(28, "Jul", 2008));
        members[11] = new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393, new Date(18, "May", 2009));
        members[12] = new Member(331, "Schmidt", "Thomas", 25, 'M', "", "Senior", 153, 867492, new Date(7, "Apr", 2009));
        members[13] = new Member(332, "Bridges", "Deborah", 12, 'F', "", "Senior", 235, 279087, new Date(23, "Mar", 2007));
        members[14] = new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813, new Date(17, "Apr", 2009));
        members[15] = new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 2007));
        members[16] = new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "Nov", 2007));
        members[17] = new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "Aug", 2005));
        members[18] = new Member(469, "Willis", "Carolyn", 29, 'F', "", "Junior", 0, 688378, new Date(14, "Jan", 2011));
        members[19] = new Member(487, "Kent", "Susan", 0, 'F', "", "Social", 0, 707217, new Date(7, "Oct", 2010));

        // Displaying records where the member's JoinDate is earlier than 07-Apr-09
        System.out.println("Members joined before 07-Apr-09:");
        for (Member member : members) {
            if (member.getJoinDate().getYear() < 2009 ||
                    (member.getJoinDate().getYear() == 2009 && member.getJoinDate().getMonth().equals("April") && member.getJoinDate().getDay() < 7)) {
                member.display();
            }
        }

        // Displaying records of all senior members whose handicap score is less than 12
        System.out.println("\nSenior members with handicap score less than 12:");
        for (Member member : members) {
            if (member.getMemberType().equals("Senior") && member.getHandicap() < 12) {
                member.display();
            }
        }

        // Displaying records of all female senior members who are part of TeamB
        System.out.println("\nFemale senior members from TeamB:");
        for (Member member : members) {
            if (member.getGender() == 'F' && member.getMemberType().equals("Senior") && member.getTeam().equals("TeamB")) {
                member.display();
            }
        }
    }
}
