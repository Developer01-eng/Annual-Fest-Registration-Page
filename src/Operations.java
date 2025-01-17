
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class Operations {

    static ArrayList<String> list = new ArrayList<>();

    // Create
    public static void createDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String username = "root";
            String password = "Developer_01";
            String query = Query.createDB;
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stm = conn.createStatement();
            stm.execute(query);
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("createDatabase() error");
            e.printStackTrace();
        }
    }

    public static void createTable() {
        try {
            Connection conn = DB.getConnect();
            String query = Query.createTB;
            Statement stm = conn.createStatement();
            stm.execute(query);
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("createTable() error");
            e.printStackTrace();
        }
    }

    // Getters for getting list of data to insert
    public static void getList(ArrayList<String> infoList) {
        list = infoList;
    }

    // Insert
    public static void insertData() {
        try {
            Connection conn = DB.getConnect();
            String query = Query.insert;
            PreparedStatement pstm = conn.prepareStatement(query);
            for (int i = 0; i < 9; i++) {
                pstm.setString(i + 1, list.get(i));
            }
            pstm.execute();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("insetData() error");
            e.printStackTrace();
        }
    }

    // Delete
    public static void delete(String str) {
        try {
            String query = Query.deleteColumn;
            Connection conn = DB.getConnect();
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, str);
            pstm.execute();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("delete() error");
            e.printStackTrace();
        }
    }

    // Update
    public static void updatePassword(String str1, String str2, String str3) {
        try {
            String query = Query.updateTable;
            Connection conn = DB.getConnect();
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, str1);
            pstm.setString(2, str2);
            pstm.setString(3, str3);
            pstm.execute();
            pstm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("updatePassword() error");
            e.printStackTrace();
        }
    }

    // Read
    public static void readAllData() {
        try {
            String query = Query.readTable;
            Connection conn = DB.getConnect();
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(query);
            rs.last();
            int rowCount = rs.getRow(); // method to get rowCount
            rs.beforeFirst();
            String data[][] = new String[rowCount][9];

            int i = 0; // i -> rowPointer
            while (rs.next()) {
                for (int j = 0; j < 9; j++) { // j -> coulumnPointer
                    data[i][j] = rs.getString(j + 1);
                }
                i++;
            }

            rs.close();
            stm.close();
            conn.close();

            ArrayList<Integer> list1 = Operations.readCountSportsplayers();
            ArrayList<Integer> list2 = Operations.readCountCulturalEventparticipants();
            int countPayments = Operations.countTotalPayments();
            int countPendingPayments = Operations.countPendingPayments();

            // Displaying all the data of database along with some useful results
            new DisplayDataPage(data, list1.get(0), list1.get(1), list1.get(2), list2.get(0), list2.get(1),
                    list2.get(2), (countPayments * 500), countPendingPayments, rowCount);

        } catch (Exception e) {
            System.out.println("readData error");
            e.printStackTrace();
        }
    }

    // Method to get count of sports players
    public static ArrayList<Integer> readCountSportsplayers() {
        ArrayList<Integer> list = new ArrayList<>();

        try {
            String query1 = Query.countCricketPlayers;
            String query2 = Query.countVolleyballPlayers;
            String query3 = Query.countBadmintonPlayers;
            Connection conn = DB.getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs1 = stm.executeQuery(query1);

            if (rs1.next()) { // method which moves ResultSet pointer in next row
                int count = rs1.getInt(1);
                list.add(count);
            }
            rs1.close();

            ResultSet rs2 = stm.executeQuery(query2);
            if (rs2.next()) {
                int count = rs2.getInt(1);
                list.add(count);
            }
            rs2.close();

            ResultSet rs3 = stm.executeQuery(query3);
            if (rs3.next()) {
                int count = rs3.getInt(1);
                list.add(count);
            }

            rs3.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("readCountSportsPlayers() error");
            e.printStackTrace();
        }
        return list;
    }

    // Mehthod to get count of Cultural Events Participants
    public static ArrayList<Integer> readCountCulturalEventparticipants() {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            String query1 = Query.countMusicParticipants;
            String query2 = Query.countDanceParticipants;
            String query3 = Query.countOtherParticipants;
            Connection conn = DB.getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs1 = stm.executeQuery(query1);
            if (rs1.next()) {
                int count = rs1.getInt(1);
                list.add(count);
            }
            rs1.close();
            ResultSet rs2 = stm.executeQuery(query2);
            if (rs2.next()) {
                int count = rs2.getInt(1);
                list.add(count);
            }
            rs2.close();
            ResultSet rs3 = stm.executeQuery(query3);
            if (rs3.next()) {
                int count = rs3.getInt(1);
                list.add(count);
            }
            rs3.close();
            stm.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("readCountCulturalEventparticipants() error");
            e.printStackTrace();
        }
        return list;
    }

    // Mehthod to get total amount received
    public static int countTotalPayments() {
        int count = 0;
        try {
            String query = Query.TPayment;
            Connection conn = DB.getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stm.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("countTotalPayment() error");
            e.printStackTrace();
        }
        return count;
    }

    // Mehthod to get total amount pending and number of amounts pending
    public static int countPendingPayments() {
        int count = 0;
        try {
            String query = Query.DuePayment;
            Connection conn = DB.getConnect();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            stm.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("countPendingPayment() error");
            e.printStackTrace();
        }
        return count;
    }

}