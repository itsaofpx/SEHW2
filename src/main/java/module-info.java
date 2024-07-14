module ku.cs.gamble {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ku.cs.gamble to javafx.fxml;
    exports ku.cs.gamble;
}