
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterLogin3 {

    @FXML
    private Button button3;

    public void nextPage3(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLHomePg.fxml");
    }

}

