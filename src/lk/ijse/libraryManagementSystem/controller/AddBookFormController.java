package lk.ijse.libraryManagementSystem.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import lk.ijse.libraryManagementSystem.dao.DatabaseAccessCode;
import lk.ijse.libraryManagementSystem.dto.BookDTO;

import java.io.IOException;
import java.sql.SQLException;

public class AddBookFormController {
    public JFXTextField txtBkID;
    public JFXTextField txtBkTitle;
    public JFXTextField txtAuthor;
    public JFXTextField txtPublisher;
    public JFXTextField txtBkInternalCode;
    public VBox root;

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"))));
        window.centerOnScreen();
        window.show();
    }

    public void saveOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        boolean isAdded = new DatabaseAccessCode().saveBook(new BookDTO(txtBkID.getText(), txtBkTitle.getText(), txtAuthor.getText(), txtPublisher.getText(), txtBkInternalCode.getText()));

        Alert alert;
        if(isAdded){
            alert = new Alert(Alert.AlertType.INFORMATION, "Saved Successfully");
        }else{
            alert = new Alert(Alert.AlertType.ERROR, "Saving Unsuccessful!");
        }
        alert.setHeaderText(null);
        alert.show();
    }
}
