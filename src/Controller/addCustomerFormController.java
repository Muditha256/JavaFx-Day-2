package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class addCustomerFormController {

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    List<Customer> customerList = new ArrayList<>();

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String id=txtId.getText();
        String name=txtName.getText();
        double salary= Double.parseDouble(txtSalary.getText());
        String address=txtAddress.getText();

        Customer customer=new Customer(id,name,address,salary);

        customerList.add(customer);

        System.out.println("------------------------------------");
        customerList.forEach(cus -> {
            System.out.println(cus);
        });
        System.out.println("------------------------------------");



    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
