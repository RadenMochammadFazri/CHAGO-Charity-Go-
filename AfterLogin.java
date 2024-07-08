
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button button1;

    public void nextPage1(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLafterLogin2.fxml");
    }

}
