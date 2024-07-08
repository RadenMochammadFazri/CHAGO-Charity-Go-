
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class NotifPembayaranPribadi {

    @FXML
    private Button ButtonP;

    public void ButtonP (ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLHomepg.fxml");
    }

}

