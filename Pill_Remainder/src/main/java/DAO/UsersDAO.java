package DAO;



import java.sql.*;
import java.util.LinkedList;

import org.springframework.stereotype.Service;

import com.Project.TaskMang.Entites.Ticket;
import com.Project.TaskMang.Entites.Users;


@Service
public class UsersDAO {
    private Connection con;

    public UsersDAO() {
        this.con = DBSingleton.getInstance();
    }

public String getRole(String User_Id) {
    Statement stmt = null;
   String role="";
    try {
        stmt = this.con.createStatement();      
        ResultSet rs = stmt.executeQuery("select USERS_TYPE from USERS where USERS_ID=" + User_Id);
        while (rs.next()) {
        	 role=(rs.getString("Users_Type"));
             
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return role;
}

    public LinkedList<Ticket> viewticket(String User_Id) {
        Statement stmt = null;
        LinkedList<Ticket> LS = new LinkedList<Ticket>();
        try {
            stmt = this.con.createStatement();
            //step4 execute query
            ResultSet rs = stmt.executeQuery("select TICKET_ID,TICKET_TYPE,TICKET_DESCRIPTION,TICKET_SUBJECT,TICKET_CREATED,TICKET_DEADLINE,TICKET_STATUS,TICKET_ASSIGNTO,TICKET_CREATEDBY from Ticket where Ticket_AssignTo='" + User_Id+"'");
            while (rs.next()) {
                Ticket t = new Ticket(rs.getString("Ticket_Id"), rs.getString("Ticket_type"), rs.getString("Ticket_description"), rs.getString("Ticket_Subject"), rs.getString("Ticket_Deadline"), rs.getString("Ticket_Status"), rs.getInt("Ticket_AssignTo"), rs.getInt("Ticket_CreatedBy"));
                t.setTicket_created(rs.getString("Ticket_Created"));
                LS.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return LS;
    }

    public int createTicket(Ticket tk) {
        Statement stmt = null;
        try {
            stmt = this.con.createStatement();
            //step4 execute query
            String str = "insert into Ticket(TICKET_ID,TICKET_TYPE,TICKET_DESCRIPTION,TICKET_SUBJECT,TICKET_CREATED,TICKET_DEADLINE,TICKET_STATUS,TICKET_ASSIGNTO,TICKET_CREATEDBY) values('" + tk.getTicket_id() + "','" + tk.getTicket_type() + "','" + tk.getTicket_description() + "','" + tk.getTicket_subject() + "',DEFAULT,DATE'" + tk.getTicket_deadline() + "','" + tk.getTicket_status() + "'," + tk.getTicket_AssignTo() + "," + tk.getTicket_CreatedBy() + ")";
            return stmt.executeUpdate(str);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
public int checkCredentials (Users users) {
    
    Statement stmt = null;
    try {
        stmt = this.con.createStatement();
        //step4 execute query
        String str = "select Users_Password from Users where Users_Id = " + users.getUsers_Id();
         ResultSet rs =         stmt.executeQuery(str);
         System.out.println(users.getUsers_Id()+" "+users.getUsers_Password());
        while (rs.next()){
        	System.out.println(rs.getString("Users_Password"));
            if(rs.getString("Users_Password").equals(users.getUsers_Password())){
                return 1;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return 0;
}





/********************************************************************************************/

public LinkedList<Users> viewUsers(String User_Id) {
    Statement stmt = null;
    LinkedList<Users> LS = new LinkedList<Users>();
    try {
        stmt = this.con.createStatement();
        //step4 execute query
        ResultSet rs = stmt.executeQuery("select USERS_ID,USERS_TYPE,USERS_NAME,USERS_EMAIL,USERS_PASSWORD from USERS where USERS_ID=" + User_Id);
        while (rs.next()) {
            Users u = new Users(rs.getInt("Users_Id"), rs.getString("Users_password"), rs.getString("Users_Name"), rs.getString("Users_Email"), rs.getString("Users_Type"));
           // u.setTicket_created(rs.getString("Ticket_Created"));
            LS.add(u);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return LS;
}
}
