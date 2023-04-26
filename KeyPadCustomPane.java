
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class KeyPadCustomPane extends KeyPadPane {

	// Create label and text
	protected Label label = new Label("You pressed the button! ");
	protected TextField Result = new TextField();

	protected void registerEventHandlers() {
		ArrayList<Button> currList = new ArrayList<Button>();

		if (copyListButtons != null) {
			currList = copyListButtons;
		} else {
			currList = listButtons;
		}
		// Event handlers
		for (int i = 0; i < currList.size(); i++) {
			currList.get(i).setPrefSize(300, 100);;
			currList.get(i).setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent e) {
					System.out.println("You pressed the button: " + ((Button)e.getSource()).getText());
				}
			});
			currList.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override

				public void handle(MouseEvent mouseEvent) {
					if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
						#A52A2A
						#5F9EA0
						
						btn0.setStyle("-fx-background-color: #A52A2A -fx-text-fill:white;");
						btn1.setStyle("-fx-background-color: #5F9EA0  -fx-text-fill: white;");
						btn2.setStyle("-fx-background-color: #A52A2A -fx-text-fill: white;");
						btn3.setStyle("-fx-background-color: #5F9EA0 -fx-text-fill: white;");
						btn4.setStyle("-fx-background-color: #A52A2A -fx-text-fill: white;");
						btn5.setStyle("-fx-background-color: #5F9EA0 -fx-text-fill: white;");
						btn6.setStyle("-fx-background-color: #A52A2A -fx-text-fill: white;");
						btn7.setStyle("-fx-background-color: #5F9EA0 -fx-text-fill: white;");
						btn8.setStyle("-fx-background-color: #A52A2A -fx-text-fill: white;");
						btn9.setStyle("-fx-background-color: #5F9EA0 -fx-text-fill: white");

						if(mouseEvent.getClickCount() == 2){
							// Color when button is clciked twice
							System.out.println("Double clicked");
							btn0.setStyle("-fx-background-color:  ");
							btn1.setStyle("-fx-background-color: ");
							btn2.setStyle("-fx-background-color: ");
							btn3.setStyle("-fx-background-color: ");
							btn4.setStyle("-fx-background-color: ");
							btn5.setStyle("-fx-background-color: ");
							btn6.setStyle("-fx-background-color: ");
							btn7.setStyle("-fx-background-color: ");
							btn8.setStyle("-fx-background-color: ");
							btn9.setStyle("-fx-background-color: ");
						}
					}
				}
			});
		}
	}
	public KeyPadCustomPane() {
		super();
		registerEventHandlers();
	}

	public KeyPadCustomPane(boolean phoneOrder) {
		if (phoneOrder) {
			this.getChildren().clear(); // Clears the default layout

			// Replace blanks and duplicate
			copyListButtons = (ArrayList<Button>)listButtons.clone();
			copyListButtons.set(copyListButtons.size() - 3, btnAsterisk);
			copyListButtons.set(copyListButtons.size() - 1, btnPound);

			// counter start at last numeric button index
			int counter = copyListButtons.size() - 4;

			// Place buttons 9-1
			for (int i = 0; i < (copyListButtons.size() - 3) / 3; i++) {
				for (int j = 0; j < 3; j++) {
					this.add(copyListButtons.get(counter--), j, i);
				}
			}

			// reset counter
			counter = copyListButtons.size() - 1;

			// Add blank, 0 , and then the blanks order
			for (int i = 2; i >= 0; i--) {
				this.add(copyListButtons.get(counter--), i, 3);
			}
			registerEventHandlers();
		} 
	}

}


