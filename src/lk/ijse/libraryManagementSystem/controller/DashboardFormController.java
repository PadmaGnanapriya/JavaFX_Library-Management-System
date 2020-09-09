package lk.ijse.libraryManagementSystem.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class DashboardFormController {
    public JFXTextField txtIssueBkID;
    public JFXTextField txtIssueMemID;
    public JFXTextField txtRenewBkID;
    public StackPane root;

    public void addMemberOnAction(ActionEvent actionEvent) throws IOException {
        setWindow("AddMemberForm");
    }

    public void addBookOnAction(ActionEvent actionEvent) throws IOException {
        setWindow("AddBookForm");
    }

    public void viewMembersOnAction(ActionEvent actionEvent) throws IOException {
    }

    public void viewBooksOnAction(ActionEvent actionEvent) {
    }

    public void settingsOnAction(ActionEvent actionEvent) {
    }

    public void issueOnAction(ActionEvent actionEvent) {
    }

    public void renewOnAction(ActionEvent actionEvent) {
    }

    public void submitOnAction(ActionEvent actionEvent) {
    }

    private void setWindow(String form) throws IOException {
        Stage window = (Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/"+form+".fxml"))));
        window.centerOnScreen();
    }
}
