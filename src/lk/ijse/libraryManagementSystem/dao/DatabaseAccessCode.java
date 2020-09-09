package lk.ijse.libraryManagementSystem.dao;

import lk.ijse.libraryManagementSystem.db.DBConnection;
import lk.ijse.libraryManagementSystem.dto.BookDTO;
import lk.ijse.libraryManagementSystem.dto.MemberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DatabaseAccessCode {
    public boolean saveBook(BookDTO bookDTO) throws SQLException, ClassNotFoundException {
        System.out.println(bookDTO.getAuthor()+" ,"+bookDTO.getBookID());
        Connection con= DBConnection.getInstance().getConnection();
        PreparedStatement pstm=con.prepareStatement("SELECT * FROM BOOK");
        ResultSet set = pstm.executeQuery();

        while (set.next()){
            System.out.println(set.getString(1)+", " +set.getString(2)+", " +set.getString(3)+", " +set.getString(4)+", " +set.getBoolean(5));
        }
        System.out.println("\n\n");

        PreparedStatement pstm2=con.prepareStatement("SELECT * FROM MEMBER");
        ResultSet set2 = pstm2.executeQuery();

        while (set2.next()){
            System.out.println(set2.getString(1)+", " +set2.getString(2)+", " +set2.getString(3)+", " +set2.getString(4));
        }



        return false;
    }

    public boolean saveMember(MemberDTO memberDTO) {
        return false;
    }
}
