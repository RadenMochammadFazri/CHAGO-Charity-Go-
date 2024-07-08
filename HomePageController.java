import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HomePageController {

    public HomePageController(){

    }

    @FXML 
    private MenuItem AboutUspg;
    @FXML
    private Button btnHome1;
    @FXML
    private MenuItem Donasipg;
    @FXML
    private MenuItem Wakafpg;
    @FXML
    private MenuItem Eventspg;
    @FXML
    private MenuItem DonasiBarangpg;
    @FXML
    private Button Joinbtn;
    @FXML
    private Button BtnDonasi;
    @FXML
    private Button BtnEvents;
    @FXML
    private Button BtnWakaf;
    @FXML
    private Button BtnPilih;



    public void AboutUs(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("AboutUs.fxml");
    }
    public void Homepg(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLHomepg.fxml");
    }
    public void Donasipg(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLDonasipage1.fxml");
    }
    public void Wakafpg(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLWakaf1.fxml");
    }
    public void Eventspg(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLEvents1.fxml");
    }
    public void DonasiBarangpg(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLPilihanDonasi.fxml");
    }
    public void Joinbtn(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLPendaftaranMitraKami.fxml");
    }
    public void BtnDonasi(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLDonasipage1.fxml");
    }
    public void BtnEvents(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLEvents1.fxml");
    }
    public void BtnWakaf(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLWakaf1.fxml");
    }
    public void BtnPilih(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLPilihanDonasi.fxml");
    }
}
