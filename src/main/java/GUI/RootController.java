package GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class RootController implements Initializable {
	@FXML
	private StackPane stackPane;
	
	
	public StackPane getStackPane() {
		return stackPane;
	}
	
	@FXML
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	}
}