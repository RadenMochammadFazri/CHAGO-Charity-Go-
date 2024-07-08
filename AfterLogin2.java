
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

public class AfterLogin2 {

    @FXML
    private Button button2;

    public void nextPage2(ActionEvent event) throws IOException{
        Main m = new Main();

        m.changeScene("FXMLafterLogin3.fxml");
    }

}
