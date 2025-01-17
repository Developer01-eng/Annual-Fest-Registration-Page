public class Query {
    static String createDB = "CREATE DATABASE IF NOT EXISTS soex";
    static String createTB = " CREATE TABLE IF NOT EXISTS student (Username VARCHAR(30),Password VARCHAR(30),Name VARCHAR(30),Course VARCHAR(30),Year VARCHAR(30),`Roll No.` VARCHAR(30),`Mode of Payment` VARCHAR(30),`Participation in Cultural Event` VARCHAR(30),`Participation in Sports` VARCHAR(30))";
    static String insert = " INSERT INTO student (Username,Password,Name,Course,Year,`Roll No.`,`Mode of Payment`,`Participation in Cultural Event`,`Participation in Sports`) VALUES (?,?,?,?,?,?,?,?,?)";
    static String deleteColumn = " DELETE FROM student WHERE `Roll No.` = ?";
    static String updateTable = "UPDATE student SET `Roll No.` = ?  WHERE  Username =  ? AND Password = ? ";
    static String readTable = "SELECT * FROM student";
    static String countCricketPlayers = "SELECT COUNT(`Participation in Sports`) FROM student WHERE `Participation in Sports` = 'Cricket ' OR  `Participation in Sports` = 'Cricket Volleyball ' OR `Participation in Sports` = 'Cricket Badminton ' OR `Participation in Sports` = 'Cricket Volleyball Badminton ' ";
    static String countVolleyballPlayers = "SELECT COUNT(`Participation in Sports`) FROM student WHERE `Participation in Sports` = 'Volleyball ' OR  `Participation in Sports` = 'Cricket Volleyball ' OR `Participation in Sports` = 'Volleyball Badminton ' OR `Participation in Sports` = 'Cricket Volleyball Badminton ' ";
    static String countBadmintonPlayers = "SELECT COUNT(`Participation in Sports`) FROM student WHERE `Participation in Sports` = 'Badminton ' OR  `Participation in Sports` = 'Volleyball Badminton ' OR `Participation in Sports` = 'Cricket Badminton ' OR `Participation in Sports` = 'Cricket Volleyball Badminton ' ";
    static String countMusicParticipants = "SELECT COUNT(`Participation in Cultural Event`) FROM student WHERE `Participation in Cultural Event` = 'Music ' OR  `Participation in Cultural Event` = 'Music Dance ' OR `Participation in Cultural Event` = 'Music Other ' OR `Participation in Cultural Event` = 'Music Dance Other ' ";
    static String countDanceParticipants = "SELECT COUNT(`Participation in Cultural Event`) FROM student WHERE `Participation in Cultural Event` = 'Dance ' OR  `Participation in Cultural Event` = 'Music Dance ' OR `Participation in Cultural Event` = 'Dance Other ' OR `Participation in Cultural Event` = 'Music Dance Other ' ";
    static String countOtherParticipants = "SELECT COUNT(`Participation in Cultural Event`) FROM student WHERE `Participation in Cultural Event` = 'Other ' OR  `Participation in Cultural Event` = 'Music Other ' OR `Participation in Cultural Event` = 'Dance Other ' OR `Participation in Cultural Event` = 'Music Dance Other ' ";
    static String TPayment = "SELECT COUNT(`Mode of Payment`) FROM student WHERE `Mode of Payment` = 'Online' OR `Mode of Payment` = 'Cash'";
    static String DuePayment = "SELECT COUNT(`Mode of Payment`) FROM student WHERE `Mode of Payment` = 'Pending' ";

}
