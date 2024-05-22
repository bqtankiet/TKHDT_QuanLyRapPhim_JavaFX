package utils;

import java.io.IOException;
import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class PaneController {

	private Pane rootPane;
	private static PaneController instance = null;
	private final HashMap<String, Pane> paneMap = new HashMap<>();

	private PaneController() {
	}

	public void init(Pane root) {
		this.rootPane = root;
	}

	public static PaneController getInstance() {
		if (instance == null) {
			instance = new PaneController();
		}
		return instance;
	}

	public void replacePane(Pane current, String other) {
		Pane pane = paneMap.get(other);
//		System.out.println(paneMap);
		try {
			if (pane == null) {
				pane = FXMLLoader.load(getClass().getResource(other));
				paneMap.put(other, pane);
			}
//			System.out.println(current.getParent());
			Pane parent = (Pane) current.getParent();
			parent.getChildren().clear();
			parent.getChildren().add(pane);
			AnchorPane.setTopAnchor(pane, 0.0);
			AnchorPane.setBottomAnchor(pane, 0.0);
			AnchorPane.setLeftAnchor(pane, 0.0);
			AnchorPane.setRightAnchor(pane, 0.0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addPane(Pane currentPane, String fxml) {
		try {
			Parent pane = FXMLLoader.load(getClass().getResource(fxml));
			currentPane.getChildren().add(pane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Pane getRootPane() {
		return rootPane;
	}

}
