package lk.ijse.libraryManagementSystem.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lk.ijse.libraryManagementSystem.dao.DatabaseAccessCode;
import lk.ijse.libraryManagementSystem.dto.BookDTO;
import lk.ijse.libraryManagementSystem.dto.MemberDTO;

import java.io.IOException;

public class AddMemberFormController {
    public VBox root;
    public JFXTextField txtMemberID;
    public JFXTextField txtName;
    public JFXTextField txtMobileNum;
    public JFXTextField txtEmail;

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/DashboardForm.fxml"))));
        window.centerOnScreen();
        window.show();
    }

    public void saveOnAction(ActionEvent actionEvent) {
        boolean isAdded = new DatabaseAccessCode().saveMember(new MemberDTO(txtMemberID.getText(), txtName.getText(), txtMobileNum.getText(), txtEmail.getText()));

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
