
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class NotifikasiMitra {

    @FXML
    private Button ButtonM;

    public void ButtonM (ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLHomepg.fxml");
    }

}

