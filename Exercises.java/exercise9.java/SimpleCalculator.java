import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SimpleCalculator extends Application {

    private TextField displayField;
    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    @Override
    public void start(Stage primaryStage) {
        displayField = new TextField();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        displayField.setEditable(false);
        grid.add(displayField, 0, 0, 3, 1);

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        int labelIndex = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Button button = createButton(buttonLabels[labelIndex++]);
                grid.add(button, j, i);
            }
        }

        Scene scene = new Scene(grid, 250, 250);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createButton(String label) {
        Button button = new Button(label);
        button.setMinSize(50, 50);
        button.setOnAction(e -> buttonClicked(label));
        return button;
    }

    private void buttonClicked(String label) {
        if ("0123456789".contains(label)) {
            if (start) {
                displayField.setText(label);
                start = false;
            } else {
                displayField.setText(displayField.getText() + label);
            }
        } else if (label.equals("C")) {
            start = true;
            operator = "";
            firstNumber = 0;
            displayField.setText("");
        } else if (label.equals("=")) {
            if (operator.isEmpty()) return;

            double secondNumber = Double.parseDouble(displayField.getText());
            switch (operator) {
                case "+":
                    displayField.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case "-":
                    displayField.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case "*":
                    displayField.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case "/":
                    if (secondNumber == 0) {
                        displayField.setText("Error");
                    } else {
                        displayField.setText(String.valueOf(firstNumber / secondNumber));
                    }
                    break;
            }
            start = true;
        } else {
            if (!start) {
                firstNumber = Double.parseDouble(displayField.getText());
                operator = label;
                start = true;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
