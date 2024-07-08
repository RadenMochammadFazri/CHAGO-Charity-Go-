import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class DonasiPage2 {

    public DonasiPage2(){

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
    private TextField inpNominal;
    @FXML
    private Button btnKonfirmasi;
    @FXML
    private PieChart jumlChart;
    @FXML
    private Button BtnHPW1;
    @FXML
    private Button BtnPM;



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

        m.changeScene("FXMLDonasiPage1.fxml");
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
    public void btnKonfirmasi(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLPembayaranPribadi.fxml");
    }
    public void BtnHPW1(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLHomepg.fxml");
    }
    public void BtnPM(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLPembayaranInstansi.fxml");
    }
    
    


}